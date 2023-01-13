<template>
  <div class="friend-detail-box">
    <div class="friend-detail-title">
      <div class="friend-detail-title-number">
        {{friend.sno}}
      </div>
      <div class="friend-detail-title-name">
        {{friend.name}}
      </div>
      <div class="friend-detail-title-operation" @click="modifyFriend">
        编辑
      </div>
    </div>
    <div class="friend-detail-text">{{friend.content}}</div>
    <div class="friend-detail-text">  </div>
  </div>
</template>

<script>

export default {
  name: 'FriendDetail',
  data() {
    return {
      hoverId: -1,
      friendList: [],
    }
  },
  props: {
    friend: {}
  },
  mounted () {

  },
  methods: {
    modifyFriend() {
      this.$parent.openSaveFriend(this.friend);
    }
  }
}

</script>

<style>

.friend-detail-box {
  width: 180%;
  border-radius: 40px;
  min-height: 200px;
  background: rgb(203,167,148);
}

.friend-detail-title {
  height: 55px;
  padding-top: 15px;
  font-size: 30px;
}

.friend-detail-title-number {
  color: white;
  width: 80px;
  height: 38px;
  line-height: 38px;
  padding-left: 30px;
  border-radius: 18px 19px 19px 0;
  background: rgb(78,49,34);
  float: left;
}

.friend-detail-title-name {
  float: left;
  padding-left: 18px;
  font-weight: bold;
}

.friend-detail-title-operation {
  float: right;
  margin-right: 30px;
}

.friend-detail-text {
  margin-left: 10px;
  height: 26px;
  font-size: 20px;
  width: 90%;
  padding-left: 25px;
  padding-bottom: 4px;
  border-bottom: 2px solid white;
  font-weight: bold;
}

</style>
