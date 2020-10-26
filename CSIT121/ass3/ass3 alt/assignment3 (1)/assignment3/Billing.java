package assignment3;

import java.util.*;

public abstract class Billing extends User{
    private Address billingAddress;
    private String email;

    public Billing(String id, String firstName, String lastName, String username, String password, UserType userType, PermissionType permission, boolean status,Address billingAddress, String email) {
        super(id, firstName, lastName, username, password, userType, permission, status);
        this.billingAddress = billingAddress;
        setEmail(email);
    }
    
    public Billing (String id, String firstName, String lastName, String username, String password, UserType userType, PermissionType permission, boolean status, String email) {
        this(id, firstName, lastName, username, password, userType, permission, status, null, email);
    }
    
    public Billing (String id, String firstName, String lastName, String username, String password, UserType userType, PermissionType permission, boolean status) {
        this(id, firstName, lastName, username, password, userType, permission, status, null, "None");
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != "None"){
            if( (email.contains("@"))&&(email.contains(".")) ){
                this.email = email;
            } else
                throw new IllegalArgumentException("Email format unvalid");
        }
    }
    
    @Override
    public String toString(){
        if ((email == "None")&&(billingAddress == null))
            return super.toString()+"\n";
        else if (billingAddress == null)
            return super.toString()+"\nEmail: "+email+"\n";
        else
            return super.toString()+"\nBilling Address: "+billingAddress+"\nEmail: "+email+"\n";
    }
    
    @Override
    public Billing clone() throws CloneNotSupportedException{
        Billing user = (Billing) super.clone();
        if (billingAddress != null)
            user.billingAddress = (Address) billingAddress.clone();
        return user;
    }
}
