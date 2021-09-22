package oopsPractice;
class Demo{
	public void display() 
	{
		System.out.println("parent class");
	}
}
public class OverridingDemo extends Demo 
	{
	@Override
	public void display()
	{
		super.display();
		System.out.println("child class");
	}
	public static void main(String args[])
	{
		Demo obj = new OverridingDemo();
		obj.display();
		System.out.println("........");
		// This would call the OverridingDemo class method
		
		Demo obj2 = new Demo();
		obj2.display();
		System.out.println("........");
		// This would call the demo class method

		OverridingDemo obj3 = new OverridingDemo();
		obj3.display();
		System.out.println("........");
		// This would call the OverridingDemo class method

		
		
    }
}


