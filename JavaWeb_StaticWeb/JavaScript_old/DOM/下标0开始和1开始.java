
1、数据存储时下标从0开始的：

       java数组
	   JS字符串
	   JS数组
	   JSON数组
	   ....

2、数据存储时下标从1开始的：
       
	   JDBC
      （ JDBC所有的下标都是从1开始的，不是从0开始。）

	  其他暂时没有碰见
     






1、
 
     java数组：
	 {
		   //遍历数组。
	  for (int i = 0; i < array.length; i++) {
	      System.out.print(array[i] + " ");
	    }
	 }
	 JS字符串 ：
	 { 
		   //indexOf  (记住下标从0开始的)
		   alert("http://www.baidu.com".indexOf("http")); // 0
		   alert("http://www.baidu.com".indexOf("https")); //(负数) -1
		   alert("http://www.baidu.com".indexOf("com"));//17

		   	//考点：经常问 substr 和 substring 的区别？
		   //substr(startIndex,length)
		   alert("abcdefxyz".substr(2,4));//cdef
		   
		   //substring(startIndex,endIndex) 注意：不包含endIndex
		   //substring 方法将返回一个包含从 start 到最后（不包含 end ）的子字符串的字符串。
		   alert("abcdefxyz".substring(2,4));//cd
		   }
	 JS数组：
	 {
		 			//遍历数组
			for (var i=0; i<student2.student.length ; i++) {
				alert(student2.student[i].name + "," + student2.student[i].birth );
			}
      }	
			
			
			
			
			
			
2、			
			
			
			
			写列的数字不健壮，写列名更健壮getString()方法里面写列字段名时要加 "id"双引号 括起来
				String id = rs.getString("id");//JDBC所有的下标都是从1开始的，不是从0开始。
				String name = rs.getString("name");//getString()方法里面写列字段名时要加 "name"双引号 括起来
				String remark = rs.getString("remark");
				System.out.println(id + "," + name + "," + remark);
				
				除了可以以String类型取出，还可以以特定类型取出，
				//getString()可以为getInt()前面的声明也随之改变。int id = rs.getInt("id");
				//用int类型是为了可以运算数字。
				int id= rs.getInt("id") + 10 ;//JDBC所有的下标都是从1开始的，不是从0开始。
				String name = rs.getString("name");//getString()方法里面写列字段名时要加 "name"双引号 括起来
				String remark = rs.getString("remark");
				System.out.println(id + 10  + "," + name + "," + remark);
				//int类型可以运算但要看情况。
			}
	












