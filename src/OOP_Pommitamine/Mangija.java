package OOP_Pommitamine;

import java.util.Scanner;

/**
 * Created by mkeerus on 21.11.15.
 */
public class Mangija {
    private Scanner sc = new Scanner(System.in);

    public int[] kysiLasuKoordinaadid() {
        System.out.println("Palun sisesta lasu koordinaadid formaadis xxx-yyy");
        String[] sisestus = sc.nextLine().split("-"); //siia peab nüüd stringi massiivi tekitama, sest massiivis on kaks väärtust, nt 10-10 asemel 10,10
        int x = Integer.parseInt(sisestus[0]);
        int y = Integer.parseInt(sisestus[1]);
        return new int[]{x, y};
    }

    public void pihtas() {
        System.out.println("Pihtas!");
    }

    public void moodas() {
        System.out.println("Mööda!");
    }

    public void gameover() {
        System.out.println("Game over");
    }
}
