import java.util.ArrayList;
import java.util.Scanner;

public class Partida {
    private String data;
    private String hora;
    private static Time time1;
    private Time time2;
    private int placarTime1;
    private int placarTime2;
    private Estadio estadio;

    public Partida(String data, String hora, Time time1, Time time2, int placarTime1, int placarTime2, Estadio estadio) {
        this.data = data;
        this.hora = hora;
        this.time1 = time1;
        this.time2 = time2;
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
        this.estadio = estadio;
    }

    public void mostrarDadosPartida(){
        System.out.println("Data: "+ this.data);
        System.out.println("Hora: " + this.hora);
        System.out.println("Estadio: " + estadio.getNome());
        System.out.println("Time da Casa: " + time1.getPais());
        System.out.println("Time Visitante: " + time2.getPais());
        System.out.println("Placar do time da Casa: " + this.placarTime1);
        System.out.println("Placar do time de fora: " + this.placarTime2);
    }
    public void atualizarResultado(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Atualizando o placar!");
        System.out.println("Digite o placar do time de " + time1.getPais() + ":");
        this.placarTime1 = scan.nextInt();
        System.out.println("Digite o placar do time de " + time2.getPais () + ":");
        this.placarTime2 = scan.nextInt();
    }

    public void mostrarResultadoPartida(){
        System.out.println(time1.getPais() + " " + this.placarTime1 +
                " x " +
                this.placarTime2 + " " +  time2.getPais() + " " );
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public int getPlacarTime1() {
        return placarTime1;
    }

    public void setPlacarTime1(int placarTime1) {
        this.placarTime1 = placarTime1;
    }

    public int getPlacarTime2() {
        return placarTime2;
    }

    public void setPlacarTime2(int placarTime2) {
        this.placarTime2 = placarTime2;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
}
