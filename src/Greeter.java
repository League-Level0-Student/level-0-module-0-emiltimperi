import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello whoever you are");
	JOptionPane.showInputDialog("What Is Your Name");
	String name = JOptionPane.showInputDialog("Confirm This");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, "Hello "+name);
}
}
