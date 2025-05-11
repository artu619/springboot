# 🚗 Proyecto de Gestión de Coches (Java + Spring + Maven)

Este proyecto es una aplicación de consola desarrollada en **Java**, usando el **framework Spring** y **Maven** como sistema de construcción. Permite registrar coches, listarlos y ordenarlos por marca o matrícula.

## 📋 Funcionalidades

- Añadir coches con matrícula, marca, modelo y kilometraje.
- Validación de matrícula (mínimo 1 y máximo 6 caracteres).
- Impide añadir coches duplicados (según la matrícula).
- Listado de todos los coches registrados.
- Ordenar coches por:
  - Marca (alfabéticamente).
  - Matrícula (alfabéticamente).
- Uso de Spring para la gestión de dependencias mediante ApplicationContext XML.

## 🧱 Estructura del Proyecto

src/
└── main/
├── java/
│ └── com/ejemplo/coches/
│ ├── Coche.java
│ ├── ComparadorMarca.java
│ └── Main.java
└── resources/
└── ApplicationContextcoche.xml

## ⚙️ Tecnologías Usadas

- Java 17+
- Spring Framework (Core, Context)
- Maven
- Eclipse IDE
- Javadoc

## 🚀 Instrucciones para ejecutar

1. Clona el repositorio o importa el proyecto en Eclipse como un **Proyecto Maven existente**.
2. Asegúrate de tener configurado Java y Maven en tu entorno.
3. Ejecuta la clase `Main.java` desde Eclipse o usando:

## Ejemplo de uso

Bienvenidos a la aplicación de gestión de coches
1️⃣ Añadir Coche
1. Añadir Coche
2. Listar Coches
3. Ordenar Coches por Marca
4. Ordenar Coches por Matrícula
5. Salir
Elija una opción: 1  
Introduce la matrícula: 123ABC  
Introduce la marca: Toyota  
Introduce el modelo: Corolla  
Introduce los kilómetros: 150000

Coche añadido con éxito.

2️⃣ Listar Coches (orden actual)

Después, si eliges **2. Listar Coches**: 

Lista de Coches:
Coche [matricula=123ABC, marca=Toyota, modelo=Corolla, kilometros=150000]

3️⃣ Ordenar Coches por Marca
Ordena internamente la lista de coches por el campo marca, en orden alfabético.

No cambia la lista mostrada inmediatamente, pero al usar la opción 2 después, los coches aparecerán ordenados por marca.

Coche [matricula=111AAA, marca=Ford, modelo=Focus, kilometros=120000]  
Coche [matricula=123ABC, marca=Toyota, modelo=Corolla, kilometros=150000]


4️⃣ Ordenar Coches por Matrícula
Ordena la lista de coches según el campo matrícula, en orden alfabético.

Al igual que en la opción 3, el resultado se verá al listar con la opción 2.

5️⃣ Salir
Finaliza la ejecución de la aplicación.

Cierra correctamente el programa y libera recursos como el Scanner.
