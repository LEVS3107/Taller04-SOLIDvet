package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;

public class MedicamentoTratamiento implements ITratamiento {
    private final double costo;
    

    public MedicamentoTratamiento(double costo){
        this.costo = costo;
        
    }
    @Override
    public double calcularCostoFinal(){
        return costo * 1.10;
    }

    @Override
    public String obtenerIndicaciones(){
        return "Dosis cada 8 horas";
    } 

    @Override
    public TipoTratamiento getTipo(){
        return TipoTratamiento.MEDICAMENTO;
    }

    @Override
    public String preparar(){
        return "Preparar receta y dosis.";
    }

    
}
