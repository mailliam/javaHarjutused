package OOP_Pommitamine;

import java.util.Arrays;

/**
 * Created by mkeerus on 21.11.15.
 */
public class Meri {
    private int mereServaPikkus;
    private Laev[] laevastik = new Laev[5];

    public Meri(int pikkus) {
        System.out.println("Start meri");
        mereServaPikkus = pikkus; //võtab parameetri vastu, salvestab mere külge. Klass ei oska parameetreid vastu võtta. Konstruktor oskab
        looLaevastik();
    }

    private void looLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(mereServaPikkus);
        }
    }

    public boolean kasOnLaevuElus() {
        for (Laev laev : laevastik) {
            boolean elus = laev.kasOledElus();
            if (elus) {
                return true;
            }
        }
        return false;
    }

    public boolean kasKeegiSaiPihta(int[] lask) {
        for (Laev laev : laevastik) {
            boolean pihtas = laev.kasSaidPihta(lask); //kaasa antakse lasu koordinaadid
            if (pihtas) {
                return true;
            }
        }
        return false;
    }

    public void kuvaSeis() {
        int [][] laud = new int [mereServaPikkus][mereServaPikkus];
        for (Laev laev : laevastik) {
            int[] koordinaadid = laev.annaKoordinaadid();
            boolean elus = laev.kasOledElus();
            int x = koordinaadid[0];
            int y = koordinaadid[1];
            if (elus) {
                laud[y][x] = 1;
            } else {
                laud[y][x] = 2;
            }
        }
            for (int i = 0; i < laud.length; i++) {
                System.out.println(Arrays.toString(laud[i]));
            }
        }
    }
