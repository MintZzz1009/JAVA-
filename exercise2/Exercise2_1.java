package exercise2;

import java.util.Arrays;

public class Exercise2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Chapter2. Variable(����) �������� 
		
		System.out.println("[2-1] ���� ǥ�� �� ĭ�� 8���� �⺻��(primitive type)�� �˸���  �ڸ��� �����ÿ�.\n");
		
		String[][] arr = new String[5][5];
		
		for (int i=0; i<5; i++) {	// 
			for (int j=0; j<5; j++) {
				arr[i][j] = "";
			}
		}
		//	'null'�� ��µǴ� �κ��� �������� ��µǵ��� �ٲٰ�
		//	�ٸ����� �ǵ��� ������ �迭�� �� �ε����� ""�� �ʱ�ȭ��. 
	
		
		String[] index = {"����", "����", "������", "������", "�Ǽ���"};
		for(int i=0; i<5; i++) {
			arr[i][0] = index[i];
		}
		
		for(int i=0; i<4; i++) {
			arr[0][i+1] = ((int)Math.pow(2, i)) + "byte";
			//	Math.pow() �޼ҵ�� �Է°��� ��°��� ��� double��
			//	Math.pow(������,����) 
		}
		
		arr[1][1] = "boolean";	// ���� 1byte
		arr[2][2] = "char";		// ������ 2byte
		
		String[] typeInt = {"byte", "short", "int", "long"};	
		// ������ 1byte, 2byte, 4byte, 8byte
		for(int i=0; i<4; i++) {
			arr[3][i+1] = typeInt[i];	
		}
		
		arr[4][3] = "float";	// �Ǽ��� 4byte
		arr[4][4] = "double";	// �Ǽ��� 8byte
		
		System.out.println("Arrays.deepToString ��� : ������ �迭 ���");	
		System.out.println(Arrays.deepToString(arr) + "\n");
		// ������ �迭 ��½� : Arrays.deepToString(�迭��) - �ٹٲ� �Ұ�...
		// �迭���� ���������̹Ƿ� �ܼ��� ������ ȣ���Ͽ� ����ϸ�
		// �迭�� �����Ͱ��� �ƴ϶� �ּҰ��� ��µ�.
		
		System.out.println("Arrays.toString ��� : 2���� �迭 ���");
		for(int i=0; i<5; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("\n");
		
		System.out.println("String.join ��� : ǥ ������� ����ϰ� ���");
		// 2���� �迭 ��½� : Arrays.toString(�迭��)
		for(int i=0; i<5; i++) {
			System.out.println(String.join("\t", arr[i]));
			//	������ �迭 ��½ÿ��� ���Ұ�!
		}
		
	}

}
