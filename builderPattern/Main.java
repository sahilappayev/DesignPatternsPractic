/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderPattern;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        
        User.UserBuilder builder = new User.UserBuilder(); // UserBuilder inner classinin obyektini yaradiriq 
        
        builder.setName("Sahil");
        builder.setSurname("Appayev");
        
        User user  = builder.build(); // buil demekle user obyekti yaradilir ve user deyishenine menimsedililir
        
        System.out.println(user.getAge() + "  " +user.getName() +"  "+ user.getSurname());
        
        
    }
    
}
