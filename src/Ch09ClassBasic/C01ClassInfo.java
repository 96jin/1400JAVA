package Ch09ClassBasic;

import java.util.Scanner;

import javax.annotation.processing.RoundEnvironment;

public class C01ClassInfo {

	public static void main(String[] args) {
		
		// 1 객체
		//	-> 현실 존재(독점적이고 배타적인 공간을 차지한다) 사물
		// 	-> 실존하는 객체에 처리를 위한 일부 정보를 추출하여(추상화) 
		// 	-> 프로그램의 메모리 공간에 담아놓은 단위(==인스턴스)
		
		// 2 객체의 구조
		//	- 속성 : 객페를 표현해 주는 세부 데이터 단위 (매개인자)	=> 변수로 저장
		//	- 기능 :	객체가 구현할 수 있는 행동 기능들 (메서드)		=> 함수(메서드)로 처리
		//		ex)	
		//			에어컨
		//			속성	: 로고문양,팬,EVA,Display,Motor개수,S/N,에너지레벨..
		//			기능	: Power On/Off, 제습, 냉방, 온풍..
		//			
		//			나무
		//			속성 : 잎, 가지, 줄기, 열매..
		//			기능 : 광합성, 물 흡수..
		//
		//			자동차
		//			속성 : 계기판, 모델명, 소유자명, 연비, ...
		//			기능 : 가속,감속,깜빡이...
		
		//			컴퓨터
		//			속성 : S/N, CPU spec, Ram spec, 모니터, 그래픽카드, 브랜드, ..
		//			기능 : 전원 On/Off, App 실행, 메모리 제어, 음량 조절, 팬 속도 조절..
		
		
		// 3 클래스
		//	-> 객체에 필요한 공간생성과 기능을 제공하기 위해 미리 선언된 자료형		
		
		// 4 자바의 메모리 영역
		//	-> 1) 스택 영역	: 메서드 내에서 생성되는 공간(일반 자료형 int,double, 참조변수,,)
		//	-> 2) 힙 영역		: 객체가 저장되는 영역(동적할당 공간)
		//	-> 3) 클래스 영역	: 공유메모리 영역(일반 메서드, static메서드, 생성자 함수, static변수)
		
		// 5 단순코드로 확인
		Scanner sc = new Scanner(System.in);
		
//		Scanner = 클래스 자료형
//		Sc = 참조 변수
//		new = 동적할당(힙영역에 공간할당)	
//		Scanner() = 생성자 메서드	- 객체생성시 한번만 호출되는 메서드
//								- 객체에 공간생성에 관여, 초기값을 부여(기본값 =0)

		
		
		
		
		
		
		
		
		
		
	}

}
