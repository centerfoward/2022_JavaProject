import java.sql.*; 
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class tableview extends JFrame implements ActionListener { 
	
	 
  String[] name = { "번호", "이름", "견종"};
  
  DefaultTableModel dt = new DefaultTableModel(name, 0);
  JTable jt = new JTable(dt);
  JScrollPane jsp = new JScrollPane(jt);

  JPanel panel = new JPanel();
  String[] comboName = { "  번호  ", "  이름  ", "  견종 "};

  JComboBox combo = new JComboBox(comboName);

  JButton serach = new JButton("검색");
  JTextArea jta = new JTextArea(20,20);
  public Connection getConnection() throws SQLException {
		Connection conn = null;
		
		String jdbc_url = "jdbc:mysql://localhost:3306/dogbesa?serverTimezone=UTC"; 
		Connection con; Statement stmt; 
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dogbesa?serverTimezone=UTC", "root",
				"1234"); //데이터베이스 이름 : dogbesa,   테이블 이름 : user_info, 행 : id, password, name, birthday, phoneNumber, sex, dog
		

		return conn;
 
  }

  tableview(){
	  super("회원 명단");

	  setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		panel.setBackground(Color.white);

        panel.add(jta);
        panel.add(serach);
        
        add(jsp, "Center");
        add(panel, "South");
        
        serach.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e) {
        	String jdbc_url = "jdbc:mysql://localhost:3306/dogbesa?serverTimezone=UTC"; 
        	Connection con; Statement stmt; 
        	
        	try { 
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        	}catch(ClassNotFoundException ss) { 
        	System.err.println("ClassNotFoundException: " + ss.getMessage()); 
        	} 
        	try{ 
        	con = DriverManager.getConnection(jdbc_url, "root", "1234"); 
        	stmt = con.createStatement(); 
        	String sql ="SELECT * FROM user_info"; 
        	ResultSet rs = stmt.executeQuery(sql); 
    
        	while(rs.next()) { 
        	int phoneNumber = rs.getInt("phoneNumber"); 
        	String name = rs.getString("name");
        	String dog = rs.getString("dog");
        
        	jta.append("        "+ phoneNumber + "     |     " + name + "     |     " +dog + "\n");
        	} 
        	rs.close(); 
        	stmt.close(); 
        	con.close(); 
        	}catch(SQLException ss) { 
        		System.err.println("SQLException: " + ss.getMessage()); 
        	}
		}

  public static void main(String[] args){ 
	  new tableview();
  }}
