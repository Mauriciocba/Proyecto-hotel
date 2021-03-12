
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Reservas> reservas;

    public Hotel() { 

        reservas = new ArrayList();
    }

    public ArrayList<Reservas> getReservas() {

        return reservas;
    }

    public void AgregarReserva(Reservas res) {

        reservas.add(res);

    }

    public double facturacionTotalvigente() {

        double acumulador = 0;

        for (Reservas reser : reservas ) {

            if (reser.isVigente()) {
                acumulador += reser.tarifas();
            }
            
        }
        return acumulador;
    }

    
    //Cantidad de reservas de cada tipo.
    
    public int devolverReservaVacaciones(){
        int contVacaciones =0;
        
        
        for (Reservas reser : reservas){
            if(reser instanceof Vacaciones)
            {
                contVacaciones++;
            }
           
        
        }
        return contVacaciones ;
        
    }
    
    public int devolverReservaNegocios(){
        int contNegocios =0;
        
        
        for (Reservas reser : reservas){
            if(reser instanceof Negocios)
            {
                contNegocios++;
            }
           
        
        }
        return contNegocios ;
        
    }
}
