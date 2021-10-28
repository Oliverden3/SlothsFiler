public class ElBil extends Bil{
    private int batteriKappacitetkWh;
    private int maxKm;
    private int whPrKm;

    public ElBil(int regNR, String mærke, String model, int årgang, int antalDøre, int batteriKappacitetkWh, int maxKm, int whPrKm) {
        super(regNR, mærke, model, årgang, antalDøre);
        this.batteriKappacitetkWh = batteriKappacitetkWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteriKappacitetkWh() {
        return batteriKappacitetkWh;
    }

    public void setBatteriKappacitetkWh(int batteriKappacitetkWh) {
        this.batteriKappacitetkWh = batteriKappacitetkWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElBil{" +
                "batteriKappacitetkWh=" + batteriKappacitetkWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }


    @Override
    double beregnGrønEjerAfgift() {
        double kmPrl = 100/(whPrKm/91);

        String msg = "Afgiften på " + getMærke() + " " + getModel() + " er ";
        if (kmPrl > 20 && kmPrl <= 50) {
            System.out.println(msg + "330kr.");
            return 330;
        }
        if (kmPrl <= 20 && kmPrl > 15) {
            System.out.println(msg + "1050kr.");
            return 1050;
        }
        if (kmPrl  <= 15 && kmPrl > 10) {
            System.out.println(msg + "2340kr.");
            return 2340;
        }
        if (kmPrl <= 10 && kmPrl >= 5) {
            System.out.println(msg + "5500kr.");
            return 5500;
        }
        if (kmPrl < 5) {
            System.out.println(msg + "10470kr.");
            return 10470;
        }
        return 0;
    }
}
