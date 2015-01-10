var pageNum = 1;
var commPerPage = 4;
function commentToJson(nick, text, postId) {
    var date = new Date();
    var month = toDoubleDigitNumber(date.getUTCMonth() + 1);
    var day = toDoubleDigitNumber(date.getUTCDate());
    var hour = toDoubleDigitNumber(date.getUTCHours());
    var minute = toDoubleDigitNumber(date.getUTCMinutes());
    var second = toDoubleDigitNumber(date.getUTCSeconds());
    var xmlhttp;
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }
    else {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.open("GET", "http://localhost:8080/apiREST/webresources/entity.post/injson/" + postId, false);
    xmlhttp.send();
    return '{"comment":"' + text +
            '","date":"' + date.getUTCFullYear() + '-' + month +
            '-' + day + 'T' +
            hour + ':' + minute + ':' + second +
            '","nick":"' + nick + '"' +
            ',"postIdpost":' + xmlhttp.responseText + '}';
}
function toDoubleDigitNumber(num) {
    if (num > 9)
        return '' + num;
    else
        return '0' + num;
}
function getAllCommentsFromServer(postId) {
    var xmlhttp;
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }
    else {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function () {
        var jsonComments = xmlhttp.responseText;
        var returntext = "";
        var responseObject = JSON.parse(jsonComments);
        for (var key in responseObject) {
            var date = responseObject[key].date;
            var formatedDate = date.slice(11, 19) + ' ' + date.slice(0, 10);
            returntext +=
                    '<div style="background-color: #b0c4de">' +
                    'Author : ' + responseObject[key].nick + '   Add date: ' + formatedDate + '<br/><br/>' +
                    responseObject[key].comment +
                    '</div><br/>';
        }
        document.getElementById("commentsshow_div_container").innerHTML = returntext;
    };
    xmlhttp.open("GET",
            "http://localhost:8080/apiREST/webresources/entity.comment/byPost/" + ((pageNum - 1) * commPerPage +pageNum-1) + "/" + (pageNum * commPerPage+pageNum-1) + "/" + postId + "",
            true);
    xmlhttp.send();
    setPaginator(postId);
}
function sendCommentToServer(postId) {
    var nick = document.getElementById("commentadd_input_nick").value;
    var commentText = document.getElementById("commentadd_textarea_text").value;
    var xmlhttp;
    var txt = commentToJson(nick, commentText, postId);
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }
    else {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.open("POST", "http://localhost:8080/apiREST/webresources/entity.comment", false);
    xmlhttp.setRequestHeader("Content-type", "application/json");
    xmlhttp.send(txt);
    document.getElementById("commentadd_textarea_text").value = "";
    document.getElementById("commentadd_input_nick").value = "";
    changeCommentsPage(1,postId);
    getAllCommentsFromServer(postId);
}
function setPaginator(postId) {
    var xmlhttp;
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }
    else {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function () {
        var commentsNumber = parseInt(xmlhttp.responseText);
        var pagesNumber = Math.ceil(commentsNumber / (commPerPage + 1));
        var linksText = '';
        for (i = 1; i <= pagesNumber; i++) {
            linksText += '<a onclick="changeCommentsPage(' + i + ', ' + postId + ')" href="javascript:void(0)">' + i + '</a> ';
        }
        document.getElementById("commentsshow_div_pages").innerHTML = linksText;
    };
    xmlhttp.open("GET",
            "http://localhost:8080/apiREST/webresources/entity.comment/byPost/count/" + postId,
            true);
    xmlhttp.send();
}
function changeCommentsPage(pageNumber, postId) {
    pageNum = pageNumber;
    getAllCommentsFromServer(postId);
}