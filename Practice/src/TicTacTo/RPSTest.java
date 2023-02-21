package TicTacTo;

import java.util.Scanner;

public class RPSTest {

	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		while(true) {
			rps.runGame();
			System.out.println("\n--- 게임을 더 하시겠습니까? (y/n) ---");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			if (answer.equals("n")) {
				break;
			}
		}
		System.out.println("\n--- 게임 종료 ---");
	}

}
