package oopsPractice;
//abstract class
abstract class Car{
	//constructor
	Car()
	{
	System.out.println("Car classs");	
	}
	
	//abstract method 
	abstract void gearChange(); 
	
	void name()
	{
		System.out.println("CAR");
	}
}
//inheritance
class Swift extends Car{
	@Override
	void name()
	{
		System.out.println("SWIFT CAR");
	}
	
	void gearChange() 
	{
	System.out.println("manually");	
	}
	
	
}
class Audi extends Car{
	@Override
	void name()
	{
	System.out.println("AUDI CAR");
		
	}
	void gearChange() 
	{
		System.out.println("Auto gear");	
	}
}

public class AbstactionDemo {
	public static void main(String args[]) {
		 //child ref and parent class  
		/*
		Swift obj2 = new Car(); 
		obj2.name();
		obj2.gearChange();
		*/
	
		
		//child ref and child class  
		Audi obj = new Audi(); 
		obj.name();
		obj.gearChange();
		System.out.println("........");
		
		//parent ref and Parent class
		//cant create object abstrct class
		/*
		Car obj3 = new Car(); 
		obj3.name();
		//obj3.gearChange();
		System.out.println("........");
		*/
		
		//parent ref and child class
		Car obj4=new Swift();
		obj4.name();
		//obj4.gearChange();
		System.out.println("........");
	}			
}
