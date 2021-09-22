package oopsPractice;
interface Printable
{  
	void print(); 
} 
interface Drawable extends Printable
{  
	void disp();  
	default void msg()
	{
		System.out.println("default method");
	} 
	static int cube(int x)
	{
		return x*x;
	}
}  
class Rectangle implements Drawable
{  
	public void disp()
	{
		System.out.println("drawing rectangle");	
	}  
	public void print()
	{
		System.out.println("Printing rectangle");	
	}  
}  
class InterfaceDemo
{  
	public static void main(String args[])
	{  
		Drawable d=new Rectangle();  
		d.disp();
		d.print();
		d.msg();  
		System.out.println(Drawable.cube(3)); 
	}
} 