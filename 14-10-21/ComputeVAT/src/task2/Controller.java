package task2;

public class Controller {
    private View view;
    private Dialog dialog;
    private CalculateVat calculateVat;
    private final int PRCVAT = 25;
    private final String MSG = "MOMS";
    private final String CURRENCY = "Kr";

    public Controller(){
        this.view=new View(CURRENCY);
        this.calculateVat=new CalculateVat(PRCVAT);
        this.dialog=new Dialog();
    }

    public void runController() {
        double userIn = dialog.doDiag();
        double moms = calculateVat.doVAT(userIn);
        view.doView(moms,MSG);
    }
}
