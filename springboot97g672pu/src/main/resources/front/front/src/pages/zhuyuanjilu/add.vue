<template>
<div :style='{"width":"100%","padding":"30px 10% 40px","margin":"0px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"border":"0px solid #e9e9e9","width":"100%","padding":"0px","margin":"0px 0","position":"relative","background":"#fff"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
    >
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="床位编号" prop="chuangweibianhao">
            <el-input v-model="ruleForm.chuangweibianhao" 
                placeholder="床位编号" clearable :disabled=" false  ||ro.chuangweibianhao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="床位名称" prop="chuangweimingcheng">
            <el-input v-model="ruleForm.chuangweimingcheng" 
                placeholder="床位名称" clearable :disabled=" false  ||ro.chuangweimingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="床位图片" v-if="type!='cross' || (type=='cross' && !ro.chuangweitupian)" prop="chuangweitupian">
            <file-upload
            tip="点击上传床位图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.chuangweitupian?ruleForm.chuangweitupian:''"
            @change="chuangweitupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="床位图片" prop="chuangweitupian">
                <img v-if="ruleForm.chuangweitupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.chuangweitupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.chuangweitupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="科室" prop="keshi">
            <el-input v-model="ruleForm.keshi" 
                placeholder="科室" clearable :disabled=" false  ||ro.keshi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="床位费用" prop="chuangweifeiyong">
            <el-input v-model="ruleForm.chuangweifeiyong" 
                placeholder="床位费用" clearable :disabled=" false  ||ro.chuangweifeiyong"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="预约编号" prop="yuyuebianhao">
            <el-select  @change="yuyuebianhaoChange" v-model="ruleForm.yuyuebianhao" placeholder="请选择预约编号">
              <el-option
                  v-for="(item,index) in yuyuebianhaoOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="患者病史" prop="huanzhebingshi">
            <el-input v-model="ruleForm.huanzhebingshi" 
                placeholder="患者病史" clearable :disabled=" false  ||ro.huanzhebingshi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="病症症状" prop="bingzhengzhengzhuang">
            <el-input v-model="ruleForm.bingzhengzhengzhuang" 
                placeholder="病症症状" clearable :disabled=" false  ||ro.bingzhengzhengzhuang"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="病症诊断" prop="bingzhengzhenduan">
            <el-input v-model="ruleForm.bingzhengzhenduan" 
                placeholder="病症诊断" clearable :disabled=" false  ||ro.bingzhengzhenduan"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="患者账号" prop="huanzhezhanghao">
            <el-input v-model="ruleForm.huanzhezhanghao" 
                placeholder="患者账号" clearable :disabled=" false  ||ro.huanzhezhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="患者姓名" prop="huanzhexingming">
            <el-input v-model="ruleForm.huanzhexingming" 
                placeholder="患者姓名" clearable :disabled=" false  ||ro.huanzhexingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="联系电话" prop="lianxidianhua">
            <el-input v-model="ruleForm.lianxidianhua" 
                placeholder="联系电话" clearable :disabled=" false  ||ro.lianxidianhua"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="入院时间" prop="ruyuanshijian">
              <el-date-picker
				  :disabled=" false  ||ro.ruyuanshijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.ruyuanshijian" 
                  type="datetime"
                  placeholder="入院时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="医生账号" prop="yishengzhanghao">
            <el-input v-model="ruleForm.yishengzhanghao" 
                placeholder="医生账号" clearable :disabled=" false  ||ro.yishengzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="医生姓名" prop="yishengxingming">
            <el-input v-model="ruleForm.yishengxingming" 
                placeholder="医生姓名" clearable :disabled=" false  ||ro.yishengxingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="注意事项" prop="zhuyishixiang">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="注意事项"
              v-model="ruleForm.zhuyishixiang">
            </el-input>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"#333","borderRadius":"0px","background":"#b4ebcc","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #eee","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#333","borderRadius":"0px","background":"none","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				chuangweibianhao : false,
				chuangweimingcheng : false,
				chuangweitupian : false,
				keshi : false,
				chuangweifeiyong : false,
				yuyuebianhao : false,
				huanzhebingshi : false,
				bingzhengzhengzhuang : false,
				bingzhengzhenduan : false,
				huanzhezhanghao : false,
				huanzhexingming : false,
				lianxidianhua : false,
				zhuyishixiang : false,
				ruyuanshijian : false,
				yishengzhanghao : false,
				yishengxingming : false,
				ispay : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          chuangweibianhao: '',
          chuangweimingcheng: '',
          chuangweitupian: '',
          keshi: '',
          chuangweifeiyong: '',
          yuyuebianhao: '',
          huanzhebingshi: '',
          bingzhengzhengzhuang: '',
          bingzhengzhenduan: '',
          huanzhezhanghao: '',
          huanzhexingming: '',
          lianxidianhua: '',
          zhuyishixiang: '',
          ruyuanshijian: '',
          yishengzhanghao: '',
          yishengxingming: '',
          ispay: '',
        },
        yuyuebianhaoOptions: [],


        rules: {
          chuangweibianhao: [
          ],
          chuangweimingcheng: [
          ],
          chuangweitupian: [
          ],
          keshi: [
          ],
          chuangweifeiyong: [
          ],
          yuyuebianhao: [
          ],
          huanzhebingshi: [
          ],
          bingzhengzhengzhuang: [
          ],
          bingzhengzhenduan: [
          ],
          huanzhezhanghao: [
          ],
          huanzhexingming: [
          ],
          lianxidianhua: [
          ],
          zhuyishixiang: [
          ],
          ruyuanshijian: [
          ],
          yishengzhanghao: [
          ],
          yishengxingming: [
          ],
          ispay: [
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.ruyuanshijian = this.getCurDateTime()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='chuangweibianhao'){
              this.ruleForm.chuangweibianhao = obj[o];
              this.ro.chuangweibianhao = true;
              continue;
            }
            if(o=='chuangweimingcheng'){
              this.ruleForm.chuangweimingcheng = obj[o];
              this.ro.chuangweimingcheng = true;
              continue;
            }
            if(o=='chuangweitupian'){
              this.ruleForm.chuangweitupian = obj[o].split(",")[0];
              this.ro.chuangweitupian = true;
              continue;
            }
            if(o=='keshi'){
              this.ruleForm.keshi = obj[o];
              this.ro.keshi = true;
              continue;
            }
            if(o=='chuangweifeiyong'){
              this.ruleForm.chuangweifeiyong = obj[o];
              this.ro.chuangweifeiyong = true;
              continue;
            }
            if(o=='yuyuebianhao'){
              this.ruleForm.yuyuebianhao = obj[o];
              this.ro.yuyuebianhao = true;
              continue;
            }
            if(o=='huanzhebingshi'){
              this.ruleForm.huanzhebingshi = obj[o];
              this.ro.huanzhebingshi = true;
              continue;
            }
            if(o=='bingzhengzhengzhuang'){
              this.ruleForm.bingzhengzhengzhuang = obj[o];
              this.ro.bingzhengzhengzhuang = true;
              continue;
            }
            if(o=='bingzhengzhenduan'){
              this.ruleForm.bingzhengzhenduan = obj[o];
              this.ro.bingzhengzhenduan = true;
              continue;
            }
            if(o=='huanzhezhanghao'){
              this.ruleForm.huanzhezhanghao = obj[o];
              this.ro.huanzhezhanghao = true;
              continue;
            }
            if(o=='huanzhexingming'){
              this.ruleForm.huanzhexingming = obj[o];
              this.ro.huanzhexingming = true;
              continue;
            }
            if(o=='lianxidianhua'){
              this.ruleForm.lianxidianhua = obj[o];
              this.ro.lianxidianhua = true;
              continue;
            }
            if(o=='zhuyishixiang'){
              this.ruleForm.zhuyishixiang = obj[o];
              this.ro.zhuyishixiang = true;
              continue;
            }
            if(o=='ruyuanshijian'){
              this.ruleForm.ruyuanshijian = obj[o];
              this.ro.ruyuanshijian = true;
              continue;
            }
            if(o=='yishengzhanghao'){
              this.ruleForm.yishengzhanghao = obj[o];
              this.ro.yishengzhanghao = true;
              continue;
            }
            if(o=='yishengxingming'){
              this.ruleForm.yishengxingming = obj[o];
              this.ro.yishengxingming = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.yishengzhanghao!=''&&json.yishengzhanghao) || json.yishengzhanghao==0){
                this.ruleForm.yishengzhanghao = json.yishengzhanghao
            }
            if((json.yishengxingming!=''&&json.yishengxingming) || json.yishengxingming==0){
                this.ruleForm.yishengxingming = json.yishengxingming
            }
          }
        });
        this.$http.get('option/dianzibingli/yuyuebianhao', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.yuyuebianhaoOptions = res.data.data;
          }
        });

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },
      // 下二随
      yuyuebianhaoChange () {
        this.$http.get('follow/dianzibingli/yuyuebianhao?columnValue=' + this.ruleForm.yuyuebianhao, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            if(res.data.data.huanzhebingshi){
              this.ruleForm.huanzhebingshi = res.data.data.huanzhebingshi
            }
            if(res.data.data.bingzhengzhengzhuang){
              this.ruleForm.bingzhengzhengzhuang = res.data.data.bingzhengzhengzhuang
            }
            if(res.data.data.bingzhengzhenduan){
              this.ruleForm.bingzhengzhenduan = res.data.data.bingzhengzhenduan
            }
            if(res.data.data.huanzhezhanghao){
              this.ruleForm.huanzhezhanghao = res.data.data.huanzhezhanghao
            }
            if(res.data.data.huanzhexingming){
              this.ruleForm.huanzhexingming = res.data.data.huanzhexingming
            }
            if(res.data.data.lianxidianhua){
              this.ruleForm.lianxidianhua = res.data.data.lianxidianhua
            }
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`zhuyuanjilu/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('zhuyuanjilu/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`zhuyuanjilu/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`zhuyuanjilu/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      chuangweitupianUploadChange(fileUrls) {
          this.ruleForm.chuangweitupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 120px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px 0 30px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #ddd;
	  border-radius: 0px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: none;
	  width: 600px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
