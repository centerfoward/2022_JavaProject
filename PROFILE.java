import javax.swing.*; 
import java.awt.*;
import java.text.Normalizer.Form; 
public class PROFILE extends JFrame{
JLabel lb1, lb2, lb3, lb4, lb5;
JTextField name; JTextField breed; 
JTextField pet; 

PROFILE() {
super("프로필 창");
setLayout(new BorderLayout());

lb1 = new JLabel("이름");
lb1.setBounds(85,255,85,105);
name = new JTextField(20);
name.setLocation(120,285);
name.setSize(150,45);
name.setHorizontalAlignment(JTextField.CENTER);

lb2 = new JLabel("견종"); 
lb2.setBounds(85,300,85,150);
breed = new JTextField(20);
breed.setLocation(120,355);
breed.setHorizontalAlignment(JTextField.CENTER);
breed.setSize(150,45);

lb3 = new JLabel("애견명"); 
lb3.setBounds(80,345,80,195);
pet = new JTextField(20);
pet.setLocation(120,425);
pet.setHorizontalAlignment(JTextField.CENTER);
pet.setSize(150,45);

lb4 = new JLabel();
ImageIcon Img = new ImageIcon(PROFILE.class.getResource("img.jpg"));
lb4.setIcon(Img);
lb4.setBounds(85, 210, 85, 60);
lb4.setSize(50,50);
lb4.setHorizontalAlignment(JLabel.CENTER);

add(lb1); 
add(name);
add(lb2);
add(breed);
add(lb3);
add(pet);
add(lb4);
setSize(400,650); 
setVisible(true); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); } 

public static void main(String[] args) {
new PROFILE(); 
 } 
}