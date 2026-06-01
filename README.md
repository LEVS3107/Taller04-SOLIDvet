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

Checklist de validación:

| Criterio | Sí/No |
| --- | --- |
| El proyecto compila |Si|
| `Veterinario` ya no reserva, diagnostica, factura ni reporta |No reporta |
| La funcionalidad del `Main` se mantiene | Si a medias|
| Los nombres de servicios son claros |Si|

Preguntas de discusión:

- ¿Cuántas razones para cambiar tenía `Veterinario` antes del refactoring?

Habian 4 razones que iban en diagnostico, reporte, facturacion y reserva
- ¿Qué ganamos al separar modelo y servicios

Que la logica que se encontraba en veterinario se separe y que veterinario tiene solo una logica de que preocuparse

- ¿Qué clase debería cambiar si mañana cambia el formato del reporte?

La clase ReservaService ya que por ahi pasa todos los strings


- Integrante 2: refactorizar OCP.
- Integrante 3: refactorizar LSP.
- Integrante 4 (Luis Mendoza): refactorizar ISP y DIP.

Tube que Fragmentar la intefaz IservicioClinica dado que al ser una interfaz muy grande hacia que se tubieran que implementar todos los metodos y muchos de ellos no eran usados en Recepcion.java
modifique clinica porque no cumple solid y en el futuro seria dificil al tener que cambiar codigo ya existente por ende al usar sus interfaces no esta atado a la clase
Asi mismo se modifico GestorReportesClinica.java para que reciba eso.


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