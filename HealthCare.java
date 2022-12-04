import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

public class HealthCare extends JFrame implements ActionListener{
	JTextField tf1, tf2;
	JLabel lb1, lb2, lb3, lb4, Jlabelkg, Jlabelage;
	JTextArea ta = new JTextArea(4, 30);
	JComboBox ComBox1;
	JPanel panel1, panel2;
	JButton rsltBtn1, MainBtn;
	int weight;
	int calorie;
	String[] SmallArray = {"치와와","비숑","몰티즈", "슈나우저","푸들","핀셔", "비글","시바","시츄", "포메라니안", "요크셔 테리어", "웰시 코기"};
	String[] BigArray = {"닥스훈트","불독","골든 리트리버", "래브라도","사모예드","허스키", "진돗개"};
	ArrayList<String> SmallList = new ArrayList<>(Arrays.asList(SmallArray));
	ArrayList<String> BigList = new ArrayList<>(Arrays.asList(BigArray));
	//const tf1 = parseInt(str);
	
	HealthCare() {
		super("건강관리");
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
		String[] list = {"닥스훈트", "치와와", "불독", "비숑", "골든 리트리버", "래브라도", "몰티즈", "슈나우저",
				"푸들","핀셔", "비글", "사모예드", "시바", "허스키", "진돗개", "시츄", "포메라니안", "요크셔 테리어", "웰시 코기"};
		//대형견 리스트와 소형견 리스트 2개를 만들고 
		ComBox1 = new JComboBox(list);
		rsltBtn1 = new JButton("결과");
		lb4 = new JLabel("기초대사량은 약 kcal이며 약 30분간 산책하는 것이 좋습니다.");
		MainBtn = new JButton("메인 화면으로 돌아가기");
		
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
		MainBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new 댕비서();
			}
		});
		
		add(panel1);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//if(e.getSource () == MainBtn)
		ta.setText("기초대사량은 " + calcCalorie(Integer.parseInt(tf1.getText())) + "kcal이며" + "\n" + "선택하신 품종은 " +ComBox1.getSelectedItem().toString()
				+ "이니 " + walktime(ComBox1.getSelectedItem().toString()));
		//int = 정수부분은 문제없으나 몸무게에 소수점을 입력했을 때 오류가 생길 수 있음
		//ta.setText("기초대사량: " + calcCalorie);
		//ta.append(calorie.getText());
	}
	
	private double calcCalorie(int weight) {
		if(weight>=2 && weight<45) {
			return 30*weight+70;
		}
		else if(weight<2 || weight>=45) {
			return 70*(weight*0.75);
		}else {
		return 30*weight+70;
		}
	}
	
	private String walktime(String dogtype) {
		if(SmallList.contains(dogtype)) {
			return "20분에서 1시간 정도 산책하세요";
		}else {
			return "1~2시간 정도 산책하세요";
		}
	}
	
	public static void main(String[] args) {
		new HealthCare();
	}

}
