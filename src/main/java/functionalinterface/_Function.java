package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment=increment(1);
        System.out.println(increment);

        int increment2=incrementByOneFunction.apply(2);
        System.out.println(increment2);

        //Here first apply method will be executed by incrementByOneFunction and then by multiplyByTenFunction
        System.out.println(incrementByOneFunction.andThen(multiplyByTenFunction).apply(3));

        System.out.println(incrmentByOneAndMultiply.apply(2, 4));

    }

    static int increment(int number){
        return number+1;
    }

    //Function takes one argument and returns the result
    static Function<Integer, Integer> incrementByOneFunction=number->number+1;

    static Function<Integer, Integer> multiplyByTenFunction=number->number*10;

    //BiFunction takes two arguments and returns the result
    static BiFunction<Integer, Integer, Integer> incrmentByOneAndMultiply=(number1, number2)->(number1+1)*number2;
}
