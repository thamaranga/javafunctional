package lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        //If lambda function body has only one line , then don't use return statement
        Function<String, String>  upperCaseName=(name)->name.toUpperCase();
        System.out.println(upperCaseName.apply("Matara"));

        BiFunction<String,Integer, String> upperCaseNameWithAge=(name, age)-> name.toUpperCase()+" "+age;
        System.out.println(upperCaseNameWithAge.apply("Matara", 25));

        Main main= new Main();
        main.calculateYourLuck.accept(12);
        main.calculateYourLuck.accept(27);

        System.out.println(isValidMobile.test("0711234567"));
        System.out.println(isValidMobile.test("0511234567"));

    }

    Consumer<Integer> calculateYourLuck=age->{
        if(age%2==0){
            System.out.println("You are lucky...");
        }else{
            System.out.println("You are unlucky...");
        }
    };

    //Since this lambda implementation has more than one lines, return statement is  must
    static Predicate<String> isValidMobile=mobileNo->{
        boolean isValid=false;
        if(mobileNo.startsWith("07")){
            isValid=true;
        }else{
            isValid=false;
        }
        return isValid;
    };
}
