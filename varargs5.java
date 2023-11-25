public class varargs5 {
    static double discount(double...P)
    {
        double sum=0;
        for(int i=0;i<P.length;i++)
        {
            sum=sum+P[i];
        }
        if(sum<500)
        {
            return sum*0.10;
        }
        else if(sum>=500 && sum<1000)
        {
            return sum*0.15;
        }
        else
        {
            return sum*0.20;
        }
    }

    public static void main(String[] args) {
        double n[]={100,200,300,1000};
        System.out.println(discount(n));
    }
    
}
