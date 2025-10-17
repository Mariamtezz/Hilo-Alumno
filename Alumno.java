public class Alumno implements Runnable{

    String nombre;

    public Alumno (String nombre){
        this.nombre=nombre;
    }


        @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola soy " + nombre + " y este es mi mensaje numero " + i);

        try {
            Thread.sleep(1500);
            }   catch (InterruptedException e) {
                System.out.println("vuelve a intentarlo");
                }
        }
    }

}