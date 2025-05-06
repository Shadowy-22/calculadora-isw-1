# Calculadora Básica

## 📝 Descripción  
Aplicación de consola desarrollada como proyecto académico para la asignatura Ingeniería de Software I, que implementa una calculadora básica conforme a los requerimientos funcionales especificados por el cliente. La calculadora está diseñada para ser intuitiva y fácil de usar, con validaciones para garantizar la correcta entrada de datos.

## ✨ Características  
| **Operaciones** | **Validaciones** | **Interfaz** |  
|----------------|----------------|-------------|  
| ➕ Suma | ✅ Solo enteros positivos | 🖥️ Menú interactivo |  
| ➖ Resta | 🔢 a > b (en resta/división) | 📢 Mensajes claros |  
| ✖️ Multiplicación | 🚫 No división por cero | 🔄 Permite repetir operaciones |  
| ➗ División |  |  |  

## ⚙️ Requisitos  

```bash
- Java JDK 8+
- Terminal/CMD
```

## 🚀 ¿Cómo usar?

1. Compilar:
```bash 
javac Calculadora.java
```

2. Ejecutar:

```bash
java Calculadora
```

3. Ingresar por teclado las operaciones matemáticas permitidas (0-4)

#### Ejemplo
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

## 📖 Documentación Técnica

La documentación automática del proyecto se genera con [Doxygen](https://www.doxygen.nl/). Incluye:
- Diagramas de clases y herencia
- Manual de uso de cada componente
- Especificaciones técnicas

### 📚 Como usar? 

1. Primero requiere tener instalado Doxygen con Graphviz
    `````bash
    # Linux (Debian/Ubuntu)
    sudo apt install doxygen graphviz

    # macOS (Homebrew)
    brew install doxygen graphviz

    # Windows (Chocolatey)
    choco install doxygen graphviz
    `````

2. Ejecutar Doxygen desde la raíz del proyecto:
    ````bash 
    doxygen Doxyfile
    ````

3. Ver la documentacion generada ejecutando el siguiente comando:
    ````bash 
    start docs/html/index.html
    ````

### 🌟 Características de la documentación

- Diagramas de clases automáticos
- Referencia completa de métodos
- Modo oscuro incluido
- Búsqueda interactiva

## 📌 Notas

📅 Fecha: 05/06/2025

👥 Grupo: 7

🎓 Supervisora: Angie Calderón

🔗 Compatibilidad: Windows/Linux/macOS con JVM

✅ Código modular con comentarios para mantenimiento futuro

🚫 No almacena datos sensibles
