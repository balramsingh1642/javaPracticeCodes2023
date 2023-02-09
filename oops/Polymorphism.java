package oops;
class Poly {
    public void run(){
        System.out.println("run alone");
    }
    public void run(String name){
        System.out.println("run with "+ name);
    }
    public void run(String name,String name1){
        System.out.println("run with "+ name + " and " + name1);
    }

}

public class Polymorphism {
    public static void main(String ar[]){
        Poly p1  = new Poly();
        p1.run();
        p1.run("Harry");
        p1.run("Balram" ,"Shyam");
    }
}
