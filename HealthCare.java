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
	String[] SmallArray = {"ġ�Ϳ�","���","��Ƽ��", "��������","Ǫ��","�ɼ�", "���","�ù�","����", "���޶�Ͼ�", "��ũ�� �׸���", "���� �ڱ�"};
	String[] BigArray = {"�ڽ���Ʈ","�ҵ�","��� ��Ʈ����", "�����","��𿹵�","�㽺Ű", "������"};
	ArrayList<String> SmallList = new ArrayList<>(Arrays.asList(SmallArray));
	ArrayList<String> BigList = new ArrayList<>(Arrays.asList(BigArray));
	//const tf1 = parseInt(str);
	
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
		String[] list = {"�ڽ���Ʈ", "ġ�Ϳ�", "�ҵ�", "���", "��� ��Ʈ����", "�����", "��Ƽ��", "��������",
				"Ǫ��","�ɼ�", "���", "��𿹵�", "�ù�", "�㽺Ű", "������", "����", "���޶�Ͼ�", "��ũ�� �׸���", "���� �ڱ�"};
		//������ ����Ʈ�� ������ ����Ʈ 2���� ����� 
		ComBox1 = new JComboBox(list);
		rsltBtn1 = new JButton("���");
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
		MainBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ���();
			}
		});
		
		add(panel1);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//if(e.getSource () == MainBtn)
		ta.setText("���ʴ�緮�� " + calcCalorie(Integer.parseInt(tf1.getText())) + "kcal�̸�" + "\n" + "�����Ͻ� ǰ���� " +ComBox1.getSelectedItem().toString()
				+ "�̴� " + walktime(ComBox1.getSelectedItem().toString()));
		//int = �����κ��� ���������� �����Կ� �Ҽ����� �Է����� �� ������ ���� �� ����
		//ta.setText("���ʴ�緮: " + calcCalorie);
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
			return "20�п��� 1�ð� ���� ��å�ϼ���";
		}else {
			return "1~2�ð� ���� ��å�ϼ���";
		}
	}
	
	public static void main(String[] args) {
		new HealthCare();
	}

}
