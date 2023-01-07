<template>
  <div id="outer">
    <!---->
    <div>
      <p style="float:right"> Memory</p>
    </div>
    <div>
      <div class="turn-page">
        <p>←&nbsp;&nbsp;&nbsp;1&nbsp;&nbsp;&nbsp;→</p>
      </div>
      <div id="contain" >
        <div class="friend-box" v-for="friend in friendList" :key="friend.id" :class="{showDetail:friend.id === hoverId}" @mouseenter="showDetail(friend.id)" @mouseleave="hideDetail(friend.id)">
          <div class="friend-no">
            {{friend.id}}
          </div>
          <div class="friend-name" >
            {{friend.name}}
          </div>
          <div class="friend-detail">
            sdfdafsa<br>dsafdsa
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import axios from "@/plugin/axiosInstance";

  export default {
    name: 'HomePage',
    data() {
      return {
        hoverId: -1,
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
      }
    }
  }

</script>

<style>

#outer {
  background-image: url(~@/staticData/87583161_p0.png);
  background-size: 100% 100%;
  height: 1234px;
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

.friend-no {
  width: 30px;
  float: left;
  border-radius: 15px;
  background: red;
  height: 30px;
  margin-top: 5px;
  margin-left: 5px;
  line-height: 30px;
  text-align: center;
  font-size: 12px;
  color: white;
}

.friend-box {;
  width: 23%;
  margin-left: 1%;
  margin-right: 1%;
  margin-top:15px;
  height: 40px;
  float: left;
  border-radius: 20px;
  background: rgba(0, 208, 255, 0.99);
  box-shadow: 2px 2px 3px 3px rgb(7, 115, 115);
}

.friend-name {
  font-size: 20px;
  font-weight: bolder;
  line-height: 38px;
  padding-left: 44px;
  color: white;
}

.friend-detail {
  position: relative;
  background: greenyellow;
  height: 250px;
  width: 130%;
  z-index: 999;
  left: 12px;
  padding-top: 5px;
  margin-right: 12px;
  display: none;
}

.showDetail .friend-detail {
  display: block;
}

</style>
