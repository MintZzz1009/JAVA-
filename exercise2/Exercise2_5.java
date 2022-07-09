package exercise2;

import java.util.Scanner; 

public class Exercise2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 '오류' 라고 적으시오.");
		
		System.out.println("System.out.println(\"1\" + \"2\")\t→ (\t)");
		System.out.printf("출력결과(오류) 입력 : "); String err1 = sc.next();
		System.out.println("System.out.println(true +  \"\" )\t→ (\t)");
		System.out.printf("출력결과(오류) 입력 : "); String err2 = sc.next();
		System.out.println("System.out.println(\'A\' + \'B\')\t→ (\t)");
		System.out.printf("출력결과(오류) 입력 : "); String err3 = sc.next();
		System.out.println("System.out.println(\'1\' + 2)\t→ (\t)");
		System.out.printf("출력결과(오류) 입력 : "); String err4 = sc.next();
		System.out.println("System.out.println(\'1\' + \'2\')\t→ (\t)");
		System.out.printf("출력결과(오류) 입력 : "); String err5 = sc.next();
		System.out.println("System.out.println(\'J\' + \"ava\")\t→ (\t)");
		System.out.printf("출력결과(오류) 입력 : "); String err6 = sc.next();
		System.out.println("System.out.println(true + null)\t→ (\t)");
		System.out.printf("출력결과(오류) 입력 : "); String err7 = sc.next();
		
		
		
	}

}
