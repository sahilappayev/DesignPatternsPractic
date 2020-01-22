/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Admin
 */
public enum MyEnum { // ENUM ashagidaki MyEnum classinin daha qisa shekilde yazilmish formasidir. Ikisi de eyni funksiyani yerine yetiri.

    TOPLA(), CHIX(), VUR(), BOL();

    private String text;

    MyEnum(String text) {
        this.text = text;
    }

    public static final class MyEnum2 {// Bu class bir nov ENUMDUR.

        public static final MyEnum2 TOPLA = new MyEnum2();
        public static final MyEnum2 CHIX = new MyEnum2();
        public static final MyEnum2 VUR = new MyEnum2();
        public static final MyEnum2 BOL = new MyEnum2();

        private String text;

        public MyEnum2() {
        }

        MyEnum2(String text) {
            this.text = text;
        }

    }
}
