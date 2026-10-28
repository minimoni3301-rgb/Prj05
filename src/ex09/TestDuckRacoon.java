package ex09;

// class는 다중상속불가능
// interface를 구현하여 다중상속을 구현한다.

// class 다중 상속 : c++ 만 가능, java랑 c#은 안됨
// 오리너구리 class = 오리 class + 너구리 class 


class Duck {
	void swim() {
		System.out.println("헤엄을 칩니다.");
	}
	
}

// interface 
// 모든 함수가 abstract 일 때 해당 클래스를 interface로 표현 가능하다. 

/*
abstract class Sachic {
	abstract int add(int v1, int v2);
	abstract int sub(int v1, int v2);
	abstract int mul(int v1, int v2);
	abstract int div(int v1, int v2);
} // => 

interface class Sachic {
	 int add(int v1, int v2);
	 int sub(int v1, int v2);
	 int mul(int v1, int v2);
	 int div(int v1, int v2);
	 
}*/
//인터페이스 안에는 코딩이 들어가면 안됨 
interface Racoon {
	void dig();
}



// java extends 뒤에는 한개의 class만 사용 가능 - 한개만 상속 가능 

// 상속은 extends, 인터페이스는 implements
class DuckRacoon extends Duck implements Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 팝니다.");
		
	}
		
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();

	}

}
