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