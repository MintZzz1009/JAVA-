package exercise3;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		[3-1] ���� ������ ����� �����ÿ�.	 
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 �� �����ڵ�� 65
		System.out.println(1 + x << 33);
		3 << 33 --> 3 << 1 --> 3 * 2 --> [���] 6
		
		System.out.println(y >= 5 || x < 0 && x > 2);
		t || f && f --> t || f --> [���] true 
		
		System.out.println(y += 10 - x++);
		y = y + (10 - x++)
		y = 5 + (10 - 2), x = 3
		y = 13, x = 3 --> [���] 13
		
		System.out.println(x+=2);
		x = x + 2 
		x = 3 + 2 --> [���] 5
		
		System.out.println( !('A' <= c && c <='Z') );
		!('A' <= 'A' && 'A' <= 'Z') --> !(t && t) --> [���] false
		
		System.out.println('C'-c);
		'C'-'A' --> 67 - 65 --> [���] 2
		
		System.out.println('5'-'0');
		'5'-'0' --> 53-48 --> 5
		
		System.out.println(c+1);
		'A' + 1 --> '65' + '1' --> '66' --> [���] B
		
		System.out.println(++c); 
		c = c + 1, print(c) --> c = 'A' + 1, print(c) --> c = 'B', print(c)
		[���] B
		
		System.out.println(c++);
		print(c), c = c + 1  --> print('B'), c = 'B' + 1  --> B, c = 'C'
		[���] B
		System.out.println(c);
		c = 'C' --> [���] C
		
		*/
		
		//[3-2] 
		/* �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����)�� ���� ���ϴ� �ڵ��̴�. ����
		 * ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 13���� �ٱ��ϰ�
		 * �� �ʿ��� ���̴�. (1)�� �˸��� �ڵ带 �����ÿ�. 
		 * 
		 * class Exercise3_2 {
		 * 	public static void main(String[] args) {
		 * 		int numOfApples = 123; // ����� ����
		 * 		int sizeOfBucket = 10; // ( ) �ٱ����� ũ�� �ٱ��Ͽ� ���� �� �ִ� ����� ����
		 * 		int numOfBucket = (  (1)  ); // ��� ����� ��µ� �ʿ��� �ٱ����� �� 
		 * 		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket); 
		 * 	}
		 * }
		 * [������] : 13
		 * 
		 * numOfBucket = (numOfApples / sizeOfBucket) + (numOfBucket % sizeOfBucket > 0 ? 1 : 0)  
		 */
		
		//[3-3]
		/* �Ʒ��� ���� num�� ���� ���� '���', '����', '0'�� ����ϴ�  �ڵ��̴�. ���� �����ڸ�
		 * �̿��ؼ� (1)�� �˸��� �ڵ带 �����ÿ�.
		 * [Hint] ���� �����ڸ� �� �� ����϶�.
		 * 
		 * class Exercise3_3 {
		 * 	public static void main(String[] args) {
		 * 		int num = 10;
		 * 		System.out.println(  (1)  );
		 * 	}
		 * }
		 * 
		 * num > 0 ? "���" : (num < 0 ? "����" : 0)
		 */
		
		
		/*
		[3-4]
		�Ʒ��� ���� num�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴�. ���� ���� num��
		���� '456'�̶�� '400'�� �ǰ�, '111'�̶�� '100'�� �ȴ�. 
		(1)�� �˸��� �ڵ带 �����ÿ�.
		
		class Exercise3_4 {
			public static void main(String[] args) {
				int num = 456;
				System.out.println(  (1)  );
			}
		}
		[������] 400
		
		(num / 100) * 100
		
		
		[3-5]
		�Ʒ��� ���� num�� �� �߿��� ���� �ڸ��� 1�� �ٲٴ� �ڵ��̴�. ���� ���� num��
		���� 333�̶�� 331�� �ǰ�, 777�̶�� 771�� �ȴ�. (1)�� �˸��� �ڵ带 �����ÿ�.
		
		class Exercise3_5 {
			public static void main(String[] args) {
				int num = 333;
				System.out.println(  (1)  );
			}
		}
		[������] 331
		
		(num / 10) * 10 + 1
		
		
		[3-6]
		�Ʒ��� ���� num�� ������ ũ�鼭�� ���� ����� 10�� ������� ���� num�� ����
		�� �������� ���ϴ� �ڵ��̴�. ���� ���, 24�� ũ�鼭�� ���� ����� 10�� ����� 
		30�̴�. 19�� ��� 20�̰�, 81�� ��� 90�� �ȴ�. 30���� 24�� �� �������� 6�̱�
		������ ���� num�� ���� 24��� 6�� ����� ���� �Ѵ�. (1)�� �˸��� �ڵ带 �����ÿ�.
		[Hint] ������ �����ڸ� ����϶�.
		
		class Exercise3_6 {
			public static void main(String[] args) {
				int num = 24;
				System.out.println(  (1)  );
			}
		}
		[������] 6
		10 - (num % 10)
		((num / 10) + 1) * 10 - num
		
		
		[3-7]
		�Ʒ��� ȭ��(Fahrenheit)�� ����(Celcius)�� ��ȯ�ϴ� �ڵ��̴�. ��ȯ������ 'C =
		5/9 x (F - 32)'��� �� ��, (1)�� �˸��� �ڵ带 �����ÿ�. ��, ��ȯ �������
		�Ҽ��� ��°�ڸ����� �ݿø��ؾ��Ѵ�.(Math.round()�� ������� �ʰ� ó���� ��)
		
		class Exercise3_7 {
			public static void main(String[] args) {
				int fahrenheit = 100;
				float celcius = (  (1)  );
				System.out.println("Fahrenheit:"+fahrenheit);
				System.out.println("Celcius:"+celcius);
			}
		}
		[������] 
			Fahrenheit:100
			Celcius:37.78
			
			(5/9f * (fahrenheit - 32) * 1000) % 10 >= 5 ? (int)((5/9f * (fahrenheit - 32) * 100) + 1) / 100f : (int)(5/9f * (fahrenheit - 32) * 100) / 100f;  
			(int)((5/9f * (fahrenheit - 32) + 0.005f) * 100) / 100f; 
		
		[3-8]
		�Ʒ� �ڵ��� �������� �����ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
		
		class Exercise3_8 {
			public static void main(String[] args) {
				byte a = 10;
				byte b = 20;
				byte c = a + b;		//30	(byte)(a + b)
				char ch = 'A';		//ch = 65
				ch = ch + 2;		//ch = 67 (char)(ch + 2)
				float f = 3 / 2;	//3	/ 2f
				long l = 3000 * 3000 * 3000;	//3000*3000*3000l
				float f2 = 0.1f;	//
				double d = 0.1; 
				boolean result = d==f2;		// (float)d == f2
				System.out.println("c="+c);
				System.out.println("ch="+ch);
				System.out.println("f="+f);
				System.out.println("l="+l);
				System.out.println("result="+result);
			}
		}
		[������]
			c=30
			ch=C
			f=1.5
			l=27000000000
			result=true
			
			
		[3-9]
		������ ������ ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�̰ų� ������ ���� ���� 
		b�� ���� true�� �ǵ��� �ϴ� �ڵ��̴�. (1)�� �˸��� �ڵ带 �����ÿ�.
		
		class Exercise3_9 {
			public static void main(String[] args) {
				char ch = 'z';
				boolean b = (  (1)  );
				System.out.println(b);
			}
		}
		[������] true
		
		'A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z' || '0' <= ch && ch <= '9'
		
		
		
		
		[3-10] ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε�, ���� ch�� ����� 
		���ڰ� �빮���� ��쿡�� �ҹ��ڷ� �����Ѵ�. �����ڵ�� �ҹ��ڰ� �빮�ں���
		32��ŭ �� ũ��. ���� ��� 'A'�� �ڵ�� 65�̰� 'a'�� �ڵ�� 97�̴�. 
		(1)~(2)�� �˸��� �ڵ带 �����ÿ�.
		
		class Exercise3_10 {
			public static void main(String[] args) {
				char ch = 'A';
				char lowerCase = (  (1)  ) ? (  (2)  ) : ch;
				System.out.println("ch:"+ch);
				System.out.println("ch to lowerCase:"+lowerCase);
			}
		}
		[������]
			ch:A
			ch to lowerCase:a
			
		ch �빮�ڳ� ? ���̸� 2(�ҹ���) : �����̸� ch(�ҹ���)
		('A' <= ch && ch <= 'Z') ? (ch = (char)(ch + 32)) : ch
			
			
		*/
		
		
		
	

		
		
		
	}

}
