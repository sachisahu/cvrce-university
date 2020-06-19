

function postToMainCanvas(path) {
    var form = $('#formMenu');
    path = getUrl(path);
    form.attr('action', path);
    form.attr('method', "get");
    form.submit();
}

function getUrl(path) {
    var contextRoot = /*[[@{/}]]*/ '';
    if (path.indexOf(contextRoot) == -1) {
        if (path.substring(0, 1) == '/') {
            path = path.substring(1);
        }
        path = contextRoot + path;
    }
    return path;
}