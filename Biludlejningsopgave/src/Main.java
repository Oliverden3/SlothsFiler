public class Main {

    public static void main(String[] args) {
        BenzinBil dyt = new BenzinBil(1942,"BMW","A7",2020,2,95,14);
        ElBil elb = new ElBil(1900,"Telsa","Super",2021,3,2000,450,6000);
        DieselBil db = new DieselBil(2000,"Audi", "A6",2016,4,true,16);

        Garage SuperGarage = new Garage("Yup");

        SuperGarage.addCars(elb);
        SuperGarage.addCars(dyt);
        SuperGarage.addCars(db);

        SuperGarage.beregnGrønAfgiftForBilpark();
        System.out.println(SuperGarage);


    }
}
