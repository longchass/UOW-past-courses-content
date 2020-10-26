package assignment3;

import java.util.ArrayList;

public abstract class User implements Comparable<User>, Cloneable{
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private UserType userType;
    private PermissionType permission;
    private boolean status;

    public User(String id, String firstName, String lastName, String username, String password, UserType userType, PermissionType permission, boolean status) {
        setId(id);
        this.username = username;
        this.userType = userType;
        this.permission = permission;
        this.status = status;
        setPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    protected void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.contains("[0..9]") == true){
            throw new IllegalArgumentException("Name should not contain numeric char");
        } else
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.contains("[0..9]") == true){
            throw new IllegalArgumentException("Name should not contain numeric char");
        } else
            this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8)
            this.password = password;
        else
            throw new IllegalArgumentException("Password must contain at least 8 chars");
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public PermissionType getPermission() {
        return permission;
    }

    public void setPermission(PermissionType permission) {
        this.permission = permission;
    }
    
    public String getFullname(){
        return firstName+" "+lastName;
    }
    
    public boolean verifyUsernameAndPassword(String username, String password) {
        if (this.username.equals(username)){
            return this.password.equals(password);
        } else
            return false;
    }
    
    public boolean verifyUsername(String username){
        return this.username.equals(username);
    }
    
    public boolean verifyUserType(UserType userType){
        return this.userType == userType;
    }
    
    public boolean verifyPermission(PermissionType permission){
        return this.permission == permission;
    }
    
    @Override
    public String toString(){
        return "ID: "+id+"\nName: "+getFullname()+"\nUsername: "+username+
                "\nUser Type: "+userType+"\nPermission: "+permission;
        
    }
    
    @Override
    public User clone() throws CloneNotSupportedException{
        return (User) super.clone();
    }
    
    @Override
    public int compareTo(User user){
        double intId = Integer.parseInt(id);
        double intIdCompare = Integer.parseInt(user.getId());
        
        if (intId > intIdCompare){
            return 1;
        } else if (intId < intIdCompare){
            return -1;
        } else
            return 0;
    }
    
    public static boolean verifyLogInByUsernameAndPassword(ArrayList<User> userList, String username, String password) {
        
        for (User search: userList) {
            if (search.username.equals(username)){
                if(search.password.equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
}
