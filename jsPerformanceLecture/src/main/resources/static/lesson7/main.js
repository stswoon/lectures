$(document).ready(function () {
    for (var i = 1; i < 1001; ++i) {
        var div = $("<div class='size'></div>");
        $("#content").append(div);
        if (i % 10 === 0) {
            $("#content").append($("<br/>"));
        }
    }
});

var frameId;
var sizeAdd = 0;

function tick() {
    ++sizeAdd;
    $(".size").height(30 + sizeAdd * 2);
    frameId = requestAnimationFrame(tick)
}


function startSize() {
    frameId = requestAnimationFrame(tick);
}

function stopSize() {
    sizeAdd = 0;
    cancelAnimationFrame(frameId);
}
