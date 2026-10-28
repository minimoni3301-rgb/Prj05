package ex12;
// 직원 정보 출력 (생성자와 setter, getter)
class Emp {
	
	private   int    eno;
	private   String name;
	private   String phone;

	
	// 생성자 
	public Emp(int eno, String name, String phone) {
		super();
		this.eno = eno;
		this.name = name;
		this.phone = phone;
	}

	
	public Emp() {
		// TODO Auto-generated constructor stub
	}


	//method
	public void info() {
		System.out.printf("%d %s %s", 
				    eno, name, phone);
	}
	
	// Getter/Setter

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	
	
	
}

public class TestGetterSetter {

	public static void main(String[] args) {
		
		// setter는 값을 바꿀 수 있다. (수정할 때 필수) 
		
		Emp emp1 = new Emp();
		//emp1.eno = 1;
		emp1.setEno(1);
		emp1.setName("장원영");
		emp1.setPhone("010-3222-1155");
		emp1.info();
		
		
		
		
//int neweno = emp1.getEno();
//System.out.println(neweno); 
		
		//생성자로 넣는거 (값을 넣는 일 밖에 못함, 전화번호 변경이 안됨), new 할 때 용도로만 사용 
		Emp emp2 = new Emp(2,"안효욱","010-0000-0000");
		emp2.info();
		
		// 생성자 만들때는 반드시 기본생성자를 만들고 인자있는 생성자를 만든다. 
		  
	}

}
