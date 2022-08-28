axios
  .get("json/6.json")
  .then(function (res) {
    console.log(res);
  })
  .catch(function (error) {
    console.log(error);
  });
