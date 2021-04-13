package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

public void run() {
		while (frontIsClear()) {
			move();
			checkMiddleBeeper();
			cleanBrokenBallot();
			move();
		}
		
	}

private void checkMiddleBeeper() {
		if (beepersPresent()) {
			nextBallot();
		}
	
	}

private void cleanBrokenBallot() {
		if (noBeepersPresent()) {
			cleanBeepersDown();
			cleanBeepersUp();
		
		}
	
	}

//Karen will be back facing East at this point

private void cleanBeepersDown() {
	if (frontIsClear()) {
		turnRight();
		move();
		
		}
	
	while (beepersPresent()) {
		pickBeeper();
		
	}
	
		turnAround();
		move();
	
	}
	
// Karen will be facing north at this point

private void cleanBeepersUp() {
	if (frontIsClear()) {
		move(); 
		
	}
	
	while (beepersPresent()) {
			pickBeeper();
		
	}
	
			turnAround();
			move();
			turnLeft();
	
	}

/* just something I added to get to the next ballot after
 * checking and a Beeper is already in place */
 
private void nextBallot() {
		move();
		move();
		
	}

}
