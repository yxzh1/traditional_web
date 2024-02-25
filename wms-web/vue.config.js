const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  //指定静态资源的基础路径
  // publicPath : './',
  transpileDependencies: true,
  //关闭es6命名检查
  lintOnSave: false,

  devServer: {
    host: '0.0.0.0', //端口号
    open:true,
    port: 8091,
    proxy: {
      '/api': {
        target: 'http://localhost:8090',
        // ws: true,
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      }
    }
  }
})
