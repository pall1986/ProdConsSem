public class App {
    protected static int buffer; // variabile condivisa globale
    public static void main() {
        Semaforo pieno=new Semaforo(0); // semaforo pieno inizializzato a 0
        Semaforo vuoto=new Semaforo(1); // semaforo vuoto inizializzato a 1
        ProduciDato scrittore=new ProduciDato(pieno,vuoto);
        ConsumaDato lettore=new ConsumaDato(pieno,vuoto);
        scrittore.start();
        lettore.start();
        System.out.println("Main: termine avvio thread. ");
    }
}
