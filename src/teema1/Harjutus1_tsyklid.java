package teema1;

import java.util.Arrays;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 *    0 1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7 8 9 0
 *    2 3 4 5 6 7 8 9 0 1
 *    3 4 5 6 7 8 9 0 1 2
 *    4 5 6 7 8 9 0 1 2 3
 *    5 6 7 8 9 0 1 2 3 4
 *    6 7 8 9 0 1 2 3 4 5
 *    7 8 9 0 1 2 3 4 5 6
 *    8 9 0 1 2 3 4 5 6 7
 *    9 0 1 2 3 4 5 6 7 8
 */
public class Harjutus1_tsyklid {
    public static void main(String[] args) {

        /*
        first(10);
        second(1);
        third();
        */
        fourth();

    }
    public static void first (int value) {

        int rida[] = new int[10];
        int count = 0;
        int j = 0;

        while (count < 10) {
            rida[j] = value;
            j = j + 1;
            value = value - 1;
            count = count + 1;
        }
        System.out.println(Arrays.toString(rida));
    }

    public static void second (int value){

        int rida[]=new int [5];
        int count=0;
        int j=0;

        while (count<5){
            rida[j]=value;
            j=j+1;
            value=value+2;
            count=count+1;
        }

        System.out.println(Arrays.toString(rida));
    }

    public static void third () {
        int rida[]= new int[10];

        int count = 0;
        int j=0;
        int value=0;

        for(int i=0;i<10;i++) {

            while (count < 10) {
                rida[j] = value;
                j = j + 1;
                value = value+1;
                count = count + 1;
            }

            System.out.println(Arrays.toString(rida));

        }

    }

    public static void fourth() {
        int rida[] = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               rida[j] = j+i>9 ? j+i-10 : j+i;
            }
            System.out.println(Arrays.toString(rida));
        }
    }
}


 /*
 if (j+i>9) {
 rida[j] = j + i-10;
 } else {
 rida[j] = j + i;
 }
 */