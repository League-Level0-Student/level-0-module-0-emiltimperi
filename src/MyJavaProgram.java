import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot boi=new Robot("vic");
	boi.setSpeed(20);
	boi.sparkle();
	boi.penDown();
	
	for (int i = 0; i < 4; i++) {
		boi.move(200);
		boi.turn(90);
		
	}
	
	
		
		
	}
}
