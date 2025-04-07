# Calculadora Básica en Java

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

## 📌 Notas

📅 Fecha: 28/03/2025

👥 Grupo: 7

🎓 Supervisora: Angie Calderón

🔗 Compatibilidad: Windows/Linux/macOS con JVM

✅ Código modular con comentarios para mantenimiento futuro

🚫 No almacena datos sensibles
