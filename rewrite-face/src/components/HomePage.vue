<template>
  <div id="outer">
    <!---->
    <div>
      <button style="float:right" @click="openSaveFriend">生命数据录入</button>
    </div>
    <div>
      <div class="turn-page">
        <p>←&nbsp;&nbsp;&nbsp;1&nbsp;&nbsp;&nbsp;→</p>
      </div>
      <div id="contain" >
        <div class="friend-box" v-for="friend in friendList" :key="friend.id" :class="{'display-div':friend.id === hoverId}" @mouseenter="showDetail(friend.id)" @mouseleave="hideDetail(friend.id)">
          <div class="friend-no">
            {{friend.id}}
          </div>
          <div class="friend-name" >
            {{friend.name}}
          </div>
          <div class="friend-detail">
            <FriendDetail :friend="friend"/>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="cover" :class="{'hidden-div':showCover === 0}">

  </div>
  <SaveFriend :class="{'hidden-div':showSaveFriend === 0}"></SaveFriend>
</template>

<script>
  import axios from "@/plugin/axiosInstance";
  import FriendDetail from "@/components/FriendDetail";
  import SaveFriend from "@/components/SaveFriend";

  export default {
    name: 'HomePage',
    components: {SaveFriend, FriendDetail},
    data() {
      return {
        hoverId: -1,
        showCover: 0,
        showSaveFriend: 0,
        friendList: [],
      }
    },
    mounted () {
      this.queryAllFriend();
    },
    methods: {
      createIdIndex (id) {
        return "friend-box-" + id;
      },
      showDetail (id) {
        this.hoverId = id;
      },
      hideDetail () {
        this.hoverId = -1;
      },
      queryAllFriend () {
        axios({
          method: "get",
          url: "/getPageInfo",
        }).then(res => {
          this.friendList = res.data.friendPerInfoList;
        })
      },
      openSaveFriend() {
        this.showCover = 1;
        this.showSaveFriend = 1;
      },
      closeSaveFriend() {
        this.showCover = 0;
        this.showSaveFriend = 0;
        this.queryAllFriend();
      },
    }
  }

</script>

<style>

#outer {
  background-image: url(~@/staticData/87583161_p0.png);
  background-size: 100% 100%;
  height: 100%;
  margin: 0;
  padding: 0;
}

#contain {
  margin-left: 8%;
  margin-right: 8%;
}

.turn-page {
  height: 60px;
  clear: both;
  text-align: center;
  font-size: 50px;
  line-height: 50px;
}

.friend-box {;
  width: 23%;
  margin-left: 1%;
  margin-right: 1%;
  margin-top:22px;
  height: 44px;
  float: left;
  border-radius: 22px;
  background: rgb(78,49,34);
  box-shadow: 1px 2px 1px 1px rgba(78,49,34, 0.5);
}

.friend-no {
  width: 30px;
  float: left;
  border-radius: 15px;
  background: rgb(148, 102, 82);
  height: 30px;
  margin-top: 7px;
  margin-left: 7px;
  line-height: 30px;
  text-align: center;
  font-size: 12px;
  color: white;
}

.friend-name {
  font-size: 20px;
  font-weight: bold;
  line-height: 42px;
  padding-left: 48px;
  color: white;
}

.friend-detail {
  position: relative;
  z-index: 999;
  left: 12px;
  padding-top: 5px;
  margin-right: 12px;
  display: none;
}

.display-div.friend-box {
  background: rgb(203,167,148);
}

.display-div {
  display: block;
}

.hidden-div {
  display: none;
}

.display-div .friend-detail {
  display: block;
}

.cover {
  background: rgba(0,0,0,0.8);
  position: fixed;
  top:0;
  bottom: 0;
  left: 0;
  right: 0;
  display: none;
}

.popup {
  width: 100%;
  height: 100%;
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  margin: auto;
}

</style>
