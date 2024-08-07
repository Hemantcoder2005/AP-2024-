package Modules;
public class AHelloWorld {
  public static void main(String[] args) {
      Car myCar = new Car("Red", 2020);
      myCar.displayDetails(); // Output: Color: Red, Year: 2020
  }
}

class Car {
  // Fields
  String color;
  int year;
  
  // Constructor
  public Car(String color, int year) {
      this.color = color;
      this.year = year;
  }
  
  // Method
  public void displayDetails() {
      System.out.println("Color: " + color + ", Year: " + year);
  }
}
