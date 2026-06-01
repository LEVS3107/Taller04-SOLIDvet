package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.IAnimalNadador;


public class Pez extends Animal implements IAnimalNadador{
    public Pez(int id, String nombre) {
        super(id, nombre, TipoAnimal.PEZ);
    }

    public void nadar() {
        System.out.println(getNombre() + " esta nadandop.");
    }

}
