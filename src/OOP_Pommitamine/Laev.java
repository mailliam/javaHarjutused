package OOP_Pommitamine;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by mkeerus on 21.11.15.
 */
public class Laev {
    private int[] koordinaadid;
    private boolean elus = true; //sest kohe alguses ei ole pihta saanud

    public Laev(int mereServaPikkus) {
        System.out.println("Start laev");
        genereeriKoordinaadid(mereServaPikkus);
    }

    private void genereeriKoordinaadid(int mereServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(mereServaPikkus);
        int y = rand.nextInt(mereServaPikkus);
        koordinaadid = new int[]{x, y};
        System.out.println(Arrays.toString(koordinaadid));

    }

    public boolean kasOledElus() {
        return elus;
    }

    public boolean kasSaidPihta(int[] lask) {
        if (Arrays.equals(lask,koordinaadid) && elus) {
            elus = false;
            return true;
        }
        return false;
    }

    public int[] annaKoordinaadid() {
        return koordinaadid;
    }
}
