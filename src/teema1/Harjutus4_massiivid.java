package teema1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Salvesta kasutajalt 10 numbrit ja sorteeri suuruse järgi. (int[])
 * 2. Salvesta kasutajalt 10 sõne ja sorteeri tähestikulises järjekorras. (String[])
 * 3. Salvesta kasutajalt x arv numbreid, lõpeta küsimine kui number on 0
 *    ja sorteeri tulemus suuruse järgi. (ArrayList)
 *
 * main() meetodi saad lühendiga psvm.
 */
public class Harjutus4_massiivid {

    public static void main(String[] args) {
       // esimene();
        teine();

    }

    public static void esimene() {

        int[] rida = new int[10];
        Scanner sc = new Scanner (System.in);

        for(int i=0;i<10;i++)
            rida[i] = sc.nextInt();
            Arrays.sort(rida);
            System.out.println(Arrays.toString(rida));

    }

    public static void teine(){


    }


}
