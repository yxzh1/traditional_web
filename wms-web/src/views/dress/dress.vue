<template>
  <div class="home-view">
    <div class="main">
      <div class="thumb">
        <!--轮播图-->
        <div class="carousel-images">
          <el-carousel trigger="click" :interval="3000" type="card" indicator-position="outside" height="300px" arrow="always">
            <el-carousel-item v-for="(item,index) in dressPicList" :key="index">
              <div class="carousel-item" style="position: relative;overflow-y: hidden;">
                <el-image
                    :src="require('@/assets/images/dress/' + item.coverImage)"
                    fit="none"></el-image>
                <div class="carousel-desc" style="position: absolute;left: 15%;top: 20px;color: white;">
                  <div class="title" style="font-size: 32px;">{{item.title}}</div>
                </div>
              </div>
            </el-carousel-item>
          </el-carousel>
        </div>
      </div>

      <div class="articles">
        <div class="article-content" v-loading="NoteListLoading">
          <div class="article-item" v-for="(item,index) in dressList" :key="index">
            <article-item :article="item"></article-item>
          </div>
        </div>

      </div>

      <!--分页-->
      <div style="margin-top: 20px;" class="my-border-padding">
        <el-pagination
            background
            @current-change="handleCurrentChange"
            :current-page.sync="currentPage"
            :page-size="6"
            layout="total, prev, pager, next"
            :total="total">
        </el-pagination>
      </div>
    </div>

  </div>
</template>

<script>
import ArticleItem from "@/views/dress/comps/ArticleItem";
// import NavBar from "@/components/navbar/NavBar.vue";

export default {
  name: "dressP",
  components:{
    // NavBar,
    ArticleItem
  },
  data(){
    return{
      dressPicList:[
        {
          coverImage : 'VCG41N127577032.jpg',
          title : '黎族服饰'

        },
        {
          coverImage : 'VCG43534N243431.jpg',
          title : '中国旗袍'
        },
        {
          coverImage : 'VCG211397170418.jpg',
          title : '苗族百褶裙'
        }
      ],

      //民族服饰列表
      dressList:[],

      // 加载是否完毕
      NoteListLoading:true,

      //分页
      total:0,
      currentPage: 1,
      pageSize: 6,
    }
  },
  methods:{
    //初始化数据
    initArticeList(){
      this.$axios.get(this.$httpsUrl + "/hys/dress/list").then(res=>res.data).then(res=>{
        if(res.code === 200){
          this.dressList.splice(0);
          this.dressList.push(...res.data);
          console.log("dressList ==> " ,this.dressList)
          this.total = res.total;
          this.NoteListLoading = false;
        }else{
          this.$message.error("获取数据失败");
        }
      })
    },
    /*分页*/
    handleCurrentChange(current){
      console.log(`当前页: ${current}`);
      this.currentPage = current
      this.initArticeList();
    },
  },
  created() {
    this.initArticeList();
  },
}
</script>

<style lang="less" scoped>
.home-view{
  .main.thumb{
    position: relative;
    flex: 1;
    box-shadow: 0 0 3px #dddddd;
    .carousel-images{
      width: 90%;
      margin: 0 auto;
    }

  }
}
</style>