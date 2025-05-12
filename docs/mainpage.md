### 📝 Descripción  
Documentacion para la aplicación de consola desarrollada como proyecto académico para la asignatura Ingeniería de Software I, que implementa una calculadora básica conforme a los requerimientos funcionales especificados por el cliente. La calculadora está diseñada para ser intuitiva y fácil de usar, con validaciones para garantizar la correcta entrada de datos.

### 📖 Caracteristicas de la Documentación Técnica

La documentación automática del proyecto está generada con [Doxygen](https://www.doxygen.nl/). Incluye:
- Diagramas de clases y herencia automaticos
- Especificaciones técnicas
- Referencia completa de métodos
- Manual de uso de cada componente
- Modo oscuro incluido
- Búsqueda interactiva

Navega por cada una de las secciones en el sidebar izquierdo para aprender mas. 

### ✨ Características de la Calculadora 
| **Operaciones** | **Validaciones** | **Interfaz** |  
|----------------|----------------|-------------|  
| ➕ Suma | ✅ Solo enteros positivos | 🖥️ Menú interactivo |  
| ➖ Resta | 🔢 a > b (en resta/división) | 📢 Mensajes claros |  
| ✖️ Multiplicación | 🚫 No división por cero | 🔄 Permite repetir operaciones |  
| ➗ División |  |  |  

### 🧮 Arquitectura General de la Calculadora 
\dot

 digraph CalculadoraBasica {
   label="Diagrama de colaboración";
   labelloc="t";
   fontsize=16;
   rankdir=LR;
   node [shape=box];

   subgraph cluster_core {
     label="Núcleo de la Calculadora";
     Calculadora;
     OperacionFactory;
   }

   subgraph cluster_operaciones {
     label="Operaciones";
     Suma;
     Resta;
     Multiplicacion;
     Division;
   }

   subgraph cluster_interfaces {
     label="Interfaces";
     margin="23";
     IOperacion;
   }

   subgraph cluster_validacion {
     label="Entrada/Validación";
     EntradaUsuario;
   }

   Calculadora -> OperacionFactory [label="crear()"];
   Calculadora -> EntradaUsuario [label="leerOpcionMenu(),\nleerNumeroPositivo(),\nconfirmarContinuar()"];
   Calculadora -> IOperacion [label="ejecutarOperacion()"];

   OperacionFactory -> Suma [label="return"];
   OperacionFactory -> Resta [label="return"];
   OperacionFactory -> Multiplicacion [label="return"];
   OperacionFactory -> Division [label="return"];

   Suma -> IOperacion [arrowhead="empty"];
   Resta -> IOperacion [arrowhead="empty"];
   Multiplicacion -> IOperacion [arrowhead="empty"];
   Division -> IOperacion [arrowhead="empty"];
 }
\enddot

### 🚀 ¿Cómo ejecutar el programa?

1. Asegurate de ir a la ruta /src/CalculadoraBasica/ , luego compilar con:
```bash 
javac Calculadora.java
```

2. Ejecutar:
```bash
java Calculadora
```

3. Ingresar por teclado las operaciones matemáticas permitidas (0-4)

##### Ejemplo
```bash
*** CALCULADORA BÁSICA ***

[1] – SUMAR
[2] – RESTAR
[3] – MULTIPLICAR
[4] – DIVIDIR
[0] – SALIR

SELECCIONAR UNA OPCION [0 a 4] Y PRESIONAR ENTER: 4
DIVIDIR
Ingrese un número: 10
Ingrese otro número: 2
Resultado: 5
¿Repetir? (Y/N): N
```

### 📌 Notas

📅 Fecha: 06/05/2025

👥 Grupo: 7

🔗 Compatibilidad: Windows/Linux/macOS con JVM

✅ Código modular con comentarios para mantenimiento futuro

🚫 No almacena datos sensibles

#### 💻 Enlace al codigo fuente
Github: https://github.com/Shadowy-22/calculadora-isw-1/tree/docs/doxygen-integration
