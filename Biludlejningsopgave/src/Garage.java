import java.util.ArrayList;

public class Garage {

    private String navn;
    private ArrayList<Bil> bilGarage;


    public Garage(String navn) {
        bilGarage = new ArrayList<Bil>();
        this.navn = navn;
    }


    public void addCars(Bil parkeretBil) {
        bilGarage.add(parkeretBil);

    }

    public double beregnGrønAfgiftForBilpark() {
        Double afgift = 0.0;
        for (Bil b : bilGarage) {
            afgift += b.beregnGrønEjerAfgift();
        }
        System.out.println("Afgiften for hele garagen er " + afgift);
        return afgift;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Garagen " + navn + " indeholder:";
        for (Bil b : bilGarage) {
            s += "\n" + b;
        }
        return s;
    }
}

