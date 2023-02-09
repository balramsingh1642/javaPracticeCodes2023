package oops;


  class Subclass {
      static String name2;
      private String add ;

      public String getAdd(){
        return this.add;
      }
      public void setAdd(String add1,String user){
        if(user.equalsIgnoreCase("admin"))
        this.add  = add1;
        else {
            System.out.println("you are not admin to chnage it");

        }
      }

} 


public class PackagesUse { 
     public String name = "Protected Variable";
     
     public void packageRun(){
        System.out.println("This package is running");
    }
    public static void main(String ar[]) {
        Subclass s1 = new Subclass();
        Subclass.name2 = "new name";
        s1.setAdd("new password","Amin");
        System.out.println(s1.getAdd());


    }



}



