 /*-------------------------------
My name: Santino Andre Salis
My subject code: DPIT111
My student number:6920767
My email address: santinoasalis@gmail.com
Assignment number: 1
 --------------------------------*/
package assignment1q4;
import java.util.Scanner;



public class Person {

    private Address workAddress;
    private Address homeAddress;
    private String email;
    private int phone;
    
    public static void main(String[] args) {
        //Create Scanner varible to hold user input 
        Scanner fetch = new Scanner(System.in);
        //declared varibles in parameter
        int worknum1, homenum2,phoneNumber;
        String worknam1, homenam2,mailAddress;
        //Get user input
        System.out.printf("Enter the street number work of address:");
        worknum1 = fetch.nextInt();
        System.out.printf("Enter the street name of work address: ");
        fetch.nextLine();
        worknam1 = fetch.nextLine();
        System.out.printf("Enter the street number of home address: ");
        homenum2 = fetch.nextInt();
        System.out.printf("Enter the street name of home address: ");
        fetch.nextLine();
        homenam2 = fetch.nextLine();
        System.out.printf("Enter the email address: ");
        mailAddress = fetch.nextLine();
        System.out.printf("Enter the phone number: ");
        phoneNumber = fetch.nextInt();
        //create person object
        Person ob = new Person(worknum1, worknam1,homenum2, homenam2, mailAddress, phoneNumber);
        //Call function to output data
        ob.printContactInformation();
    }
    
    public Person(int worknum1, String worknam1, int homenum2, String homenam2, String mailAddress, int phoneNumber){
        //Create object 
        workAddress = new Address(worknum1, worknam1);
        homeAddress = new Address(homenum2, homenam2);
        email = mailAddress;
        phone = (int) (long) phoneNumber;
        
       
   
    }

    
    public void getEmail(String mailAddress){
        email = mailAddress; 
        
    }
    
    public void getPhone(long phoneNumber){
        
        phone = (int) phoneNumber;
    }
    
    private void printContactInformation(){
        
        
        System.out.println("Home Address " + homeAddress.getAddress());
        System.out.println("Work Address " + workAddress.getAddress());

    }
    
}
