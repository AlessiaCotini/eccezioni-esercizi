package eserciziotre;

public class EsercizioTre{
    static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Ale",27.2);
        ContoOnLine contoOnLine = new ContoOnLine("RobertSmith",54879.24,220.0);
        try{
            //----------CONTO IN ROSSO---------------
            conto.preleva(28);
            System.out.println(conto.getSaldo());
            //----------PRELIEVO NON DISPONIBILE-----
            contoOnLine.preleva(60000.30);
            System.out.println(contoOnLine.getSaldo());
        } catch (BancaException e) {
            System.out.println("Prova a ricaricare, " + e.getMessage());
        }

    }
}
