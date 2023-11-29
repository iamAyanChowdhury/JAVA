class Subject
{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public String getSubId()
    {
        return subId;
    }
    public String getName()
    {
        return name;
    }
    public int getMaxmarks()
    {
        return maxMarks;
    }
    public int getMarksObtain()
    {
        return marksObtain;
    }

    public void setMaxmarks(int mm)
    {
      maxMarks=mm;
    }
    public void setMarksObtain(int mo)
    {
        marksObtain=mo;
    }

    public String toString()
    {
        return "Subject-Id:"+subId+"\n"
        +"Name:"+name+"\n"
        +"MARKS-OBTAINED:"+marksObtain+"\n";
    }
    
    public Subject(String subId , String name)
    {
        this.subId=subId;
        this.name=name;
    }
    
}


public class arrayOfObjects {
    public static void main(String[] args) {
       Subject subs[]=new Subject[3];
        subs[0]=new Subject("a1", "CS");
        subs[1]=new Subject("A2","Phy");
        for (Subject s : subs) {
            System.out.println(s);
        }
        
    }
    
}
