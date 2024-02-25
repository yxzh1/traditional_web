<template>
	<div class="traveller-author-view">
		<div class="main">
			<div class="travs_position">
				<router-link to="/dress" title="民族服饰说">民族服饰</router-link>
<!--				<strong> >xxx的专栏</strong>-->
				<span style="color: #fd8a4d"> >{{aboutArticleInfo.dress_title}}</span>
			</div>

<!--			<h1 style="text-align: center">{{aboutArticleInfo.dress_title}}</h1>-->

<!--			<div class="top-extra">-->
<!--				<div class="author">By <span>{{'匿名'}}</span></div>-->
<!--				<div class="publish_time">-->
<!--					<i class="el-icon-time"></i>-->
<!--					{{aboutArticleInfo.dress_publishTime}}-->
<!--				</div>-->
<!--				<div class="view">-->
<!--					<i class="el-icon-view"></i>-->
<!--					已经有 <span>{{aboutArticleInfo.dress_view}}</span> 人阅读-->
<!--				</div>-->
<!--			</div>-->

			<div class="article-wrapper" v-html="aboutArticleInfo.dress_content"></div>
		</div>

	</div>
</template>

<script>
	export default {
		name: "NoteDetail",
		components:{
		},
		data(){
			return{
				//文章及其作者信息
				aboutArticleInfo:{
          dress_title: '',
          dress_publishTime: '',
          dress_view: '',
          dress_content: ''
        },
			}
		},
		methods:{
			//初始化数据
			initTravellerAuthorArtice(){
        this.$axios.get(this.$httpsUrl+"/hys/dress/getByDressId?dressId=" + this.aboutArticleInfo.id).then(res => res.data).then(res =>{
					console.log("aboutArticleInfo---",res);
					if(res.code === 200){
						this.aboutArticleInfo = res.data;
					}
				})
			},
		},
		created() {
			this.aboutArticleInfo.id = this.$route.params.id
			this.initTravellerAuthorArtice();
		},
	}
</script>

<style lang="less" scoped>
	.traveller-author-view{
		width: 100%;
		display: flex;
		.main{
			flex: 1;
			.travs_position{
				height: 18px;
				margin: 23px 0 33px;
			}
			.top-extra{
				display: flex;
				padding: 0 60px 0 0;
				line-height: 40px;
				.publish_time{
					flex: 1;
					margin-left: 20px;
					margin-right: 20px;
				}
				span{
					color: #fd8a4d;
					font-weight: bold;
				}
			}
			.article-wrapper{
        text-align: center;
				h1 {
          text-align: center;
        }
        :deep(.contentBox) {
          width: 60%;
          margin: 0 auto;
          text-align: center;
          text-indent: 2em;
          p {
            text-align: center;
          }
        }
			}
		}

		.side{
			width: 400px;
			border: 1px solid #ddd;
      border-radius: 8px;
			padding: 0 10px;

			h2{
				font-size: 28px;
				font-weight: bold;
				color: #ff8a87;
			}
		}
	}
</style>
