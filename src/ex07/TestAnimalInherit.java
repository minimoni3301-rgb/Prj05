package ex07;

class Animal {
	String name;
	void   eat() {
		   System.out.println(name + "(이)가 먹는다");}
}


          // 상속 
class Dog extends Animal{
  
   
   void  bark() {
	   System.out.println(name + "(이)가 멍멍");}
   }

class Cat extends Animal {
	

	void  meow() {
		System.out.println(name + "(이)가 야옹 ");
	}
}
class Tiger extends Animal {
	void cry() {
		System.out.println(name + "(이)가 어흥");
	}
}
	
// 메인이 있는 함수에 public 을 붙인다. 
public class TestAnimalInherit {

	// method overloading 으로 처리
	public static void main(String[] args) {
		Dog  chu  = new Dog();
		work(chu, "츄");
		

		
		Cat nero  = new Cat();
		work(nero, "네로");
		

		Tiger neo = new Tiger();
		work(neo, "네오");
	}
	
//2. 동일한 부모 클래스를 상속한 클래스일 경우에는 하나의 함수로 구현가능
		private static void work(Animal animal, String name) {
			animal.name = name;
			animal.eat();
			
			
			// class 강제 형변환(캐스팅)
			// animal이 Dog 타입에서 호출된 것인가 
			if (animal instanceof Dog)
		        ((Dog) animal).bark();
			
			if(animal instanceof Cat)
			   ((Cat) animal).meow();
			
			if (animal instanceof Tiger)
				((Tiger) animal).cry();
				// animal.bark();
	}
		
		
		
/*  method overloading 으로 처리
	private static void work(Tiger neo, String string) {
		
		neo.name = "네오";
		neo.eat();
		neo.cry();
	}

	private static void work(Cat nero, String string) {
		
		nero.name = "네로";
		nero.eat();
		nero.meow();
		
	}

	private static void work(Dog chu, String string) {
		
		chu.name  = "츄";
		chu.eat();
		chu.bark();
		*/

	
		
	}
	
	


