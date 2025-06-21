<template>
	<div>
		<div class="container" :style='{"minHeight":"100vh","width":"100%","alignItems":"center","background":"url(http://codegen.caihongy.cn/20240126/6145e2c35351411a81426b78728fd386.jpg)no-repeat center center / cover","justifyContent":"center","display":"flex"}'>
			<el-form v-if="pageFlag=='register'" :style='{"padding":"100px 20px 20px 50px","boxShadow":"0 1px 6px rgba(64, 158, 255, .8)","margin":"0","borderRadius":"10px","background":"#fff","width":"600px","position":"relative","height":"auto"}' ref="rgsForm" class="rgs-form" :model="rgsForm" :rules="rules">
				<div v-if="true" :style='{"margin":"0 0 10px 0","color":"#fff","top":"0px","textAlign":"center","left":"0px","background":"rgb(51, 136, 203)","width":"100%","letterSpacing":"3px","lineHeight":"60px","fontSize":"24px","position":"absolute","fontWeight":"600"}' class="title">基于 web 的病历管理系统的设计与实现注册</div>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('huanzhezhanghao')?'required':''">患者账号：</div>
					<el-input  v-model="ruleForm.huanzhezhanghao"  autocomplete="off" placeholder="患者账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('huanzhexingming')?'required':''">患者姓名：</div>
					<el-input  v-model="ruleForm.huanzhexingming"  autocomplete="off" placeholder="患者姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in huanzhexingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('nianling')?'required':''">年龄：</div>
					<el-input  v-model.number="ruleForm.nianling"  autocomplete="off" placeholder="年龄"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('lianxidianhua')?'required':''">联系电话：</div>
					<el-input  v-model="ruleForm.lianxidianhua"  autocomplete="off" placeholder="联系电话"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('shenfenzhenghaoma')?'required':''">身份证号码：</div>
					<el-input  v-model="ruleForm.shenfenzhenghaoma"  autocomplete="off" placeholder="身份证号码"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('jiatingzhuzhi')?'required':''">家庭住址：</div>
					<el-input  v-model="ruleForm.jiatingzhuzhi"  autocomplete="off" placeholder="家庭住址"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huanzhe'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('touxiang')?'required':''">头像：</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="huanzhetouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='yisheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('yishengzhanghao')?'required':''">医生账号：</div>
					<el-input  v-model="ruleForm.yishengzhanghao"  autocomplete="off" placeholder="医生账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='yisheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('yishengxingming')?'required':''">医生姓名：</div>
					<el-input  v-model="ruleForm.yishengxingming"  autocomplete="off" placeholder="医生姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='yisheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='yisheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='yisheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in yishengxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='yisheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('lianxifangshi')?'required':''">联系方式：</div>
					<el-input  v-model="ruleForm.lianxifangshi"  autocomplete="off" placeholder="联系方式"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='yisheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('zhiwei')?'required':''">职位：</div>
					<el-input  v-model="ruleForm.zhiwei"  autocomplete="off" placeholder="职位"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='yisheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('zhaopian')?'required':''">照片：</div>
                    <file-upload
                        tip="点击上传照片"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
                        @change="yishengzhaopianUploadChange"
                    ></file-upload>
				</el-form-item>
				<button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"20px auto 5px","outline":"none","color":"#fff","borderRadius":"8px","background":"rgb(51, 136, 203)","display":"block","width":"80%","fontSize":"16px","height":"44px"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0 10%","color":"#2a67b2","display":"inline-block","lineHeight":"1","fontSize":"12px","textDecoration":"underline"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>
			
		</div>
	</div>
</template>

<script>
export default {
	data() {
		return {
			ruleForm: {
			},
			forgetForm: {},
            pageFlag : '',
			tableName:"",
			rules: {},
            huanzhexingbieOptions: [],
            yishengxingbieOptions: [],
		};
	},
	mounted(){
		this.pageFlag = this.$route.query.pageFlag
		if(this.$route.query.pageFlag=='register'){
			
			let table = this.$storage.get("loginTable");
			this.tableName = table;
			if(this.tableName=='huanzhe'){
				this.ruleForm = {
					huanzhezhanghao: '',
					huanzhexingming: '',
					mima: '',
					xingbie: '',
					nianling: '',
					lianxidianhua: '',
					shenfenzhenghaoma: '',
					jiatingzhuzhi: '',
					touxiang: '',
				}
			}
			if(this.tableName=='yisheng'){
				this.ruleForm = {
					yishengzhanghao: '',
					yishengxingming: '',
					mima: '',
					xingbie: '',
					lianxifangshi: '',
					zhiwei: '',
					zhaopian: '',
				}
			}
			if ('huanzhe' == this.tableName) {
				this.rules.huanzhezhanghao = [{ required: true, message: '请输入患者账号', trigger: 'blur' }]
			}
			if ('huanzhe' == this.tableName) {
				this.rules.huanzhexingming = [{ required: true, message: '请输入患者姓名', trigger: 'blur' }]
			}
			if ('huanzhe' == this.tableName) {
				this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('yisheng' == this.tableName) {
				this.rules.yishengzhanghao = [{ required: true, message: '请输入医生账号', trigger: 'blur' }]
			}
			if ('yisheng' == this.tableName) {
				this.rules.yishengxingming = [{ required: true, message: '请输入医生姓名', trigger: 'blur' }]
			}
			if ('yisheng' == this.tableName) {
				this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			this.huanzhexingbieOptions = "男,女".split(',')
			this.yishengxingbieOptions = "男,女".split(',')
		}
	},
	created() {
	},
	destroyed() {
		  	},
	methods: {
		changeRules(name){
			if(this.rules[name]){
				return true
			}
			return false
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        huanzhetouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },
        yishengzhaopianUploadChange(fileUrls) {
            this.ruleForm.zhaopian = fileUrls;
        },

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
					if((!this.ruleForm.huanzhezhanghao) && `huanzhe` == this.tableName){
						this.$message.error(`患者账号不能为空`);
						return
					}
					if((!this.ruleForm.huanzhexingming) && `huanzhe` == this.tableName){
						this.$message.error(`患者姓名不能为空`);
						return
					}
					if((!this.ruleForm.mima) && `huanzhe` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `huanzhe` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					if(`huanzhe` == this.tableName && this.ruleForm.nianling &&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
						this.$message.error(`年龄应输入整数`);
						return
					}
					if(`huanzhe` == this.tableName && this.ruleForm.lianxidianhua &&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
						this.$message.error(`联系电话应输入手机格式`);
						return
					}
					if(`huanzhe` == this.tableName && this.ruleForm.shenfenzhenghaoma &&(!this.$validate.checkIdCard(this.ruleForm.shenfenzhenghaoma))){
						this.$message.error(`身份证号码应输入身份证格式`);
						return
					}
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					if((!this.ruleForm.yishengzhanghao) && `yisheng` == this.tableName){
						this.$message.error(`医生账号不能为空`);
						return
					}
					if((!this.ruleForm.yishengxingming) && `yisheng` == this.tableName){
						this.$message.error(`医生姓名不能为空`);
						return
					}
					if((!this.ruleForm.mima) && `yisheng` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `yisheng` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					if(`yisheng` == this.tableName && this.ruleForm.lianxifangshi &&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
						this.$message.error(`联系方式应输入手机格式`);
						return
					}
            if(this.ruleForm.zhaopian!=null) {
                this.ruleForm.zhaopian = this.ruleForm.zhaopian.replace(new RegExp(this.$base.url,"g"),"");
            }
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
						}
					});
				} else {
					this.$message.error(data.msg);
				}
			});
		}
	}
};
</script>

<style lang="scss" scoped>
	.container {
	  position: relative;
	  background: url(http://codegen.caihongy.cn/20240126/6145e2c35351411a81426b78728fd386.jpg)no-repeat center center / cover;

		.el-date-editor.el-input {
		  width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 3px solid rgb(201, 208, 220);
						border-radius: 8px;
						padding: 0 10px;
						outline: none;
						color: rgb(134, 150, 176);
						width: 400px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 3px solid rgb(201, 208, 220) ;
						border-radius: 8px;
						padding: 0 10px;
						outline: none;
						color: rgb(134, 150, 176);
						width: 400px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 3px solid rgb(201, 208, 220)   ;
						border-radius: 8px;
						padding: 0 10px 0 30px;
						outline: none;
						color: rgb(134, 150, 176);
						width: 400px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 3px solid rgb(201, 208, 220)   ;
						border-radius: 8px;
						padding: 0 10px 0 30px;
						outline: none;
						color: rgb(134, 150, 176);
						width: 400px;
						font-size: 14px;
						height: 44px;
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
		  		  border: 3px dashed rgb(201, 208, 220)   ;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: rgb(201, 208, 220)   ;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 160px;
		  		  text-align: center;
		  		  height: 160px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 3px dashed rgb(201, 208, 220)   ;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: rgb(201, 208, 220)   ;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 160px;
		  		  text-align: center;
		  		  height: 160px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 3px dashed rgb(201, 208, 220)   ;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: rgb(201, 208, 220)   ;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 160px;
		  		  text-align: center;
		  		  height: 160px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				left: -10px;
				position: absolute;
				content: "*";
			}
	.editor>.avatar-uploader {
		line-height: 0;
		height: 0;
	}
</style>
