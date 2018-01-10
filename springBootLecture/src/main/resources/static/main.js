'use strict';

function createHero() {
    var heroName = $("#hero-name").val();

    var request = {
        type: "POST",
        url: "/heroesUniqueCreate",
        headers: {
            'Accept': 'application/json;charset=UTF-8',
            'Content-Type': 'application/json;charset=UTF-8'
        },
        data: JSON.stringify({
            name: heroName
        })
    };
    $.ajax(request)
        .done(function () {
            alert("Hero created");
        })
        .fail(function (response) {
            alert("Error: " + response.responseJSON.message);
        });
}