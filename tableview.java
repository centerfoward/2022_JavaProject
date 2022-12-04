import java.sql.*; 
public class tableview { 
public static void main(String[] args){ 
String jdbc_url = "jdbc:mysql://localhost:3306/dogbesa?serverTimezone=UTC"; 
Connection con; Statement stmt; 
try { 
Class.forName("com.mysql.cj.jdbc.Driver"); 
}catch(ClassNotFoundException e) { 
System.err.println("ClassNotFoundException: " + e.getMessage()); 
} 
try{ 
con = DriverManager.getConnection(jdbc_url, "root", "1234"); 
stmt = con.createStatement(); 
String sql ="SELECT * FROM user_info"; 
ResultSet rs = stmt.executeQuery(sql); 
System.out.println( "<< 회원 명단 >>");
System.out.println( "[번호 ]\t" + " [이름]\t" + " [견종]");
while(rs.next()) { 
int phoneNumber = rs.getInt("phoneNumber"); 
String name = rs.getString("name");
String birthday = rs.getString("birthday");
System.out.println( phoneNumber + " ," + name +","+birthday); 
} 
rs.close(); 
stmt.close(); 
con.close(); 
}catch(SQLException e) { 
System.err.println("SQLException: " + e.getMessage()); 
}} }
