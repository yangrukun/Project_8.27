<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Boolean类型</title>
	</head>
	<body>
		<script type="text/javascript">
            /*
			  1、JS中的布尔类型永远只有两个值：true和false（这点和java一样。）
			  2、在Boolean类型中有一个函数叫做：Boolean()。
			        语法格式：
					     Boolean(数据)
						 
					Boolean()函数的作用是将非布尔类型转换成布尔类型。（重点）
					
			  3、
			*/
		   var username = "";
		   
		   //下面Boolean()函数将username转换成boolean类型，username为空时false，不为空时true。
/* 		   if (Boolean(username)) {
		   			   alert("欢迎你"+ username);	
		   } else{
		   	   alert("用户名不能为空！");
		   } */
		   
		   if (username) {
			   alert("欢迎你"+ username);	
		   } else{
		   	   alert("用户名不能为空！");
		   }
		   
		   //规律：偏向“有”就转换成true，偏向“没有”就转换成false。
		   alert(Boolean(1));//true
		   alert(Boolean(0));//false
		   alert(Boolean(""));//false
		   alert(Boolean("abc"));//true
		   alert(Boolean(null));//false
		   alert(Boolean(NaN));//false
		   alert(Boolean(undefined));//false
		   alert(Boolean(Infinity));//true
		   
		   //Null类型只有一个值，null
		   alert(typeof null);//object  注意：
		   //这是JS设计时一流的问题，数据类型时null但是typeof结果是object。
		   //null是Null类型，但是typeof运算符结果是"object"
		   
		</script>
	</body>
</html>


       //简化以上代码：
       //一行代码就能简化，(all == checkedCount) 能自己进行判断，结果是true 或者 false 。
     firstChk.checked = (all == checkedCount);//右边结果是true 或者 false 。


    
	
	直接点：加()就能自行判断并返回boolean类型。
	
	  firstChk.checked = (all == checkedCount);//右边结果是true 或者 false 。















