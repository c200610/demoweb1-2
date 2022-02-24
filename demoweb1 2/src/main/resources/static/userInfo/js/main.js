function costClick(){
document.getElementById("cost").style.visibility = "visible";
document.getElementById("info").style.visibility = "hidden";
document.getElementById("changePass").style.visibility = "hidden";
}

function infoClick(){
    document.getElementById("cost").style.visibility = "hidden";
    document.getElementById("info").style.visibility = "visible";
    document.getElementById("changePass").style.visibility = "hidden";
}
function changepasswordClick(){
  document.getElementById("cost").style.visibility = "hidden";
  document.getElementById("info").style.visibility = "hidden";
  document.getElementById("changePass").style.visibility = "visible";
}


function mysqlCostClick() {
    document.getElementById("iframe").src= "https://www.youtube.com/embed/tLQLa6lM3Us"
    
  }


function excelCostClick() {
    document.getElementById("iframe").src= "https://www.youtube.com/embed/EFUSUcbLHK0"
    
  }
  var flag = true;
  function showPass() {
      if (flag) {
  
          document.getElementById('newPassword').type = "text";
          flag = false;
      } else {
          document.getElementById('newPassword').type = "password";
          flag = true;
      }
  
  }
  