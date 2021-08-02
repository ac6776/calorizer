new Vue({
  el: '#app',
  data() {
    return {
      info: 'Hello'
    };
  },
  mounted() {
    axios
      .get('http://localhost:8079/api')
      .then(response => {
        this.info = response;
        console.log(response)
      });
  }
});