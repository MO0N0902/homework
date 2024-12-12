package teamTask;

import java.util.Scanner;

public class TeamTask_javayo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 각 과목 점수를 입력받음
		System.out.print("국어 점수를 입력하세요: ");
		int korean = sc.nextInt();

		System.out.print("수학 점수를 입력하세요: ");
		int math = sc.nextInt();

		System.out.print("역사 점수를 입력하세요: ");
		int history = sc.nextInt();

		// 총합 계산
		int total = korean + math + history;

		// 평균 계산
		double average = total / 3.0;

		// 결과 출력
		System.out.println("총합 점수: " + total);
		System.out.printf("평균 점수: %.2f\n", average);
	}
}
