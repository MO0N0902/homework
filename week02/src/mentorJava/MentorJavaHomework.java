package mentorJava;

import java.util.Scanner;

public class MentorJavaHomework {
//예제 2-1
	public static void main(String[] args) {
//		System.out.print("Welcome.");// 괄호 안의 문자열"Welcome."을 출력 (줄바꿈 안함)
//		System.out.print("JAVA WORLD"); // 괄호 안의 문자열 "JAVA WORLD" 출력 (줄바꿈 안함)

//예제 2-2

//		System.out.println("Welcome.");// 괄호 안의 문자열"Welcome."을 줄바꿔서 출력
//		System.out.println("JAVA WORLD");// 괄호 안의 문자열"JAVA WORLD"을 줄바꿔서 출력

//예제 2-3

//		System.out.printf("저는 대학교에 %d학년에 재학중입니다", 3);// printf와 서식문자 %d를 사용하여 정수를 출력

//예제 2-4

//		System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째", 1, 2.0, "셋");// 서식문자 %d(정수), %f(실수),%s(문자열)을 활용하여 출력

//예제 2-5
//		System.out.printf("%5d",1);
//		System.out.println();
//		System.out.printf("%5d",12);
//		System.out.println();
//		System.out.printf("%5d",123);
//		System.out.println();
//		System.out.printf("%5d",1234);
//		System.out.println();
//		System.out.printf("%5d",12345);
//		System.out.println();
		//"%nd" n칸 만큼 확보한 후 왼쪽으로 정렬하여 출력
		//println은 줄바꿈의 역할

//예제 2-6
//		System.out.printf("%.1f", 1.234567);
//		System.out.println();
//		System.out.printf("%.2f", 1.234567);
//		System.out.println();
//		System.out.printf("%.3f", 1.234567);
//		System.out.println();
//		System.out.printf("%.4f", 1.234567);
//		System.out.println();
//		System.out.printf("%.5f", 1.234567);
		
		//%.nf 소수점 아래 n번째 까지 출력
		//println은 줄바꿈 역할
		
// 예제 2-7
//		int studentAge; //정수형 변수 studentAge를 선언
//		studentAge = 20;//studentAge에 20값 대입
//		System.out.println(studentAge); // 출력

// 예제 2-8
//		String myCity = "Seoul"; //문자열 변수 myCity에 Seoul을 대입
//		System.out.println("I am from" + myCity); // +연산자를 활용해 문자열 결합 출력

//예제 2-9
//		int myAge = 20; //정수형 변수 myAge에 20 대입
//		int yourAge = myAge; // 정수형 변수 yourAge에 정수형 변수 myAge에 대입된 값 20을 대입
//		
//		System.out.println(myAge); 
//		System.out.println(yourAge);
		// 두가지 변수 출력

// 예제 2-10
//	int myAge = 20;
//	int yourAge = 30;
//	int tempAge;
//	
//	tempAge = myAge; // tempAge에 myAge값인 20을 대입
//	myAge = yourAge; // myAge에 yourAge값인 30을 대입
//	yourAge = tempAge; // yourAge에 tempAge값인 20을 대입
//	
//	System.out.println(myAge); //마지막으로 대입한 30의 값을 출력
//	System.out.println(yourAge); // 마지막으로 대입한 20의 값을 출력 
	
// 예제 2-11
//	byte num1 = 20;
//	short num2 = 30;
//	int num3 = 40;
//	long num4 = 50; //값의 범위를 초과하지 않는 선에서 정수형 값을 변수에 대입
//	
//	System.out.println(num1);
//	System.out.println(num2);
//	System.out.println(num3);
//	System.out.println(num4);
 // 출력

// 예제 2-12
//		byte num1 = 0110;
//		short num2 = 0107;
//		int num3 = 0x46;
//		long num4 = 69L;
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
		//2진수 8진수 16진수의 형태로도 대입가능하지만 출력되는 형태는 10진수이다
		
// 예제 2-13
//		double marathon = 42.195;
//		float halfMarathon = 21.0975f; //float은 소수점 7자리까지 표현할 수 있음
//		System.out.println("마라톤은" + marathon + "km를 달립니다.");
//		System.out.println("하프마라톤은" + halfMarathon + "km를 달립니다.");
		
// 예제 2-14
//		double pieDoble = 3.141592653589793;
//		float pieFloat = 3.141592653589793f;
//		
//		System.out.println("double : " + pieDoble);
//		System.out.println("float : " + pieFloat);
		
//예제 2-15
//		char ga = '가';
//		char na = '나'; 
//		char alphabetA = 'A';
//		char alphabetB = 'B';
//		//문자형 char형을 이용해 문자 저장(''사용)
//		
//		System.out.println(ga);
//		System.out.println(na);
//		System.out.println(alphabetA + ", " + alphabetB);
		
//예제 2-16
//		int ga = '가';
//		int na = '나'; 
//		int alphabetA = 'A';
//		int alphabetB = 'B';
//		//문자별 유니코드에 저장되어있는 값을 int형으로 대입
//		System.out.println(ga);
//		System.out.println(na);
//		System.out.println(alphabetA);
//		System.out.println(alphabetB); //유니코드에 저장되어있는 값을 출력
		
//예제 2-17
//		int alphabetA = 'A';
//		int alphabetB = 'B';
		//문자별 유니코드에 저장되어있는 값을 int형으로 대입
//		System.out.println(alphabetA);
//		System.out.println(alphabetB); 
		//유니코드에 저장되어있는 값을 출력
	
//		char alphabetC = 67; 
		//67에 해당되는 유니코드 문자를 char형태로 저장
//		System.out.println(alphabetC);
		//67에 해당되는 유니코드 문자를 char형태로 출력
		
//예제 2-18
//		boolean isStudent = true; //true or false 값을 가지고 있는 boolean형에 isStudent 변수 생성하고 true값 대입
//		System.out.println(isStudent); // 출력
		
//예제 2-19
//		boolean isStudent = true; //true or false 값을 가지고 있는 boolean형에 isStudent 변수 생성하고 true값 대입
//		if(isStudent) {
//				System.out.println("저는 학생입니다"); //isStudent가 true이면 "저는 학생입니다" 출력
//		}else
//			System.out.println("저는 학생이 아닙니다.");//isStudent가 false이면 "저는 학생이 아닙니다" 출력
		
// 예제 2-20
//		String hi ="안녕하세요, "; //문자열 변수 hi에 "안녕하세요" 대입 
//		String niceToMeetYou ="만나서 반갑습니다."; // 문자열 변수 niceToMeetYou에 "만나서 반갑습니다." 대입
//				
//		System.out.println(hi);
//		System.out.println(niceToMeetYou);
				//문자열 출력
	
// 예제 2-21
//		int num1 = 11; //정수형 num1에 11 대입
//		double num2 = 3.14; // 실수형 num2에 3.14대입
//		double num1Change = (double)num1; // 정수형 num1의 값을 numChange에 실수형으로 형변환해서 저장
//		
//		System.out.println("num1 : " + num1); // num1의 값 출력
//		System.out.println("num1Change : " + num1Change); // 형변환한 num1의값 출력
//		System.out.println(num1Change + num2); // 실수형 + 실수형 출력
//		System.out.println((int)1.23); //1.23을 정수형으로 형변환
		
// 예제 2-22
//		int i1 = 10; //정수형 it변수에 10대입
//		byte b1 = (byte)i1; // int i1의 값을 b1에 byte로 형변환해서 저장
//		System.out.println(b1); //b1출력
//		
//		int i2 =128; //i2변수에 128대입
//		byte b2 = (byte)i2; // i2의 값을 b2에 byte로 형변환해서 저장
//		System.out.println(b2); //b2출력 
		//128은 byte의 범위를 벗어나기 때문에 오류 발생

// 예제 2-23
//		double d1 = 1.0e100; //1.0 x(10의 100승) float의범위를 벗어남
//		float f1 = (float)d1; //d1의 값을 float로 형변환 후 f1에 저장
//		System.out.println(f1); //f1출력
//		
//		double d2 = 1.0e-100; // 1.0 x (10의 -100승)
//		float f2 = (float)d2; // d2의 값을 float로 형변화 후 f1에 저장
//		System.out.println(f2); // f2 출력
		
//예제 2-24
//	double pie = 3.14; // 실수형 변수pie에 3.14대입
//	int pieInt = (int)pie;// 실수형 pie의 값을 int로 형변환 후 pieInt에 저장
//	System.out.println(pieInt); //pieInt 출력
//	
//	int num =100; //정수형 변수 num에 100 대입
//	double numD = (double)num; // num의 값을 실수형으로 형변환후 numD에 저장
//	float numF = (float) 100; // 100을 float로 형 변환 후 numF에 대입
//	System.out.println(numD); 
//	System.out.println(numF);// 출력
//	
//	int i = 99999999; //정수형 변수 i에 999999999 대입
//	float f = (float) i ; // i를 float로 형변환후 f에 저장
//	System.out.println(f); // f 출력, float 범위 밖이기 때문에 오류 발생

//예제 2-25
//	int num1 = 14; // 정수형 변수 num1에 14 대입
//	double num2 = 3.14; //  실수형 변수 num2에 3.14 대입
//	double num4 = num1; // num1의 값을 자동으로 double형으로 형변환 가능
////	int num4 = (int)num2;
//	System.out.println(num4); // 자동형변환된 값 출력
	
//예제 2-26
//	int i = 100; // 정수형 i변수에 100값 대입
//	char c = 'a'; 
//	int j = c; //char 형에서 int형으로 자동 변환
//	double d = i; //int형에서 double 형으로 자동 변환
//	
//	System.out.println("int형 변수 j의 값 :" + j);
//	System.out.println("double형 변수 d의 값 :"+ d);
	
	
// 예제 2-27
//		int i = 10; //정수형 변수에10 대입
//		byte b = (byte)i; //byte로 형변환
//		System.out.println("[int -> byte] i의 값 :" + i + "b의 값 : " + b); 출력
//		
//		int j = 1000; // 정수형 변수에 1000 대입
//		byte c = (byte) j; // byte로 형변환 해서 c에 저장
//		System.out.println("int -> byte j의 값 :" + j + "c의 값 :" + c); // byte의 범위를 벗어나기 때문에 에러 발생

// 예제 2-28
// 예제 2-29
// 예제 2-30
		Scanner sc = new Scanner(System.in); //입력 메소드
//		System.out.println("나이를 입력해 주세요"); //입력문
//		int age = sc.nextInt();// 입력받은 정수를 age변수에 저장
//		System.out.printf("내 나이는 %d세 입니다", age); // 출력문
		
// 예제 2-31
//		String name, address; //문자형 변수 이름, 주소 생성
//		int age; // 정수형 변수 나이 생성
//		double weight; // 실수형 변수 몸무게 생성
//		
//		System.out.println("이름, 주소, 나이, 페중을 빈칸으로 구분하여 순서대로 입력하세요");
//		name = sc.next(); //입력받을 문자형을 name변수에 저장
//		address = sc.next(); // 입력받을 문자형을 address변수에 저장
//		age = sc.nextInt(); // 입력받을 정수형을 age변수에 저장
//		weight = sc.nextDouble(); // 입력받을 실수형을 weight변수에 저장
//		
//		System.out.printf("당신의 이름은 %s입니다\n", name);
//		System.out.printf("당신의 이름은 %s입니다\n", address);
//		System.out.printf("당신의 이름은 %d입니다\n", age);
//		System.out.printf("당신의 이름은 %.1fkg입니다\n", weight);
		// 출력문
		
// 예제 3-1
//		int x = 100; //정수형 변수 x에 100 대입
//		int resultPlus = + x; // x 변수에 +부호를 대입한 값을 변수에 저장
//		int resultMinus = - x; // x변수에 -부호를 대입한 값을 변수에 저장
//		
//		System.out.println(resultPlus);
//		System.out.println(resultMinus);
		// 출력
		
//예제 3-2
//		double d = 1.11; // 실수형 변수d에 1.11 대입 
//		double result = -d; // 실수형 변수 result에 변수 d의 -값을 대입
//		
//		System.out.println(-d); 
//		System.out.println(result);
		// 출력
		
//예제 3-3
//		int num = 10; // 정수형 변수 num에 10 대입
//		System.out.println(num);// num 출력
//		num++; // num값에 1증가
//		System.out.println(num); //증가된 num값 출력
		
//예제 3-4
//		int num = 10; // 정수형 변수 num에 10 대입
//		System.out.println(num++); // 10이 출력된 후 num에 1증가
//		System.out.println(num); //증가된 num값 출력
		
//예제 3-5
//		int num = 30; // 정수형 변수 num에 30값 대입
//		System.out.println(++num); // num에 +1한 후 출력
//		System.out.println(num); // num출력
//		
//		System.out.println(num++); // 출력한후 + 1 
//		System.out.println(num); // num출력
		
//예제 3-6
//		int x = 1;
//		System.out.println(x++); // x를 출력하고 + 1
//		System.out.println(x); // x를 출력
//		System.out.println(++x); // +1하고 x출력

// 예제 3-7
//		char alphabetX = 'x'; // 문자 변수 x대입 // 유니코드 정수 = 88
//		System.out.println(alphabetX++); // 변수가 출력된뒤 +1
//		System.out.println(alphabetX); // 출력
		
// 예제 3-8
//		boolean isHuman = false;
//		System.out.println(!isHuman); //!붙여서 값을 반대로 바꿈
//		System.out.println(isHuman); // 그대로 출력
		
//예제 3-9
//		int x =100;
//		int y = 200;
//		System.out.println(x + y); // 100 + 200
//		System.out.println(x - y); // 100 - 200
//		System.out.println(x * y); // 100 * 200
//		System.out.println(x / y); // 100 / 200
//		System.out.println(x % y); //100 %200
	
//예제 3-10
//		double num1 = 1.23456;
//		int num2 = 6;
//		System.out.println(num1 + num2); // num2가 자동형변환 되어 출력
		
//예제 3-11
		int result = 1000000 *100000;
		System.out.println(result);
		
		
		
	}

}
