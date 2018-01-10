$(document).ready(function () {
    for (var i = 1; i < 1001; ++i) {
        var div = $("<div class='size'></div>");
        $("#content").append(div);
        if (i % 10 === 0) {
            $("#content").append($("<br/>"));
        }
    }
});

function changeSize() {
    for (var i = 0; i < 10; ++i) {
        $(".size").height(30 + i * 2);
    }
}

