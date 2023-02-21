package TicTacTo;

import java.util.Scanner;

public class RockPaperScissors {
	
	String [] rps = {"", "가위", "바위", "보"};
	String [][] player = new String[3][3]; //[플레이어][0: 누가, 1: 선택한 요소, 2: 결과]
	
	int userSelectNum;
	int comSelectNum;
	int winner; // 0:draw, 1: player1, 2: player2
	
	Scanner sc = new Scanner(System.in);
	
	void intro() {
		System.out.println("### 가위바위보 게임 ###\n");
		System.out.println(">>> 가위, 바위, 보 번호를 입력하세요");
		System.out.println("    | 1:가위 | 2: 바위 | 3: 보 |");
		System.out.printf(">>> ");
		
	}
	
	int userSelect() {
		
		userSelectNum = sc.nextInt();
		
		player[1][0] = "사용자";
		player[1][1] = rps[userSelectNum];
		player[1][2] = "이겼습니다.";
		return userSelectNum;
	}
	
	int comSelect() {
		
		int randomNumber = (int) ((Math.random() * 3) + 1);
		comSelectNum = randomNumber;
		player[2][0] = "Computer";
		player[2][1] = rps[comSelectNum];
		player[2][2] = "이겼습니다.";
		return comSelectNum;
	}
	
	int gameResult(int player1, int player2) {
		
		player[0][0] = "";
		player[0][1] = "";
		player[0][2] = "비겼습니다.";
		
		int i = player1 - player2;
		
		switch(i) {
		case 0:
			winner = 0;
			break;
		case -2: case 1:
			winner = 1;
			break;
		case -1: case 2:
			winner = 2;
			break;
		}
		
		return winner;
		
	}
	
	void runGame() {
		
		intro();
		userSelect();
		comSelect();
		gameResult(userSelectNum, comSelectNum);
		System.out.printf("%n %s : %s", player[1][0], player[1][1]);
		System.out.printf("%n %s : %s", player[2][0], player[2][1]);
		System.out.printf("%n>>> %s %s%n", player[winner][0], player[winner][2]);
	
	}
	
	void endGame() {
		sc.close();
	}
}
