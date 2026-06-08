package eserciziotre;

public class EsercizioTre{
    static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Ale",27.2);
        ContoOnLine contoOnLine = new ContoOnLine("RobertSmith",54879.24,220.0);
        try{
            contoOnLine.preleva(60000.30);
            contoOnLine.getSaldo();
            conto.preleva(28.0);
            conto.getSaldo();
        } catch (BancaException e) {
            System.out.println("Il conto è in rosso, prova a ricaricare prima di voler prendere soldi che non hai!");
        }

    }
}
