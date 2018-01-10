var array = [];
for (var i = 0; i < Math.pow(10, 6); ++i) {
    // array.push({key: Math.ceil(Math.random()*1000));
    array.push({key: i, value: "a" + i});
}

var map = new Map();
array.forEach(function(item) {
    map.set(item.key, item);
});

var valueToFind = Math.ceil(Math.random()*Math.pow(10, 7));
document.addEventListener("DOMContentLoaded", function(event) {
    document.getElementById("valueToFind").innerHTML = valueToFind;
});

findInArray = function () {
    var t0 = performance.now();
    var result = array.find(function (item) {
        return item.key === valueToFind;
    });
    var t1 = performance.now();

    console.log(result);
    document.getElementById("result-array").innerHTML = t1 - t0 + " ms";
};

findInArray2 = function () {
    var i = 0;
    var n = array.length;
    var result;
    var t0 = performance.now();
    for (i; i < n; ++i) {
        if (array[i].key === valueToFind) {
            result = array[i];
            break;
        }
    }
    var t1 = performance.now();

    console.log(result);
    document.getElementById("result-array-2").innerHTML = t1 - t0 + " ms";
};

findInArray3 = function () {
    var i = 0;
    var n = array.length;
    var result;
    var t0 = performance.now();
    for (i; i < n; ++i) {
        if (array[i].key == valueToFind) {
            result = array[i];
            break;
        }
    }
    var t1 = performance.now();

    console.log(result);
    document.getElementById("result-array-3").innerHTML = t1 - t0 + " ms";
};

findInMap = function () {
    var t0 = performance.now();
    var result = map.get(valueToFind);
    var t1 = performance.now();
    console.log(result);
    document.getElementById("result-map").innerHTML = t1 - t0 + " ms";
};
