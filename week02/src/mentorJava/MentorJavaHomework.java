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
//		int result = 1000000 *100000; //정수형 값에 1000000*1000000값 대입
//		System.out.println(result);//int의 범위를 벗어나기 때문에 오류 출력
		
//예제 3-12
//		int x =10; 
//		int y = 1; //정수형 변수 x,y에 각각 10,1 대입
//		y+=x; //y의 값에 x값 더함 1+10 =11
//		System.out.println(y); //11출력
//		y*=x; //y의 값에 x값 곱함 11x10 =110
//		System.out.println(y); //110 출력
//		y%=x; //y의 값을 x의 값으로 나누고 나머지 110%10=0
//		System.out.println(y); //0출력

//예제 3-13
//		int a =10;
//		int b = 20;
//		System.out.println(a>b); // a가 b보다 큰가에 대한 값 출력 : false
//		System.out.println(a<=b); //a가 b보다 작거나 같은가에 대한 값 출력 : true
//		System.out.println(a==b); // a와 b가 같은가에 대한 값 출력 : false
//		System.out.println(a!=b); // a와b가 다른가에대한 값 출력 : true
		
//예제 3-14
//		int a =10;
//		int b = 11;
//		System.out.println(a<=b); // a가 b보다 작거나 같은가에대한 값 출력 :true
//		System.out.println(a==b); // a와 b가 같은가에대한 값 출력 : false
//		System.out.println(a!=--b); // b-1의 값과 a의 값이 다른가 : false
		
//예제 3-15
//		boolean b1 =true;
//		boolean b2 =false;
//		boolean b3 =true;
//		boolean b4 =false;
//		
//		System.out.println("#####논리곱#####"); //둘다 같아야 값 출력 아니라면 flase출력
//		System.out.println(b1 && b2); // 하나만 true이기때문에 flase
//		System.out.println(b1 && b3); // 두항이 모두 true라서 true
//		System.out.println(b2 && b4); // 두항이 모두 false라서 false
//		System.out.println();
//		System.out.println("#####논리합#####"); // 하나라도 true이면 true
//		System.out.println(b1 || b2); //b1이 true라서 true
//		System.out.println(b1 || b3); // 두항이 모두 true라서 true
//		System.out.println(b2 || b4); // 두항이 모두 false라서 false
//		System.out.println();
//		System.out.println("#####베타적 논리합#####");//다르면true 같으면 false
//		System.out.println(b1 ^ b2); //두항이 다르기때문에 true
//		System.out.println(b1 ^ b3); // 두항이 같기때문에 false
		
//예제 3-16
//		int num =(7>1) ? 1 : 2; // 조건식이 true이면 1출력 false라면 2출력
//		System.out.println(num); //true이기때문에 1출력
		
//예제 3-17
//		int num = 0; // 정수형 변수 num생성
//		if(7>1) { //7이 1보다 크다면
//			num=1; //num의 값은 1
//		}else { //그렇지 않다면 
//			num=2;//num의 값은 2
//		}
//		System.out.println(num); // 조건식이 true이기때문에 num의값은 1
		
//예제 4-1
//		int result = 0; //정수형 변수 result생성
//		if(3>2) { //3이 2보다 크다면
//			result = 3; // result의 값은 3
//		}
//		System.out.println(result); //조건식이 true이기때문에 3출력
		
// 예제 4-2
//		System.out.println("나이를 입력하세요"); //나이 입력문 작성
//		int age  =sc.nextInt(); // 입력한 정수를 age변수에 저장
//		if(age > 19) { // 입력한 정수가 19를 넘는다면 
//			System.out.println("성인입니다");// 성인입니다 출력
//		}
//		System.out.println("프로그램을 종료합니다"); // 그렇지 않다면 프로그램을 종료합니다 출력
		
//예제 4-3
//		int num =5;//정수형 변수 num에 5 대입
//		if(num > 4) { //num의 값이 4보다 크다면 
//			System.out.println(num + "은 4보다 큽니다"); //출력
//		}else {//아니라면
//			System.out.println(num + "은 4보다 작습니다"); //출력
//		}
			
//예제 4-4
//		int a=4;
//		int b=10; // 정수형 변수 두가지에 각각 4,10 값 대입
//		if(a>b) { // a가 b보다 크다면
//			System.out.println("a가 b보다 큽니다"); // 출력
//		}else {//아니라면
//			System.out.println("a가 b보다 작거나 같습니다"); //출력
//		}
		
//예제 4-5
//		int a = 4;
//		int b = 10;
//		int max = 0;//정수형 변수 세가지에 각각 4, 10, 기본값 대입
//		if(a>b) { //a가 b보다 크다면
//			max =a; //max의 값은 a로 저장
//			
//		}else { // 그게 아니라면
//			max = b; //max의 값은 b로 저장
//		}
//	
//		System.out.println(a + "와" + b +"중의 큰수는" + max + "입니다");
		
		
//예제 4-6
//		System.out.println("나이를 입력하세요"); //나이입력문 작성
//		int age = sc.nextInt(); //입력받을 값을 정수형 변수 age에 저장
//		if(age > 19) { //입력받은값이 19가 넘는다면
//			System.out.println("성인입니다"); //출력
//		}else { 
//			System.out.println("미성년자입니다");//아니라면 출력
//		}
		
//예제 4-7
//		int favorite = 7; // 정수형 변수에 7값 대입
//		if(favorite < 5) { 
//			System.out.println("좋아하는 숫자가 5보다 작습니다");// 변수의 값이 5보다 작다면 출력이지만 크다
//		}else if (favorite > 5) { 
//			System.out.println("좋아하는 숫자는 5보다 큽니다");// 변수의 값이 5보다 크기때문에 해당 출력문 사용
//		}else { // 위의 조건문이 true이기 때문에 건너뛴다
//			System.out.println("좋아하는 숫자가 5입니다.");
//		}
//		

//예제 4-8
//		int favorite = 7; // 정수형 변수에 7값 대입
//		if(favorite > 5) { 
//			System.out.println("좋아하는 숫자가 5보다 큽니다");// 변수의 값이 5보다 크기때문에 해당 출력문 사용
//		}else if (favorite == 7) { 
//			System.out.println("좋아하는 숫자는 7입니다");// 변수의 값이 7이지만 위에조건문에서 먼저 true가 나왔기때문에 사용x
		
// 예제 4-9
//		System.out.println("나이를 입력하세요"); //나이 입력문 작성
//		int age = sc.nextInt(); // 입력한 정수를 age변수값에 저장
//		if(age > 19) { //입력한 정수가 19를 넘는다면 출력
//			System.out.println("성인입니다");
//		}else if(age >13) {//입력한 정수가 13을 넘는다면 출력
//			System.out.println("청소년입니다");
//		}else {//그외의 값 출력
//			System.out.println("유아입니다");
//		}
			
//예제 4-10
//		int num = 7; //정수형 변수에 7대입
//		
//		switch(num) { 
//		case 1 : //num의 값이 1과 같을때
//			System.out.println("num은 1입니다");
//			break; // 조건이 충족했을때 멈추게 하는기능
//		case 2: //num의 값이 7과 같을때
//			System.out.println("num은 7입니다");
//			break;
//		default : //그외의 값일때
//			System.out.println("num은 1도 7도 아닙니다");
//		break;
//			
//		}
		
//예제 4-11
//		int num = 7; //정수형 변수에 7대입
//		
//		switch(num) { 
//		case 1 : //num의 값이 1과 같을때
//			System.out.println("num은 1입니다");
//			
//		case 2: //num의 값이 7과 같을때
//			System.out.println("num은 7입니다");
//			
//		default : //그외의 값일때
//			System.out.println("num은 1도 7도 아닙니다");
//		
//			//break;가 없기때문에 조건을 충족한 뒤 모든 출력문 출력
//		}
		
// 예제 4-12	
//		System.out.println("원하는 숫자를 입력하세요 (1~5)");
//		int num = sc.nextInt();
//		switch(num) {
//		case 5 : 
//			System.out.println("5를 입력하셨습니다.");
//			break;
//		case 4 : 
//			System.out.println("4를 입력하셨습니다.");
//			break;
//		case 3 : 
//			System.out.println("3를 입력하셨습니다.");
//			break;
//		case 2 : 
//			System.out.println("2를 입력하셨습니다.");
//			break;
//		case 1 : 
//			System.out.println("1를 입력하셨습니다.");
//			break;
//		} // 1부터 5중 입력받아 입력한 숫자에 맞는 case문 출력
//		
		
// 예제 5-1 
//		int sum = 0;
//		for(int i =1; i<=10; i++) { 
//			sum+=i;
//		}
//		System.out.println("합 :" + sum);
		// 정수형 변수 i가 1 부터 10보다 같을때까지 sum의 값에 더하고 +1
		//즉 sum의 값은 1부터 10까지 더한 값
		
//예제 5-2
//		int sum =0;
//		for(int i = 1; i <=100; i++) {
//			if(i%2==0) {
//				sum+=i;
//			}
//		}
//		System.out.println("합 : "+ sum);
//	// 정수형 변수 i가 1부터 100까지 1씩 증가 
//		// 증가하면서 i가 짝수라면 sum의값에 더함
//		// 즉 sum의 값은 1부터 100까지 짝수의 합
	
//예제 5-3
//		for(int =1; i<=9; i++) { // i가 9와같거나 작다는 조건을 충족하고  
//			for(int j =1; j <=9; j++) {// j가 9와 같거나 작다는 조건을 충족하면
//				System.out.println(i + "x" + j "=" +(i*j)+"\t"); // 출력
//			} //i문장으로 돌아가는 것이 아니라 내부for문으로 돌아가서 j의 값에 +1
//			//j는 1부터 9까지 올라갔다가 조건이 충족하지 않는 순간 외부for문으로 올라가고 i의 값이 +1되면 j는 다시 1로 초기화된다
//		System.out.println(); //단별로 줄바꿈
//		} 
		
// 예제 5-4
//		for(int i = 0; i <7; i++) { //i가 7보다 작다는 조건을 충족하면
//			for(int j = 0; j<7-i; j++) { //j가 7-i와 같아질때까지 j의 값을 +1하고
//				System.out.println(" "); //해당 칸에 빈칸을 찍는다 공백이 하나씩 줄어드는 모양
//			}
//		}for(int k = 0; k<(2*i) +1; k++) { //0에서 시작한 k가 (2*i) +1와 같아질때까지 +1하고
//			System.out.println("*"); //*을 찍는다
//		} //홀수로 늘어나는 모양
//	System.out.println(); // 줄바꿈
	
//예제 5-5
//		int sum = 0;
//		int i = 1;
//		while(i<=10) { //변수i가 10과 같아질때까지 반복
//			sum += i; // sum에i더함
//		i++ // i가 1씩 늘어나고 다시 반복
//		}
//		System.out.println("합 :" + sum); //sum의 값은1부터 10까지 더한값
	 
//예제 5-6
//		int sum = 0;
//		int i = 1;
//		do { // while의 조건이 true이면 실행
//		sum+=1;
//		i++
//		}while(i<=10);
//	
//		System.out.println("합" + sum); //sum의 값은 1부터 10까지 더한 값
		
//예제 5-7
//		int sum =0;
//		for(int =0;i<=100;i++) { //i가 1부터 100과 같아질때까지
//			if(i%2!=0) {// i의 값이 2로 나누었을때 나머지가 0이 아니라면(홀수)
//				continue // 아래로 내려가지말고 다음반복 실행
//			}
//		sum +=i;// 그렇지 않다면(i의 값이 짝수라면 sum에 i값 더하기)
//		}
//		System.out.println("짝수 합 : " + sum); //1부터 100까지 짝수의 합
	
//예제 5-8
//		int magicNumber = (int)(Math.random()*50)+1; // 1~50사이의 무작위 숫자를 변수에 넣기
//		//스캐너 클래스 import
//		boolean isMatched = false; // 정답과 실패 변수 생성
//		for(int i =0; i<10; i++) { //i가 1부터 10이 될때까지 1씩증가
//			System.out.println("찾는 숫자를 입력 >>"); //입력문 작성
//			int guess =sc.nextInt();//입력한 숫자를 변수에 저장
//			if(guess == magicNumber) {//입력한 숫자와 무작위 숫자가 맞았을때 
//				System.out.println((i+1)+"번째에 맞췄습니다!"); //is는 0부터 시작하기에 i+1설정
//				isMatched=true;
//				break; //숫자를 맞추면 더이상의 반복진행이 무의미 하기에 break사용
//			}else if (guess> magicNumber) { // 입력한 숫자가 더 클때
//				System.out.println("맞춰야할 숫자가 더 작습니다");
//			}else if (guess< magicNumber) { //입력한 숫자가 더 작을때
//				System.out.println("맞춰야할 숫자가 더 큽니다");
//		}
//	
//	}
//	if(!isMatched) { // i가 10이 됐을때 
//		System.out.println("정답을 맞추지 못했습니다");
	}
	

}
