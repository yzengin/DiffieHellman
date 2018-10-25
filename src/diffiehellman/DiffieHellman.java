package diffiehellman;

import java.util.Scanner;

public class DiffieHellman {

    public static void main(String[] args) {
        double baz = 5; 
        double asal = 23; 
        double randomYakup=9; 
        double randomAfra=5;
        hesaplamaKalan(baz,asal,randomYakup,randomAfra); 
    }

    public static void hesaplamaKalan(double baz, double asal, double yakup, double afra) {
        double yakupKalan = Math.pow(baz,yakup)%asal;
        double afraKalan = Math.pow(baz,afra)%asal;
        keyTakas(yakupKalan,afraKalan,yakup,afra,asal);
    }

    public static long keyTakas(double yakupKalan, double afraKalan, double yakup, double afra, double asal) {
        double yakupGizliAnahtar = Math.pow(afraKalan,yakup)%asal; 
        double afraGizliAnahtar = Math.pow(yakupKalan,afra)%asal; 
        System.out.println("Yakup'un Gizli Anaharı: " + yakupGizliAnahtar);
        System.out.println("Afra'nın Gizli Anahtarı: " + afraGizliAnahtar);
        return 0;
    }
}