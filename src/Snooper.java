import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	String age = JOptionPane.showInputDialog("How old are you?");
	String hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
	JOptionPane.showMessageDialog(null,"Hello " +name+". You are "+age+"year(s) old,"+" and you enjoy "+hobby);
}
}
