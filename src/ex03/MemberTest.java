package ex03;

import java.time.LocalDate;

/*RESCENE
원이  리브  미나미  메이   제나 
2004  2006  2006    2008   2008
리더  보컬  보컬    랩     보컬
*/

// GMember 설계도 
class GMember  {
	
	//Fields : private를 붙여서 만들기 **공식 
	private  String  name;
	private  int     bYear;
	private  String  role; 
	
	// 객체지향언어가 가지는 특징 (OverLoading) 
	// Polymorphism        : 다형성 
	// OverLoading        : 같은 이름의 생성자나 함수가 (인자 갯수가 다른) 여러개 있어요 
	// Constructor 생성자 : 객체를 생성 (new)  할때 실행되는 명령
	// 방이 태어날 때 해야 할 일을 적어두는 곳 
	// 생성자는 클래스 이름과 같아야한다. 
	
	// 기본 생성자 : 인자 없는 생성자, NoArgsConstructor
	public GMember() {
		System.out.println("하이 방가");
		
	}
	// 모든 인자가 있는 생성자, AllArgsConstructor
	public GMember(String name, int bYear, String role) {
		 this.name  = name;	
		 this.bYear = bYear;
		 this.role  = role;
		 // 구분하려고 필드 변수에 ' this ' 를 붙인다 
	}
	
	// Methods : public으로 만들어라 (데이터로 무엇을 할 것인지)
  public void info() {
	 int age = LocalDate.now().getYear() - bYear;
	  System.out.printf("%s %d년 (%d세) %s\n",
		   name, bYear, age, role);
	  
	}
}
public class MemberTest {
    //null 널 : 변수를 만들었으나, 사용한적이 없다. 
	// ""   빈문자열 empty string  
	
	//모두 대문자 : Ctrl + shift + x
	//모두 소문자 : Ctrl + shift + y
	public static void main(String[] args) {
	/*	
	 GMember r = new GMember(); // new 를하면 무조건 Heap 에 공간이 만들어짐
	 // r은 Heap 의 위치 정보를 가지고 있다.
	 r.name = "원이";
	 r.info();
    */
		
      GMember r0 = new GMember(); // 하이 방가가 나오는 형태 
     // r1.name    = "원이"; 
      // 오류 : The field GMember.name is not visible
      // private 변수를 .으로 직접 사용했다 
      
      // ****private 변수에 값을 넣는 방법 2가지******
      // 1. 생성자를 이용
      GMember r1 = new GMember("원이",2004,"리더"); 
      r1.info();
      
      // 2. Getter / Setter 를 사용 
      
		
      
      	
	}

}
