package ex10;


interface IDuck {
 void swim();
}

interface IRacoon {
 void dig();
}

// 인터페이스는 코딩이 없어야한다. {} (중괄호)가 없어야한다.(; 뒤에)
// 뒤에 , 를 사용해서 두개가 들어올 수 있다. 
class DuckRacoon implements IDuck, IRacoon {

	@Override
	public void dig() {
		System.out.println("땅을 팝니다.");
		
	}

	@Override
	public void swim() {
		System.out.println("헤엄을 칩니다.");
		
	}
	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		
		dr.swim();
		dr.dig();
		
		  
	}

}
