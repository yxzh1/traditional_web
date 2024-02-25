package com.wms.common.utils;


import java.io.File;
import java.util.regex.Pattern;

public class FilenameUtils {

    private static final char SYSTEM_NAME_SEPARATOR;

    private static final char OTHER_SEPARATOR;

    static {
        SYSTEM_NAME_SEPARATOR = File.separatorChar;
        OTHER_SEPARATOR = flipSeparator(SYSTEM_NAME_SEPARATOR);
    }

    static char flipSeparator(char ch) {
        if (ch == '/') {
            return '\\';
        } else if (ch == '\\') {
            return '/';
        } else {
            throw new IllegalArgumentException(String.valueOf(ch));
        }
    }

    public static String getBaseName(String fileName) {
        return removeExtension(getName(fileName));
    }

    public static String getName(String fileName) {
        return fileName == null ? null : requireNonNullChars(fileName).substring(indexOfLastSeparator(fileName) + 1);
    }

    public static String getExtension(String fileName) throws IllegalArgumentException {
        if (fileName == null) {
            return null;
        } else {
            int index = indexOfExtension(fileName);
            return index == -1 ? "" : fileName.substring(index + 1);
        }
    }

    private static String requireNonNullChars(String path) {
        if (path.indexOf(0) >= 0) {
            throw new IllegalArgumentException("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
        } else {
            return path;
        }
    }

    public static int indexOfLastSeparator(String fileName) {
        if (fileName == null) {
            return -1;
        } else {
            int lastUnixPos = fileName.lastIndexOf(47);
            int lastWindowsPos = fileName.lastIndexOf(92);
            return Math.max(lastUnixPos, lastWindowsPos);
        }
    }

    public static String removeExtension(String fileName) {
        if (fileName == null) {
            return null;
        } else {
            requireNonNullChars(fileName);
            int index = indexOfExtension(fileName);
            return index == -1 ? fileName : fileName.substring(0, index);
        }
    }

    public static int indexOfExtension(String fileName) throws IllegalArgumentException {
        if (fileName == null) {
            return -1;
        } else {
            int offset;
            if (isSystemWindows()) {
                offset = fileName.indexOf(58, getAdsCriticalOffset(fileName));
                if (offset != -1) {
                    throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
                }
            }

            offset = fileName.lastIndexOf(46);
            int lastSeparator = indexOfLastSeparator(fileName);
            return lastSeparator > offset ? -1 : offset;
        }
    }

    static boolean isSystemWindows() {
        return SYSTEM_NAME_SEPARATOR == '\\';
    }

    private static int getAdsCriticalOffset(String fileName) {
        int offset1 = fileName.lastIndexOf(SYSTEM_NAME_SEPARATOR);
        int offset2 = fileName.lastIndexOf(OTHER_SEPARATOR);
        if (offset1 == -1) {
            return offset2 == -1 ? 0 : offset2 + 1;
        } else {
            return offset2 == -1 ? offset1 + 1 : Math.max(offset1, offset2) + 1;
        }
    }
}
