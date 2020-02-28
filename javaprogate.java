class Main {
  public static void main(String[] args) {
    // Declare the number variable of type int
    int number;
    
    // Assign 3 to the number variable
    number = 3;
    
    // Print the number variable
    System.out.println(number);

    // Declare the name variable of type String
    String name;
    
    // Assign "Bob" to the name variable
    name = "Bob";
    
    // Print the name variable
    System.out.println(name);
    
  }
}
//end of this
// class Main {
//   public static void main(String[] args) {
//     int number1 = 3;
    
//     // Declare the number2 variable of type int, and assign 7 to it.
//     int number2 = 7;
    
//     // Print the result of number1 * number2
//     System.out.println(number1 * number2);
    
//     // Assign "Let's learn programming" to the text variable
//     String text = "Let's learn programming";
    
//     // Concatenate the text variable and the string, and print the result
//     System.out.println(text + " using Progate");
      
//   }
// }
// //end of this
// class Main {
//   public static void main(String[] args) {
//     int number = 11;
//     String text = "Ruby";
//     System.out.println(number);
//     System.out.println(text);
    
//     // Update the number variable with 9
//     number = 9;
    
//     // Print the number variable
//     System.out.println(number);
    
//     // Update the text variable with "Java"
//     text = "Java";
    
//     // Print the text variable
//     System.out.println(text);
    
//   }
// }
// //end of this
// class Main {
//   public static void main(String[] args) {
//     int number = 3;
//     System.out.println(number);
    
//     // Update the number variable by adding 7 to it
//     number = number + 7;
    
//     // Print the number variable
//     System.out.println(number);
      
//   }
// }
// //end of this
// class Main {
//   public static void main(String[] args) {
//     int number = 8;
    
//     // Update the number variable by multiplying 7 to it
//     number *= 7;
    
//     // Print the number variable
//     System.out.println(number);
    
//     // Update the number variable by adding 1 to it
//     number++;
    
//     // Print the number variable
//     System.out.println(number);
    
//   }
// }
// //end of this
// class Main {
//   public static void main(String[] args) {
//     int length = 6;
//     int height = 8;
    
//     // Assign the area of the rectangle to the rectangleArea variable  
//     int rectangleArea = length * height;
    
//     // Print the rectangleArea variable
//     System.out.println(rectangleArea);
    
//     // Assign the area of the triangle to the triangleArea variable 
//     int triangleArea = length * height / 2;
    
//     // Print the triangleArea variable 
//     System.out.println(triangleArea);
    
//   }
// }
// //end of this
//  class Main {
//   public static void main(String[] args) {
//     // Assign a string to the name variable
//     String name = "Kate Jones";
    
//     // Assign an integer to the age variable
//     int age = 27;
    
//     // Assign a double to the height variable (i.e. 1.6)
//     double height = 1.6;
    
//     // Assign a double to the weight variable (i.e. 50.0)
//     double weight = 50.0;
    
//     // Calculate the BMI and assign it into the bmi variable
//     double bmi = weight / height / height;
    
//     // Print name, age, height, weight, and BMI
//     System.out.println("My name is " + name);
//     System.out.println("I am " + age + " years old");
//     System.out.println("My height is " + height + " meters");
//     System.out.println("My weight is " + weight + " kilograms");
//     System.out.println("My BMI is " + bmi);
    
//   }
// }
    
//   //end of this
// class Main {
//   public static void main(String[] args) {
//     // Print true
//     System.out.println(true);
    
//     // Print false
//     System.out.println(false);
    
//     // Using ==, print the result of comparing the values
//     System.out.println(12 / 4 == 3);
    
//     // Using !=, print the result of comparing the values
//     System.out.println(12 / 4 != 3);  
    
//     // Assign the result of 3 * 9 == 27 to the bool variable
//     boolean bool = 3 * 9 == 27;
    
    // Print the value of the bool variable
    System.out.println(bool);
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    // Use && or || to print true
    System.out.println(true || false);
    
    // Use && or || to print false
    System.out.println(false && true);
    
    // Print the result of 8 < 5 AND 3 >= 2
    System.out.println(8 < 5 && 3 >= 2);
    
    // Print the result of 8 < 5 OR 3 >= 2
    System.out.println(8 < 5 || 3 >= 2);
    
    // Print the result of NOT 8 < 5
    System.out.println(!(8 < 5));
    
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    // Put true as the condition for the if statement
    if (true) {
      System.out.println("The condition is true. Printing...");
    }
    
    // Put false as the condition for the if statement
    if (false) {
      System.out.println("The condition is false. Not printing...");
    }
    
    int x = 5;
    // If x is greater than 2, print "x is greater than 2"
    if (x > 2) {
      System.out.println("x is greater than 2");
    }
    
    // If x is greater than 8, print "x is greater than 8"
    if (x > 8) {
      System.out.println("x is greater than 8");
    }
    
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    int number = 12;
    
    // Add else and else if statements
    if (number < 10) {
      System.out.println("The number is less than 10");
    } else if (number < 20) {
      System.out.println("The number is equal to or greater than 10, but less than 20");
    } else {
      System.out.println("The number is equal to or greater than 20");
    }
    
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    int number = 12;
    
    // Create a control flow according to the result of number % 3
    switch (number % 3) {
      case 0:
        System.out.println("Divisible by 3");
        break;
      case 1:
        System.out.println("Remainder is 1 when divided by 3");
        break;
      case 2:
        System.out.println("Remainder is 2 when divided by 3");
        break;
    }
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    int number = 10;
    
    // Create a while loop that repeats while number is greater than 0
    while (number > 0) {
      System.out.println(number);
      number--;
    }
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    // Create a for loop that runs 10 times
    for (int i = 1; i <= 10; i++) {
      System.out.println("Loop count: " + i);
    }
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    // Assign a list of names to the names variable
    String[] names = {"Ken", "Master White", "Ben"};
    
    // Print the element at index 0
    System.out.println(names[0]);
    
    // Print the element at index 2 
    System.out.println(names[2]);
    
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    String[] names = {"Bob", "Kate", "John"};
    
    // Get the elements of names using a for loop, and print "My name is ___"
    for (int i = 0; i < names.length; i++) {
      System.out.println("My name is " + names[i]);
    }
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    // Call the printData method
    printData();
  }
  
  // Define the printData method
  public static void printData() {
    System.out.println("My name is Kate Jones.");
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    // Add an argument for each person’s age
    printData("Kate Jones", 27);
    printData("John Christopher Smith", 65);
  }

  // Edit the method to accept an argument for age
  public static void printData(String name, int age) {
    System.out.println("My name is " + name + ".");
    // Output 「I am ____ years old.」
    System.out.println("I am " + age + " years old.");
    
  }
}
//end of this
class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("My name is " + name + ".");
    System.out.println("I am " + age + " years old.");
    System.out.println("My height is " + height + " meters.");
    System.out.println("My weight is " + weight + " kilograms.");

    double bmi = bmi(height, weight);
    System.out.println("My BMI is " + bmi + ".");
    
    // Make an if statement to determine the result of the isHealthy method
    if (isHealthy(bmi)) {
      System.out.println("You are healthy!");
    } else {
      System.out.println("You are not healthy.");
    }
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  // Define the isHealthy method
  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25.0;
  }
}
//end of this
// Import the Scanner class from java.util.Scanner
import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Name: ");
    
    // Make the name variable to take an input value from the console
    String name = scanner.next();
    
    //  Print out 「Hello, ____.」
    System.out.println("Hello, " + name + ".");
    
  }
}

//end of this

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("First Name: ");
    // Input a string value
    String firstName = scanner.next();
    
    System.out.print("Last Name: ");
    // Input a string value
    String lastName = scanner.next();
    
    System.out.print("Age: ");
    // Input an integer value
    int age = scanner.nextInt();
    
    System.out.print("Height (m): ");
    // Input a decimal value
    double height = scanner.nextDouble();
    
    System.out.print("Weight (kg): ");
    // Input a decimal value
    double weight = scanner.nextDouble();
    
    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
  }
}





