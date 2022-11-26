import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class HealthCare extends JFrame implements ActionListener {

	private JFrame frame;
	JTextField tf1, tf2;
	JLabel lb1, lb2, lb3, lb4, Jlabelkg, Jlabelage;
	JTextArea ta = new JTextArea(4, 30);
	JComboBox ComBox1;
	JPanel panel1, panel2;
	JButton rsltBtn1, MainBtn;
	int weight;
	//const tf1 = parseFloat(str)
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCare window = new HealthCare();
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
	public HealthCare() {
		setTitle("댕비서");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\\성결대\\\\2학년 2학기\\\\자바응용\\\\팀프로젝트\\\\사진자료\\\\메인아이콘.png"));
		getContentPane().setBackground(new Color(255, 255, 255));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lb1 = new JLabel("애완동물의 무게");
		tf1 = new JTextField(5);
		Jlabelkg = new JLabel("KG");
		lb2 = new JLabel("애완동물의 나이");
		tf2 = new JTextField(5);
		Jlabelage = new JLabel("살");
		lb3 = new JLabel("품종을 선택해주세요");
		String[] list = {"닥스훈트", "치와와", "불독", "비숑", "골든 리트리버", "래브라도", "몰티즈", 
				"슈나우저", "푸들", "핀셔", "비글", "사모예드", "시바", "허스키", "진돗개", "테리어", "웰시 코기"};
		ComBox1 = new JComboBox(list);
		rsltBtn1 = new JButton("결과");
		//int calorie = calcCalorie(tf1);
		lb4 = new JLabel("기초대사량은 약 kcal이며 약 30분간 산책하는 것이 좋습니다.");
		MainBtn = new JButton("메인 화면으로 돌아가기");
		MainBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new 댕비서();
			}
		});
		panel1 = new JPanel();
		panel1.add(lb1);
		panel1.add(tf1);
		panel1.add(Jlabelkg);
		panel1.add(lb2);
		panel1.add(tf2);
		panel1.add(Jlabelage);
		panel1.add(lb3);
		panel1.add(ComBox1);
		panel1.add(rsltBtn1);
		panel1.add(ta);
		rsltBtn1.addActionListener(this);
		panel1.add(MainBtn);

		add(panel1);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		ta.setText("기초대사량: " );
		
	}
	
	private int calcCalorie(int weight) {
		return 30*weight+70;
	}
	

}
