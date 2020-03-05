package edu.campus02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int preis = 200;
        double steuerklasse1 = 0.2;
        double steuerklasse2 = 0.16;
        double steuerklasse3 = 0.08;

        double steuer1 = preis + preis * steuerklasse1;
        double steuer2 = preis + preis * steuerklasse2;
        double steuer3 = preis + preis * steuerklasse3;

        boolean ergebnis1 = steuer1 > 0;
        boolean ergebnis2 = steuer2 > 1;
        boolean ergebnis3 = steuer3 > 2;
        boolean ergebnis4 = 1 < 0;

        if (ergebnis1) {
            System.out.println("Mit Steurklasse1 kostes das Ding: " + steuer1);
        } else if (ergebnis2) {
            System.out.println("Mit Steuerklasse2 kostest's: " + steuer2);
        } else if (ergebnis3) {
            System.out.println("Mit 3 kostet's: " + steuer3);
        } else {
            System.out.println("Kein Ergebnis");
        }

        int preis1 = 200;
        int steuerklasse = 1;

        double steuer1a = 0.2;
        double steuer2b = 0.16;
        double steuer3c = 0.08;
        double steuera = 0;
        double brutto;

        if(steuerklasse ==1)

        {
            steuera = preis * steuer1;
        } else if (steuerklasse ==2) {
            steuera = preis * steuer2;
        } else if(steuerklasse ==3)
        {
            steuera = preis * steuer3;
        }

        brutto = preis + steuera;
        System.out.println("Was ist da los?");

        
    }
}




