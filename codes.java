// 1. Introduction to Java
// Demonstrates a simple Java program

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// 2. Data Types and Variables

// Primitive Data Types
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        int num = 10;
        float decimal = 5.5f;
        char letter = 'A';
        boolean flag = true;
        System.out.println("Integer: " + num);
        System.out.println("Float: " + decimal);
        System.out.println("Char: " + letter);
        System.out.println("Boolean: " + flag);
    }
}

// Non-Primitive Data Types
public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String text = "Hello Java";
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("String: " + text);
        System.out.println("Array Element: " + numbers[0]);
    }
}

// Type Casting
public class TypeCasting {
    public static void main(String[] args) {
        int num = 10;
        double doubleNum = num; // Implicit casting
        double decimal = 9.78;
        int intNum = (int) decimal; // Explicit casting
        System.out.println("Implicit Casting: " + doubleNum);
        System.out.println("Explicit Casting: " + intNum);
    }
}

// 3. Operators

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Relational: " + (a > b));
        System.out.println("Logical: " + (a > 5 && b < 10));
    }
}

// 4. Control Statements

public class ControlStatements {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}

// 5. Arrays

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("First element: " + arr[0]);
    }
}

// 6. Strings

public class StringExample {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("UpperCase: " + str.toUpperCase());
    }
}

// 7. Methods and Functions

public class MethodsExample {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum: " + add(2, 3));
    }
}

// 8. Object-Oriented Programming Basics

class Car {
    String model;
    int year;
    
    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        car1.display();
    }
}
