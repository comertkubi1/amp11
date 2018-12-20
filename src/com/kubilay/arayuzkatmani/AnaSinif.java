package com.kubilay.arayuzkatmani;

import com.kubilay.iskatmani.*;
import java.lang.String;
import com.sun.org.apache.xpath.internal.operations.Mod;

import javax.lang.model.util.ElementScanner6;

public class AnaSinif {
    public static void main(String[] args) {
        AsalSayilar as=new AsalSayilar();
        System.out.println(as.asalmiyazdir(21));

       Parametre p=new Parametre();
        p.topla2(100,100,"ali");
       KlavyedenBilgi kb=new KlavyedenBilgi();
        kb.klavyedenoku();
       //  System.out.println("Dikdörtgenin alani= "+kb.soru3());

       // IcIceFor ic=new IcIceFor();
       // ic.soru7();
       // ic.soru1();

        //ModAlma ma=new ModAlma();
        //ma.soru2();

        //ForDongu fd=new ForDongu();
        //fd.soru8();
        //System.out.println("1 ile 100 arasındaki sayıların toplamı= "+fd.soru7());

       // Sinav s1=new Sinav();
       // s1.soru1();
        //s1.soru2();

        //DortIslem di = new DortIslem(); //DörtIslem sınıfından nesne olusturdum.
        //System.out.println("En büyük sayı= "+ di.soru2());

        //dislem.soru1();

       /* dislem.ikisayitaopla();
        dislem.ikisayicarp();
        dislem.ikisayicikar();
        dislem.ikisayibol();
        System.out.println( dislem.ikisayitoplafonk() );*/
    }


}
