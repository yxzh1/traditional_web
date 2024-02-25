<template>
  <div class="login-view">
    <div class="login-card">
      <div class="title" style="height: 70px;line-height: 60px;">
        <div style="display: flex;">
          <el-image
              style="width: 60px; height: 50px"
              :src="require('@/assets/ChinaTrad_logo.png')"
              fit="fill"></el-image>
          <div style="font-size:28px;margin-left: 50px;line-height: 60px;font-weight: bold;font-style: italic;">
            星光不负赶路人
          </div>
        </div>
      </div>

      <el-form
          :model="ruleForm"
          :rules="rules"
          ref="loginRuleForm"
          label-width="100px"
          label-position="left"
          class="demo-ruleForm">
        <el-form-item label="用户名" prop="username">
          <el-input v-model="ruleForm.username"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password">
          <el-input v-model="ruleForm.password" type="password" show-password autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="验证码" prop="verify_code">
          <el-row>
            <el-col :span="15">
              <el-input v-model="ruleForm.verify_code"></el-input>
            </el-col>
            <el-col :span="8" :offset="1">
              <el-image id="verify_captcha" @click="updateCaptcha"
                        style="width: 100%; height: 48px"
                        :src="captchaPath"
                        fit="scale-down"></el-image>
            </el-col>
          </el-row>
        </el-form-item>

        <el-form-item>
          <el-button type="success" style="width: 100%;" @click="submitForm">登录</el-button>
        </el-form-item>
        <el-form-item>
          <el-button type="warning" style="width: 100%;" @click="$router.push('register')">注册</el-button>
        </el-form-item>

      </el-form>
    </div>

    <!--粒子特效-->
    <vue-particles
        color="#dedede"
        :particleOpacity="0.7"
        :particlesNumber="80"
        shapeType="circle"
        :particleSize="4"
        linesColor="#dedede"
        :linesWidth="1"
        :lineLinked="true"
        :lineOpacity="0.4"
        :linesDistance="150"
        :moveSpeed="3"
        :hoverEffect="true"
        hoverMode="grab"
        :clickEffect="true"
        clickMode="push">
    </vue-particles>
  </div>
</template>

<script>

export default {
  name: "LoginP",
  components: {},
  data() {
    return {
      captchaPath: '',
      ruleForm: {
        username: "k98765",
        password: "123456",
        verify_code: "",
      },
      rules: {
        username: [
          {required: true, message: "请输入用户名", trigger: "blur"},
          {min: 2, max: 18, message: "长度在 2 到 18 个字符", trigger: "blur"}
        ],
        password: [
          {required: true, message: "请输入密码", trigger: "blur"},
          {min: 3, max: 18, message: "长度在 3 到 18 个字符", trigger: "blur"}
        ],
        verify_code: [
          {required: true, message: "请输入验证码", trigger: "blur"},
        ]
      }
    };
  },
  created() {
    this.captchaPath = '/api/hys/user/captchaImage'
  },
  // mounted() {
  //   this.updateCaptcha()
  // },
  methods: {
    submitForm() {
      this.$refs.loginRuleForm.validate((valid) => {
        if (valid) {
          this.$axios.post(this.$httpsUrl+'/hys/user/login', {
            "param":{
              ...this.ruleForm
            }
          }).then(res=>res.data).then(res => {
            console.log(res);
            if (res.code === 200) {
              this.$notify.success("登录成功！");
              //储存
              sessionStorage.setItem("CurUser",JSON.stringify(res.data.user))
              //提交路由信息
              // this.$store.commit("setMenu",res.data.menu)
              this.$store.commit("setUser",res.data.user)
              //跳转主页
              this.$router.replace("/")
            } else {
              alert("校验失败，用户名或密码错误!")
            }
          })
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
    updateCaptcha() {
      // this.$notify.success("更新验证码");
      this.captchaPath = "/api/hys/user/captchaImage?" + Math.random()
    },
  }
};
</script>

<style scoped>
.login-view {
  position: relative;
  background-image: url('~@/assets/images/common/login_bg.jpg');
  background-size: cover;
  width: 100vw;
  height: 100vh;
}

.login-card {
  width: 500px;
  height: 400px;
  position: absolute;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  margin: auto;
  padding: 15px 30px 10px 30px;
  border-radius: 8px;
  box-shadow: 0 0 3px #ddd;
  background-color: white;
}
</style>
