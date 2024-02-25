<template>
  <div id="footer-outer">
    <div class="footer-content">
      <div class="item contact-me">
        <h3>联系我</h3>
        <p>Email:xx</p>
        <p>Phone:xx</p>
      </div>
      <div class="item focus-me">
        <h3>微信</h3>
        <el-image
            style="width: 100px; height: 100px"
            :src="require('@/assets/images/common/wx.png')"
            fit="contain"></el-image>
      </div>
      <div class="item talk-us">
        <h3>支付宝</h3>
        <el-image
            style="width: 100px; height: 100px"
            :src="require('@/assets/images/common/zhifubao.png')"
            fit="contain"></el-image>
      </div>
      <div class="item website-info">
        <h3>站点信息</h3>
        <p><b>文章总数：</b>16篇</p>
        <p><b>访问总数：</b>174次</p>
        <p><b>评论总数：</b>7条</p>
        <p><b>留言总数：</b>19条</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "FooterF"
}
</script>

<style lang="less" scoped>
#footer-outer {
  background-color: rgb(84, 92, 100);

.footer-content {
  color: aliceblue;
  height: 220px;
  margin: auto;
  width: 90vw;
  display: flex;
  align-items: center;
  justify-content: space-between;

.item {
  flex: 1;
  text-align: center;
}
}
}
</style>