 /*-------------------------------
My name: Santino Andre Salis
My subject code: DPIT111
My student number:6920767
My email address: santinoasalis@gmail.com
Assignment number: 1
 --------------------------------*/
package assignment1q4;


public class Address {
    
    private int streetNumber;
    private String streetName;
    private String suburb;
    private int postCode;
    private String state;
    
    public Address(int num1, String nam1){
     
        
        streetNumber = num1;
        streetName = nam1;
        //default values
        postCode = 2500; 
        suburb = "Wollongong";
        state = "NSW";
         
    }
    
     public String getAddress(){
         
        return streetNumber + streetName+","+postCode+","+suburb+","+state;
         
         
     }
     
    
    }
