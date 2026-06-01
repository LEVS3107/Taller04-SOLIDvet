package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;

public class FisioterapiaTratamiento implements ITratamiento{
     private final double costo;
     

    public FisioterapiaTratamiento (double costo){
        this.costo = costo;
    
    }
    @Override
    public double calcularCostoFinal(){
        return costo * 0.95;
    }

    @Override
    public String obtenerIndicaciones(){
        return "Sesiones cada 2 veces por semana";
    } 

    @Override
    public TipoTratamiento getTipo(){
        return TipoTratamiento.FISIOTERAPIA;
    }

    @Override
    public String preparar(){
        return "Preparar camilla y bandas elasticas.";
    }
}
