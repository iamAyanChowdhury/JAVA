class TV
{
    public void switchOn()
    {
      System.out.println("TV is switched on");
    }
    public void changeChannel()
    {
        System.out.println("TV channel is changed");
    }
}
class SmartTV extends TV{
    @Override
    public void switchOn()
    {
        System.out.println("Smart TV is switched on");
    }
    @Override
    public void changeChannel()
    {
        System.out.println("SmartTV channel is changed");
    }
    public void browse()
    {
        System.out.println("Smart TV browsing");
    }
}
public class TVandSmartTV {
   public static void main(String[] args) {
     TV t=new TV();
     t.switchOn();
     t.changeChannel();
     System.out.println("");
     SmartTV st=new SmartTV();
     st.switchOn();
     st.changeChannel();
     st.browse();
     System.out.println("");
     TV t1=new SmartTV();
     t1.changeChannel();
    }
    
}
