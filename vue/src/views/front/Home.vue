<template>
  <div class="main-content">
    <div style="position: absolute; font-size: 40px; font-weight: bold; color: white; font-style: italic; top: 200px; left: 100px">最棒的酒店预订系统，最漂亮的前台</div>
    <div>
      <img src="@/assets/imgs/result.jpg" style="width: 100%; height: 300px" alt="">
    </div>
    <div style="width: 60%; margin: 30px auto; text-align: left;">
      <div style="font-size: 25px; font-weight: bold;">探索中国</div>
      <el-carousel arrow="always" :interval="4000" style="margin-top: 30px;">
        <el-carousel-item>
          <div style="display: flex;">
            <div style="flex: 1;">
              <img src="@/assets/imgs/img.png" style="width: 100%; height: 175px; border-radius: 10px;" alt="">
              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF;">上海</div>
              <div style="font-size: 12px;  margin-top: 10px;">1840家住宿</div>
            </div>
            <div style="flex: 1;">
              <img src="@/assets/imgs/img_1.png" style="width: 100%; height: 175px; border-radius: 10px;" alt="">
              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF;">北京</div>
              <div style="font-size: 12px;  margin-top: 10px;">1352家住宿</div>
            </div>
            <div style="flex: 1;">
              <img src="@/assets/imgs/img_2.png" style="width: 100%; height: 175px; border-radius: 10px;" alt="">
              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF;">广州</div>
              <div style="font-size: 12px;  margin-top: 10px;">1739家住宿</div>
            </div>
            <div style="flex: 1;">
              <img src="@/assets/imgs/img_3.png" style="width: 100%; height: 175px; border-radius: 10px;" alt="">
              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF;">杭州</div>
              <div style="font-size: 12px;  margin-top: 10px;">723家住宿</div>
            </div>
          </div>
        </el-carousel-item>
        <el-carousel-item>
          <div style="display: flex;">
            <div style="flex: 1;">
              <img src="@/assets/imgs/img_4.png" style="width: 100%; height: 175px; border-radius: 10px;" alt="">
              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF;">苏州</div>
              <div style="font-size: 12px;  margin-top: 10px;">520家住宿</div>
            </div>
            <div style="flex: 1;">
              <img src="@/assets/imgs/img_5.png" style="width: 100%; height: 175px; border-radius: 10px;" alt="">
              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF;">西安</div>
              <div style="font-size: 12px;  margin-top: 10px;">981家住宿</div>
            </div>
            <div style="flex: 1;">
              <img src="@/assets/imgs/img_6.png" style="width: 100%; height: 175px; border-radius: 10px;" alt="">
              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF;">南京</div>
              <div style="font-size: 12px;  margin-top: 10px;">439家住宿</div>
            </div>
            <div style="flex: 1;">
              <img src="@/assets/imgs/img_7.png" style="width: 100%; height: 175px; border-radius: 10px;" alt="">
              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF;">青岛</div>
              <div style="font-size: 12px;  margin-top: 10px;">923家住宿</div>
            </div>
          </div>
        </el-carousel-item>
      </el-carousel>
    </div>

    <div style="width: 60%; margin: 50px auto; text-align: left">
      <div style=" font-size: 25px; font-weight: bold">特价优惠</div>
      <div style="margin-top: 30px">
        <el-row :gutter="20">
          <el-col :span="6" v-for="item in hotelData">
            <el-card :body-style="{ padding: '15px' }" shadow="hover" style = "border-radius: 12px">
            <img :src="item.avatar" style="width: 100%; height: 175px; border-radius: 10px" alt="">
            <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF">{{item.name}}</div>
            <div style="margin-top: 10px">
              <span style="font-weight: bold; font-size: 16px; color: red">￥{{item.price}}</span> 起
<!--              <span style="font-size: 14px; color: #455873FF; margin-left: 20px"><i class="el-icon-chat-line-square"></i> 1688点评</span>-->
            </div>
            </el-card>
          </el-col>
<!--          <el-col :span="6">-->
<!--            <el-card :body-style="{ padding: '15px' }" shadow="hover" style = "border-radius: 12px">-->
<!--              <img src="@/assets/imgs/img_9.png" style="width: 100%; height: 175px; border-radius: 10px" alt="">-->
<!--              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF">如家酒店</div>-->
<!--              <div style="margin-top: 10px">-->
<!--                <span style="font-weight: bold; font-size: 16px; color: red">￥180</span> 起-->
<!--                <span style="font-size: 14px; color: #455873FF; margin-left: 20px"><i class="el-icon-chat-line-square"></i> 1688点评</span>-->
<!--              </div>-->
<!--            </el-card>-->
<!--          </el-col>-->
<!--          <el-col :span="6">-->
<!--            <el-card :body-style="{ padding: '15px' }" shadow="hover" style = "border-radius: 12px">-->
<!--              <img src="@/assets/imgs/img_10.png" style="width: 100%; height: 175px; border-radius: 10px" alt="">-->
<!--              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF">全季酒店</div>-->
<!--              <div style="margin-top: 10px">-->
<!--                <span style="font-weight: bold; font-size: 16px; color: red">￥180</span> 起-->
<!--                <span style="font-size: 14px; color: #455873FF; margin-left: 20px"><i class="el-icon-chat-line-square"></i> 1688点评</span>-->
<!--              </div>-->
<!--            </el-card>-->
<!--          </el-col>-->
<!--          <el-col :span="6">-->
<!--            <el-card :body-style="{ padding: '15px' }" shadow="hover" style = "border-radius: 12px">-->
<!--              <img src="@/assets/imgs/img_11.png" style="width: 100%; height: 175px; border-radius: 10px" alt="">-->
<!--              <div style="font-size: 16px; font-weight: bold; margin-top: 10px; color: #455873FF">维也纳酒店</div>-->
<!--              <div style="margin-top: 10px">-->
<!--                <span style="font-weight: bold; font-size: 16px; color: red">￥180</span> 起-->
<!--                <span style="font-size: 14px; color: #455873FF; margin-left: 20px"><i class="el-icon-chat-line-square"></i> 1688点评</span>-->
<!--              </div>-->
<!--            </el-card>-->
<!--          </el-col>-->
        </el-row>
      </div>
    </div>
  </div>
</template>

<script>

export default {

  data() {
    return {
      hotelData:[],
    }
  },
  mounted() {
    this.loadHotels()
  },
  // methods：本页面所有的点击事件或者其他函数定义区
  methods: {
    loadHotels() {
      let data
      this.$request.get('/hotel/selectAll',{}).then(res => {
        if(res.code === '200'){
          this.hotelData=res.data;
        }else{
          this.$message.error(res.msg)
        }

      })
    }
  }
}
</script>

