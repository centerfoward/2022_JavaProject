import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HealthCare extends JFrame implements ActionListener{
	JTextField tf1, tf2;
	JLabel lb1, lb2, lb3, lb4, Jlabelkg, Jlabelage;
	JTextArea ta = new JTextArea(4, 30);
	JComboBox ComBox1;
	JPanel panel1, panel2;
	JButton rsltBtn1, MainBtn;
	int weight;
	//const tf1 = parseFloat(str);
	
	HealthCare() {
		super("�ǰ�����");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lb1 = new JLabel("�ֿϵ����� ����");
		tf1 = new JTextField(5);
		Jlabelkg = new JLabel("KG");
		lb2 = new JLabel("�ֿϵ����� ����");
		tf2 = new JTextField(5);
		Jlabelage = new JLabel("��");
		lb3 = new JLabel("ǰ���� �������ּ���");
		String[] list = {"�ڽ���Ʈ", "ġ�Ϳ�", "�ҵ�", "���", "��� ��Ʈ����", "�����", "��Ƽ��", 
				"��������", "Ǫ��", "�ɼ�", "���", "��𿹵�", "�ù�", "�㽺Ű", "������", "�׸���", "���� �ڱ�"};
		ComBox1 = new JComboBox(list);
		rsltBtn1 = new JButton("���");
		//int calorie = calcCalorie(tf1);
		lb4 = new JLabel("���ʴ�緮�� �� kcal�̸� �� 30�а� ��å�ϴ� ���� �����ϴ�.");
		MainBtn = new JButton("���� ȭ������ ���ư���");
		
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
		ta.setText("���ʴ�緮: ");
		
	}
	
	private int calcCalorie(int weight) {
		return 30*weight+70;
	}
	
	public static void main(String[] args) {
		new HealthCare();
	}

}
