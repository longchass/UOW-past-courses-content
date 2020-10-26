package assignment3;

public class Address implements Cloneable, Comparable<Address>{
    private String streetNumber;
    private String streetName;
    private String suburb;
    private String city;
    private String state;
    private int postcode;
   
    public Address(String streetNumber, String streetName, String suburb, String city, String state, int postcode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.suburb = suburb;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
    }
    public Address(){}
    
    @Override
    public String toString() {
        return streetNumber+", "+streetName+", "+suburb+", "+city+", "+state+", "+postcode;
    }
    
    @Override
    public Address clone() throws CloneNotSupportedException{
        return (Address) super.clone();
    }
    
    @Override
    public int compareTo(Address add){
        if (postcode == add.getPostcode()) 
            return 0;
        else if(postcode < add.getPostcode())
            return -1;
        else
            return 1;
    }
    
    public String getState(){
        return state;
    }
    
    public int getPostcode() {
        return postcode;
    }
}
