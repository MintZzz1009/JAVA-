package exercise2;

public class Exercise2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		[2-13] ���� �� Ÿ�԰� �⺻���� �߸� ����� ���� ��� ���ÿ� ? ( )
		
			a. boolean - false
			b. char - '\u0000'	// �����ڵ�� 0.
			c. float - 0.0		// float�� 0.0f�� �⺻��	. 0.0�� 0.0d���̻� d�� ������ ��
			d. int - 0
			e. long - 0			// long 0L. long�� �⺻�� 0L�� �⺻��.
			f. String - ""		// String�� ������ Ÿ��. ��� �������� �⺻���� null.
			
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
