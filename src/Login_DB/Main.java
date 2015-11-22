package Login_DB;

import java.util.Scanner;

/**
 * Created by mkeerus on 22.11.15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta kasutajanimi");
        String kasutajaNimi = sc.nextLine();
        System.out.println("Sisesta parool");
        String parool = sc.nextLine();

        Andmebaas andmebaas = new Andmebaas();
        //andmebaas.looTabel(); //kui korra oled teinud, siis kommenteeri välja. projektis ei taha sellist asja näha. seda ei ole vaja mitu korda. kui üks tabel on kord loodud, siis ei saa seda üle kirjutada
        boolean kasutajaEksisteerib = andmebaas.kasKasutajaOnOlemas(kasutajaNimi);
        //Kui tahad meetodile midagi kaasa anda, siis sulgudesse kirjutad muutuja, mis defineeritakse juba klassis ära. Ei defineeri uut muutujat
        System.out.println(kasutajaEksisteerib);

        if (kasutajaEksisteerib) {
            //idee poolest logi sisse
        } else {
            andmebaas.registreeri(kasutajaNimi, parool);
        }
        andmebaas.sulgeYhendus(); //tuleb alati sulgeda, muidu jääb ühendus elama ja võtab ressurssi

    }
}
