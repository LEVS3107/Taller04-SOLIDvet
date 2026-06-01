package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.IAnimalCaminador;
 

public class Perro extends Animal implements IAnimalCaminador {
    public Perro(int id, String nombre) {
        super(id, nombre, TipoAnimal.PERRO);
    }

    public void caminar() {
        System.out.println(getNombre() + " esta caminando.");
    }
}
