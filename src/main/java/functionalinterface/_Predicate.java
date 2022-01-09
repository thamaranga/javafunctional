package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {


    public static void main(String[] args) {

        System.out.println(validatePhoneNumber("0711234567"));
        System.out.println(validatePhoneNumber("0511234567"));

        System.out.println(validatePhoneNumberPredicate.test("0711234567"));
        System.out.println(validatePhoneNumberPredicate.test("0511234567"));

        System.out.println(isWithinSriLankaAndWithinSoutherProvincePredicate.test("Sri Lanka" , "Matara"));
        System.out.println(isWithinSriLankaAndWithinSoutherProvincePredicate.test("India" , "Dilli"));
        System.out.println(isWithinSriLankaAndWithinSoutherProvincePredicate.test("Sri Lanka" , "Colombo"));




    }


    //Normal Java function
    static boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.startsWith("07");

    }

    //Predicate Functional interface
    static Predicate<String> validatePhoneNumberPredicate=phoneNumber->phoneNumber.startsWith("07");

    //BiPredicate
    static BiPredicate<String,String> isWithinSriLankaAndWithinSoutherProvincePredicate=(countryname,districtName)->countryname.equalsIgnoreCase("Sri Lanka") &&
            (districtName.equalsIgnoreCase("Matara") || districtName.equalsIgnoreCase("Galle") ||
            districtName.equalsIgnoreCase("Hambanthota"));
}
