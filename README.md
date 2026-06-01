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
  Checklist de validación:

| Criterio | Sí/No |
| --- | --- |
| El proyecto compila | SÍ|
| No hay condicional gigante por tipo en la lógica nueva |Sí|
| Cada tratamiento conoce su propio costo e indicaciones |Sí |
| Agregar un nuevo tratamiento requiere crear una clase, no editar todas |Sí |

Preguntas de discusión:

- ¿Por qué los condicionales repetidos hacen más caro el cambio?
Porque no solo modificas un solo lugar. Tienes que buscar por todo el proyecto dónde más se validaba ese tipo
- ¿Qué pasaría si agregamos `Odontologia` como tratamiento?
tenemos que agregar un clase nueva
- ¿Cuándo una interfaz ayuda a extender el sistema?
Ayuda cuando necesitas que diferentes objetos puedan ser intercambiados entre sí porque comparten el mismo comportamiento
- Integrante 3: refactorizar LSP.
- Integrante 4: refactorizar ISP y DIP.

Lee `guia.md` para instrucciones, checklists y preguntas de discusión.
