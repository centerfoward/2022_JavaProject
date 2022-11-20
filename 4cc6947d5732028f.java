import javax.swing.*;				//자바책 444p 참조로 제작함
import java.awt.*;
import java.awt.event.*;

public class 댕비서 extends JFrame implements ActionListener {
	JButton jbtn1, jbtn2, jbtn3, jbtn4;

	댕비서() {
		super("댕비서");
		setLayout(new FlowLayout());
		jbtn1 = new JButton("산책");
		add(jbtn1);
		jbtn2 = new JButton("검색");
		add(jbtn2);
		jbtn3 = new JButton("소통");
		add(jbtn3);
		jbtn4 = new JButton("건강");
		add(jbtn4);
	
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		jbtn3.addActionListener(this);
		jbtn4.addActionListener(this);
	
		setSize(300,100);
		setVisible(true);
}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbtn1) {
			
		}
		
		if(e.getSource()==jbtn2) {				//작업 이진혁								
			String search =JOptionPane.showInputDialog(this, "애완식품을 입력하세요");
			System.out.println("검색 : " + search);		//데이터베이스를 사용하여 검색한 값을 패널로 출력해야함 현재 데이터베이스 연동도안되어있으며 콘솔로 출력되고있음 수정예정부분
		}
		
		if(e.getSource()==jbtn3) {}
		if(e.getSource()==jbtn4) {}
		
	}
	public static void main(String[] args) {
		댕비서 aet = new 댕비서();
		aet.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
