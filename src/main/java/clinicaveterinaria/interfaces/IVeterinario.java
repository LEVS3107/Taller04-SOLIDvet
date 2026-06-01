package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Veterinario;

public interface IVeterinario {
    void crearVeterinario(Veterinario veterinario);

    Veterinario obtenerVeterinario(int id);
}
