package may.com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    private Calculator calculator;
    
    // Initialize the variable. Execute this method before each test.
    @Before 
    public void initialize() {
        calculator = new Calculator();
    }

    @Test
    public void calculatorInitialValueZero() {
        // Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

    @Test 
    public void valueFiveWhenFiveAdded() {
        // Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubstracted() {
        // Calculator calculator = new Calculator();
        calculator.subtract(2);
        assertEquals(-2, calculator.getValue());
    }

    // Another JUnit methods
    // assertTrue (boolean) | Eg. assertTrue(management.exerciseList().contains("Write a test"));
    // assertFalse (boolean) | Eg. assertFalse(management.isCompleted("Some exercise"));
}


// How to use Maven
// - Search for "Maven in 5 minutes"
// - Follow the instructions

// In General
// - Install Maven for the operating system
// - Go to the parent directory of the project directory
// - Create a project
// - mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false
// - Then 'cd' into the project
// - Go to the test file
// - Add the tests
// - mvn test