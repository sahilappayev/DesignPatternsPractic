/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderPattern;

import builderPattern.User.UserBuilder; // User clasinin ichindeki UserBuilder clasini import edirik

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        
        UserBuilder builder = new UserBuilder() // UserBuilder inner classinin obyektini yaradiriq 
            //UserBuilder`in constructoru geriye builder obyekti qytarir ve ; qoymadan onu ashagidaki setirlerde de istifade ed bilirik
            .setName("Sahil")
            .setSurname("Appayev");
        
        User user  = builder.build(); // buil demekle user obyekti yaradilir ve user deyishenine menimsedililir
        
        System.out.println(user.getAge() + "  " +user.getName() +"  "+ user.getSurname());
        
        builder.setName("Agabala");
        System.out.println(user.getName());
        
        
        
        
    }
    
}
