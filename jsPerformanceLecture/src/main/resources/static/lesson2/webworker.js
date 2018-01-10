self.addEventListener('message', function(e) {
    var count = e.data.count;

    var result = 0;
    for (var i = 0; i < count; ++i) {
        result++;
    }

    self.postMessage(result);
}, false);