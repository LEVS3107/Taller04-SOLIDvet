package clinicaveterinaria.service;

import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.EstadoCita;

public class DiagnosticoService {
    public static void diagnosticar(Cita cita, String diagnostico) {
        cita.setDiagnostico(diagnostico);
        cita.setEstado(EstadoCita.ATENDIDA);
    }
    
}
