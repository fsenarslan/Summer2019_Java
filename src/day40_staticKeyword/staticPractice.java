package day40_staticKeyword;

public class staticPractice {
	
	static long num1;
			long num2;
	
	public static void main(String[] args) {
		
		System.out.println(num1);
		System.out.println(staticPractice.num1);
		
	//  System.out.println(num2);
	//  System.out.println(staticPractice.num2);
		
		method1();
		staticPractice.method1();
	//  staticPractice.method2();
		
		staticVariables.method1();
		
		staticPractice obj = new staticPractice();
		obj.method2();
		obj.method1();
		
	  }
	
	public static void method1() {
		System.out.println("A");
	}
	
	public void method2(){
		System.out.println("B");
	}
	
	
	
	
	
	
}
