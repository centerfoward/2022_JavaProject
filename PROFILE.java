import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*; 
import java.awt.*; 
public class PROFILE extends JFrame implements ActionListener{
	JLabel lb1, lb2, lb3;
	JTextField name; JTextField breed; 
	JTextField pet; 

	private JFrame frame;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROFILE window = new PROFILE();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PROFILE() {
		setTitle("댕비서");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\\성결대\\\\2학년 2학기\\\\자바응용\\\\팀프로젝트\\\\사진자료\\\\메인아이콘.png"));
		getContentPane().setBackground(new Color(255, 255, 255));
		initialize();
	}

	private void initialize() {

		lb1 = new JLabel("이름");
		lb1.setFont(new Font("굴림", Font.BOLD, 20));
		lb1.setBackground(new Color(0, 0, 0));
		lb1.setForeground(new Color(64, 0, 128));
		lb1.setBounds(12,5,41,21);
		name = new JTextField(20);
		name.setLocation(65,5);
		name.setSize(226,21);
		name.setHorizontalAlignment(JTextField.CENTER);

		lb2 = new JLabel("견종"); 
		lb2.setBackground(new Color(0, 0, 0));
		lb2.setForeground(new Color(0, 128, 64));
		lb2.setFont(new Font("굴림", Font.BOLD, 20));
		lb2.setBounds(12,52,41,23);

		lb3 = new JLabel("애견명");
		lb3.setFont(new Font("굴림", Font.BOLD, 20));
		lb3.setBounds(0,93,63,36);
		pet = new JTextField(20);
		pet.setLocation(65,103);
		pet.setHorizontalAlignment(JTextField.CENTER);
		pet.setSize(226,21);
		getContentPane().setLayout(null);

		getContentPane().add(lb1); 
		getContentPane().add(name);
		getContentPane().add(lb2);
		getContentPane().add(lb3);
		getContentPane().add(pet);
		breed = new JTextField(20);
		breed.setLocation(65,55);
		breed.setHorizontalAlignment(JTextField.CENTER);
		breed.setSize(226,21);
		getContentPane().add(breed);
		
		JButton MenuButton = new JButton("메인화면으로 돌아가기");
		MenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new 댕비서();
			}
		});
		MenuButton.setBounds(127, 578, 164, 23);
		getContentPane().add(MenuButton);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\\\성결대\\\\2학년 2학기\\\\자바응용\\\\팀프로젝트\\\\사진자료\\\\메인화면_수정본.jpg"));
		lblNewLabel.setBounds(0, 0, 384, 601);
		getContentPane().add(lblNewLabel);
		setSize(400,650); 
		setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
