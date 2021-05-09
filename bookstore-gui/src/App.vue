<template>
  <div class="container">
    <Navbar />
    <Bookstore />
  </div>
</template>

<script>
import Navbar from "./components/Navbar.vue";
import Bookstore from "./components/Bookstore.vue";

export default {
  name: "App",
  components: {
    Bookstore,
    Navbar,
  },
};
</script>

<style></style>
