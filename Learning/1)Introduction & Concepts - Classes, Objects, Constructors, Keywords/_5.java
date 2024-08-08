public class _5 {
  public static void main(String[] args) {
    // Your code here

  }
}
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