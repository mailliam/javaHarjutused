package teema1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {

    static int[][] laud;


    public static void main(String[] args) {
        generateTable();
    }

    private static void generateTable() {
    laud=new int[9][9];

    ArrayList a = new ArrayList();
        a.add(new int[4]);

        System.out.println(a.toString());

    }


}
