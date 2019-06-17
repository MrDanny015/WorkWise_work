$(window).on('load',function doc() {
    
    type_list();
	site_list();
	
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

//发布新动态
function submit_article(){
	
	$.post("/submitarticle", $("#article-tab").serialize(),
    	function (data) {
            if (data) {
                location.reload();
            } else {
                alert("系统错误，发布操作失败");
            }
        }, "json")
}




//查询文章类型下拉框
function type_list(){

    $.ajax({
            url: "/selecttype",//写你自己的方法，返回map，我返回的map包含了两个属性：data：集合，total：集合记录数量，所以后边会有data.data的写法。。。
            // 数据发送方式
            type: "get",
            // 接受数据格式
            dataType: "json",
            // 要传递的数据
            data: 'data',
            // 回调函数，接受服务器端返回给客户端的值，即result值
            success: function (data) {
            //alert(data.data);
            $('.type_kind').append("<option value=''>请选择文章类型</option>");
            $.each(data.data, function (i) {
            //alert(i);
            //$("<option value='" + data.data[i].schoolno + "'>" + data.data[i].schoolname + "</option>")
            //.appendTo("#schoolno.selectpicker");

            $('.type_kind').append("<option value=" + data.data[i].tid + ">" + data.data[i].typename + "</option>");

            });

            

            },
            error: function (data) {
                alert("查询地址信息失败" + data);
            }
        })
     
}


//查询地址下拉框
function site_list(){

    
    $.ajax({
            url: "/selectsite",//写你自己的方法，返回map，我返回的map包含了两个属性：data：集合，total：集合记录数量，所以后边会有data.data的写法。。。
            // 数据发送方式
            type: "get",
            // 接受数据格式
            dataType: "json",
            // 要传递的数据
            data: 'data',
            // 回调函数，接受服务器端返回给客户端的值，即result值
            success: function (data) {
            //alert(data.data);
            $('.site_kind.selectpicker').append("<option value=''>请选择您的位置</option>");
            $.each(data.data, function (i) {
            //alert(i);
            //$("<option value='" + data.data[i].schoolno + "'>" + data.data[i].schoolname + "</option>")
            //.appendTo("#schoolno.selectpicker");

            $('.site_kind.selectpicker').append("<option value=" + data.data[i].sid + ">" + data.data[i].sitename + "</option>");

            });

           

            },
            error: function (data) {
                alert("查询地址信息失败" + data);
            }
        })
        
}

//删除我的评论
function deletecomment(cid){

    $.ajax({
            url: "/deletecomment",//写你自己的方法，返回map，我返回的map包含了两个属性：data：集合，total：集合记录数量，所以后边会有data.data的写法。。。
            // 数据发送方式
            type: "post",
            // 接受数据格式
            dataType: "json",
            // 要传递的数据
            data: {cid:cid},
            // 回调函数，接受服务器端返回给客户端的值，即result值
            success: function (data) {
                location.reload();
            },
            error: function (data) {
                alert("系统错误，删除操作失败");
            }
        })

}
//删除我的文章
function deletearite(aid){

     $.ajax({
            url: "/deletearite",//写你自己的方法，返回map，我返回的map包含了两个属性：data：集合，total：集合记录数量，所以后边会有data.data的写法。。。
            // 数据发送方式
            type: "post",
            // 接受数据格式
            dataType: "json",
            // 要传递的数据
            data: {aid:aid},
            // 回调函数，接受服务器端返回给客户端的值，即result值
            success: function (data) {
                location.reload();
            },
            error: function (data) {
                alert("系统错误，删除操作失败");
            }
        })

}