



（1）ECMAScript
       是ECMA制定的262标准，JavaScript和JScript都遵守这个标准，
	   ECMAScript是JavaScript核心语法

（2）DOM编程
       是通过JavaScript对HTML中的dom节点进行操作，
	   DOM是有规范的，DOM规范是W3C制定的。

（3）BOM编程
       是对浏览器本身操作，例如：前进、后退、地址栏、关闭窗口、弹窗等。
	   由于浏览器有不同的厂家制造，所以BOM缺少规范，一般只是有一个默认的行业规范。

	  1、JavaScript包括三大块 ：
	  
		  ECMAScript：JS的核心语法（ES规范/ECMA-262标准）
		  
		  DOM：Document Object Model（文档对象模型：对网页当中的节点进行增删改查过程。）HTML文档被当成一棵DOM树来看待。
				var domObj = document.getElementById("id");//重点句子核心语句
				
		  BOM: Browser Object Model（浏览器对象模型）
				关闭浏览器窗口、打开一个新的浏览器窗口、后退、前进、浏览器地址栏上的地址等，都是BOM编程 。
				
	  2、DOM和BOM之间的区别和联系？
		
		 BOM的顶级对象是：window
		 DOM的顶级对象是：document
		 实际上BOM包含DOM的！
		  













