package ClassInheritance;

public class Engine extends Part {
    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
        // Call the constructor from the super class
        super(identifier, manufacturer, manufacturer);
        this.engineType =engineType;
    }

    // All the public or protected methods or variables from the superclass are available for the subclass to use
    
    // ACCESS MODIFIERS - PUBLIC, PRIVATE, PROTECTED
    // Variable or method with 'private' modifier is visible only to the internal methods of that class
    // Subclass cannot directly access the private variable or methods of the superclass
    // Subclass can sees everything with 'private' modifier in the superclass
    // Use 'protected' for variables or methods visible to the subclass but invisible to everything else
    
    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {

        // Call the superclass method with 'super' similar to 'this'
        return super.toString() + " | Let me add my own message";
    }
}
