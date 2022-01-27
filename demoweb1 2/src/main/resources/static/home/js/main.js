window.addEventListener("load", function () {
    truncateCardTitle();
});

function truncateCardTitle() {
    var cardList = document.getElementsByClassName("card-title");
    console.log(cardList);
    for (var i = 0; i < cardList.length; i++) {
        var text = cardList[i].innerHTML;
        var newText = truncateString(text, 35);
        cardList[i].innerHTML = newText;
    }
}

function truncateString(str, num) {
    if (str.length > num) {
        return str.slice(0, num) + "...";
    }
}



let cart = document.querySelectorAll('.add-cart');
for(let i = 0; i < cart.length; i++){
    cart[i].addEventListener( 'click', () =>{
        cartNumber();
    })
}

function cartNumber(){
    let productNumbers = sessionStorage.getItem('cartNumbers',1);
    productNumbers = parseInt(productNumbers);
    if(productNumbers){
        sessionStorage.setItem('cartNumbers', productNumbers +1);
        document.querySelector('.myNavbar__cart p').textContent = productNumbers +1;
    }else{
        sessionStorage.setItem('cartNumbers', 1);
        document.querySelector('.myNavbar__cart p').textContent = 1;
    }
}


function onloadCartNumber(){
    let productNumbers = sessionStorage.getItem('cartNumbers');
    if(productNumbers){
        document.querySelector('.myNavbar__cart p').textContent = productNumbers;
    }
}
onloadCartNumber();


// function headerFix(){
//     window.onscroll = function () {
        
//         if (document.body.scrollTop > 200 || document.documentElement.scrollTop > 200) {
//             document.getElementById("header").style.transform = "translate(0,0)";
//         } else {
//             document.getElementById("header").style.transform = "translate(0,0)";
//         }
//     }

// }
// headerFix();