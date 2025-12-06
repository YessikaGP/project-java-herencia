# project-java-herencia

**Actividad:** Herencia y polimorfismo en Java – Generalización de clases y sobreescritura de métodos  
**Duración esperada:** 4 horas

## Estructura del proyecto
- `Vehicle` (clase abstracta): atributos y métodos comunes.
- `Car`, `Motorcycle` (clases derivadas): especializan `Vehicle` y sobreescriben métodos.
- `Engine`, `Wheel` (componentes): composición dentro de `Vehicle`.

## Diagrama de clases (texto)
Vehicle (abstract)
├─ Car
└─ Motorcycle

Vehicle -> contiene -> Engine
Vehicle -> contiene -> Wheel

## Explicación breve
La clase `Vehicle` define los atributos comunes (`brand`, `model`, `engine`) y métodos abstractos `start()` y `stop()`. `Car` y `Motorcycle` heredan de `Vehicle` y **sobreescriben** `start()`, `stop()` y `describe()`. Se demuestra polimorfismo creando un arreglo `Vehicle[]` que contiene instancias de `Car` y `Motorcycle` y llamando métodos desde referencias `Vehicle`.

## Ejecución
Compilar y ejecutar la clase `App` (JDK 17).  
Salida esperada (se incluye captura):

![Salida por consola](docs/console-screenshot.png)

## Commits realizados
1. `feat: creación del repositorio base para proyecto de herencia`  
2. `feat: agregar clase base Vehicle (abstracta) con atributos comunes`  
3. `feat: implementar componentes Engine y Wheel (composición)`  
4. `feat: agregar clases derivadas Car y Motorcycle con sobreescritura`  
5. `feat: añadir clase App con ejemplos y demostración de polimorfismo`  
6. `docs: actualización del README con explicación de jerarquía y captura de ejecución`

---
