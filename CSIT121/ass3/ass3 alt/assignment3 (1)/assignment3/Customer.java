package assignment3;

import java.util.ArrayList;

public class Customer extends Billing{
    private Address customerAddress;

    public Customer(String id, String firstName, String lastName, String username, String password, UserType userType, boolean status, Address billingAddress, String email, Address customerAddress) {
        super(id, firstName, lastName, username, password, userType, PermissionType.Booking, status, customerAddress, email);
        this.customerAddress = customerAddress;
        setId(id);
    }
    
    public Customer(String id, String firstName, String lastName, String username, String password, boolean status, Address billingAddress, String email) {
        super(id, firstName, lastName, username, password, UserType.Customer, PermissionType.Booking, status, billingAddress, email);
        setId(id);
    }
    
    @Override
    protected void setId(String id){
        for (int i=0; i < id.length(); i++){
            if(Character.isLetter(i)){
                throw new IllegalArgumentException("Customer's Id must start with 1 and followed by 6 digits letter");
            }
        }
        if ( (id.length() != 7)||(id.charAt(0) != '1') ) {
            throw new IllegalArgumentException("Customer's Id must start with 1 and followed by 6 digits ");
        } else 
            super.setId(id);
        
    }
    
    public static ArrayList<Customer> filterOnlyCustomerList(ArrayList<User> userList){
        ArrayList<Customer> custList = new ArrayList<>();
        for (User search: userList){
            if (search instanceof Customer)
                custList.add((Customer)search);
        }
        return custList;
    }
    
    @Override
    public void setPermission(PermissionType permission){
        if ( (permission == PermissionType.Booking)||(permission == PermissionType.None) ){
            super.setPermission(permission);
        } else
            throw new IllegalArgumentException("Customer can only have permission of Booking or None");

    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }
    
    @Override
    public Customer clone() throws CloneNotSupportedException{
        Customer cloneCust = (Customer) super.clone();
        cloneCust.customerAddress = (Address) this.customerAddress.clone();
        return cloneCust;
    }

    public static ArrayList<Customer> filterOnlyVIPCustomerList(ArrayList<User> userList){
        ArrayList<Customer> custList = new ArrayList<>();
        for(User u: userList){
            if ( (u instanceof Customer)&&(u.getUserType() ==UserType.VIP) ){
                custList.add( (Customer)u );
            }
        }
        return custList;
    }
}
