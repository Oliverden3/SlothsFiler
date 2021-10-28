public class BenzinBil extends Bil {
    private int oktanTal;
    private int kmPrL;

    public BenzinBil(int regNR, String mærke, String model, int årgang, int antalDøre, int oktanTal, int kmPrL) {
        super(regNR, mærke, model, årgang, antalDøre);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "BenzinBil{" +
                "oktanTal=" + oktanTal +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    double beregnGrønEjerAfgift() {
        String msg = "Afgiften på " + getMærke() + " " + getModel() + " er ";
        if (kmPrL > 20 && kmPrL <= 50) {
            System.out.println(msg + "330kr.");
            return 330;
        }
        if (kmPrL <= 20 && kmPrL > 15) {
            System.out.println(msg + "1050kr.");
            return 1050;
        }
        if (kmPrL <= 15 && kmPrL > 10) {
            System.out.println(msg + "2340kr.");
            return 2340;
        }
        if (kmPrL <= 10 && kmPrL >= 5) {
            System.out.println(msg + "5500kr.");
            return 5500;
        }
        if (kmPrL < 5) {
            System.out.println(msg + "10470kr.");
            return 10470;
        }
        return 0;
    }
}
