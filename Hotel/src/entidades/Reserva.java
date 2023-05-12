package entidades;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Propriedade propriedade;
    private Hospede hospede;
    private Date checkIn;
    private Date checkOut;
    private long quantDias;
    private float precoTotal;
    private Reserva reserva;

    public Reserva(Propriedade propriedade, Hospede hospede, Date checkIn, Date checkOut) {
        this.propriedade = propriedade;
        this.hospede = hospede;
        this.quantDias = checkIn.getTime() - checkOut.getTime();
        this.quantDias = TimeUnit.DAYS.convert(quantDias, TimeUnit.MILLISECONDS);
        this.checkOut = checkOut;
        this.precoTotal = precoTotal;
        this.reserva = reserva;
        realizarReserva();
    }
    public void realizarReserva() {
        Scanner sc = new Scanner(System.in);
        if (this.propriedade.getDisponibilidade() == true) {
            this.precoTotal = this.propriedade.getValor() * this.quantDias;
            System.out.println("Preço total: " + this.precoTotal);
            System.out.println("Deseja confirmar a reserva?");
            String resposta = sc.next();
            if (resposta.toUpperCase() == "SIM") {
                this.propriedade.setReservas(reserva);
                System.out.println("Reserva realizada!");
            }
        }
    }

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public long getQuantDias() {
        return quantDias;
    }

    public void setQuantDias(long quantDias) {
        this.quantDias = quantDias;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}