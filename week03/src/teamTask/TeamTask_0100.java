package teamTask;

import java.util.Scanner;

public class TeamTask_0100 {
	// 로직구성
	// 메인메소드 
	//사용자로부터 이름을 입력받는다 
	// 메소드 작성
	// mathrandom을 이용해서 무작위 숫자 입력받고
	// num에 저장하고 출력
	//  sum에 num의 값 더하기
	// 두번 반복해서 user1, 2 랜덤값과 합계 구하기
	//if문으로 승자 가리기
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("첫 번째 사용자 이름을 입력하세요: ");
	        String user1 = sc.nextLine();

	        System.out.print("두 번째 사용자 이름을 입력하세요: ");
	        String user2 = sc.nextLine();

	        randomGame(user1, user2);
	       
	    }

	    // randomGame 메서드
	    public static void randomGame(String user1, String user2) {
	        // 사용자 1의 랜덤 숫자 합계 계산
	        int sum1 = 0;
	        System.out.print(user1 + "의 숫자: ");
	        for (int i = 0; i < 5; i++) {
	            int num = (int)(Math.random() * 100) + 1; // 1 ~ 100 사이의 랜덤 숫자
	            sum1 += num;
	            System.out.print(num + " ");
	        }
	        System.out.println(user1 + "의 합계: " + sum1);

	        // 사용자 2의 랜덤 숫자 합계 계산
	        int sum2 = 0;
	        System.out.print(user2 + "의 숫자: ");
	        for (int i = 0; i < 5; i++) {
	            int num = (int) (Math.random() * 100) + 1; 
	            sum2 += num;
	            System.out.print(num + " ");
	        }
	        System.out.println(user2 + "의 합계: " + sum2);

	        // 결과 출력
	        if (sum1 > sum2) { // sum1이 더 높을때
	            System.out.println("1등: " + user1 + ", 합계: " + sum1);
	            System.out.println("2등: " + user2 + ", 합계: " + sum2);
	        } else if (sum2 > sum1) { //sum2이 더 높을때
	            System.out.println("1등: " + user2 + ", 합계: " + sum2);
	            System.out.println("2등: " + user1 + ", 합계: " + sum1);
	        } else { // 무승부
	            System.out.println("무승부!" + sum1);
	        }
	    }
	}

