package exercise2;

public class Exercise2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		[2-10] char 타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오) 
		
		char : 2byte 크기. 0 ~ 2^16 - 1. 0 ~ 65536.

			
		*/
		
		int a = (int)Math.pow(2, 16);
		System.out.println(a);
	}

}
