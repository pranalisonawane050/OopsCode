package oopsPractice;

class Student{  
    int rollno;  
    String name;  
    
    //static variable
    static String college = "ITS";  
    
    //static method 
    static void change()
    {  
    	college = "IIT";  
    }  
    //constructor   
    Student(int r, String n)
    {  
    	rollno = r;  
    	name = n;  
    }  
    
    void display()
    {
    	System.out.println(rollno+" "+name+" "+college);
    }
    
    static
    {
    	System.out.println("static block is invoked");
   }
}  

public class  StaticDemo{  
   public static void main(String args[])
   {  
  
   Student.change();  
    
   Student s1 = new Student(1,"Karan");  
   Student s2 = new Student(2,"Arjun");  
   Student s3 = new Student(3,"Sonu ");  
     
   s1.display();  
   s2.display();  
   s3.display();  
   }  
}  