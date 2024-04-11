import java.util.Scanner;

class Main {
  static int value = 12;
  static int count;

  public static void main(String[] args){
    // 🧠 BASIC JAVA - Variables
    // System.out.println("Hello World!");
    // System.out.print(2024);
    // System.out.println(4 + 3);
    
    // int age;
    // age = 28;
    // System.out.println("I am " + age + " years old");

    // int year = 2023;
    // year = 2024;
    // System.out.println(year);

    // System.out.println(value);
    // System.out.println(count);

    // count = 5;
    // System.out.println(count);

    // // int x = 5;
    // // int y = 8;
    // // int z = 3;
    // int x = 5, y = 8, z = 3;
    // System.out.println(x + y + z);

    // 🧠 BASIC JAVA - Data types
    // // integer types
    // byte aSingleByte = 100; // 8-bit. -128 to 127
    // short aSmallNumber = 20000; // 16-bit. -32,768 to 32,767
    // int anInteger = 2107621710; // 32-bit. -2,147,483,648 to 2,147,483,647
    // long aLargeNumber = 9223366008855775577L; // 64-bit. 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    // System.out.println(aSingleByte);
    // System.out.println(aSmallNumber);
    // System.out.println(anInteger);
    // System.out.println(aLargeNumber);

    // // decimal types
    // double aDouble = 0.123456789012345; // 64-bit. Sufficient for storing 15 decimal digits
    // float aFloat = 0.1234567F; // 32-bit. Sufficient for storing 6 to 7 decimal digits
    // System.out.println(aDouble);
    // System.out.println(aFloat);

    // // 'e' sign for the power of 10 in decimal types
    // double scientificNumber1 = 15e2;
    // double scientificNumber2 = 12.5e4;
    // float scientificNumber3 = 35e3f;
    // System.out.println(scientificNumber1);
    // System.out.println(scientificNumber2);
    // System.out.println(scientificNumber3);

    // // boolean
    // boolean isWeekend = true; // 1-bit
    // boolean isWorkday = false; // 1-bit

    // System.out.println(isWeekend);
    // System.out.println(isWorkday);

    // // character
    // char copyrightSymbol = '\u00A9'; // 16-bit
    // System.out.println(copyrightSymbol);

    // char ascii65 = 65, ascii66 = 66, ascii67 = 67;
    // System.out.println(ascii65);
    // System.out.println(ascii66);
    // System.out.println(ascii67);

    // // data types conversion
    /* Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double */
    // int number1 = 5;
    // double number2 = number1;
    // System.out.println(number2);

    /* Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte */
    // double number3 = 5.8;
    // int number4 = number3; //error
    // int number4 = (int)number3;
    // System.out.println(number4);


    // 🧠 BASIC JAVA - Operator
    // int number1 = 12;
    // int number2 = 6;

    // System.out.println(number1 + number2);
    // System.out.println(number1 - number2);
    // System.out.println(number1 * number2);
    // System.out.println(number1 / number2);
    // System.out.println(number1 % number2);

    // int number3 = 12;
    // // int number4 = 5;
    // double number4 = 5;
    // System.out.println(number3 / number4);

    // int number = 12;
    // // number = number + 5;
    // number += 5;
    // System.out.println(number);

    // // number = number + 1;
    // number++;
    // System.out.println(number);

    // // number = number - 6;
    // number -= 6;
    // System.out.println(number);

    // // number = number - 1;
    // number--;
    // System.out.println(number);
    
    // // number = number % 5;
    // number %= 5;
    // System.out.println(number);

    // int number1 = 12;
    // int number2 = 15;

    // System.out.println(number1 == number2);
    // System.out.println(number1 != number2);
    // System.out.println(number1 > number2);
    // System.out.println(number1 < number2);
    // System.out.println(number1 >= number2);
    // System.out.println(number1 <= number2);

    // int age = 25;
    // System.out.println(age >= 15 && age < 40);
    // System.out.println(age >= 15 && age < 20);
    // System.out.println(age >= 15 || age < 20);

    // 🧠 BASIC JAVA - String
    // String name = "Ahmad Zaenun Faiz";
    // String name = new String("Ahmad Zaenun Faiz");
    // System.out.println(name);

    // System.out.println(name.length());
    // System.out.println(name.isEmpty());
    // System.out.println(name.toUpperCase());
    // System.out.println(name.toLowerCase());
    // System.out.println(name.indexOf("nun"));

    // String text = "The sky is blue";
    // System.out.println(text.replace("blue", "red"));
    // System.out.println(text);
    
    // String updatedText = text.replace("blue", "red");
    // System.out.println(updatedText);

    // System.out.println(text.contains("sky"));
    // System.out.println(text.contains("azure"));

    // System.out.println(name.concat(text));
    // System.out.println(name + text);

    // String literalString1 = "abc";
    // String literalString2 = "abc";

    // String objectString1 = new String("xyz");
    // String objectString2 = new String("xyz");
    // String objectString3 = new String("XYZ");

    // System.out.println(literalString1 == literalString2);
    // System.out.println(objectString1 == objectString2);
    // System.out.println(objectString1.equals(objectString2));
    // System.out.println(objectString1.equals(objectString3));
    // System.out.println(objectString1.equalsIgnoreCase(objectString3));

    // String name = "Ahmad Zaenun Faiz"; // %s
    // String country = "Indonesia"; // %s
    // int age = 28; // %d
    // double weight = 50.5; // %f
    // char percentSign = '%'; // %c
    // boolean isTrue = false; // %b
    // // System.out.println("Hello World! My name is " + name + ". I am from " + country + " and I am " + age + " year old.");
  
    // String formattedString = String.format("My name is %s. I am from %s. I am %d years old. My weight is %f kg. My health condition is 78%c and I have a %b name.", name, country, age, weight, percentSign, isTrue);
    // System.out.println(formattedString);

    // 🧠 BASIC JAVA - User input
    Scanner scanner = new Scanner(System.in); // make sure to import module first in the top
    
    System.out.print("What is your name? ");
    // scanner.nextLine();
    String name = scanner.nextLine();
    // System.out.println("My name is: " + name);
    System.out.printf("Hello %s. ", name);

    System.out.print("How old are you? ");
    int age = scanner.nextInt();
    scanner.nextLine(); // to clean input buffer after nextInt()
    System.out.printf("%d is an excellent age to start programming %s. What language do you prefer? ", age, name);

    String language = scanner.nextLine();
    System.out.printf("%s is a very popular programming language.", language);

    scanner.close();
  }
}