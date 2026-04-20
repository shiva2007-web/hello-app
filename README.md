# Hello World Maven Application

A simple Java-based command-line application built with Maven, demonstrating the evolution of argument handling and string optimization.

## Features
- **Flexible Argument Support**: Handles zero, one, or multiple command-line arguments.
- **Optimized Output**: Uses `StringBuilder` and enhanced for-loops for efficient string construction.
- **Maven Integrated**: Standard project structure ready for CI/CD and dependency management.

## How to Run

### Using Maven (Recommended)
```bash
# Compile the project
mvn compile

# Run with arguments
mvn exec:java -Dexec.args="Alice Bob Charlie"
```

### Manual Run
```bash
# Compile
javac src/main/java/HelloApp.java

# Run
java -cp src/main/java HelloApp Alice Bob
```

## Use Cases Covered
This project demonstrates 5 stages of evolution:
1. **UC1**: Basic entry point.
2. **UC2**: Argument support.
3. **UC3**: Default values (ternary operator).
4. **UC4**: Multi-argument support (for-loop).
5. **UC5**: Optimized final implementation (enhanced for-each).

---
Created as part of the **NeuroSync** and **GhostShield** ecosystem learning modules.
