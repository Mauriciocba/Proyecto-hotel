

public class Vacaciones extends Reservas {
 
    private int cantidadNinos;


    public int getCantidadNinos() {
        return cantidadNinos;
    }

    public void setCantidadNinos(int cantidadNinos) {
        this.cantidadNinos = cantidadNinos;
    }

    public Vacaciones(int nroHabitacion, double diasReservados, boolean vigente, int cantidadNinos) {
        super(nroHabitacion, diasReservados, vigente);
        this.cantidadNinos = cantidadNinos;
    }

   
    public double tarifas(){
        
        double precio = getDiasReservados()  *(cantidadNinos*100+600);
        
    
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + " Nro de habitacion: " + getNroHabitacion() +" cantidad de niños: " + cantidadNinos;
    }

    
    

}
