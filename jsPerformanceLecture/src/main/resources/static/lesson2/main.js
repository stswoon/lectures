//http://www.html5rocks.com/ru/tutorials/workers/basics/

var count = Math.pow(10, 9) * 3;

function sum() {
    var t0 = performance.now();
    var result = 0;
    for (var i = 0; i < count; ++i) {
        result++;
    }
    var t1 = performance.now();
    document.getElementById("result").innerHTML = t1 - t0 + "ms (result=" + result + ")";
}

var worker = new Worker('webworker.js'); //work only on servers, on local PC this cause security exception
function sumWebWorker() {
    worker.addEventListener('message', function (e) {
        var t1 = performance.now();
        document.getElementById("result-webWorker").innerHTML = t1 - t0 + "ms (result=" + e.data + ")";
    }, false);
    var t0 = performance.now();
    worker.postMessage({count: count});
}