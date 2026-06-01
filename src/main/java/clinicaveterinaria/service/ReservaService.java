package clinicaveterinaria.service;

import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.EstadoCita;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Veterinario;
import clinicaveterinaria.repository.BaseDatos;

import java.time.LocalDate;

public class ReservaService {
    private final BaseDatos baseDatos;
    private boolean disponible;

    public ReservaService(BaseDatos baseDatos, boolean disponible, int id, Mascota mascota) {
        this.baseDatos = baseDatos;
        this.disponible = disponible;
    }

    public Cita reservarCita(int citaId, Mascota mascota, LocalDate fecha) {
        disponible = false;
        return new Cita(citaId, mascota, this, fecha, "Pendiente", EstadoCita.PROGRAMADA);
    }

    public Cita reservarCita(int id, Mascota mascota, Veterinario veterinario, LocalDate fecha) {
        Cita cita = new Cita(id, mascota, veterinario, fecha, "Pendiente", EstadoCita.PROGRAMADA);
        baseDatos.getCitas().add(cita);
        veterinario.setDisponible(false);
        return cita;
    }

}
