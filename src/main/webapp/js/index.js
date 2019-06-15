$(window).on('load',function doc() {

	selectArticle_tab();

});

//登出
function login_out(){
	$.post("/loginout");
    location.href="sign-in.html";
}

//评论
function Postcomment(aid){

    $.post("/submitcomment?aid="+aid, $(".comment-tab").serialize(),
    	function (data) {
            if (data) {
                location.reload();
            } else {
                alert("系统错误，评论操作失败");
            }
        }, "json")

}




