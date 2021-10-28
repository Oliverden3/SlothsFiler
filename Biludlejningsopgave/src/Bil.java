public abstract class Bil {
    private int regNR;
    private String mærke;
    private String model;
    private int årgang;
    private int antalDøre;

    public Bil(int regNR, String mærke, String model, int årgang, int antalDøre) {
        this.regNR = regNR;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public int getRegNR() {
        return regNR;
    }

    public String getMærke() {
        return mærke;
    }

    public String getModel() {
        return model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setRegNR(int regNR) {
        this.regNR = regNR;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    abstract double beregnGrønEjerAfgift();

}
