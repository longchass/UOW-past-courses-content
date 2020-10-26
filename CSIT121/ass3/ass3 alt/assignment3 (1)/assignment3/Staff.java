package assignment3;

import java.util.ArrayList;

public class Staff extends User{
    private String position;
    public Staff(String id, String firstName, String lastName, String username, String password, boolean status, String position) {
        super(id, firstName, lastName, username, password, UserType.Staff, PermissionType.Edit, status);
        this.position = position;
    }
    
        @Override
    protected void setId(String id){
        for (int i=0; i < id.length(); i++){
            if(Character.isLetter(i)){
                throw new IllegalArgumentException("Staff's Id must start with 3 and followed by 6 digits");
            }
        }
        if ( (id.length() != 7)||(id.charAt(0) != '3') ) {
            throw new IllegalArgumentException("Staff's Id must start with 3 and followed by 6 digits");
        } else 
            super.setId(id);
        
    }
    
    @Override
    public void setPermission(PermissionType permission){
        if ( (permission == PermissionType.Edit)||(permission == PermissionType.None) ){
            super.setPermission(permission);
        } else
            throw new IllegalArgumentException("Staff can only have permission of Booking or None");
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nPosition: "+position+"\n";
    }
    
    public static ArrayList<Staff> filterOnlyStaffList(ArrayList<User> userList){
        ArrayList<Staff> staffList = new ArrayList<>();
        for (User search: userList){
            if (search instanceof Staff)
                staffList.add((Staff)search);
        }
        return staffList;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
