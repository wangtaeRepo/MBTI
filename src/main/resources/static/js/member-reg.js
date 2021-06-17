function signUpMember() {
  //   alert("save");
  var form = document.querySelector("#insertForm");
  console.log("check");
  form.action = "/mbti/sign";
  form.method = "POST";
  form.submit();
}
