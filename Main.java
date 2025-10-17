import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("introduce el primer nombre");
        String nombre1 = sc.nextLine();
        System.out.println("introduce el segundo nombre");
        String nombre2 = sc.nextLine();
        System.out.println("introduce el tercer nombre");
        String nombre3 = sc.nextLine();

        Alumno alumno1 = new Alumno(nombre1);
        Alumno alumno2 = new Alumno(nombre2);
        Alumno alumno3 = new Alumno(nombre3);

        Thread hilo1 = new Thread(alumno1);
        Thread hilo2 = new Thread(alumno2);
        Thread hilo3 = new Thread(alumno3);

        try {
            hilo1.start();
            hilo1.join();

            hilo2.start();
            hilo2.join();

            hilo3.start();
            hilo3.join();

        } catch (InterruptedException e){
            System.out.println("vuelve a intentarlo");
        }

    }
}