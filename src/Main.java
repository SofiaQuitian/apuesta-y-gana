import java.util.Random;
import java.util.Scanner;

//Valery Sofia Quitian Carrillo//
//juego de apuesta y gana//

public class Main {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner scanner = new Scanner(System.in);

        int dinero;
        int opcion;
        System.out.println("Introduce la cantidad de dinero inicial");
        dinero = scanner.nextInt();

        int numa = aleatorio.nextInt( 1, 4 );
        do {
            if (numa == 3) {

                System.out.println("El numero aleatorio fue" +numa);
                System.out.println("Haz perdido todo tu dinero");
                dinero = 0;
                System.out.println("Tu dinero acutal es: " +dinero);
                break;

            }else if(numa == 2) {

                System.out.println("El numero aleatorio fue" +numa);
                System.out.println("Haz perdido la mitad de tu dinero");
                dinero /= 2;
                System.out.println("Tu dinero actual es: " +dinero);
                System.out.println("¿Quieres seguir jugando?(1=SI 2=NO");
                opcion = scanner.nextInt();
                if(opcion==1){
                    System.out.println("Puedes seguir jugando");
                    continue;

                }else if(opcion==2){
                    break;
                }

            }else if(numa == 1) {

                System.out.println("El numero aleatorio fue" +numa);
                System.out.println("Haz multiplicado tu dinero");
                dinero *= 2;
                System.out.println("Tu dinero actual es: " +dinero);

            }

        } while(dinero!=3);



    }
}