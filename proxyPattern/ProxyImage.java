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
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage() {
    }

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        //Proxy Pattern vasitesile biz esas classdaki metodlari chagirarken proxy classinda elave yoxlama emeliyyatlari heyata kechirde bilerik
        
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
