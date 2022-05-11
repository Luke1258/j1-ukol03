package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    @Override
    public String toString() {
        return "Pocitac je zapnuty: " + jeZapnuty + " " + "Procesor: " + cpu + " " + "Pamet: " + ram + " " + "Pevny disk: " + pevnyDisk;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public boolean zapniSe() {
        if (jeZapnuty()) {
            System.err.println("Pocitac je uz zapnuty, pocitac nie je mozne zapnut dva krat. Je zapnuty: " + jeZapnuty);
            return jeZapnuty;
        } else if (cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Pocitac nie je mozne zapnut kvoli jednemu alebo viacerym chybajucim komponentom: procesor, pamet, pevny disk");
        } else {
            jeZapnuty = true;
        }
        return jeZapnuty;
    }

    public void vypniSe(){
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Pocítac sa vypol");
        } else {
            System.err.println("Pocítac je uz vypnuty");
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty == true) {
            if ((pevnyDisk.getVyuziteMisto() + velikost) <= pevnyDisk.getKapacita()) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
                System.out.println("Vyuzite miesto sa zvysilo o velkost suboru a kapacita je postacujuca");
                System.out.println("Aktualna kapacita je: " + pevnyDisk.getKapacita());
            } else if (pevnyDisk.getVyuziteMisto() > pevnyDisk.getKapacita()){
                System.err.println("Kapacita disku je nepostacujuca. Disk potrebuje vyuzit viac miesta nez je kapacita disku");
            }
        }
    }
    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            if ((pevnyDisk.getVyuziteMisto() - velikost) >= 0) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
                System.out.println("Vyuzite miesto sa znizilo o velkost suboru");
                System.out.println("Aktualna kapacita je: " + pevnyDisk.getKapacita());
            } else {
                System.err.println("Vyuzite miesto nemoze klesnut pod nulu");
            }
        }
    }


    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }
}
