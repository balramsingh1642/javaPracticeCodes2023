package oops;
class Inheritance {
    String name = "Rama" ;
    public void run1(String name){
        System.out.println("Started with Parent class veriable " + this.name);
        System.out.println("running started " + name);
    }
}

class ChildClass extends Inheritance{
    
}
class MultilevelInheritance  extends ChildClass{
    
    public void run1(String s1){
        System.out.println("Most child class");
    }
    
}

class InheritedClass{
    public static void main(String ar[]){
        MultilevelInheritance in1 = new MultilevelInheritance();
        System.out.println("hello");
      in1.run1(" Shyama");
    }
    
}
