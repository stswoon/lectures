$(document).ready(function () {
    for (var i = 1; i < 1001; ++i) {
        var div = $("<div class='size'></div>");
        $("#content").append(div);
        if (i % 10 === 0) {
            $("#content").append($("<br/>"));
        }
    }
});

function startSize() {
    $(".size").addClass("scale");
}

function stopSize() {
    $(".size").removeClass("scale");
}
