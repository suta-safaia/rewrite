<template>
  <div class="save-friend popup">
    <div class="save-friend-contain">
      <div class="save-friend-title">

      </div>
      <div class="save-friend-form">
        <div class="save-friend-form-no">
          234
        </div>
        <div class="save-friend-form-name">
          <input placeholder="告诉我的ta的名字吧"/>
        </div>
        <div style="clear:both;"></div>
        <div class="save-friend-form-content">
          <div class="save-friend-form-content-text" contenteditable="true">

          </div>
        </div>
      </div>
      <div class="save-friend-bottom">
        <div class="save-friend-bottom-operation">
          <button>保存</button>
          <button>取消</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>


export default {
  name: 'SaveFriend',
  data() {
    return {
    }
  },
  props: {

  },
  mounted () {

  },
  methods: {

  }
}

</script>

<style>

.save-friend {
  background: rgb(183, 135, 118);
  border-radius: 40px;
}

.save-friend-contain {
  width: 100%;
  height: 100%;
}

.save-friend-form {
  width: 100%;
  height: 80%;
}

.save-friend-form-no {
  width: 80px;
  height: 80px;
  float: left;
  border-radius: 40px;
  background: rgb(148, 102, 82);
  margin-top: 50px;
  margin-left: 50px;
  line-height: 80px;
  text-align: center;
  font-size: 30px;
  color: white;
}

.save-friend-form-name {
  float: left;
  margin-top: 50px;
  margin-left: 20px;
}

.save-friend-form-name input {
  height: 80px;
  width: 360px;
  font-size: 35px;
  border: none;
  outline: none;
  background: rgb(183, 135, 118);
}

.save-friend-form-content {
  font-size: 20px;
  clear: both;
  margin-top: 30px;
  margin-left: 100px;
  width: 60%;
  height: 80%;
  overflow-y: auto;
  background-image: url(~@/staticData/underline.png);
  background-attachment: local;
}

.save-friend-form-content-text {
  padding-left: 15px;
  padding-right: 15px;
  border:none;
  outline:none;
  line-height: 50px;
}

.save-friend-bottom {
  height: 100%;
}

.save-friend-bottom-operation {
  position: absolute;
  bottom: 80px;
  right: 300px;
}
</style>

<style scoped>
::-webkit-scrollbar{
  display: none;
}
</style>
