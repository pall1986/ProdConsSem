public class ProduciDato extends Thread {
    private Semaforo pieno;
    private Semaforo vuoto;
    private int ndati=5; // numero di elementi da produrre
    private int attesa=500; // tempo di riposo/attesa in ms
    public ProduciDato(Semaforo s1, Semaforo s2){
        this.pieno=s1;
        this.vuoto=s2;
    }
    public void run(){
        for(int i=0;i<ndati;i++){// per tutti i dati da produrre
            this.vuoto.P();
            App.buffer=i;// produce un numero
            System.out.println("Scrittore: dato scritto "+i);
            this.pieno.V();

            try {
                Thread.sleep(attesa);
            } catch (InterruptedException e) {
            }
        }
            System.out.println("Scrittore: terminazione scrittura dati ");
    }
}
