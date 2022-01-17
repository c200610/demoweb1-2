var flag = true;
function showPass() {
    if (flag) {

        document.getElementById('password').type = "text";
        flag = false;
    } else {
        document.getElementById('password').type = "password";
        flag = true;
    }

}




