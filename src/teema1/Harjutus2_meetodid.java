package teema1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {
        // tostaKuupi(5);
        kasutajaSisestus(3,12);

    }

    public static double tostaKuupi(double arv) {
        double tulemus=Math.pow(arv, 3);

        System.out.println(tulemus);
        return tulemus;
    }

    public static int kasutajaSisestus(int min, int max) {

        boolean eiSobi=true;
        int arv=0;


        while(eiSobi==true){
            System.out.print("Sisesta arv: ");
            Scanner sc = new Scanner(System.in);
            try{
                arv = sc.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("Sisesta korrektne arv!");
            }

            if (arv >= min && arv <= max) {
                eiSobi=false;
                System.out.println("Sobib!");

            } else {
                eiSobi = true;
                System.out.println("Arv peab olema vahemikus " +min + " kuni " + max+" ");
            }
        }
       return arv;
    }

}
