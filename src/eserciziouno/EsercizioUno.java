package eserciziouno;

import java.util.Arrays;
import java.util.Scanner;

public class EsercizioUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci cinque numeri da uno a dieci");
            int primo = scanner.nextInt();
            int secondo = scanner.nextInt();
            int terzo = scanner.nextInt();
            int quarto = scanner.nextInt();
            int quinto = scanner.nextInt();
            int[] arrayOfNumbers = {primo, secondo,terzo,quarto,quinto};
            System.out.println("Hai scelto questi numeri:");
            System.out.println(Arrays.toString(arrayOfNumbers));
        System.out.println("Vuoi cambiare qualcosa?");
        System.out.println("Indica la posizione usando i numeri da uno a cinque  : ");
        while(true){
            try {
                int posizione = scanner.nextInt();
                if (posizione < 0 | posizione> 5)throw new ExceptionUno("posizione non valida");
                if(posizione == 0) break;
                int posizioneArray = posizione-1;
                System.out.println("Ora il nuovo numero da inserire : ");
                int input = scanner.nextInt();
                if (posizioneArray >= 0 && posizioneArray < arrayOfNumbers.length) {
                    arrayOfNumbers[posizioneArray] = input;
                    System.out.println("Nuova lista :");
                    System.out.println(Arrays.toString(arrayOfNumbers));
                    System.out.println("Continua ad inserire numeri fino a che decidi di cambiare, lo zero per terminare : ");
                }else {
                    System.out.println("Scegline un altro.");
                }
            } catch (ExceptionUno ex){
                System.out.println("numero non valido, sceglierne un altro");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            }
        }


    }

