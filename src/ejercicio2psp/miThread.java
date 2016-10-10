package ejercicio2psp;

public class miThread extends Thread {

    public miThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 6; i++) {

            try {

                System.out.println(i + "" + getName());

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println("Fio interrumpido");
            }

        }
    }

}
