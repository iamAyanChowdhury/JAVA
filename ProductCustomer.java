class Product
{
    String item_number;
    String name;
    double price;
    long quantity;

    public String getItem_number()
    {
        return item_number;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public long getQuantity()
    {
        return quantity;
    }

    public void setPrice(double P)
    {
        price=P;
    }
    public void setQuantity(long Q)
    {
        quantity=Q;
    }

    public Product(String itemno,String N)
    {
        item_number=itemno;
        name=N;
    }

    public String Product_details()
    {
        return "Item-no:"+item_number+"\n"
        +"Name of the product:"+name+"\n"
        +"Price of the product:"+price+"\n"
        +"Product-quantity:"+quantity;
    }

} 

class Customer
{
  String custId;
  String name;
  String address;
  String phno;

  public String getCustId()
  {
    return custId;
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
    return phno;
  }

  public void setAddress(String Address)
  {
    address=Address;
  }
  public void setPhno(String Phno)
  {
    phno=Phno;
  }

  public Customer(String CustId,String Name)
  {
    custId=CustId;
    name=Name;
  }

  public String Customer_details()
  {
    return "Customer-id:"+custId+"\n"
    +"Name:"+name+"\n"
    +"Address:"+address+"\n"
    +"Phone-no:"+phno;
  }
}

public class ProductCustomer {
    public static void main(String[] args) {
        Product p=new Product("ABC1", "NIKE");
        p.setPrice(2999);
        p.setQuantity(1000);
        System.out.println(p.Product_details());
        System.out.println("");

        Customer c=new Customer("A1", "Ayan Chowdhury");
        c.setAddress("Purasree");
        c.setPhno("+917044348982");
        System.out.println(c.Customer_details());
    }
   
    
    
}
