package q8958;

import java.util.Scanner;

public class Main { // 2차 배열이용한 풀이
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		int[][] ar = new int[g][]; // 가변배열
		for (int i = 0; i < ar.length; i++) {
			String str = sc.next();
			ar[i] = new int[str.length()]; // str.length???? str.length()??????? 
			int sum = 0;
			int score = 1;
			for (int j = 0; j < ar[i].length; j++) {
				do {
					ar[i][j] = str.charAt(j); // int 타입 배열인데 char 입력 가능('O' <-79 , 'X' <- 88?
					if (ar[i][j] == 'O') {
						sum = sum + score;
						score = score + 1;
					} else {
						score = 1;
					}
					j++;
				} while (j < ar[i].length);
				System.out.println(sum);
			}
		}
	}
}