# Automated Testing in Java

![Java](https://img.shields.io/badge/Java-17+-orange)
![Maven](https://img.shields.io/badge/Maven-3.8+-blue)
![Build](https://img.shields.io/badge/build-passing-brightgreen)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)


This project demonstrates how to implement **automated tests in Java** using **JUnit 5** and **Mockito**, with examples of **unit tests, integration tests, and TDD**. The goal is to showcase best testing practices to ensure software quality.

---

## 📌 Main Features
- ✅ **JUnit 5** for unit testing.  
- ✅ **Mockito** for mocking dependencies.  
- ✅ **Integration tests** with in-memory database **H2**.  
- ✅ Example application with **MovieRepository**.  
- ✅ **Maven** for dependency management and build.  
- ✅ Clear project structure following best practices.  

---

## 🗂️ Project Structure
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

## ⚙️ Requirements
- **Java 17 or higher**  
- **Maven 3.8+**  
- Recommended IDE: IntelliJ IDEA or Eclipse  

---

## 🚀 Installation and Execution
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/automated-testing-java.git
   cd automated-testing-java
Build the project:

bash
Copy code
mvn clean install
Run the tests:

bash
Copy code
mvn test
🧪 Unit Test Example
java
Copy code
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result); // Verifies the expected result
    }
}

---

### 📖 Documentation
JUnit 5 User Guide

Mockito Documentation

Spring JDBC Template

### 🤝 Contributing
Contributions are welcome:

Fork the project.

Create a branch (git checkout -b feature/new-feature).

Make your changes and commit (git commit -m 'Add new feature').

Push to the branch (git push origin feature/new-feature).

Open a Pull Request.

### 📜 License
This project is licensed under the **MIT License**. You are free to use it for personal and commercial purposes.
