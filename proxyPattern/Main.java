/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyPattern;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Image image = ObjectCreator.createObject(RealImage.class); // createObject metodu eslinde bize proxyImage obyekti qaytarir ve biz onun uzerinden realImage obyekti ile ish goruruk

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }

}
