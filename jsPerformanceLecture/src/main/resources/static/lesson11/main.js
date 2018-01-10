$(document).ready(function () {
    $("#tags-autocomplete").autocomplete({
        source: function (request, response) {
            $.get("/cities/" + request.term, function (data) {
                response(data);
            });
        },
        minLength: 1
    });


    var dataContainsS = [];
    $.get("/cities/S", function (data) {
        dataContainsS = data;
    });
    $("#tags-prediction").autocomplete({
        source: function (request, response) {
            if (request.term === "S") {
                response(dataContainsS)
            } else {
                $.get("/cities/" + request.term, function (data) {
                    response(data);
                });
            }
        },
        minLength: 1
    });
});