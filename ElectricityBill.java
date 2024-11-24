
import java.util.*; 
class ElectricityBill
{
    public static void main(String...args)
    {
    String consumer_no, consumer_name;
    double prev_month_reading, current_month_reading,no_units;
    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter the consumer no :"); 
    consumer_no = scan.nextLine(); 
    System.out.println("Enter the consumer name :"); 
    consumer_name=scan.nextLine(); 
    System.out.println("Enter the previous month reading :"); 
    prev_month_reading = scan.nextFloat(); 
    System.out.println("Enter the current month reading :"); 
    current_month_reading = scan.nextFloat();
    no_units = current_month_reading - prev_month_reading; 
    System.out.println("---------------------------------------------");
    System.out.println(" ElectricityBill "); 
    System.out.println("---------------------------------------------");
    System.out.println("Consumer name : "+consumer_name); 
    System.out.println("Consumer no : "+consumer_no); 
    System.out.println("No.of units : "+no_units); 
    System.out.println("Electricity Bill : Rs."+domestic(no_units)); 
    System.out.println("---------------------------------------------");
    }
    public static double domestic(double no_units)
    {
    double cost = 1; 
    if(no_units <= 100)
    {
        cost = no_units * 1 ;
    }
    else if(no_units >= 101 && no_units <= 200)
    {
        cost = no_units * 2.50 ;
    }
    else if(no_units >= 201 && no_units <=500)
    {
        cost = no_units * 4 ;
    }
    else
    {
    cost = no_units * 6 ;
    }
    return (cost);
    }
}