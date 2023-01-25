package chap01;

import java.util.Scanner;

// 입력한 정숫값의 부호(양수/음수/0)을 판단
public class JudgeSign {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("양수");
		else if(n < 0)
			System.out.println("음수");
		else
			System.out.println("0");
	}
}
