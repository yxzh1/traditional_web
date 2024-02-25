<template>
  <div class="note-detail-view">
    <div class="content-wrapper">
      <div class="article-wrapper" v-html="noteDetail.mzwh_detail_content"></div>
    </div>
  </div>
</template>

<script>
export default {
  name: "NoteDetail",
  data(){
    return{
      //游记详情及作者信息
      noteDetail: {
        mzwh_detail_content: "",
        mzwh_detail_cost: "",
        mzwh_cover_image: "",
        mzwh_detail_day: "",
        mzwh_detail_publiser_avatar: "",
        mzwh_detail_publiser_name: "",
        mzwh_detail_publish_time: "",
        mzwh_detail_start_time: "",
        mzwh_title: "",
        mzwh_detail_tn_id: "",
        id:"",
      },
    }
  },
  methods:{
    //初始化数据
    initNoteAndAuthorInfo(){
      this.$axios.get(this.$httpsUrl + "/hys/detail/getByTnId?tnId=" + this.noteDetail.id).then(res=>res.data).then(res=>{
        if(res.code === 200){
          this.noteDetail = res.data
        }
      })
    },
  },
  created() {
    this.noteDetail.id = this.$route.params.id;

    this.initNoteAndAuthorInfo();
  },
}
</script>

<style>
.content{
  width: 80%;
  margin:0 auto;
}
h1{
  text-align: center;
}
#infContent1{
  font-size: 20px;
}
.infos{
  font-size: 16px;
  text-align: center;
}
</style>