<template>
  <div>
    <ul id="ulSetting">
      <li @click="goLogin">不可思议</li>
      <li>导航栏</li>
      <li>光标小下划线</li>
      <li>PURE CSS</li>
      <li>Nav Underline</li>
    </ul>
  </div>
</template>

<script>
export default {
  methods: {
    goLogin() {
      this.$router.push({ path: "/login-in" });
    },
  },
};
</script>

<style>
#ulSetting {
  display: flex;
  position: absolute;
  width: 800px;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  list-style: none;
}

#ulSetting li {
  position: relative;
  padding: 20px;
  font-size: 24px;
  color: #000;
  transition: 0.1s all linear;
  cursor: pointer;
}

#ulSetting li::before {
  content: "";
  position: absolute;
  top: 0;
  left: 100%;
  width: 0;
  height: 100%;
  border-bottom: 2px solid #000;
  transition: 0.2s all linear;
}

#ulSetting li:hover::before {
  width: 100%;
  top: 0;
  left: 0;
  transition-delay: 0.1s;
  border-bottom-color: #000;
}

#ulSetting li:hover ~ li::before {
  left: 0;
}

#ulSetting li:active {
  background: #000;
  color: #fff;
}
</style>