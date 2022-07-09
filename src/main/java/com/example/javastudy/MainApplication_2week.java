package com.example.javastudy;

public class MainApplication_2week {
    public static void main(String[] args) {

        //  연습문제 2-1
        /*
        boolean = 논리형 (1byte)
        byte = 정수형 (1byte)
        int = 정수형 (4byte)
        char  = 문자형 (2byte)
        short = 정수형 (2byte)
        float = 실수형 (4byte)
        long  = 정수형 (8byte)
        double = 실수형 (8byte)
        */

        //연습문제 2-2
        /*
         int regNo = 9501021111111;
        * */

        //연습문제 2-3
        /*
         * int i = 100;
         * long l = 100L;
         * final float PI = 3.14f
         *
         *  리터럴  : 100 , 100l , 3.14f
         *  변수 :  i , l
         *  키워드 : int , long , float
         *  상수 : PI
         * */

        //연습문제 2-4
        /*
         * 기본형 타입엔 총 4가지 정수형, 실수형, 문자형 , 논리형
         *  int >> 4byte 크기의 정수형
         *  Byte >> 1byte 최소 단위 정수형
         *  double >> 8byte 긴 단위 실수형
         *  boolean >> true , flase 1byte 단위 논리형
         *
         *  답 기본형이 아닌것은 없는 것으로 판단.
         * */

        //연습문제 2-5
        /*
         * 1. System.out.println( "1" + "2"  ) => ( "12" )
         * 2. System.out.println( true + "" )  => ( true )
         * 3. System.out.println( 'A' + 'B' )  => ( 'AB' ) // 'A' 의 아스키 코드 65 'B' 의 아스키 코드 66 이 합쳐진 131
         * 4. System.out.println( '1' + 2 ) => ( 51 )
         * 5. System.out.println( '1' + '2' ) => ('12') // '1'의 아스키 코드 49 '2'의 아스키코드 50 이 합쳐진 99
         * 6. System.out.println( 'J' + "ava" ) => ( Java )
         * 7. System.out.println( true + null ) => ( error )
         * */

        //연습문제 2-6
        /*
         * 답 : True  , NULL,
         * */

        //연습문제 2-7
        /*
         * 답 : $ystem , 자바, $MAX_NUM
         * */

        //연습문제 2-8
        /*
         * 참조형 변수는 포인터 .. 1byte ? ... boolean or byte
         * 답은 없다..
         *
         * */

        //연습문제 2-9
        /*
         *  답 :  float f = (float) l ;
         *       i = (int) ch;
         * */

        //연습문제 2-10
        /*
         * 답 : char =  > 2byte = 16bit ;  2의 16 제곱인  65536개
         * */

        //연습문제 2-11
        /*
         *  byte b  = 127 이하 로 해야한다.
         *  float f = 3.14 f 로 해야한다.
         *
         *  답 : a , d
         * */

        //연습문제 2-12
        /*
         * 답 : a
         * */

        //연습문제 2-13
        /*
         * 답 : b ,c
         * */

        //연습문제 3-1
        /*

        int x = 2 ;
        int y = 5 ;
        char  c = 'A';

        System.out.println( 1 + x << 33);   >> 6
        System.out.println(y >=5 || x <0 && x> 2); >> true
        System.out.println(y += 10 - x ++); >> 13
        System.out.println(x +=2 ); >> 5
        System.out.println(!('A' <= c && c <= 'Z')); >> false
        System.out.println('C' - c ); >> 2
        System.out.println('5' - '0'); >> 5
        System.out.println( c + 1 ); >> 66
        System.out.println( ++c ); >> B
        System.out.println( c++ ); >> B
        System.out.println( c );  >> C
        * */

        //연습문제 3-2
        /*
        int numofApples = 123 ;
        int sizeofBucket = 10 ;
        int numofBucket = (numofApples / sizeofBucket + 1) ;

        System.out.println("필요한 바구니 수 : " + numofBucket);
        */

        //연습문제 3-3
        /*
        int num  = 10 ;
        System.out.println( num > 0 ? "양수" : num == 0 ? "0" : "음수" );
        */

        //연습문제 3-4
        /*
        int num = 456 ;
        System.out.println( num - (num%100) );
        */

        //연습문제 3-5
        /*
        int num  = 333;
        System.out.println(num - (num%10) + 1);
        */

        //연습문제 3-6
        /*
        int num = 24 ;
        System.out.println(((num/10 + 1)  * 10) - num) ;
        */

        //연습문제 3-7
        /*
        // 변환 공식  : 섭씨 = 5/9 * ( 화씨 - 32 )
        int fahrenheit = 100 ;
        float celcius = ( ((float)fahrenheit - 32.00f) * 5.00f / 9.00f + 0.005f )  * 100f / 100;
        System.out.println("화씨 : " + fahrenheit);
        System.out.println("섭씨 : " + String.format("%.2f" , celcius));
         */

        //연습문제 3-8
        /*
        byte a = 10;
        byte b = 20;
        int c = a + b ;

        char ch = 'A' ; // asc 2 >> 65
        ch  = (char) ((byte)ch + 2);

        float f = 3.0f/2.0f;
        long l = 3000l * 3000l * 3000l ;
        float  f2 = 0.1f;
        double d = 0.1f;
        boolean result = d==f2;

        System.out.println("c => " + c );
        System.out.println("ch => " + ch);
        System.out.println("f => " + f);
        System.out.println("l => " + l) ;
        System.out.println("result => " + result);
        */

        //연습문제 3-9
        /*
        char ch = 'z';
        boolean b = ( ( (byte)ch > 47 && (byte)ch <= 57  || (byte)ch > 64 && (byte)ch <= 90 || (byte)ch > 96 && (byte)ch <= 122 )   ? true : false  ) ;

        System.out.println( b );
        */

        //연습문제 3-10
        /*
        char ch = 'C' ;
        char lowerCase = ( (byte)ch > 64 && (byte)ch <= 90)  ? (char) ((byte) ch + 32) : ch;

        System.out.println("ch : " + ch);
        System.out.println("ch to lowerCase : " + lowerCase);
        */

    }
}