package com.test.helloworld;

//싱글톤은 하나의 객체만 만들도록 보장 - 메모리 낭비가 적다.

class Singletone {
	private static Singletone single = new  Singletone();
	
	private Singletone(){}
	
	public static Singletone getInstance(){
		return single;
	}
	
	public void hello(){
		
	}
}

class Singletone2 extends Singletone{
	@Override //- 오버라이드 되는지 갈쳐준다.
	public void hello(){
		
	}
}
public class HelloWorld {
	public static void main (String args[]) {
		
		Singletone single1 = Singletone.getInstance();
		Singletone single2 = Singletone.getInstance();
		
		if(single1==single2)
				System.out.println("Same!!!!");
		else
			System.out.println("Difference");
		System.out.println("Hello World~!");
		System.out.println("안녕하세요.");
	}
}

//일반적 예제 - 주소가 다르다.
/*class Singletone {
	public Singletone(){}
	
}

public class HelloWorld {
	public static void main (String args[]) {
		
		Singletone single1 = new Singletone();
		Singletone single2 = new Singletone();
		
		if(single1==single2)
				System.out.println("Same!!!!");
		else
			System.out.println("Difference");
		System.out.println("Hello World~!");
		System.out.println("안녕하세요.");
	}
}*/

