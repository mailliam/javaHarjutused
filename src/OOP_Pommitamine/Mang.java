package OOP_Pommitamine;

/**
 * Created by mkeerus on 21.11.15.
 * Mere ja laevastiku genereerimine
 * Kuni laevu on elus,
 *     küsi kasutajalt koordinaadid
 *     pommita merd
 *     anna tagasisidet
 * Mäng on läbi
 */

public class Mang {
    public Mang () {
        System.out.println("Start mäng");
        Meri meri = new Meri(10);
        Mangija mangija = new Mangija();

        while (meri.kasOnLaevuElus()) {
            meri.kuvaSeis();
            int[] lask = mangija.kysiLasuKoordinaadid();
            boolean pihtas = meri.kasKeegiSaiPihta(lask); //tuleb anda lasu koordinaadid kaasa
            if (pihtas) {
                mangija.pihtas();
            } else {
                mangija.moodas();
            }
        }
        mangija.gameover();
    }
}

