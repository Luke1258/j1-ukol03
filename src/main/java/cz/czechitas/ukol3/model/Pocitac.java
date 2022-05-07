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

    public boolean jeZapnuty(){
        return jeZapnuty;
    }

    public void zapniSe(){
        if (jeZapnuty == true){
            System.out.println("Pocitac je uz zapnuty");
        } else if (cpu == null || ram == null || pevnyDisk == null){
            System.err.println("Pocitac nie je mozne zapnut kvoli jednemu alebo viacerym chybajucim komponentom: procesor, pamet, pevny disk");
        }
    }

    public void vypniSe(){
        if (jeZapnuty == true) {
            jeZapnuty = false;
            System.out.println("Pocítac sa vypol");
        } else {
            System.out.println("Pocítac je uz vypnuty");
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
