package task2;

public class CalculateVat {
    private final int PRCVAT;
    public CalculateVat(int PRCVAT){
        this.PRCVAT =PRCVAT;
    }
    public double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
