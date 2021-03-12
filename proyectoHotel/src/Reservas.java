
public abstract class Reservas {

    private int nroHabitacion;
    private double diasReservados;
    private boolean vigente;

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public double getDiasReservados() {
        return diasReservados;
    }

    public void setDiasReservados(double diasReservados) {
        this.diasReservados = diasReservados;
    }


    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Reservas(int nroHabitacion, double diasReservados, boolean vigente) {
        this.nroHabitacion = nroHabitacion;
        this.diasReservados = diasReservados;
        this.vigente = vigente;
    }
    
    public abstract double tarifas();

    @Override
    public String toString() {
        return   " Habitacion: " + nroHabitacion + " dias Reservados: " + diasReservados ;
    }
    
    
    

    
}
