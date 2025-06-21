<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20231014/825464b6febd4bf2946d4b4b656195e3.jpg)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"padding":"50px 0 20px","boxShadow":"0px 26px 26px -30px #999","margin":"120px auto 60px","borderRadius":"12px","background":"radial-gradient(circle, rgba(245,245,245,1) 0%, rgba(255,255,255,1) 50%, rgba(245,245,245,1) 100%)","width":"35vw","position":"relative","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="false" :style='{"width":"100%","margin":"0 0 10px 0","lineHeight":"44px","fontSize":"20px","color":"rgba(64, 158, 255, 1)","textAlign":"center"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"margin":"20px auto 10px","color":"#333","top":"-90px","textAlign":"center","width":"100%","letterSpacing":"4px","lineHeight":"44px","fontSize":"30px","position":"absolute"}'>基于 web 的病历管理系统的设计与实现注册</p></div>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="huanzhezhanghao">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('huanzhezhanghao')?'required':''">患者账号：</div>
				<el-input v-model="registerForm.huanzhezhanghao"  placeholder="请输入患者账号" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="huanzhexingming">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('huanzhexingming')?'required':''">患者姓名：</div>
				<el-input v-model="registerForm.huanzhexingming"  placeholder="请输入患者姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="mima">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="mima2">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="xingbie">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in huanzhexingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="nianling">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('nianling')?'required':''">年龄：</div>
				<el-input v-model.number="registerForm.nianling"  placeholder="请输入年龄" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="lianxidianhua">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('lianxidianhua')?'required':''">联系电话：</div>
				<el-input v-model="registerForm.lianxidianhua"  placeholder="请输入联系电话" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="shenfenzhenghaoma">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('shenfenzhenghaoma')?'required':''">身份证号码：</div>
				<el-input v-model="registerForm.shenfenzhenghaoma"  placeholder="请输入身份证号码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="jiatingzhuzhi">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('jiatingzhuzhi')?'required':''">家庭住址：</div>
				<el-input v-model="registerForm.jiatingzhuzhi"  placeholder="请输入家庭住址" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='huanzhe'" prop="touxiang">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="huanzhetouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yisheng'" prop="yishengzhanghao">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('yishengzhanghao')?'required':''">医生账号：</div>
				<el-input v-model="registerForm.yishengzhanghao"  placeholder="请输入医生账号" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yisheng'" prop="yishengxingming">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('yishengxingming')?'required':''">医生姓名：</div>
				<el-input v-model="registerForm.yishengxingming"  placeholder="请输入医生姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yisheng'" prop="mima">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yisheng'" prop="mima2">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yisheng'" prop="xingbie">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in yishengxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yisheng'" prop="lianxifangshi">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('lianxifangshi')?'required':''">联系方式：</div>
				<el-input v-model="registerForm.lianxifangshi"  placeholder="请输入联系方式" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yisheng'" prop="zhiwei">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('zhiwei')?'required':''">职位：</div>
				<el-input v-model="registerForm.zhiwei"  placeholder="请输入职位" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yisheng'" prop="zhaopian">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('zhaopian')?'required':''">照片：</div>
                <file-upload
					tip="点击上传照片"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.zhaopian?registerForm.zhaopian:''"
					@change="yishengzhaopianUploadChange"
				></file-upload>
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"20px 0px 0 8vw","outline":"none","color":"#fff","borderRadius":"4px","background":"#ff3d00","display":"inline-block","width":"350px","fontSize":"16px","height":"44px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"0px auto 0px","color":"#666","textAlign":"right","display":"none","outline":"none","borderRadius":"4px","background":"none","width":"auto","fontSize":"16px","height":"44px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 20px","margin":"20px 0 20px","color":"#999","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"14px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
			<div class="idea1" :style='{"top":"-19px","left":"0","background":"url() no-repeat center top","display":"none","width":"40vw","position":"absolute","height":"66px"}'></div>
			<div class="idea2" :style='{"width":"100%","background":"blue","display":"none","height":"40px"}'></div>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {},
			forgetForm: {},
			rules: {},
			requiredRules: {},
            huanzhexingbieOptions: [],
            yishengxingbieOptions: [],
		}
    },
	mounted() {
		if(this.$route.query.pageFlag=='register'){
			this.tableName = this.$route.query.role;
			if(this.tableName=='huanzhe'){
				this.registerForm = {
					huanzhezhanghao: '',
					huanzhexingming: '',
					mima: '',
					mima2: '',
					xingbie: '',
					nianling: '',
					lianxidianhua: '',
					shenfenzhenghaoma: '',
					jiatingzhuzhi: '',
					touxiang: '',
				}
			}
			if(this.tableName=='yisheng'){
				this.registerForm = {
					yishengzhanghao: '',
					yishengxingming: '',
					mima: '',
					mima2: '',
					xingbie: '',
					lianxifangshi: '',
					zhiwei: '',
					zhaopian: '',
				}
			}
			if ('huanzhe' == this.tableName) {
				this.requiredRules.huanzhezhanghao = [{ required: true, message: '请输入患者账号', trigger: 'blur' }]
			}
			if ('huanzhe' == this.tableName) {
				this.requiredRules.huanzhexingming = [{ required: true, message: '请输入患者姓名', trigger: 'blur' }]
			}
			if ('huanzhe' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('yisheng' == this.tableName) {
				this.requiredRules.yishengzhanghao = [{ required: true, message: '请输入医生账号', trigger: 'blur' }]
			}
			if ('yisheng' == this.tableName) {
				this.requiredRules.yishengxingming = [{ required: true, message: '请输入医生姓名', trigger: 'blur' }]
			}
			if ('yisheng' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
		}
	},
    created() {
		this.pageFlag = this.$route.query.pageFlag;
		if(this.$route.query.pageFlag=='register'){
		  if ('huanzhe' == this.tableName) {
			this.rules.huanzhezhanghao = [{ required: true, message: '请输入患者账号', trigger: 'blur' }];
		  }
		  if ('huanzhe' == this.tableName) {
			this.rules.huanzhexingming = [{ required: true, message: '请输入患者姓名', trigger: 'blur' }];
		  }
		  if ('huanzhe' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
			this.huanzhexingbieOptions = "男,女".split(',');
		  if ('huanzhe' == this.tableName) {
			this.rules.nianling = [{ required: true, validator: this.$validate.isIntNumer, trigger: 'blur' }];
		  }
		  if ('huanzhe' == this.tableName) {
			this.rules.lianxidianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		  if ('huanzhe' == this.tableName) {
			this.rules.shenfenzhenghaoma = [{ required: true, validator: this.$validate.isIdCard, trigger: 'blur' }];
		  }
		  if ('yisheng' == this.tableName) {
			this.rules.yishengzhanghao = [{ required: true, message: '请输入医生账号', trigger: 'blur' }];
		  }
		  if ('yisheng' == this.tableName) {
			this.rules.yishengxingming = [{ required: true, message: '请输入医生姓名', trigger: 'blur' }];
		  }
		  if ('yisheng' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
			this.yishengxingbieOptions = "男,女".split(',');
		  if ('yisheng' == this.tableName) {
			this.rules.lianxifangshi = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		}
    },
    //方法集合
    methods: {
		changeRules(name){
			if(this.requiredRules[name]){
				return true
			}
			return false
		},
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      huanzhetouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      yishengzhaopianUploadChange(fileUrls) {
          this.registerForm.zhaopian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
				if((!this.registerForm.huanzhezhanghao) && `huanzhe` == this.tableName){
					this.$message.error(`患者账号不能为空`);
					return
				}
				if((!this.registerForm.huanzhexingming) && `huanzhe` == this.tableName){
					this.$message.error(`患者姓名不能为空`);
					return
				}
               if(`huanzhe` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `huanzhe` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
				if(`huanzhe` == this.tableName && this.registerForm.nianling &&(!this.$validate.isIntNumer2(this.registerForm.nianling))){
					this.$message.error(`年龄应输入整数`);
					return
				}
					if(`huanzhe` == this.tableName && this.registerForm.lianxidianhua &&(!this.$validate.isMobile2(this.registerForm.lianxidianhua))){
						this.$message.error(`联系电话应输入手机格式`);
						return
					}
					if(`huanzhe` == this.tableName && this.registerForm.shenfenzhenghaoma &&(!this.$validate.isIdCard2(this.registerForm.shenfenzhenghaoma))){
						this.$message.error(`身份证号码应输入身份证格式`);
						return
					}
				if((!this.registerForm.yishengzhanghao) && `yisheng` == this.tableName){
					this.$message.error(`医生账号不能为空`);
					return
				}
				if((!this.registerForm.yishengxingming) && `yisheng` == this.tableName){
					this.$message.error(`医生姓名不能为空`);
					return
				}
               if(`yisheng` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `yisheng` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
					if(`yisheng` == this.tableName && this.registerForm.lianxifangshi &&(!this.$validate.isMobile2(this.registerForm.lianxifangshi))){
						this.$message.error(`联系方式应输入手机格式`);
						return
					}
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20231014/825464b6febd4bf2946d4b4b656195e3.jpg);
		
		.el-input {
		  width: auto;
		}
		
		.el-date-editor.el-input {
			width: auto;
		}
		
		.el-form-item /deep/ .el-form-item__content {
						display: flex;
						width: 100%;
						flex-wrap: wrap;
					}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px;
						outline: none;
						color: #666;
						background: #fff;
						width: 300px;
						font-size: 14px;
						border-color: #ddd;
						border-width: 1px;
						border-style: solid;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px;
						outline: none;
						color: #666;
						background: #fff;
						width: auto;
						font-size: 14px;
						border-color: #ddd;
						border-width: 1px;
						border-style: solid;
						min-width: 300px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #666;
						background: #fff;
						width: auto;
						font-size: 14px;
						border-color: #ddd;
						border-width: 1px;
						border-style: solid;
						min-width: 300px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #666;
						background: #fff;
						width: auto;
						font-size: 14px;
						border-color: #ddd;
						border-width: 1px;
						border-style: solid;
						min-width: 300px;
						height: 40px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #ddd;
		  		  background: #fff;
		  		  width: 150px;
		  		  font-size: 32px;
		  		  border-color: #ddd;
		  		  border-width: 1px;
		  		  line-height: 60px;
		  		  border-style: solid;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #ddd;
		  		  background: #fff;
		  		  width: 150px;
		  		  font-size: 32px;
		  		  border-color: #ddd;
		  		  border-width: 1px;
		  		  line-height: 60px;
		  		  border-style: solid;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #ddd;
		  		  background: #fff;
		  		  width: 150px;
		  		  font-size: 32px;
		  		  border-color: #ddd;
		  		  border-width: 1px;
		  		  line-height: 60px;
		  		  border-style: solid;
		  		  text-align: center;
		  		  height: 60px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				left: 78px;
				position: absolute;
				content: "*";
				order: 2;
			}
</style>
