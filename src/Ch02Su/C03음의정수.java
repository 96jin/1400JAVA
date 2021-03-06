package Ch02Su;

// CPU는 가산회로에 의해서 가산처리(+)를 할 수 있다? O
// CPU는 감산회로에 의해서 감산처리(-)를 할 수 있다? X

// 보수의 개념을 도입해서 사용자가 뺄셈요청시 덧셈으로 치환하여 뺄셈과 동일한 결과값을 전달해준다.
//	   5의 2진수				-5의 2진수  --> 전체 자리에 0과 1을 바꿔주고 1을 더해준다. (보수)
// 00000101 					11111011 (5에대한 2의 보수) 		11111010 (5에대한 1의 보수) : 비트만 반전시킨것.

// 2의 보수로 변환되었을때 왼쪽 끝 비트를 부호비트로 해석한다.
// 0이면 양수(+) , 1이면 음수(-) 


//문제
//10진수		->		2진수
//11				->	00001011
//-11				-> 11110101
//111				->	01101111
//-111			->	10010001
//96				->	01100000
//-96			-> 10100000
//
////문제
//2진수		->		10진수
//10001010	-> -128+8+2			= -118
//11000101	->	-128+1+4+64 	= -59
//01110101	->	1+4+16+32+64 	= 117
//11001100	-> -128+64+8+4 	= -52


public class C03음의정수 {

	public static void main(String[] args) {
		
		System.out.printf("%d\n", (byte)(0b10010001));

	}

}
