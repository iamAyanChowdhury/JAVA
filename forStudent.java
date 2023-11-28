    class Student {
    public int roll;
    public int m1,m2,m3;
    public String name;
    public String course;

    public int total()
    {
        return m1+m2+m3;
    }
    public int average()
    {
       return (m1+m2+m3)/3;
    }
    public  char grade()
    {
       if(average()>60)
       {
         return  'A';
       }
       else
       {
        return 'B';
       }
    
    }
    public String details()
    {
       return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }

    
}
public class forStudent
{
    public static void main(String[] args) {
        Student s=new Student();
        s.m1=20;
        s.m2=40;
        s.m3=60;
        s.name="Ayan Chowdhury";
        s.roll=24;
        s.course="Computer-science";
        System.out.println("The deatils of the student: "+"\n"+s.details());
        System.out.println("Total marks:"+s.total());
        System.out.println("The average is: "+s.average());
        System.out.println("The grade is:"+s.grade());
    }
}
