<template>

  <div class="index-view">
    <div id="header-outer">
      <div style="display: flex;margin: auto;width: 90%;">
        <div style="width: 200px;height: 100%;">
          <el-image
              style="width: 70px; height: 60px;line-height: 60px;"
              :src="require('@/assets/ChinaTrad_logo.png')"
              fit="fill"></el-image>
        </div>

        <div class="head-nav" style="flex: 3;">
          <el-menu
              :default-active="navActiveIndex"
              router
              class="el-menu-demo"
              mode="horizontal"
              active-text-color="#ffd04b">
            <el-menu-item index="/home" >首页</el-menu-item>
            <el-menu-item index="/festivals">民族节日</el-menu-item>
            <el-menu-item index="/dress">民族服饰</el-menu-item>
            <el-menu-item index="/heritage">非物质文化遗产</el-menu-item>
            <el-menu-item index="/bbs">社区</el-menu-item>
<!--            <el-menu-item index="/about">关于我</el-menu-item>-->
          </el-menu>
        </div>

        <div style="flex: 1;line-height: 60px;">
          <el-input
              size="medium "
              placeholder="请输入内容"
          >
            <el-button slot="append" type="success" icon="el-icon-search"></el-button>
          </el-input>
        </div>

        <div v-if="userInfo.isValid === 0" style="float: right;line-height: 60px;margin-left: 30px;">
          <el-dropdown class="userinfo-dropdown" @command="handleCommand">
								<span class="el-dropdown-link">
									<el-image
                      style="width: 55px; height: 55px;border-radius:50%"
                      :src="'/api' + userInfo.userAvatar"
                      fit="cover">
									</el-image>
								</span>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item command="adminManagement"><i class="el-icon-s-platform"></i>后台管理</el-dropdown-item>
              <el-dropdown-item command="userInfo"><i class="el-icon-user"></i>个人中心</el-dropdown-item>
              <el-dropdown-item command="setting"><i class="el-icon-setting"></i>设置</el-dropdown-item>
              <el-dropdown-item command="logout"><i class="el-icon-s-flag"></i>注销登录</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
        </div>

        <div class="btns" style="float: right;line-height: 60px;" v-else>
          &nbsp; &nbsp; &nbsp;
          <el-button type="success" size="medium" @click="$router.push('/login')">登录</el-button>
          <span style="margin-left: 20px"></span>
          <el-button type="warning" size="medium" @click="$router.push('/register')">注册</el-button>
        </div>

      </div>
    </div>

    <el-dialog
        title="个人中心"
        :visible.sync="dialogVisible"
        width="1000px">
      <div>
        <div>
          <image-preview :src="form.userAvatar" :width="100" :height="100" style="position: relative; left: 20px; bottom:15px;"/>
          <span style="position: relative; bottom: 40px; font-size: 20px; left: 45px;">{{form.nickName}}</span>
        </div>
        <el-descriptions class="margin-top" :column="3" border>
          <template slot="extra">
            <el-button type="primary" size="small" @click="editUserInfo">修改</el-button>
          </template>
          <el-descriptions-item>
            <template slot="label">
              <i class="el-icon-user"></i>
              账号
            </template>
            {{userInfo.userName}}
          </el-descriptions-item>
          <el-descriptions-item>
            <template slot="label">
              <i class="el-icon-lock"></i>
              密码
            </template>
            {{userInfo.userPassword}}
          </el-descriptions-item>
          <el-descriptions-item>
            <template slot="label">
              <i class="el-icon-mobile-phone"></i>
              手机号
            </template>
            {{userInfo.userPhone}}
          </el-descriptions-item>
          <el-descriptions-item>
            <template slot="label">
              <i class="el-icon-female"></i>
              性别
            </template>
            <el-tag :type="getTagType()"> {{genderText}}</el-tag>
          </el-descriptions-item>
          <el-descriptions-item>
            <template slot="label">
              <i class="el-icon-star-on"></i>
              年龄
            </template>
            {{userInfo.userAge}}
          </el-descriptions-item>
          <el-descriptions-item>
            <template slot="label">
              <i class="el-icon-message"></i>
              邮箱
            </template>
            {{userInfo.userEmail}}
          </el-descriptions-item>
        </el-descriptions>
      </div>
    </el-dialog>

    <el-dialog
        title="修改个人信息"
        :visible.sync="open"
        width="1500px"
        :before-close="handleClose"
        @close="getList"
        append-to-body>
      <el-form ref="form" :inline="true" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="头像" prop="userAvatar">
          <image-upload v-model="form.userAvatar" />
        </el-form-item>
        <el-form-item label="昵称" prop="nickName">
          <el-input v-model="form.nickName" placeholder="请输入昵称" />
        </el-form-item>
        <el-form-item label="账号" prop="userName">
          <el-input v-model="form.userName" placeholder="请输入账号" />
        </el-form-item>
        <el-form-item label="密码" prop="userPassword">
          <el-input v-model="form.userPassword" placeholder="请输入密码" />
        </el-form-item>
        <el-form-item label="手机号" prop="userPhone">
          <el-input v-model="form.userPhone" placeholder="请输入联系方式" />
        </el-form-item>
        <el-form-item label="性别" prop="userSex">
          <el-radio-group v-model="form.userSex">
            <el-radio :label="0">男</el-radio>
            <el-radio :label="1">女</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="年龄" prop="userAge">
          <el-input v-model="form.userAge" placeholder="请输入年龄" />
        </el-form-item>
        <el-form-item label="邮箱" prop="userEmail">
          <el-input v-model="form.userEmail" placeholder="请输入邮箱" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    <!--    回到顶部-->
<!--    <el-backtop target=".page-component__scroll .el-scrollbar__wrap"></el-backtop>-->
  </div>

</template>

<script>
  import ImageUpload from '@/components/ImageUpload/index';
  import ImagePreview from '@/components/ImagePreview/index';
export default {
  name: "HeaderP",
  components:{ImageUpload,ImagePreview},
  data(){
    return{
      userInfo: '',
      navActiveIndex:"/home",
      open: false,
      dialogVisible: false,
      TagType: '',
      options: [{
        value: '0',
        label: '男'
      }, {
        value: '1',
        label: '女'
      }],
      // 表单参数
      form: {},
      // 表单校验
      rules: {}
    }
  },
  computed: {
    genderText() {
      return this.userInfo.userSex === 1 ? '女' : '男';
    }
  },
  created() {
   this.initUserInfo()
  },
  methods:{
    initUserInfo(){
      this.userInfo = this.$store.state.login_user
      this.form = this.$store.state.login_user
    },
    handleClose(done) {
      this.form = this.$store.state.login_user
      done();
    },
    getList(){
      this.$axios.get(this.$httpsUrl + '/hys/user/' + this.userInfo.userId).then(res => res.data).then(res => {
        if(res.code === 200){
          this.$store.commit('setUser',res.data)
          sessionStorage.setItem("CurUser",JSON.stringify(res.data))
          this.initUserInfo()
        }
      })
    },
    getTagType(){
      if(this.form.userSex === 1){
        this.TagType = 'danger'
      }
      return this.TagType
    },
    handleCommand(command) {
      if (command === "adminManagement") {
        // window.location.href = "http://localhost:80/";
        window.open('http://localhost:80/')
      }
      if (command === "userInfo") {
        this.dialogVisible = true
        // this.$router.push("/user/info/")
      }
      if (command === "setting") {
        // this.$router.push("/user/setting/")
      }
      if (command === "logout") {
        this.logout()

      }
    },
    logout(){
      this.$confirm('确定退出?','提示',{
        confirmButtonText: '确定',
        cancelButtonText: "取消",
        cancelButtonClass: "el-message-box__btns",
        type: 'warning',
        center: true,
      })
          .then(()=>{
            //点确定走这里
            this.$message({
              type: 'success',
              message: '退出登录成功'
            })
            this.$store.commit("removeLoginUser")
            this.$router.push('/')
            //当前页面的刷新
            this.$router.go(0)
            sessionStorage.clear()
          })
          .catch(()=>{
            //点取消走这里
            this.$message({
              type: 'info',
              message: '取消退出'
            })
          })
    },
    // 取消按钮
    cancel() {
      this.open = false;
      // this.reset();
    },
    // reset(){
    //   // this.form =
    // },
    submitForm(){
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.userId != null) {
            this.$axios.put(this.$httpsUrl + '/hys/user',this.form).then(res => res.data).then(res => {
              if(res.code === 200){
                // this.Message.success("修改成功");
                this.$notify.success("修改成功");
                this.open = false;
                this.getList();
              }
            })
            // updateArticle(this.form).then(response => {
            //   this.$modal.msgSuccess("修改成功");
            //   this.open = false;
            //   this.getList();
            // });
          }
        }
      });
    },
    editUserInfo(){
      this.open = true;
    }

  }
}
</script>

<style lang="less" >

.el-message-box__btns{
  text-align: center;
  // 交换 确定 和 取消 按钮的位置
  .el-button:nth-child(1) {
    float: right;
    margin-right: 32%;
  }
  .el-button:nth-child(2) {
    float: left;
    margin-left: 35%;
  }
}

.index-view {
  position: relative;
  width: 100vw;
  height: auto;

  #header-outer {
    width: 100%;
    height: 60px;
    background-color: white;
    position: fixed;
    top: 0;
    left: 0;
    z-index: 100;
    box-shadow: 0 2px 3px #ddd;

    .head-nav {
      .el-menu-item {
        font-size: 20px;
      }
    }

  }
}

.middle-container {
  width: 90vw;
  min-height: 800px;
  margin: 80px auto 20px auto;
  /*border: 1px solid red;*/
}

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