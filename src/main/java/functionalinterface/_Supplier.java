package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDbConnectionURL());
        System.out.println(getDbConnectionURLSupplier.get());
    }

    //Using normal java method
    static  String getDbConnectionURL(){
        return "jdbc://localhost:3306/users";
    }

    //Using supplier functional interface
    static Supplier<String> getDbConnectionURLSupplier=()->"jdbc://localhost:3306/users";
}
