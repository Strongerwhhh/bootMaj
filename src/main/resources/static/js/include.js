// <link rel="stylesheet" th:href="@{/static/css/bootstrap.min.css}">
//     <script th:src="@{/static/js/jquery.min.js}"></script>
//     <script th:src="@{/static/js/bootstrap.min.js}"></script>
//     <script th:src="@{/static/js/responsiveslides.min.js}"></script>
// <link rel="shortcut icon" href="#" />
document.write("<link rel=\"stylesheet\" href=\"/static/css/bootstrap.min.css\">");
document.write("<link rel=\"shortcut icon\" href=\"/static/favicon.ico\">");
document.write("<link rel=\"stylesheet\" href=\"/static/css/jquery.toast.min.css\">");
document.write("<script src=\"/static/js/jquery.min.js\"></script>")
document.write("<script src=\"/static/js/jquery.toast.min.js\"></script>")
document.write("<script src=\"/static/js/bootstrap.min.js\"></script>")
document.write("<script src=\"/static/js/responsiveslides.min.js\"></script>")

function setMsg(msg) {
    $.toast({
        heading: msg.title,
        text: msg.text,
        showHideTransition: 'fade',
        icon: msg.type,
        position : 'top-center'
    })
}