package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        System.out.println("Program spuštěn.");

        Pocitac pocitac = new Pocitac();
        System.out.println(pocitac.toString());
        pocitac.zapniSe();      // Vypise chybu, protoze pocitac nema vsechny povinne soucasti

        Procesor procesor = new Procesor();
        procesor.setRychlost(3_400_000_000_000L);
        procesor.vyrobce = "Intel";

        Pamet pamet = new Pamet();
        pamet.kapacita = 16_000_000_000L;

        Disk disk = new Disk();
        disk.kapacita = 255_195_746_304L;

        pocitac.setCpu(procesor);
        pocitac.setRam(pamet);
        pocitac.setPevnyDisk(disk);

        System.out.println(pocitac.toString());

        pocitac.zapniSe();
        pocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
        System.out.println(pocitac.toString());
        pocitac.vypniSe();

        pocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
        pocitac.vypniSe();      // protoze pocitac je uz vypnuty

        pocitac.zapniSe();
        pocitac.vytvorSouborOVelikosti(11223344);
        System.out.println("Vypis toString hodnotu: " + pocitac.toString());
        pocitac.vytvorSouborOVelikosti(111111);
        System.out.println("Vypis toString hodnotu: " + pocitac.toString());
        pocitac.vymazSouboryOVelikosti(999999);
        System.out.println("Vypis toString hodnotu: " + pocitac.toString());
    }
}
