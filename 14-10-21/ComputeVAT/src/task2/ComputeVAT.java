package task2;/*
 * FORMÅL:
 * At omskrive en procesorienteret løsning til en objektorienteret løsning
 *
 * OPGAVE:
 * Du skal forbedre denne kode ved at flytte de forskellige metoder
 * ud i klasser
 *
 * Fremgangsmåden er flg:
 * 1) Kør koden så du forstår hvad den gør
*  2) kopier eksisterende kode
 * 2) gem hver metode i en klasse med passende navne
   doDiag i en klasse der hedder 'task2.Dialog'
   doVat i en klasse der hedder 'task2.CalculateVat'
   doView i en klasse der hdder 'task2.View'
   runController i en klasse der hedder task2.Controller
 * 3) sørg for passende "inventar" (fields, constructor og metoder)

 * 4) sørg for at lave en task2.Main som kun rummer flg:
    public static void main(String[] args) {
        task2.Controller controller = new task2.Controller();
        controller.runController();
    }
    *
    * TEST kørsel:
    * Indtast varens pris:
345,6
Du betaler 86,40 Kr i MOMS

*  5) Dokumenter programmet med et klassediagram - brug PlantUML
 *
 */


import java.util.Scanner;

public class ComputeVAT {

}
