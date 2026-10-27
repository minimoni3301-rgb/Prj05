package ex05;


class Dog {
  
   String name;
   void   eat() {
	   System.out.println(name + "(이)가 먹는다");}// void 뒤에 eat을 매서드 이름(함수 이름) 
   void  bark() {                                  // 메서드 이름은 소문자로 시작하는 것이 관례 
	   System.out.println(name + "(이)가 멍멍");}
   }

class Cat {
	
	String name;
	void   eat() {
		   System.out.println(name + "(이)가 먹는다");}
	void   meow() {
		System.out.println(name + "(이)가 야옹 ");
	}
	
	
} 
public class TestAnimal {

	public static void main(String[] args) {
		Dog  chu  = new Dog();
		chu.name  = "츄";
		chu.eat();
		chu.bark();
		
		Cat nero  = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();

	}

}
