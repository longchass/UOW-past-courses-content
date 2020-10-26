package assignment3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class UserManagement {
    private Map<String,User> usersMap = new HashMap();
    
    public boolean verifyLogIn(String username, String password){
        return User.verifyLogInByUsernameAndPassword(getUserList(), username, password);
    }
    
    public boolean addUser(User user){
        usersMap.put(user.getUsername(),user);
        return true;
    }
        
    public boolean changePassword(String username, String oldPassword, String newPassword) {
////         User u1=this.usersMap.get(username);
////         if  u1.verifyLogIn(username, newPassword)
        
        for(User u: getUserList()){
            if (u.verifyUsernameAndPassword(username, oldPassword) == true){
                u.setPassword(newPassword);
                return true;
            }
        }
        return false;
    }
    
    public void updateUserName(User user, String firstName, String lastName) {
        
           User u1=this.usersMap.get(user.getUsername());
           if (u1!=null)
           {
           u1.setFirstName(firstName);
           u1.setLastName(lastName);
           }
        
        for(User u: this.getUserList()){
            if(u.getUsername().equals(user.getUsername())){
                u.setFirstName(firstName);
                u.setLastName(lastName);
            }
        }
        
    }
    
    public void updateStaffPosition(Staff user, String position) {
        for(User u: this.getUserList()){
            if(u.getUsername().equals(user.getUsername())){
                Staff staff = (Staff) u;
                staff.setPosition(position);                
            }
        }

    }
    
    public List<Customer> searchCustomerByFullName(String keyword) {
        List<Customer> result = this.getUserList().stream()
                          .filter(e -> e instanceof Customer)
                          .map(e -> (Customer) e)
                          .filter(e -> e.getFullname().toLowerCase().matches("(.*)"+keyword+"(.*)"))
                          .collect(Collectors.toList());
        
        return result;
    }
    
    public String[] displayCustomerByFullName(String keyword){
        String[] result = this.searchCustomerByFullName(keyword).stream()
                            .map(e -> e.getFullname())
                            .toArray(String[]::new);
        
        return result;
    }
    
    public String[] filterVIPCustomerList(){
        String[] result = this.getUserList().stream()
                            .filter(e -> e.getUserType()==UserType.VIP)
                            .map(e -> (Customer) e)
                            .map(e -> String.format("%s, %s", e.getFullname(),e.getEmail()))
                            .toArray(String[]::new);
        
        return result;
    }
    
    public String[] sortCustomerByLastName() {
        String[] sortedList = this.getUserList().stream()
                            .filter(e -> e instanceof Customer)
                            .sorted(Comparator.comparing(User::getLastName))
                            .map(e -> (Customer) e)
                            .map(e -> String.format("%s, %s", e.getFullname(),e.getBillingAddress()))
                            .toArray(String[]::new);
        return sortedList;
    }
    
    public Customer[] filterNSWCustomer(){
        Customer[] customers = this.getUserList().stream()
                        .filter(s -> s instanceof Customer)
                        .map(s -> (Customer) s)
                        .filter(s -> s.getBillingAddress().getState().equals("NSW"))
                        .toArray(Customer[]::new);
        
        return customers;
    }
    
    public ArrayList<User> getUserList(){
        Collection<User> values = usersMap.values();
        ArrayList<User> usersList = new ArrayList<>(values);
        return usersList;
    }
    public Map<String,User> getUserMap(){
        return usersMap;
    }
    
    
     public void readRecord() throws IOException {
        Scanner in = null;
        boolean error =false;
        try {
            in= new Scanner(Paths.get("User Management.txt"));
        } catch (IOException ex) {
          error =true; 
          throw new IOException();
        }
        if (!error)  //check to open file
        {
            if(!in.hasNext())
                throw new NoSuchElementException("No record");
            
        while(in.hasNext()){
            String record = in.nextLine();
            String[] s = record.split(", ");

            if(s.length == 20){
                Customer cust = new Customer(s[0],s[1],s[2],s[3],s[4],UserType.valueOf(s[5]),Boolean.parseBoolean(s[6]),
                        new Address(s[7],s[8],s[9],s[10],s[11],Integer.parseInt(s[12])),s[13],
                        new Address(s[14],s[15],s[16],s[17],s[18],Integer.parseInt(s[19])) );
                usersMap.put(cust.getUsername(), cust);
            } else if(s.length == 13) {
                Customer cust = new Customer(s[0],s[1],s[2],s[3],s[4],Boolean.parseBoolean(s[5]),
                        new Address(s[6],s[7],s[8],s[9],s[10],Integer.parseInt(s[11])),s[12]);
                usersMap.put(cust.getUsername(), cust);
            } else if(s.length == 6) {
                Guest guest = new Guest(s[0],s[1],s[2],s[3],s[4],Boolean.parseBoolean(s[5]));
                usersMap.put(guest.getUsername(), guest);
            } else if(s.length == 7) {
                Staff staff = new Staff(s[0],s[1],s[2],s[3],s[4],Boolean.parseBoolean(s[5]),s[6]);
                usersMap.put(staff.getUsername(), staff);
            }
        } 
        }
        
        in.close();
    }
    
    public void writeToFile() {
        Formatter pen = null;
        try {
            pen = new Formatter(Paths.get("User Management.txt").toFile());
            
        }catch(FileNotFoundException ex) {
            System.err.println("File not found");
        }
        
        for (User user: this.getUserList()){
            if(user instanceof Customer) {
                Customer u = (Customer) user;
                if(u.getCustomerAddress() != null) {
                pen.format("%s, %s, %s, %s, %s, %s, %s, %s, %s, %s\n",
                        u.getId(),u.getFirstName(),u.getLastName(),u.getUsername(),u.getPassword(),u.getUserType(),true,
                        u.getBillingAddress(),u.getEmail(),u.getCustomerAddress());
                } else {
                pen.format("%s, %s, %s, %s, %s, %s, %s, %s \n", 
                        u.getId(),u.getFirstName(),u.getLastName(),u.getUsername(),u.getPassword(),true,
                        u.getBillingAddress(),u.getEmail());
                }
            } else if(user instanceof Guest){    
                Guest u = (Guest) user;
                pen.format("%s, %s, %s, %s, %s, %s \n", u.getId(),u.getFirstName(),u.getLastName(),
                        u.getUsername(),u.getPassword(),true);
            } else {
                
                Staff u = (Staff) user;
                pen.format("%s, %s, %s, %s, %s, %s, %s \n", u.getId(),u.getFirstName(),u.getLastName(),
                        u.getUsername(),u.getPassword(),true,u.getPosition());
            }
        }
        pen.close();
    }
   
}
