package com.yigitb.javadersleri.nesne_tabanli_programlama.paket1;

public class A {
    //Acces Modifier = Visibility Modifier
    int varsayilanDegisken = 1; //hiçbir şey yazılmazsa protected'dır
    public int publicDegisken = 2; //her yerden erişebilir
    protected int protectedDegisken = 3; //aynı paketteyse erişim sağlanır  -- aynı klasördeyse
    private int privateDegisken = 4;    //sadece sınıf içinden erişim sağlanır

}
