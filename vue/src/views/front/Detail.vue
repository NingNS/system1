<template>
  <div class="main-content">
    <div style="width: 75%; margin: 10px auto;">
      <div style=" font-weight: 700; font-size: 16px; padding: 15px 30px; border-bottom: 1px solid #eeeeee">详情信息</div>
      <div style="display: flex; margin-top: 20px; padding: 0 60px">
        <div style="flex: 3; margin-right: 10px">
          <img :src="typeData.img" alt="" style="width: 100%; height: 500px; border-radius: 10px">
        </div>
        <div style="flex: 2; margin-left: 10px">
          <div style="font-size: 16px; font-weight: bold; margin: 0 15px">基本信息</div>
          <div style="font-size: 17px; margin: 15px 15px; display: flex; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">
            <span style="flex: 1">
              <i></i>类型：{{typeData.name}}
            </span>
            <span style="flex: 1">
              <i style="margin-left: 20px"></i>间数：{{typeData.num}}
            </span>
            <span style="flex: 1">
              <i style="margin-left: 20px"></i>酒店：{{typeData.hotelName}}
            </span>
          </div>

          <div style="font-size: 16px; font-weight: bold; margin: 10px 15px">洗浴用品</div>
          <div style="font-size: 14px; margin: 15px 15px;">
            <div style="display: flex; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">
<!--            <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙刷-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 洗发水-->
<!--            </span>-->
<!--            </div>-->
<!--            <div style="display: flex; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">-->
<!--            <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙刷-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 洗发水-->
<!--            </span>-->
              <h1>此处为详细信息</h1>
            </div>
          </div>

<!--          <div style="font-size: 16px; font-weight: bold; margin: 10px 15px">洗浴用品</div>-->
<!--          <div style="font-size: 14px; margin: 15px 15px;">-->
<!--            <div style="display: flex; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">-->
<!--            <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙刷-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 洗发水-->
<!--            </span>-->
<!--            </div>-->
<!--            <div style="display: flex; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">-->
<!--            <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙刷-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 洗发水-->
<!--            </span>-->
<!--            </div>-->
<!--          </div>-->

<!--          <div style="font-size: 16px; font-weight: bold; margin: 10px 15px">洗浴用品</div>-->
<!--          <div style="font-size: 14px; margin: 15px 15px;">-->
<!--            <div style="display: flex; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">-->
<!--            <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙刷-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 洗发水-->
<!--            </span>-->
<!--            </div>-->
<!--          </div>-->


<!--          <div style="font-size: 16px; font-weight: bold; margin: 10px 15px">洗浴用品</div>-->
<!--          <div style="font-size: 14px; margin: 15px 15px;">-->
<!--            <div style="display: flex; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">-->
<!--            <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙刷-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 洗发水-->
<!--            </span>-->
<!--            </div>-->
<!--            <div style="display: flex; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">-->
<!--            <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙刷-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 牙膏-->
<!--            </span>-->
<!--              <span style="flex: 1">-->
<!--              <i class="el-icon-circle-check"></i> 洗发水-->
<!--            </span>-->
<!--            </div>-->
<!--          </div>-->

          <div style="margin-left: 15px; margin-top: 25px; color: red; font-size: 16px">价格：￥ {{typeData.price}} / 晚</div>

          <div style="margin-left: 15px; margin-top: 25px">
            <el-button type="primary" @click="addCollect">加入收藏</el-button>
            <el-button type="success" @click="initDialog">立即预订</el-button>
          </div>
        </div>
      </div>
      <!--      <div style="font-weight: 700; font-size: 16px; padding: 15px 30px; border-bottom: 1px solid #eeeeee">评论信息</div>-->
      <div></div>
      <div>
        <el-dialog title="时间" :visible.sync="fromVisible" width="40%" :close-on-click-modal="false" destroy-on-close>
        <el-form label-width="100px" style="padding-right: 50px">
          <el-form-item prop="title" label="入住时间">
            <el-date-picker
                v-model="inTime"
                type="date"
                placeholder="选择日期" value-format="yyyy-MM-dd">
            </el-date-picker>
          </el-form-item>
          <el-form-item prop="typeId" label="离开时间">
            <el-date-picker
                v-model="outTime"
                type="date"
                placeholder="选择日期" value-format="yyyy-MM-dd">
            </el-date-picker>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button @click="fromVisible = false">取 消</el-button>
          <el-button type="primary" @click="save">确 定</el-button>
        </div>
      </el-dialog>
      </div>
    </div>
  </div>
</template>

<script>

export default {

  data() {
    let typeId = this.$route.query.id
    return {
      user:JSON.parse(localStorage.getItem('xm-user') || '{}'),
      typeData: {},
      typeId: typeId,
      fromVisible: false,
      form:{},
      inTime:null,
      outTime:null,
    }
  },
  mounted() {
    this.loadType()
  },
  // methods：本页面所有的点击事件或者其他函数定义区
  methods: {
    loadType() {
      this.$request.get('/type/selectById?id=' + this.typeId).then(res => {
        if (res.code === '200') {
          this.typeData = res.data
        } else {
          this.$message.error(res.msg)
        }
      })
    },
    addCollect() {
      let data = {userId: this.user.id, typeId: this.typeId}
      this.$request.post('/collect/add', data).then(res => {
        if (res.code === '200') {
          this.$message.success('收藏成功')
        } else {
          this.$message.error(res.msg)
        }
      })
    },
    initDialog(){
      this.fromVisible = true
    },
    save(){
      let data={
        userId: this.user.id,
        typeId: this.typeId,
        hotelId: this.typeData.hotelId,
        inTime:this.inTime,
        outTime:this.outTime,
      }
      this.$request.post('/orders/add', data).then(res => {
        if (res.code === '200') {  // 表示成功保存
          this.$message.success('预订成功')
          this.fromVisible = false
        } else {
          this.$message.error(res.msg)  // 弹出错误的信息
        }
      })
    },

  }
}
</script>