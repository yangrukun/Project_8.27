



1、使用window.onload是为了

         拿到某些在script块下面的标签的某些元素的 id
		 
	
2、而有一些必须先执行的函数在轮到加载标签，此时声明函数就不能用window.onload声明了。
       
	   仔细看好顺序！！！
	
			function displayTime(){
					var time = new Date();
					var strtime = time.toLocaleString();
					document.getElementById("btn").innerHTML = strtime ;
				}
			
			
		</script>
		<br /><br />
		
<!-- 		onclick="displayTime()"写在input按钮上，script里面的函数不能使用window.onload,因为displayTime()必须在input之前声明，
		而window.onload,是整个页面加载完毕才执行。   顺序错了/。 -->
		
		<input type="button" value="显示系统时间" onclick="displayTime()" />
		
		<div id="btn"></div>
		




















