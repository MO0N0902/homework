package section06;

import java.util.Arrays;
import java.util.Comparator;

public class EX06 {
	public static void main(String[] args) {
		// 예제 6-1
//	int[] arr = new int[4]; // 4칸짜리 정수형 배열 생성
//	
//	System.out.println(arr); // 배열의 참조값 출력

		// 예제 6-2
//	int[] arr = new int [4]; // 4칸짜리 정수형 배열 생성
//	// 배열에 값 삽입
//	arr[0] = 1; // 인덱스 번호 기준이기때문에 ar[0] 부터 시작
//	arr[1] = 2;
//	arr[2] = 3;
//	arr[3] = 4;
//	// 배열의 값 출려
//	System.out.println("arr[0] =" + arr[0]); // 해당 배열의 인덱스 번호를 입력해 값을 출력
//	System.out.println("arr[1] =" + arr[1]);
//	System.out.println("arr[2] =" + arr[2]);
//	System.out.println("arr[3] =" + arr[3]);
//	
//	//예제 6-3
//	int[] intArray = new int[5]; //5칸짜리 정수형 배열 생성
//	String[] strArray = new String[5];// 5칸짜리 문자열 배열 생성
//	
//	int[] varArray = {1,2,3,4,5}; // 5칸짜리 값을 넣어준 정수형 배열 생성
//	
//	System.out.println("intArray[0] = " + intArray[0]); // intArray배열값 출력(값을 넣지 않았기 때문에 기본값 출력)
//	System.out.println("intArray[1] = " + intArray[1]);
//	
//	System.out.println("strArray[0] = " + strArray[0]); // strArray배열값 출력(값을 넣지 않았기 때문에 기본값 출력)
//	System.out.println("strArray[1] = " + strArray[1]);
//	
//	System.out.println("varArray[0] = " + varArray[0]); //varArray의 첫번째 값 출력
//	System.out.println("varArray[1] = " + varArray[1]);

		// 예제 6-4
//		int[] numbers = new int[10]; //10칸짜리 정수형 배열 생성
//		for (int i = 0; i < numbers.length; i++) { //i가 배열의 크기까지 1씩 늘어나며 임의의 값 대입
//			numbers[i] = (int) (Math.random() * 30) + 1;
//		}
//		int sum = 0; //합계 더해줄 변수 생성
//		for (int i = 0; i < numbers.length; i++) { //i가 배열의 크기까지 1씩 늘어나며
//			if (numbers[i] % 2 == 0) { // i의 값이 2로 나누었을때 나머지가 0이라면
//				sum += numbers[i]; //sum에 더하기
//			}
//		}
//		for (int i = 0; i < numbers.length; i++) { 
//			System.out.print(numbers[i] + " "); //배열의 값 출력
//		}
//		System.out.println();
//		System.out.println("배열의 짝수들의 합 : " + sum);

		
		//예제 6-5
//		char[] cards = {'1', 'L', 'O', '2','V', '3', 'E'}; //문자형 배열 선언
//		String myWord = ""; 
//		
//		for(int i = 0; i < cards.length; i ++) { // 아스키코드를 이용해 cards 배열의 값을 word에 저장
//			int word = cards[i];
//			
//			if((word >= 65 && word <= 90) || (word >=97 && word <=122)){
//				myWord += (char)word; // 
//			}
//			
//		}
//		System.out.println("단어 : " + myWord);
		
		
		//예제 6-6
		
		
		//예제 6-7
//		int[] arr = {1,6,2,3,10,7,4,5,8,9}; //arr 배열에 값 대입
//		
//		System.out.println(Arrays.toString(arr)); //배열의 출력을 간단하게 할수 있는 toString을 이용하여 출력
		
		//예제 6-8
//		int[] arr = {1,6,2,3,10,7,4,5,8,9};
//		System.out.println("정렬 전 배열 : "+ Arrays.toString(arr)); //정렬안된 배열을 출력
//		Arrays.sort(arr); // 오름차순 정렬 명령어
//		System.out.println("오름차순 정렬 :" + Arrays.toString(arr) );// 오름차순된 배열을 출력

		//예제 6-9
//		Integer[] arr = {1,6,2,3,10,7,4,5,8,9}; //배열생성
//		
//		System.out.println("정렬 전 배열 : " + Arrays.toString(arr)); // 정련안된 배열 출력
//		Arrays.sort(arr, Comparator.reverseOrder()); // 배열을 내림차순으로 정리
//		System.out.println("내림차순 정렬 : " + Arrays.toString(arr)); // 출력
		
		//예제6-10
//		int[] arr01 = {1,2,3}; // 배열생성
//		 
//		int[] arr02 = arr01; // arr02에 arr01값 대입
//		
//		System.out.println("arr01 배열 : " + Arrays.toString(arr01)); //arr01배열 출력
//		
//		arr02[1]= 10; //arr02 두번째 값 10으로 변경
//		
//		System.out.println("arr01 배열 : " + Arrays.toString(arr01)); //arr01배열출력
//		System.out.println("arr02 배열 : " + Arrays.toString(arr02)); //값 수정된 arr02 값 출력
		
		//예제 6-11
//		int[] card = {1,6,4,5,3,2}; // 카드 배열 생성
//		int[] newCard = new int[card.length]; // card배열의 길이와 new카드의 길이를 같게 설정
//		
//		for(int i = 0; i<card.length; i++) { //for문 사용해서 newCard의 배열에 card의 값 대입
//			newCard[i] = card[i];
//		}
//		
//		System.out.println("card 배열 : "+ Arrays.toString(card));
//		System.out.println("newCard 배열 : "+ Arrays.toString(newCard)); //출력
		
		//예제 6-12
//		int[] card = {3,1,4,5,10}; //배열 생성
//		
//		int[] newCard = Arrays.copyOf(card, card.length); //배열의 깊은복사(값과 크기를 복사)
//		
//		card[1] =10; //card의 두번째값 10으로 변경
//		
//		System.out.println("card 배열 : "+ Arrays.toString(card)); //card 배열 출력 깊은복사이기 때문에 card배열의 값만 변경됨
//		System.out.println("card 배열 : "+ Arrays.toString(newCard));
		
		
		//예제 6-13
//		int[] card = {1,6,4,5,3,2}; // 배열 생성
//		int[] newCard = new int[card.length]; // newcard배열을 card배열의 크기와 동일하게 생성
//		
//		System.arraycopy(card, 0, newCard, 0, card.length); 
//		// 복사대상배열, 복사시작위치, 카피할 배열, 시작위치, 복사할 길이
//		System.out.println("card 배열 : "+ Arrays.toString(card)); // 출력
//		System.out.println("card 배열 : "+ Arrays.toString(newCard));// 출력
		
		//예제 6-14
//		int[][]arr = new int[2][3]; //2행 3열 배열생성
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3; //1행에 값 대입
//		
//		arr[1][0] = 11;
//		arr[1][1] = 12;
//		arr[1][2] = 13; //2행에 값 대입
//		
//		System.out.println("2차원 배열 : " + arr); //배열의 주소값 출력
//		System.out.println("2차원 배열 : " + arr[0]); // 1행의 주소값 출력 
//		
//		System.out.println("행의 크기 : " + arr.length); // 행의 크기 출력
//		
//		System.out.println("1행의 열 크기  " +arr[0].length); // 1행의 크기 출력
//		System.out.println("2행의 열 크기  " +arr[1].length); // 2행의 크기 출력
//		
//		System.out.println("arr[0][0] = " + arr[0][0]); // 1행 1열의 값 출력
		
		//예제 6-15
//		int[][] arr = new int[5][5]; //5행 5열 배열 생성
//		
//		int count = 1; //값 대입할 변수 생성
//		
//		for(int i = 0; i < 5; i++) { // 이중for문으로 arr배열에 1부터 순서대로 값 대입
//			for(int j = 0; j < 5; j++) {
//				arr[i][j] = count++;
//			}
//		}
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + " "); //배열 순서대로 출력
//			}
//		System.out.println();
//		
//		}
		
		//예제 6-16
//		int[] score = {90,92,93}; //1행 3열 배열 출력
//		
//		int sum = 0; // 총점 변수
//		double avg = 0; // 평균 변수
//		
//		for(int val : score) { // val변수에 score배열의 값 하나씩 대입
//			sum+=val; // 대입한 값 sum에 더하기
//		}
//		
//		avg = (double)sum/3; // 더한값 3으로 나누기
//		
//		System.out.println("총점 :" + sum + ", 평균 : " + avg); //총점과 평균 출력
		
		
				
				
	}// main
}// class
