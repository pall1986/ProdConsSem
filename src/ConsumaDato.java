public class ConsumaDato extends Thread{
private Semaforo pieno;
    private Semaforo vuoto;
    private int dato;
    public ConsumaDato(Semaforo s1, Semaforo s2){
        pieno=s1;
        vuoto=s2;
    }
    public void run(){
        while(true){
            pieno.P();
            dato=App.buffer; // consuma un numero
            System.out.println("Lettore: dato letto "+dato);
            vuoto.V();
           
        }
    }
}
