<template>
  <div class="traveller-article" style="border: 1px solid #ddd; border-radius: 8px; margin-top: 10px;">
    <div class="article-title hvr-underline-from-center" @click="$router.push('/heritage/article/'+article.heritageId)">
      {{article.heritageTitle}}
    </div>

    <div class="article-item">
      <div class="left">
        <el-image class="hvr-grow"
                  style="width: 100%; height: 100%;"
                  :src="'/api' + article.heritageThumbnail"
                  fit="fill"></el-image>
      </div>
      <div class="right">
        <div class="article-desc">{{article.heritageDescription}}</div>
        <div class="article-extra">
          <div class="name"><i class="el-icon-location"></i>By  <span  class="author-name">{{writerName}}</span></div>
          <div class="pulishTime"><i class="el-icon-time"></i>
            {{article.heritagesPublishTime ? article.heritagesPublishTime.toString().slice(0,10) : article.heritagesPublishTime.toString().slice(0,10)}}
          </div>
          <div class="viewCount"><i class="el-icon-view"></i> {{article.heritageView}}</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ArticleItem",
  props:{
    article:{
      type:Object,
      default(){
        return{}
      }
    }
  },
  data(){
    return{
      //作者名字
      writerName: 'nm'
    }
  },
  methods: {
  }
}
</script>

<style lang="less" scoped>
.traveller-article{
  border-bottom: 1px dashed #ddd;
  padding: 20px 30px;
  &:hover{
    background-color: #fafafa;
  }

  .article-title{
    font-size: 26px;
    line-height: 50px;
  }

  .article-item{
    margin-top: 10px;
    display: flex;
    .left{
      width: 280px;
      height: 160px;
      overflow: hidden;
    }
    .right{
      flex: 1;
      margin-left: 20px;
      .article-desc{
        word-spacing: 10px;
        text-indent: 2em;
        font-size: 20px;
        height: 90px;
        line-height: 1.5;
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: pre-line;
      }
      .article-extra{
        display: flex;
        line-height: 40px;
        div{
          margin-left: 20px;
          width: 100px;
        }
        .pulishTime{
          flex: 1;
        }
        .author-name{
          color: #fd8a4d;
          &:hover{
            text-underline: #fd8a4d;
            cursor: pointer;
            border-bottom: 1px solid #fd8a4d;
          }
        }
      }
    }
  }
}


</style>