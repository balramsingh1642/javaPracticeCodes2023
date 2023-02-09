import oops.PackagesUse;
import oops.Subclass;
public class PackageUsedHere{
    public static void main(String ar[]){
    PackagesUse p1 = new  PackagesUse();
    p1.packageRun();
    p1.name = "new protected name";

    System.out.println(p1.name);

    Subclass s1 = new Subclass();
    s1.name2 = " new s1 name";
    System.out.println(s1.name);
    }
}
