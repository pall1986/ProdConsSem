public class Semaforo {
private int stato; // 0 =rosso
public Semaforo(int v) {
    this.stato=v;

}
private int getStatus() {
    return stato;
}
synchronized public void P(){
    while(getStatus()==0){ //semaforo rosso
        try {
            wait(); // il thread si sospende
        } catch (InterruptedException e) {
        }
    }
    stato--;//pone il semaforo a rosso
}
synchronized public void V(){
    stato++; //pone il semaforo a verde
    notify(); //risveglia un thread sospeso
}
}
