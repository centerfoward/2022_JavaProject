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
  JTextField jtf = new JTextField(20);
  JButton serach = new JButton("검색");

  tableview(){
	  super("회원 명단");
	  setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		panel.setBackground(Color.white);
        panel.add(combo);
        panel.add(jtf);
        panel.add(serach);
        
        add(jsp, "Center");
        add(panel, "South");
        
        serach.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e) {
			
		}
 

  public static void main(String[] args){ 
	  new tableview();
  }}
