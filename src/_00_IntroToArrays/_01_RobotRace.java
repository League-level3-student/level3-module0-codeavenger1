package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();
		int winner;
		//2. create an array of 5 robots.
		Robot [] rob = new Robot[5]; 
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setSpeed(10);
		}
		
			//4. make each robot start at the bottom of the screen, side by side, facing up
			rob[0].setX(70);
			rob[0].setY(450);
			rob[1].setX(170);
			rob[1].setY(450);
			rob[2].setX(270);
			rob[2].setY(450);
			rob[3].setX(370);
			rob[3].setY(450);
			rob[4].setX(470);
			rob[4].setY(450);
			
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
			boolean go = true;
			while (go) {
			for (int i = 0; i < rob.length; i++) {
				rob[i].move(rand.nextInt(50));
				if(rob[i].getY()< 0) {
					go = false;
					winner = i;
					JOptionPane.showMessageDialog(null, "Robot " + winner+1 + " won!");
					rob[winner].sparkle();
				}
			}}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
			
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
