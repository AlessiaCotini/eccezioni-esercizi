package eserciziodue;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EsercizioDueB {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
        //virgola o punto RICORDARE!!!!!
        try{
            System.out.println("Calcoliamo il numero di chilometri percorsi per litro : ");
            System.out.println("Inserisci i chilometri che hai fatto : ");
            double chilometri = scanner.nextDouble();
            System.out.println("Ora inserisci i litri di benzina consumati : ");
            double litri = scanner.nextDouble();
            double risultato = chilometri/litri;
            if (litri == 0.0 | litri==0) throw new InputMismatchException();
            System.out.println("Con un litro hai percorso " + risultato + "km");
        } catch (Exception e) {
            System.out.println("Il numero di litri deve essere definito.");
        }
    }
}