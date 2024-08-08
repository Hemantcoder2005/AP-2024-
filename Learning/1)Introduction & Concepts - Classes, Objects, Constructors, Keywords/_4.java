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
  
  