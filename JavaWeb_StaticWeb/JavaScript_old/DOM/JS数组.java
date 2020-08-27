<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>内置支持类Array</title>
	</head>
	<body>
		<script type="text/javascript">
			//第一种方式 []  多用
			//创建JS数组     java右边时大括号，JS是[]中括号。还能自动扩容。
			//创建长度为0的数组
			var arr1 = [];
			//alert(arr1.length);//0
			//创建类型随意的数组
			var arr2 = [12,3.14,"abc",null,15 ]//// JS中数组元素的类型随意。元素的个数随意。
			//alert(arr2.length);//5
			
			//下标会越界码？
			arr2[7] = "dd";//不会越界 ，会自动扩容，空的以undefined填充。
			
			//遍历
			for(i = 0 ; i < arr2.length ; i++){
				document.write(arr2[i]+"<br />");
				
			}
		
		    document.write("<br/>")
			
			//另外一种创建数组的对象 的方式 少用
			var a = new Array();
			document.write(a.length);//0
			 document.write("<br/>")//换行
			 
			var a2 = new Array(3);//3代表长度
			document.write(a2.length);//3
			document.write("<br/>")//换行
			
			var a3 = new Array(3,2);//这里表示具体的数据
			document.write(a3.length);//2
			document.write("<br/>")//换行
		   
		   //join的用法
		    var b =[1,2,3,4,5]	
			var c = b.join("-");
			var d = b.join("-=");
			
			document.write(b);//1,2,3,4,5
			document.write("<br/>")//换行
			document.write(c);//1-2-3-4-5
			document.write("<br/>")//换行
			document.write(d);//1-=2-=3-=4-=5
			document.write("<br/>")//换行
			
			//push用法 在数组末尾添加一个元素(数组长度+1)
			b.push(10);
			document.write(b.join("-"));//1-2-3-4-5-10
			document.write("<br/>")//换行
			
			//pop用法  将数组末尾的元素弹出 （数组长度-1）
			b.pop();
			document.write(b.join("-"));//1-2-3-4-5
			document.write("<br/>")//换行
			
			//注意：JS中的数组还可以自动模拟 栈数据结构 ：后进先出，先进后出原则。
			//push 入栈（压栈）
			//pop  出栈（弹栈） 
			
			//reverse 反转数组
			b.reverse();
			document.write(b.join("-"));//5-4-3-2-1
			document.write("<br/>")//换行
			
		
		</script>
	</body>
</html>
<!--
   java中数组array的创建：
     public class Test{
		 public static void main(String[] args){
			 int[] arr = {1,2,3,4,5,6};
			 int[] arr2 = new  int[5]; // 等同于：int[] arr2 = {0,0,0,0,0};
			 
			 String[] arr3 = {"a","b","c"};
			 String[] arr4 = new String[3]; // 等同于：String arr4 = {null,null,null};		  
		}
	 }
   public class TestArray {
      public static void main(String[] args) {
         // 数组大小
         int size = 10;
         // 定义数组
         double[] myList = new double[size];
		 //数组下标是从0开始的。
         myList[0] = 5.6;
         myList[1] = 4.5;
         myList[2] = 3.3;
         myList[3] = 13.2;
         myList[4] = 4.0;
         myList[5] = 34.33;
         myList[6] = 34.0;
         myList[7] = 45.45;
         myList[8] = 99.993;
         myList[9] = 11123;
         // 计算所有元素的总和
         double total = 0;
         for (int i = 0; i < size; i++) {
            total += myList[i];
         }
         System.out.println("总和为： " + total);
      }
	  //遍历数组。
	  for (int i = 0; i < array.length; i++) {
	      System.out.print(array[i] + " ");
	    }
   }
   
   For-Each 循环：
   
   JDK 1.5 引进了一种新的循环类型，被称为 For-Each 循环或者加强型循环，它能在不使用下标的情况下遍历数组。
   语法格式如下：
   for(type element: array)
   {
       System.out.println(element);
   }
   实例
   该实例用来显示数组 myList 中的所有元素：
   TestArray.java 文件代码：
   public class TestArray {
      public static void main(String[] args) {
         double[] myList = {1.9, 2.9, 3.4, 3.5};
    
         // 打印所有数组元素
         for (double element: myList) {
            System.out.println(element);
         }
      }
   }
   以上实例编译运行结果如下：
   1.9
   2.9
   3.4
   3.5
-->
