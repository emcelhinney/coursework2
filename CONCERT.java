import javax.swing.JOptionPane;
import java.io.*;
public class CONCERT
{ 
    // array of customer objects
    private CUSTOMER customerList[];
    // number of customers to be calculated after reading file
    int noOfCustomers;
    FILEREADCSV customerfile;

    public CONCERT()
    {
        // initialise instance variables
        customerfile = new FILEREADCSV();

    }

    // top level algorithm
    public void processCustomers() throws IOException
    {
        setUpCustomerList();
        showyear();
        countmethod();
        counttotal();
        savefridaynightfile();

    }

    public void setUpCustomerList() throws IOException
    {
        // first user message
        System.out.println("Concert Sales: Customer Update");
        System.out.println("**Preparing to read data file");
        // read file, fetch data as a String array containing the rows
        String[] dataRows = customerfile.readCSVtable();
        // calculate the number of customer rows, skip headings
        noOfCustomers = dataRows.length;
        // update user with number of rows with customer details
        System.out.println("**" + noOfCustomers + "rows.read.\n\n");
        customerList = new CUSTOMER[noOfCustomers];
        for (int i = 0; i< noOfCustomers; i++)
        {
            customerList[i] = new CUSTOMER();
            customerList[i].readCustomerDetails(dataRows[i]);
        }
    }

    public void showyear()
    {
        //placeholder
    }

    public void countmethod()
    { 
        //placeholder
    }

    public void counttotal()
    {
        //placeholder
    }

    public void savefridaynightfile()
    {
        //placeholder
    }
}

