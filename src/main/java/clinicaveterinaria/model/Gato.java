package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.IAnimalCaminador;

public class Gato extends Animal implements IAnimalCaminador{
    public Gato(int id, String nombre) {
        super(id, nombre, TipoAnimal.GATO);
    }

    public void caminar() {
        System.out.println(getNombre() + " esta caminando.");
    }
}
