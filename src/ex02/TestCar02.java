package ex02;

//access modifier : 접근제한자
// private : 해당 class 에서만 사용 가능
// package : 해당 패키지에서 사용가능. ( 접근제한자를 생략하면 )
// protected : package + protected (상속관계에서 공유)
// public :모든 곳에서 사용 가능, 다른 클래스에서도 

// class  : 설계도 (우리가 표현하고 싶은 대상[객체])
class Car {
	
	//Fields
	
	String    name;
	String    color;
	int       year;
	
	
	
	// Methods
	// info()는 내가 만든 객체 안에 들어있는 데이터를 화면에 출력해주는 도우미 (데이터로 무엇을 할 것인지)
	void info()   // void는 자기 할 일(출력)만 하고 끝내며, 별도의 계산 결과를 돌려주지 않는다는 뜻 
      {
		System.out.println("차이름:" + name);
		System.out.println("색상:" + color);
		System.out.println("연식:" + year);
		
		
		
	}
	
	
	}


public class TestCar02 {

	public static void main(String[] args) {
		Car car1 = new Car(); //객체 방 하나 새로 파기 
		                      // 위에 car 설계도에 부품 name,color, year 들어있어서 방을 3개 자동으로 만듬 
		car1.name = "아빠차";
		car1.color = "Black";
		car1.year = 2024;
		car1.info();

		Car car2 = new Car();
		car2.name = "엄마차";
		car2.color = "red";
		car2.year = 2025;
		car2.info();  //자바에서 . 은 '~의 내부로 들어가라'는 의미 
		
		
	}

}
