public class ConsumaDato extends Thread{
private Semaforo pieno;
    private Semaforo vuoto;
    private int dato;
    public ConsumaDato(Semaforo s1, Semaforo s2){
        this.pieno=s1;
        this.vuoto=s2;
    }
    public void run(){
        while(true){
            this.pieno.P();
            this.dato=App.buffer; // consuma un numero
            System.out.println("Lettore: dato letto "+dato);
            this.vuoto.V();
           
        }
    }
}
