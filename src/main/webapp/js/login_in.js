//页面加载是触发
$(window).on("load", function() {

	datestart();
})

//日期框插件js
function datestart(){
	$('.form_datetime').datetimepicker({
            weekStart: 0, //一周从哪一天开始
            minView:2,
            language:'zh-CN',
            bootcssVer:3,
            pickerPosition:"bottom-left",
            todayBtn:  1, //
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            forceParse: 0,
            showMeridian: 1
   });
}

//用户注册
function registered_user(){

	$.post("/registeris", $("#signup-tab-user").serialize(), function (data) {
               
        if (data.flag) {
            alert("注册成功");
            location.reload();
        } else {
             alert(data.msg);
        	}
    }, "json")
}

//开发人员注册
function registered_Development(){

	$.post("/registeris", $("#signup-tab-Development").serialize(), function (data) {
               
        if (data.flag) {
            alert("注册成功");
            location.reload();
        } else {
             alert(data.msg);
        	}
    }, "json")
}

//登陆提交
function Login_submission(){
    $.post("/loginis", $("#signin-tab").serialize(), function (data) {
               
        if (data.code==10001) {
            window.location.href="index.html";
        } else {
             alert(data.msg);
            }
    }, "json")
}
