/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.io.IOException;
import java.util.Arrays;

public class TestMethod {
    public static void main(String[] args){
        UserManagement manager = new UserManagement();
        
        try{
            manager.readRecord();
        } catch(IOException ex){}
        
        //expected to have 4 out of 8 records
        System.out.println(manager.searchCustomerByFullName("a"));
        
        //expected to have 4 records
        System.out.println("\n\n"+Arrays.toString(manager.filterVIPCustomerList()));
        
        //expected to have 4 records
        System.out.println("\n\n"+Arrays.toString(manager.filterNSWCustomer()));
    }
}
