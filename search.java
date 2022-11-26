import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;


public class search  extends JFrame implements ActionListener{
	JTextField tf1;
	JLabel lb1;
	JTextArea ta = new JTextArea(4, 120);
	JButton rsltBtn1, MainBtn;
	JPanel panel1;
	
	search() {
	super("검색");
	setSize(400, 400);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	lb1 = new JLabel("찾기");
	tf1 = new JTextField("	검색어를 입력하세요	");
	rsltBtn1 = new JButton("검색");
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
	panel1.add(rsltBtn1);
	panel1.add(ta);
	rsltBtn1.addActionListener(this);
	panel1.add(MainBtn);

	add(panel1);
	setVisible(true);
	
	}
	public static void main(String[] args) {
		new search();
	}

	@Override

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		String search =JOptionPane.showInputDialog(this, "검색어를 입력하세요"); //현재 검색어를 입력하지 않고 확인을 누르면 에러가뜨고 취소를 누른경우 null값으로 검색이됨 수정예정

		try {
			Desktop.getDesktop().browse(new URI("https://search.shopping.naver.com/search/all?query="+search));
		}

			catch (IOException ss) 
			{
				ss.printStackTrace();
			} 
			catch (URISyntaxException ss) 
			{
			ss.printStackTrace();	
		}
		setVisible(false);
	}}
