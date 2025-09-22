# Automated Testing en Java

Este proyecto demuestra cómo implementar **pruebas automáticas en Java** utilizando **JUnit 5** y **Mockito**, con ejemplos de **tests unitarios, de integración y TDD**. El objetivo es mostrar buenas prácticas de testing para asegurar la calidad del software.

---

## 📌 Características principales
- ✅ **JUnit 5** para la creación de tests unitarios.  
- ✅ **Mockito** para la simulación de dependencias (*mocks*).  
- ✅ **Tests de integración** con base de datos en memoria **H2**.  
- ✅ Ejemplo de aplicación con **repositorio de películas (MovieRepository)**.  
- ✅ Uso de **Maven** para la gestión de dependencias y build.  
- ✅ Estructura clara de proyecto siguiendo buenas prácticas.  

---

## 🗂️ Estructura del proyecto
.
├── src

│ ├── main

│ │ └── java/org/example/ATJAVA

│ │ ├── movies/model/Movie.java

│ │ ├── movies/data/MovieRepository.java

│ │ └── movies/data/JdbcMovieRepository.java

│ └── test

│ └── java/org/example/ATJAVA

│ ├── movies/MovieRepositoryTest.java

│ └── movies/MovieServiceTest.java

├── pom.xml

└── README.md

---

## ⚙️ Requisitos
- **Java 17 o superior**  
- **Maven 3.8+**  
- IDE recomendado: IntelliJ IDEA o Eclipse  

---

## 🚀 Instalación y ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/juanfcoesq/AT-Java.git
   cd automated-testing-java
Compilar el proyecto:

bash
Copy code
mvn clean install
Ejecutar los tests:

bash
Copy code
mvn test
🧪 Ejemplo de Test Unitario
java
Copy code
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado); // Verifica el resultado esperado
    }
}

📖 Documentación
JUnit 5 User Guide

Mockito Documentation

Spring JDBC Template

🤝 Contribuciones
Las contribuciones son bienvenidas:

Haz un fork del proyecto.

Crea una rama (git checkout -b feature/nueva-funcionalidad).

Realiza tus cambios y haz commit (git commit -m 'Añadir nueva funcionalidad').

Haz push a la rama (git push origin feature/nueva-funcionalidad).

Abre un Pull Request.

📜 Licencia
Este proyecto está bajo la licencia MIT. Puedes usarlo libremente para fines personales y comerciales.

css
Copy code

¿Quieres que además te lo adapte con **badges** (por ejemplo de Maven, JUnit o estado de build) para que
