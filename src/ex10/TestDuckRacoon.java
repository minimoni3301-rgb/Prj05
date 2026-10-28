package ex10;

/*인터페이스는 애초에 "누구나 이 규칙을 지켜서 구현해라!" 
 * 하고 세상에 공개하는 표준 규격서이기 때문에, 
 * 앞에 아무것도 적지 않아도 무조건 public이 적용되도록 자바가 설계되어 있습니다.
 */
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
