package exercise2;

public class Exercise2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은 모두 고르시오 ? ( )
		
			a. boolean - false
			b. char - '\u0000'	// 유니코드로 0.
			c. float - 0.0		// float는 0.0f가 기본값	. 0.0은 0.0d접미사 d가 생략된 것
			d. int - 0
			e. long - 0			// long 0L. long은 기본값 0L이 기본값.
			f. String - ""		// String은 참조형 타입. 모든 참조형의 기본값은 null.
			
			ANS) c, e, f
			
		*/ 
		char ch = '\u0000';
		char test = 'A';
		System.out.println(ch);
		
		char ch1 = ' ';
		int ch1ToInt = (int)ch1;
		System.out.println(ch1);
		System.out.println(ch1ToInt);
		System.out.println(65 + "");
		System.out.println(test);
		System.out.println((int)test);
		System.out.println((int)ch);
		//System.out.println(\u0000 + "");
	}

}
