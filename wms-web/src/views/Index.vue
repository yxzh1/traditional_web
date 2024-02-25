<!--主页-->
<template>
  <el-container >
      <el-header>
        <HeaderP></HeaderP>
      </el-header>

      <el-main>
        <router-view/>
      </el-main>

      <el-footer>
        <FooterF></FooterF>
      </el-footer>

  </el-container>
</template>

<script>
import HeaderP from "@/views/Header.vue";
import FooterF from "@/views/FooterF.vue";
export default {
  name: "IndexP",
  components: {HeaderP,FooterF},
  data(){
    return{
    }
  },
  methods:{

  },
  created() {
    this.$router.push("/home")
  }

}
</script>

<style scoped>
.el-header{
  padding: 0;
}
</style>