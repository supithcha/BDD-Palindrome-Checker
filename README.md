# BDD-Palindrome-Checker

This project demonstrates Behavior-Driven Development (BDD) using **Concordion**, a framework that bridges the gap between business and technical teams by making tests human-readable and executable.

The Palindrome Checker verifies whether a given word is a palindrome. The project uses **JUnit** for test execution and **Concordion** to create human-readable specifications.

---

## Features
- **Behavior-Driven Development**: Test cases are written in a plain HTML format for readability and collaboration.
- **Concordion Integration**: Automatically executes tests defined in HTML specifications.
- **JUnit**: Acts as the backbone for test execution.
- **Palindrome Checker**: A Java-based utility to check if a word is a palindrome.

---

## Project Structure
- **`src/main/java`**: Contains the core functionality (`PalindromeChecker` class).
- **`src/test/java`**: Includes the Concordion test fixture (`PalindromeCheckerFixture`).
- **`src/test/resources`**: Holds the HTML specification (`PalindromeChecker.html`).
- **`target/test-classes`**: Stores the generated test results in HTML format.

---

## Prerequisites
- Java 11 or later
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse) for running the tests and viewing results

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/supithcha/BDD-Palindrome-Checker.git
 
2. Navigate to the project directory:
 ```bash
  cd BDD-Palindrome-Checker
  ```

4. Build the project and run the tests using Maven:
  ```bash
  cd BDD-Palindrome-Checker
  ```
5. View the generated Concordion report:
- Locate the output file under target/test-classes/PalindromeChecker.html.
- Open the file in your browser to see the results.

## Dependencies
The project uses the following dependencies:
- Concordion - Framework for human-readable executable specifications
- JUnit - Test execution framework
- Maven - Dependency management and build tool

## Author
Supithcha
GitHub: [supithcha](https://github.com/supithcha)
