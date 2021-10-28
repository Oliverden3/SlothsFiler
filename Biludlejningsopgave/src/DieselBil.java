public class DieselBil extends Bil {
    private Boolean harPartikelFilter;
    private int kmPrL;

    public DieselBil(int regNR, String mærke, String model, int årgang, int antalDøre, Boolean harPartikelFilter, int kmPrL) {
        super(regNR, mærke, model, årgang, antalDøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    public Boolean getHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(Boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "DieselBil{" +
                "harPartikelFilter=" + harPartikelFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    double beregnGrønEjerAfgift() {
        String msg = "Afgiften på " + getMærke() + " " + getModel() + " er ";
        if (kmPrL > 20 && kmPrL <= 50) {
            System.out.println(msg + "130kr.");
            return 130;
        }
        if (kmPrL <= 20 && kmPrL > 15) {
           System.out.println(msg + "1390kr.");
            return 1390;
        }
        if (kmPrL <= 15 && kmPrL > 10) {
            System.out.println(msg + "1850kr.");
            return 1850;
        }
        if (kmPrL <= 10 && kmPrL >= 5) {
            System.out.println(msg + "2770kr.");
            return 2770;
        }
        if (kmPrL < 5) {
            System.out.println(msg + "15260kr.");
            return 15260;
        }
        if (harPartikelFilter = false) {}
        System.out.println("Betal yderlige 1000kr for manglende partikelfilter");

        return 0;
    }
}
