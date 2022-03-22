import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class JavaFrame {
	

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("JFrame Ödevi");
		jf.setSize(500,600);
		jf.setLocation(100,200);	
		jf.getContentPane().setLayout(new FlowLayout());
			
		JTextField text1 = new JTextField(25);
		JButton button1 = new JButton("Gönder");
		JLabel label1 = new JLabel ();
			label1.setText(" Adýnýzý giriniz");
			
		JTextField text2 = new JTextField(25);
		JButton button2 = new JButton("Gönder");
		JLabel label2 = new JLabel ();
			label2.setText(" Soyadýnýzý giriniz");
			
			
		jf.getContentPane().add(text1);
	//	jf.getContentPane().add(button1);
		jf.getContentPane().add(label1);
			
		jf.getContentPane().add(text2);
	//	jf.getContentPane().add(button2);
		jf.getContentPane().add(label2);
		
		jf.getContentPane().add(button1);
			
		button1.addActionListener(new ActionListener() {
			
			public void 	actionPerformed(ActionEvent e) {
			label1.setText("merhaba " + text1.getText());
			label2.setText("merhaba " + text2.getText());
		}
	}
);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setVisible(true);
	}
}