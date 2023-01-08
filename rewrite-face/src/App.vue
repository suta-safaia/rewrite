<template>
  <HelloWorld/>
</template>

<script>
import HelloWorld from './components/HomePage.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  height: 100vh;
}
html, body {
  margin: 0;
  padding: 0;
}

</style>
