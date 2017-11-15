import javax.swing.JOptionPane;

public class AnnoyingPopup {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Error YOU HAVE BEEN HACKED");
	JOptionPane.showInputDialog("HOW OLD ARE YOU");
	String age = JOptionPane.showInputDialog("HOW OLD ARE YOU");
	System.out.println(age); 
}
}
