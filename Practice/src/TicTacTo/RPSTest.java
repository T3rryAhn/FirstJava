package TicTacTo;

import java.util.Scanner;

public class RPSTest {

	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		while(true) {
			rps.runGame();
			System.out.println("\n--- 寃뚯엫�쓣 �뜑 �븯�떆寃좎뒿�땲源�? (y/n) ---");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			if (answer.equals("n")) {
				break;
			}
		}
		System.out.println("\n--- 寃뚯엫 醫낅즺 ---");
	}
	//1

}
