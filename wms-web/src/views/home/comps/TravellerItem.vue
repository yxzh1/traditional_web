<template>
	<div class="traveller-item">
		<div class="thumbnail">
			<el-image
					style="width: 100%; height: 180px;"
					:src="'/api' + article.authorNoteThumbnail"
					fit="cover"></el-image>
		</div>
		<div class="desc">
			<div class="title hvr-underline-reveal" @click="$router.push('/home/article/'+article.authorNoteId)">{{article.authorNoteTitle}}</div>
			<div class="content">{{article.authorNoteDescription}}</div>
		</div>
	</div>
</template>

<script>
	export default {
		name: "TravellerItem",
		props:{
			article:{
				type:Object,
				default(){
					return{}
				}
			}
		}
	}
</script>

<style lang="less" scoped>
	.traveller-item{
		padding: 20px 10px;
		border-bottom: 1px dashed #ddd;

		.thumbnail{
			width: 100%;
		}
		.desc {
			.title {
				margin: 10px 0 5px;
				font-size: 22px;
				width: 100%;
				color: #333;
				font-weight: normal;
				height: 36px;
				line-height: 36px;
				overflow: hidden;
				white-space: nowrap;
				text-overflow: ellipsis;
			}

			.content {
        text-indent: 2em;
				height: 60px;
				line-height: 20px;
				font-size: 16px;
				overflow: hidden;
			}
		}
	}
</style>