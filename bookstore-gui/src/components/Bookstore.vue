<template>
  <table class="table">
    <thead>
      <tr>
        <th scope="col">#</th>
        <th scope="col">Author</th>
        <th scope="col">Title</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="(item) in items" v-bind:key="item.id">
        <th scope="row">{{item.id}}</th>
        <td>{{item.author}}</td>
        <td>{{item.title}}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
import axios from 'axios';

export default {
  name: "Bookstore",
  props: {
    msg: String,
  },
  data () {
      return {
        items: []
      }
    },
    mounted () {
      axios
        .get('http://localhost:8090/books')
        .then(response => { console.log(response); this.items = response.data;})
    }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
