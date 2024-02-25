<template>
	<div class="traveller-author-view">
		<div class="main">
			<div class="travs_position">
				<router-link to="/home" title="文化播报">文化播报</router-link>
<!--				<strong> >xxx的专栏</strong>-->
				<span style="color: #fd8a4d"> >{{aboutArticleInfo.author_note_title}}</span>
			</div>
			<div class="article-wrapper" v-html="aboutArticleInfo.author_note_detail_content"></div>
		</div>

	</div>
</template>

<script>
	export default {
		name: "HomeNoteDetail",
		components:{
		},
		data(){
			return{
				//文章及其作者信息
				aboutArticleInfo:{
          id: '',
          author_note_title: '',
          author_note_detail_content: ''
        },
			}
		},
		methods:{
			//初始化数据
			initTravellerAuthorArtice(){
        this.$axios.get(this.$httpsUrl+"/hys/note/getByAuthorNoteId?authorNoteId=" + this.aboutArticleInfo.id).then(res => res.data).then(res =>{
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
        :deep(.content) {
          width: 80%;
          margin:0 auto;
          p {
            text-align: center;
          }
          #infContent1{
            font-size: 20px;
          }
          .infos{
            font-size: 16px;
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
