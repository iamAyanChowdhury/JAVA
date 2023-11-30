class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phNo;
    private String dob;
    private String balance;
    
    public String getAccno()
    {
        return accNo;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhno()
    {
        return phNo;
    }
    public String getDob()
    {
        return dob;
    }
    public String getBalance()
    {
        return balance;
    }

    public void setAddress(String addr)
    {
      address=addr;
    }
    public void setPhno(String phN)
    {
      phNo=phN;
    }

    public Account(String accNo, String name,  
    String address, String phNo, 
    String dob,String balance )
    {
        this.accNo=accNo;
        this.name=name;
        this.address=address;
        this.phNo=phNo;
        this.dob=dob;
        this.balance=balance;
    }
}
class SavingsAccount extends Account
{
    public void deposit(long amt)
    {
        balance=balance+amt;
    }
}


public class Bank {
    
}
