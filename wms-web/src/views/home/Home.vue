<template>
  <div class="home-view">
    <div class="layout-left">
      <!--轮播图-->
      <div class="carousel-images">
        <el-carousel trigger="click" :interval="3000" indicator-position="outside" height="300px" arrow="always">
          <el-carousel-item v-for="(item,index) in carouselImages" :key="index">
            <div class="carousel-item" style="position: relative;overflow-y: hidden;">
              <el-image
                        style="width: 100%; height: 100%; background-repeat: no-repeat; background-position:center center;background-size: cover;"
                        :src="require('@/assets/images/home/banner/' + item.coverImage + '.jpg')"
                        fit="none"></el-image>
              <div class="carousel-desc" style="position: absolute;left: 15%;top: 20px;color: white;">
                <div class="title" style="font-size: 32px;">{{item.title}}</div>
                <div class="location" style="margin-top: 10px;"><i class="el-icon-location"></i> {{item.location}}</div>
              </div>
            </div>
          </el-carousel-item>
        </el-carousel>
      </div>
      <!--      分割线-->
      <el-divider/>

      <div class="main-content" style="width: 100%;display: flex;">
        <div class="main-left" style="flex:1;">
          <!--nav类型-->
          <div class="nav-container" style="line-height: 50px;display: flex">
            <div class="nav-left" style="flex: 1;display: flex;">
              <div class="navHot"
                   @click="tabToggleClick('热门')"
                   :class="{active:currentTab ==='热门'}"
                   style="line-height: 50px;font-size: 24px;padding: 0 10px;">热门</div>
              <div class="navNew"
                   style="line-height: 50px;font-size: 24px;padding: 0 10px;"
                   :class="{active:currentTab ==='最新发表'}"
                   @click="tabToggleClick('最新发表')">最新发表</div>
            </div>

            <div class="nav-right" style="width: 120px;line-height: 50px;">
              <el-button type="warning" @click="$router.push('/write/note')">
                <i class="el-icon-plus"></i>
                写文章
              </el-button>
            </div>
          </div>

          <div class="main-table" v-loading="NoteListLoading">
            <div class="travel-item" v-for="(item,index) in travelNoteList" :key="index">
              <travel-note-item :travel="item"></travel-note-item>
            </div>
          </div>

          <!--分页-->
          <div class="home-pagination">
            <el-pagination
                background
                @current-change="handleCurrentChange"
                :current-page.sync="currentPage"
                :page-sizes="pageSizes"
                :page-size="pageSize"
                layout="total, sizes, prev, pager, next, jumper"
                :total="total">
            </el-pagination>
          </div>
        </div>

        <div class="main-right"
             style="width: 400px;margin-left: 20px;">
          <div class="traveller-box">
            <nav-bar class = "navBarBox">
            <div slot = "middle-slot">文化播报</div>
<!--              <div slot = "right-slot">-->
<!--                <router-link to="/traveller">专栏首页</router-link>-->
<!--              </div>-->
            </nav-bar>

            <div class="traveller-item" v-for="(item,index) in TravellerNoteList" :key="index" style="width: 100%">
              <traveller-item :article="item"></traveller-item>
            </div>
          </div>

          <div class="unknownTravel-box" style="margin-top: 20px">
            <nav-bar class = "navBarBox">
              <div slot = "left-slot">旅游推荐</div>
              <div slot = "right-slot">
                查看更多>
              </div>
            </nav-bar>
            <el-image
                style="width: 100%; height: 200px;"
                title="杭州西湖雷峰塔"
                :src="require('@/assets/images/home/VCG211467590832.jpg')"
                fit="cover"></el-image>
            <el-image
                style="width: 100%; height: 200px; margin-top: 15px"
                title="贵州安顺黄果树瀑布"
                :src="require('@/assets/images/home/VCG211314441533.jpg')"
                fit="cover"></el-image>
            <el-image
                style="width: 100%; height: 200px; margin-top: 15px"
                title="川西 甘孜藏族自治州 稻城亚丁 理塘  白塔"
                :src="require('@/assets/images/home/VCG211463094729.jpg')"
                fit="cover"></el-image>
            <el-image
                style="width: 100%; height: 200px; margin-top: 15px"
                title="洛阳老君山"
                :src="require('@/assets/images/home/VCG211453910294.jpg')"
                fit="cover"></el-image>
          </div>

<!--          <div class="learnUs-box" style="margin-top: 20px">-->
<!--            <nav-bar class = "navBarBox">-->
<!--              <div slot = "left-slot">了解我们</div>-->
<!--              <div slot = "right-slot">-->
<!--                查看更多>-->
<!--              </div>-->
<!--            </nav-bar>-->
<!--            <el-image-->
<!--                style="width: 100%; height: 200px;"-->
<!--                src="https://b1-q.mafengwo.net/s14/M00/01/D0/wKgE2l1t1WqAOUvnAACxwvHwMhM32.jpeg"-->
<!--                fit="cover"></el-image>-->
<!--          </div>-->


        </div>
      </div>
    </div>
  </div>
</template>

<script>
import TravelNoteItem from "./comps/TravelNoteItem"
import TravellerItem from "./comps/TravellerItem"
import NavBar from "@/components/navbar/NavBar"
export default {
  name: "HomeP",
  components:{
    TravelNoteItem,
    TravellerItem,
    NavBar,
  },
  data(){
    return{
      currentTab:"热门",

      carouselImages:[
        {
          coverImage: "6",
          title: "三日游",
          location: "中国上海"
        },
        {
          coverImage: "7",
          title: "7日游",
          location: "中国内蒙古"
        },
        {
          coverImage: "8",
          title: "7日游",
          location: "中国重庆"
        }
      ],

      activeTagName:"navHot",

      // 加载是否完毕
      NoteListLoading:true,

      travelNoteList:[],

      TravellerNoteList:[],

      //分页
      total:0,
      currentPage: 1,
      pageSizes: [3, 6, 9],
      pageSize: 9,
    }
  },
  methods:{
    initTravelNoteList(){
      let params = {
        "type":this.currentTab ==="热门" ? 1 : 2,
        "currentPage":this.currentPage,
        "pageSize":this.pageSize
      }
      this.$axios.get(this.$httpsUrl + "/hys/mzwh/getByType?" + this.$qs.stringify(params,{encode:false}))
          .then(res=>res.data).then(res=>{
              if(res.code===200){
                this.travelNoteList.splice(0);
                this.travelNoteList.push(...res.data);
                this.total = res.total;
                this.NoteListLoading = false;
              }else{
                this.$message.error("获取数据失败");
              }
          })
    },

    // initCarousel(){
    //   //按照点赞数获取6个轮播数据
    //   // this.$axios.get(this.$httpsUrl + "/mzwh/getByUpDesc").then(res=>res.data).then(res=>{
    //   //   if(res.code === 200){
    //   //     this.carouselImages.splice(0);
    //   //     this.carouselImages.push(...res.data);
    //   //   }
    //   // })
    // },

    initTravellerNoteList(){
      this.$axios.get(this.$httpsUrl + "/hys/note/getByTime?limit=4").then(res=>res.data).then(res=>{
        if(res.code === 200){
          this.TravellerNoteList.splice(0);
          this.TravellerNoteList.push(...res.data);
        }
      })
    },

    tabToggleClick(tabName){
      this.currentTab = tabName;
      this.initTravelNoteList();
    },

    /*分页*/
    handleSizeChange(size){
      console.log(`每页 ${size} 条`);
      this.pageSize = size
      this.initTravelNoteList();
    },
    handleCurrentChange(current){
      console.log(`当前页: ${current}`);
      this.currentPage = current
      this.initTravelNoteList();
    },
  },
  created() {
    this.initTravelNoteList();

    // this.initCarousel();

    this.initTravellerNoteList();
  },
}
</script>

<style lang="less" scoped>
.home-view{
  .layout-left{
    position: relative;
    flex: 1;
    box-shadow: 0 0 3px #dddddd;
    .carousel-images{
      width: 90%;
      margin: 0 auto;
    }
    .main-content{
      .main-left{
        .nav-container{
          .active{
            background-color: rgba(255, 138, 0,0.7);
            color: white;
            border-bottom: 4px solid rgba(255, 138, 0,1);
          }
        }
      }
    }

    .home-pagination{
      //position: absolute;
      //left: 0;
      //bottom: 0;
      border: 1px solid #ddd;
      padding: 10px;
      border-radius: 5px;
    }
  }
}
</style>