# Why Do We Need OOP?

### Let's Start with an Example

Imagine your teacher asks you to create data for 100 students.

- Being an awesome person 😎, you create variables for 100 students and store all the data in them.
- Congrats 🎉! You've achieved the goal. But what if you have **1 lakh students** now? 😂
- You might think, "Now, this is going to be difficult 😅."

Let me introduce you to a concept called **class**.

- You can create a class where you define some objects and properties.
- Then, you can call that class and send values to it (like name, age, parents' names, etc.).
- Next time, you can tell people, "See, I have a template of the Student class. I don't have to create variables for storing data of thousands of students."

# What is a Class and an Object?

## Class:
- It is a logical construct.

## Object:
- It is a physical reality.

## Let me give you an example:
Consider the **Human Race** as a class (which is not a physical thing, it's a concept) that has the logical understanding of how to have a baby. This concept brings something physical into reality: an **object**. I think you get it now 😂.

# How to Access Instance Variables?

- Let's say we have a `Student` class with three properties: `name`, `rollNumber`, and `marks`.
- You can initialize the class, save data into it, and access it later on.
- In Java, we use the **`.`** operator to link the reference variable with the instance variable (stack memory to heap memory).

# Class Code Example

```java
class Student {
    int rno;
    String name;
    float marks;
}
```
# Main Question how we intialize this class?
- We can so like this 
```Java
Student Hemant;
```
- Is job done? (Think🤔)
- No, Because you are just putting things into stack memory you don't have reference to it. It is a **NULL**.
- So we have to tell heap memory,Hey! please create a object (not a class) and give me refernce and store it into Hemant in stack memory.
- Here is a example.
```Java
Student Hemant = new Student();
```
- By using **new** keyword you can create object in heap memory.

# Why we need always to intialize classes with **new**?
- As, In java it is not allowed to intialize with random pointers like c\c++.
- That's while definning arrays,classes we use **new** to intialize the stack memory with reference from heap memory.

# Manipulating the objects
- What will print if we simply run Hemant
```Java
public class _1 {
  public static void main(String[] args) {
    Student Hemant = new Student();
    System.out.println(Hemant);
  }
}
class Student{
  int rollNumber;
  String name;
  double marks;
}
```

## OUPUT
```bash
Student@2f92e0f4
```

## If we print the instance of an object then what's there value?
```Java
public class _2 {
  public static void main(String[] args) {
    Student Hemant = new Student();
    System.out.println(Hemant.rollNumber);
    System.out.println(Hemant.name);
    System.out.println(Hemant.marks);
  }
}
```

- **Note** : You must be wondering I don't have Student class in my code still it is running because I have **_1.class** file in my directory.
- Coming Back, See the the output
```bash
0
null
0.0
```
- All in,double,bool intialized by 0 and Stings array by null
- Now maniuplating 
```Java
public class _3 {
  public static void main(String[] args) {
    Student Hemant = new Student();
    Hemant.rollNumber = 1;
    Hemant.name = "Hemant";
    Hemant.marks = 98.6;

    // Printing out
    System.out.println(Hemant.rollNumber);
    System.out.println(Hemant.name);
    System.out.println(Hemant.marks);
  }
}
```
## OUTPUT
```bash
1
Hemant
98.6
```

- But you have seen while manipulating we are writting multiple lines to manipulate an object Is there any better way. Now welcome a **Contructor**.

# Contructor
- Contructor is special function which run automatically when we create an object and allocate some value.
```Java
public class _4 {
  public static void main(String[] args) {
    Student Hemant = new Student(1, "Hemant", 98.6);
    Hemant.print();
  }
}
class Student{
    int rollNumber;
    String name;
    double marks;
    Student (int rollNum,String name,double marks){
        this.rollNumber = rollNum;
        this.name = name;
        this.marks = marks;
    }
    public void print(){
        System.out.println(this.rollNumber);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
  }
  
```
## OUTPUT
```bash
1
Hemant
98.6
```

# How to call a contructor from another Contructor
```Java
class Student{
  int rollNumber;
  String name;
  double marks;
  Student(){
    this (2, "Girik", 99.9)
  }
  Student (int rollNum,String name,double marks){
      this.rollNumber = rollNum;
      this.name = name;
      this.marks = marks;
  }
  public void print(){
      System.out.println(this.rollNumber);
      System.out.println(this.name);
      System.out.println(this.marks);
  }
}
```

# Why Don't We Use the `new` Keyword with Primitive Data Types?

## Understanding Primitive Data Types

In Java, primitive data types are the most basic types of data. They include:

- `int` (integer)
- `float` (floating-point number)
- `double` (double-precision floating-point number)
- `char` (character)
- `boolean` (true/false)
- `byte` (8-bit integer)
- `short` (16-bit integer)
- `long` (64-bit integer)

These data types are called "primitive" because they are built into the language and represent the simplest forms of data. When you create a variable of a primitive data type, it directly holds the value.

## Direct Memory Allocation

When you declare a primitive data type, memory is allocated directly in the stack for that variable. For example:

```java
int number = 5;
```

# Is `final` the Same as `const`?

## Similarities

Both `final` in Java and `const` in C++ are used to create variables whose values cannot be changed once assigned.

### In Java (`final`):
- **Variables**: A `final` variable cannot be reassigned after it has been initialized. If it's a reference to an object, the reference cannot be changed, but the object's internal state can still be modified.

    ```java
    final int x = 10;
    x = 20; // Error: cannot assign a value to final variable 'x'
    ```

- **Classes**: A `final` class cannot be subclassed.

    ```java
    final class MyClass {
        // ...
    }
    
    class AnotherClass extends MyClass { // Error: cannot inherit from final MyClass
        // ...
    }
    ```

- **Methods**: A `final` method cannot be overridden by subclasses.

    ```java
    class MyClass {
        final void myMethod() {
            // ...
        }
    }
    
    class AnotherClass extends MyClass {
        void myMethod() { // Error: cannot override the final method from MyClass
            // ...
        }
    }
    ```

### In C++ (`const`):
- **Variables**: A `const` variable cannot be modified after it has been initialized.

    ```cpp
    const int x = 10;
    x = 20; // Error: assignment of read-only variable 'x'
    ```

- **Pointers**: You can have `const` pointers, where either the pointer itself or the data it points to, or both, are immutable.

    ```cpp
    const int* ptr; // pointer to a const int (can't modify the int through the pointer)
    int* const ptr2; // const pointer to an int (can't change the pointer's address)
    const int* const ptr3; // const pointer to a const int (neither the int nor the pointer can be changed)
    ```

- **Functions**: `const` can be used to make member functions that do not modify the object's state.

    ```cpp
    class MyClass {
        int value;
        
        void myMethod() const { // This method cannot modify 'value'
            // value = 10; // Error: assignment of member 'MyClass::value' in read-only object
        }
    };
    ```

## Differences

### 1. **Context and Use Cases**:
   - In Java, `final` applies to variables, methods, and classes. It restricts reassignment of variables, inheritance of classes, and overriding of methods.
   - In C++, `const` is more flexible, applying to variables, pointers, function parameters, and member functions. It's used to ensure immutability in various contexts.

### 2. **Objects and References**:
   - In Java, `final` on an object reference means the reference cannot be changed, but the object's internal state can still be modified.
   - In C++, `const` can apply to the data pointed to by a pointer, ensuring the data itself is immutable, which is a finer level of control than Java's `final`.

### 3. **Initialization**:
   - In Java, a `final` variable must be initialized either at the time of declaration or in the constructor.
   - In C++, a `const` variable can be initialized in the constructor initializer list or at the point of declaration, offering more flexibility.

## Conclusion

While both `final` in Java and `const` in C++ enforce immutability, they are not exactly the same. `final` is used primarily for making variables, methods, and classes immutable in Java, while `const` offers more granular control over immutability in C++, including making entire objects, pointers, and function behavior immutable.

# Garbage Collection by JVM (Java Virtual Machine)

## What is Garbage Collection?

Garbage Collection (GC) in Java is the process by which the Java Virtual Machine (JVM) automatically identifies and reclaims memory that is no longer in use, freeing it up for future allocation. This process helps manage memory in Java applications, preventing memory leaks and optimizing performance.

### Key Features:
- **Automatic Memory Management**: Unlike languages like C++ where developers manually allocate and deallocate memory, Java handles memory management automatically through garbage collection.
- **No Manual Destruction**: In Java, there's no need for a manual destructor as in C++. The JVM takes care of cleaning up objects that are no longer referenced.

## How is it Similar to Destructors?

In languages like C++, destructors are special methods that are called when an object is destroyed. They are used to clean up resources like memory, file handles, or network connections.

### Similarities:
- **Resource Cleanup**: Both destructors in C++ and garbage collection in Java are responsible for cleaning up resources that are no longer needed.
- **Preventing Resource Leaks**: Both mechanisms help prevent resource leaks by ensuring that memory or other resources are properly released.

### Differences:
- **Automatic vs. Manual**: In C++, developers must explicitly define destructors and manually manage memory. In Java, garbage collection is automatic, and developers don't need to write destructors.
- **Control**: C++ gives developers full control over when and how resources are released, while Java abstracts this away, with the JVM deciding when to perform garbage collection.

## How Does JVM Perform Garbage Collection?

The JVM periodically runs the garbage collector to find and remove objects that are no longer reachable in the program. This process involves:

1. **Marking**: The garbage collector first identifies which objects are still in use (reachable) and marks them.
2. **Sweeping**: It then removes objects that are not marked, freeing up memory.
3. **Compacting**: In some garbage collectors, memory may be compacted to reduce fragmentation and improve allocation efficiency.

Done for this Lecture Meet you next time with **Packages, Static, Singleton Class, In-built Methods**
