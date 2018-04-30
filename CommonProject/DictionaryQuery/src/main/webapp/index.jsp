<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>通过首字母查询出中文-例子</title>

<link rel="stylesheet" href="css/autocomplete.css" />
</head>

<script type="text/javascript" src="js/jquery.min.js" ></script>	
<script type="text/javascript" src="js/autocomplete.js"></script>
	
<body>
	<div>
        <div id="search-form"></div>
		<div id="message" style="display:none;"></div>
		<input type="button" value="拍照"  />
    </div>
		
</body>

<script type="text/javascript">
var proposals = new Array();//显示的数据
var zplxvalues = new Array();//实际保存的值 与数据对应  
var arrPy = new Array();//拼音

arrPy[0] = "zs";
arrPy[1] = "ls";
arrPy[2] = "ww";

proposals[0] = "张三";
proposals[1] = "李四";
proposals[2] = "王五";

zplxvalues[0] = 1;
zplxvalues[1] = 2;
zplxvalues[2] = 3;

$(function(){
	//实现搜索功能
	$('#search-form').autocomplete({
		hints: arrPy,
		realnames: proposals,
		realvalues:zplxvalues,
		width: 250,
		height: 30,
		onSubmit: function(text){
			//在这里判断算了   给图片类型赋值
			/* for(var i = 0; i < proposals.length; i++){
				//console.log(proposals[i]);
				if(text == proposals[i]){
					$("#vehdzdalx").val(zplxvalues[i]);
					$("#vehdzdalxmc").val(text);
					changedalx(text);
					break;
				}
			} */
		}
	});
	//监听事件
	$("#search-form input[type='text']").on("input",isShowScan);
});

function isShowScan(){
	if($("#search-form input[type='text']").val().trim()==""){
		alert("监听文本是否为空！");
		/* changedalx("");
		$("#vehdzdalx").val("");
		$("#vehdzdalxmc").val(""); */
	}
}
</script>

</html>