public class Negocios extends Reservas{

private boolean conferencia;    

    public boolean isConferencia() {
        return conferencia;
    }

    public void setConferencia(boolean conferencia) {
        this.conferencia = conferencia;
    }

    public Negocios(int nroHabitacion, double diasReservados, boolean vigente,boolean conferencia) {
        super(nroHabitacion, diasReservados, vigente);
        this.conferencia = conferencia;
    }

   
    
    
   
    public double tarifas(){
        
        double costo = getDiasReservados() *500;
        
        if(isConferencia()){
        costo  += 700;
        }
       
        return costo;
        
    }

    @Override
    public String toString() {
        return super.toString() + "Habitacion nro:  " + getNroHabitacion() + "conferencia " + conferencia ;
    }

    
    
    


}
