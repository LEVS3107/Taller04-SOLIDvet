package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;

public class TratamientoPrueba implements ITratamiento {
    private final double costo;
    

    public TratamientoPrueba(double costo){
        this.costo = costo;

    }
    @Override
    public double calcularCostoFinal(){
        return costo + 5.0;
    }

    @Override
    public String obtenerIndicaciones(){
        return "Observaciones de prueba";
    } 

    @Override
    public TipoTratamiento getTipo(){
        return TipoTratamiento.PRUEBA;
    }

    @Override
    public String preparar(){
        return "Preparar prueba.";
    }

}
