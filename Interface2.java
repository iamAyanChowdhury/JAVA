class Phone
{
    public void call()
    {
      System.out.println("Phone call");
    }
    public void SMS()
    {
        System.out.println("Phone sending sms");
    }
}

interface Icamera
{
    public void click();
    public void record();
}

interface Imusicplayer
{
    public void play();
    public void stop();
}

class Smartphone extends Phone implements Icamera,Imusicplayer
{
    public void videocall()
    {
        System.out.println("Smartphone video calling");
    }
    public void click()
    {
        System.out.println("Smartphone clicking photos");
    }
    public void record()
    {
        System.out.println("Smartphone recording videos");
    }
    public void play()
    {
        System.out.println("Smartphone playing music");
    }
    public void stop()
    {
        System.out.println("Smartphone stopping music");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Icamera i=new Smartphone();
        i.click();
    }
    
    
}
