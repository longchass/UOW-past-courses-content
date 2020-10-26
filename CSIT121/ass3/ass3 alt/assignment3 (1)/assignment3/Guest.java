package assignment3;

import java.util.ArrayList;

public class Guest extends Billing{
    public Guest(String id, String firstName, String lastName, String username, String password, boolean status) {
        super(id, firstName, lastName, username, password, UserType.Customer, PermissionType.View, status);
        setId(id);
    }

    public Guest(String id, String firstName, String lastName, String username, String password, boolean status, String email) {
        super(id, firstName, lastName, username, password, UserType.Customer, PermissionType.View, status, email);
    }
    
    
    @Override
    protected final void setId(String id){
        for (int i=0; i < id.length(); i++){
            if(Character.isLetter(i)){
                throw new IllegalArgumentException("Guest's Id must start with 2 and followed by 6 digits");
            }
        }
        if ( (id.length() != 7)||(id.charAt(0) != '2') ) {
            throw new IllegalArgumentException("Guest's Id must start with 2 and followed by 6 digits");
        } else 
            super.setId(id);
        
    }
    
    @Override
    public void setPermission(PermissionType permission){
        if ( (permission == PermissionType.View)||(permission == PermissionType.None) ){
            super.setPermission(permission);
        } else
            throw new IllegalArgumentException("Guest can only have permission of View or None");
    }
    
    public static ArrayList<Guest> filterOnlyGuestList(ArrayList<User> userList){
        ArrayList<Guest> guestList = new ArrayList<>();
        for (User search: userList){
            if (search instanceof Guest)
                guestList.add((Guest)search);
        }
        return guestList;
    }
}
