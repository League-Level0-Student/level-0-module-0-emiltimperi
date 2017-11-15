import javax.swing.JOptionPane;

public class EveryThingIsAwesome {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello whoever you are");
	JOptionPane.showInputDialog("WHAT DO YOU LIKE");
	String item = JOptionPane.showInputDialog("Confirm This");
	System.out.println(item);
	JOptionPane.showMessageDialog(null,item+" IS AWESOME");
}
}
