package monty;

import java.util.Random;

public class Game {

	private int choice;
	private int winningDoor;

	Game() {
		winningDoor = new Random().nextInt(3) + 1;
	}
	
	public int getWinningDoor() {
		return winningDoor;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public int determineOtherDoor() {
		int otherChoice;
		
		if (choice == winningDoor) {
			otherChoice = (choice + new Random().nextInt(2) + 1) % 4;
			if (otherChoice == 0) {
				otherChoice++;
			}
		} else {
			otherChoice = winningDoor;
		}
		
		return otherChoice;
	}

	public boolean win() {
		return choice == winningDoor;
	}

}
