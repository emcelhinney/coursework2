public class CUSTOMER
{
    // instance variables - replace the example below with your own
    private String customerid;
    private char ticketid;
    private int numoftickets;
    private char method;
    public float total;
    private String seatsection;
    
    public CUSTOMER()
    {
        // initialise instance variables
        customerid = "";
        ticketid = 0;
        numoftickets = 0;
        method = 0;
        total = 0.0f;
        
    }
    public void readCustomerDetails(String dataItems)
    {
        // unpack string of row data into fields
        String[] rowItems = dataItems.split(",");
        // store each data item as instace property
        customerid = rowItems[0];
        ticketid = (rowItems[1]).charAt(0);
        numoftickets = Integer.parseInt(rowItems[2]);
        method = (rowItems[3]).charAt(0);
        seatsection = rowItems[1];
    }
    public String writeDetails()
    {
        // join up data into a string to output as a row
        // use "," to separate csv columns
        String customerData = "";
        customerData = customerData.concat(customerid);
        customerData = customerData.concat(",");
        customerData = customerData.concat(seatsection);
        customerData = customerData.concat(",");
        customerData = customerData.concat(Integer.toString(numoftickets));
        customerData = customerData.concat(",");
        customerData = customerData.concat(Character.toString(method));
        return customerData;
    }
  public char getmethod()
  {
      return method;
    }
   public char getnight()
   {
       return ticketid;
    }
   public int getnumOftickets()
   {
       return numoftickets;
}
}
