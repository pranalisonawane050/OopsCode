package oopsPractice;

class EmployeeCount
{
   private int numOfEmployees = 0;
   public void setNoOfEmployees (int count)
   {
       numOfEmployees = count;
   }
   public float getNoOfEmployees () 
   {
       return numOfEmployees;
   }
}
public class EncapsulationDemo
{
   public static void main(String args[])
   {
      EmployeeCount obj = new EmployeeCount ();
      obj.setNoOfEmployees(5613);
      System.out.println("No Of Employees: "+obj.getNoOfEmployees());
      
      EmployeeCount obj2 = new EmployeeCount ();
      obj2.setNoOfEmployees(6000);
      System.out.println("No Of Employees: "+(int)obj2.getNoOfEmployees());
    }
}