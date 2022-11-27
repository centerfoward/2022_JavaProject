import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.*;			
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class 댕비서 extends JFrame implements ActionListener {
	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					댕비서 window = new 댕비서();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public 댕비서() {
		setTitle("댕비서");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\\성결대\\\\2학년 2학기\\\\자바응용\\\\팀프로젝트\\\\사진자료\\\\메인아이콘.png"));
		getContentPane().setBackground(new Color(255, 255, 255));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getContentPane().setLayout(null);
		jbtn1 = new JButton("산책");
		jbtn1.setBounds(12, 5, 100, 23);
		getContentPane().add(jbtn1);
		jbtn2 = new JButton("검색");
		jbtn2.setBounds(123, 5, 100, 23);
		getContentPane().add(jbtn2);
		jbtn3 = new JButton("소통");
		jbtn3.setBounds(235, 5, 100, 23);
		getContentPane().add(jbtn3);
		jbtn4 = new JButton("건강");
		jbtn4.setBounds(340, 5, 100, 23);
		getContentPane().add(jbtn4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\성결대\\2학년 2학기\\자바응용\\팀프로젝트\\사진자료\\메인화면_수정본.jpg"));
		lblNewLabel.setBounds(22, 38, 418, 415);
		getContentPane().add(lblNewLabel);
		
		
	
		jbtn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new walk();
				setVisible(false);
				
			}
		});
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PROFILE();
				setVisible(false);
			}
		});
		
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new search();
				setVisible(false);
			}
		});
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new HealthCare();
				setVisible(false);
				
			}
		});
	
		setSize(482,502);
		setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
