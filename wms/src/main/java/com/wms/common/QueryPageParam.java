package com.wms.common;

import lombok.Data;

import java.util.HashMap;

@Data
public class QueryPageParam {
    private  static int Page_size=20;
    private  static int Page_num=1;

    private int pageSize=Page_size;
    private int pageNum=Page_num;

    private HashMap param = new HashMap();
}
