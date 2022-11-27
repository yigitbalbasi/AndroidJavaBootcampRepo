package com.yigitb.javadersleri.standart_programlama;

public class Donguler {
    public static void main(String[] args) {
        //1,2,3
        for (int i = 1; i < 4; i++) {
            System.out.println("Dongu1:" + i);
        }

        //1,2,3
        int x = 1;

        while (x < 4) {
            System.out.println("döngü2:" + x);
            x++;
        }

        //10 ile 20 arasında 5er artış

        for (int y = 10; y < 21; y = y + 5) {
            System.out.println("döngü3" + y);
        }

        //20den 10a doğru 5er azalış
        for (int z = 20; z > 9; z = z - 5) {
            System.out.println("döngü4" + z);
        }

        //break kullanılırsa ekran cıktısı
        //1,2,3 olur
        for (int i = 1; i < 6; i++) {
            System.out.println("döngü5" + i);
            if (i == 3) {
                break;
            }

        }

        //continue olunca ekran cıkısı
        //1,2,4,5 olur
        for (int i = 1; i < 6; i++) {
            System.out.println("döngü5" + i);
            if (i == 3) {
                continue;
            }

        }


    }
}
