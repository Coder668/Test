/*package it.sun.data;
import java.sql.*;

public class datatest {
	public static void main(String args[]){  
	    try {  
	      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������     
	      //Class.forName("org.gjt.mm.mysql.Driver");  
	     System.out.println("Success loading Mysql Driver!");  
	    }  
	    catch (Exception e) {  
	      System.out.print("Error loading Mysql Driver!");  
	      e.printStackTrace();  
	    }  
	    try {  
	      Connection connect = DriverManager.getConnection(  
	          "jdbc:mysql://localhost:3306/goodtest","root","123");  
	           //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û��������� �����Զ���  
	  
	      System.out.println("Success connect MySql server!");  
	      Statement stmt = connect.createStatement();  
	      ResultSet rs = stmt.executeQuery("select * from tb_stu1");
	      rs.first();
	                                                              //user Ϊ��������  
	      while (rs.next()) {  
	        System.out.println(rs.getString("name"));  
	        System.out.println(rs.getString("password"));
	      }  
	    }  
	    catch (Exception e) {  
	      System.out.print("get data error!");  
	      e.printStackTrace();  
	    }  
	  }  
}
*/