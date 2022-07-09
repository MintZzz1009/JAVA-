package exercise2;

import java.util.Arrays;

public class Exercise2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Chapter2. Variable(변수) 연습문제 
		
		System.out.println("[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은  자리에 넣으시오.\n");
		
		String[][] arr = new String[5][5];
		
		for (int i=0; i<5; i++) {	// 
			for (int j=0; j<5; j++) {
				arr[i][j] = "";
			}
		}
		//	'null'로 출력되는 부분이 공백으로 출력되도록 바꾸고
		//	줄맞춤이 되도록 다차원 배열의 각 인덱스를 ""로 초기화함. 
	
		
		String[] index = {"종류", "논리형", "문자형", "정수형", "실수형"};
		for(int i=0; i<5; i++) {
			arr[i][0] = index[i];
		}
		
		for(int i=0; i<4; i++) {
			arr[0][i+1] = ((int)Math.pow(2, i)) + "byte";
			//	Math.pow() 메소드는 입력값과 출력값은 모두 double형
			//	Math.pow(대상숫자,지수) 
		}
		
		arr[1][1] = "boolean";	// 논리형 1byte
		arr[2][2] = "char";		// 문자형 2byte
		
		String[] typeInt = {"byte", "short", "int", "long"};	
		// 정수형 1byte, 2byte, 4byte, 8byte
		for(int i=0; i<4; i++) {
			arr[3][i+1] = typeInt[i];	
		}
		
		arr[4][3] = "float";	// 실수형 4byte
		arr[4][4] = "double";	// 실수형 8byte
		
		System.out.println("Arrays.deepToString 사용 : 다차원 배열 출력");	
		System.out.println(Arrays.deepToString(arr) + "\n");
		// 다차원 배열 출력시 : Arrays.deepToString(배열명) - 줄바꿈 불가...
		// 배열명은 참조변수이므로 단순히 변수명만 호출하여 출력하면
		// 배열의 데이터값이 아니라 주소값이 출력됨.
		
		System.out.println("Arrays.toString 사용 : 2차원 배열 출력");
		for(int i=0; i<5; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("\n");
		
		System.out.println("String.join 사용 : 표 모양으로 깔끔하게 출력");
		// 2차원 배열 출력시 : Arrays.toString(배열명)
		for(int i=0; i<5; i++) {
			System.out.println(String.join("\t", arr[i]));
			//	다차원 배열 출력시에는 사용불가!
		}
		
	}

}
