# ClinicaVeterinaria

Proyecto Java Maven para practicar refactoring con principios SOLID en un taller colaborativo.

El sistema funciona desde el inicio, pero contiene violaciones intencionales de SRP, OCP, LSP, ISP y DIP. La idea es que cada integrante refactorice una zona del código sin romper la ejecución.

## Setup en 5 minutos


Compilar con Maven. Salida esperada:

```text
=== ClinicaVeterinaria funcionando ===
```

## Estructura del proyecto

```text
src/main/java/clinicaveterinaria/
├── Main.java
├── interfaces/
│   ├── IAnimal.java
│   ├── IBaseDatos.java
│   ├── IServicioClinica.java
│   ├── ITratamiento.java
│   └── IVeterinarioService.java
├── model/
│   ├── Mascota.java
│   ├── Veterinario.java
│   ├── Cita.java
│   ├── Tratamiento.java
│   ├── Factura.java
│   └── clases auxiliares para animales y enums
├── repository/
│   ├── BaseDatos.java
│   └── DirectoBaseDatos.java
└── service/
    ├── ReservaService.java
    ├── DiagnosticoService.java
    ├── FacturacionService.java
    ├── ReporteService.java
    └── servicios CRUD y clases con violaciones intencionales
```

## Trabajo del taller

- Integrante 1: refactorizar SRP.
- Integrante 2: refactorizar OCP.
- Integrante 3: refactorizar LSP.
- Integrante 4: refactorizar ISP y DIP.

Lee `guia.md` para instrucciones, checklists y preguntas de discusión.

### Integrante 3: refactorizar LSP.
Preguntas de discusión:

- ¿Por qué lanzar `UnsupportedOperationException` puede ser señal de mal diseño?
Lanzar `UnsupportedOperationException` es señal de un mal diseño porque desde un inicio estamos asumiendo que el codigo se va a llegar a romper por la implementacion de un atributo que no se hereda, en este caso un animal con una habilidad que no le corresponde

- ¿Qué contrato estaba prometiendo `Animal`?
`Animal` prometia que todos los animales iban a poder realizar todas las habilidades en este caso `nadar()`, `caminar()` y `volar()`

- ¿Cómo cambia el diseño cuando modelamos capacidades en lugar de herencia amplia?
Al modelar capacidades unicas para las clases hijas damos mayor flexibilidad y espacio para futuras mejoras sin tener que modificar directamente la clase padre.

| Equipo | Compila | Ejecuta | Cumple SOLID | Evidencia breve |
| --- | --- | --- | --- | --- |
| LSP | Si | Si |Si cumple | Se segmento la interfaz IAnimal para as habilidades especificas de cada animal `public interface IAnimalNadador{ void nadar();}`, `public interface IAnimalCaminador{ void caminar();}` y `public interface IAnimalVolador{ void volar();}` |