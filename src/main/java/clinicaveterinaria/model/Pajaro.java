package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.IAnimalVolador;


public class Pajaro extends Animal implements IAnimalVolador{
    public Pajaro(int id, String nombre) {
        super(id, nombre, TipoAnimal.PAJARO);
    }

    public void volar() {
        System.out.println(getNombre() + " esta volando.");
    }
}
