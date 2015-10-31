package teema1;

import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
        //esimene();
        //teine();
        kolmas();

    }

    public static boolean esimene() {

        System.out.print("Kas kull (1) või kiri (0)? ");
        Scanner sc= new Scanner (System.in);

        int arvamus = sc.nextInt();
        int vise = (int) (Math.random()*2);
        boolean tulemus;

        if (arvamus==vise){
            tulemus=true;
            System.out.println("Õige!");
            System.out.println(vise);
        } else {
            tulemus=false;
            System.out.println("Mööda!");
            System.out.println(vise);
        }
        return tulemus;
    }

    public static int teine() {
        System.out.print("Palju inimesi osaleb? ");
        Scanner sc = new Scanner (System.in);
        int arv = sc.nextInt();
        int valik = (int) (1 + Math.random()*arv);
        System.out.println(valik);
        return valik;
    }

    public static int kolmas() {

        int kasutajaVise1 = (int) (1+Math.random()*6);
        int kasutajaVise2 = (int) (1+Math.random()*6);
        int kasutajaTulemus = kasutajaVise1 + kasutajaVise2;
        System.out.println("Kasutaja: "+kasutajaVise1+" "+kasutajaVise2+" "+kasutajaTulemus);

        int arvutiVise1 = (int) (1+Math.random()*6);
        int arvutiVise2 = (int) (1+Math.random()*6);
        int arvutiTulemus = arvutiVise1 + arvutiVise2;
        System.out.println("Arvuti: " + arvutiVise1+" "+arvutiVise2+" "+arvutiTulemus);

        int winner = kasutajaTulemus > arvutiTulemus ? kasutajaTulemus : arvutiTulemus;
        if (winner==kasutajaTulemus){
            System.out.println("Kasutaja");
        } else {
            System.out.println("Arvuti");
        }

        return winner;
    }
}
