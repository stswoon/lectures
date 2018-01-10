function attachSimpleScroll() {
    window.onscroll = function () {
        var scrolled = window.pageYOffset || document.documentElement.scrollTop;
        alert("Y scroll = " + scrolled);
    }
}

function attachDebounceScroll() {
    var timerId = null;
    window.onscroll = function () {
        clearTimeout(timerId);
        timerId = setTimeout(function () {
            var scrolled = window.pageYOffset || document.documentElement.scrollTop;
            alert("Y scroll = " + scrolled);
        }, 200);
    }
}