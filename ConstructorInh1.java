class Parent
{
    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent
{
  public Child()
  {
    System.out.println("Child Constructor");
  }
}


public class ConstructorInh1 
{
public static void main(String[] args) 
{
Parent p=new Parent();
System.out.println("");
     
//this will print bth the memebrs of p and c class(Inheritance)
Child c=new Child(); 
   
}

    
}
