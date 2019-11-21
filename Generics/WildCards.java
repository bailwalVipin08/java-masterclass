package Generics;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class ListProcessor<T> {

    //upper bound wildcard, works with a list of 'Number' and its subtypes
    public static double sumListItems(List<? extends Number> list) {
        double sum = 0.0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    //unbound wildcard, works with any type
    public static void printList(List<?> list) {
        for(Object o : list) {
            System.out.print(o + ", ");
        }
        
    }

    //lower bound wildcard works with Integer and its super types (Number and Object)
    public static void addNumbersToList(List<? super Integer> list) {        
        for(int i = 5; i <= 10; i++) {
            list.add(i);
        }
        printList(list);
     }
}

public class WildCards {
    public static void main(String[] args) {

        // upper bound wildcard List
        System.out.println("Results with upperbound wildcard: ");
        List<Integer> il = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of Integers = " + ListProcessor.sumListItems(il));
        List<Double> id = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Sum of Doubles = " + ListProcessor.sumListItems(id));
        System.out.println();

        //unbound wildcard list
        System.out.print("Results with unbound wildcard: ");
        List<String> strList = Arrays.asList("Java", "Generics", "WildCards");
        System.out.print("[ ");
        ListProcessor.printList(strList);
        System.out.print("]");
        System.out.println();
        System.out.println();

        //lowerbound wildcard list
        System.out.print("Results with Lower bound wildcard: ");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ListProcessor.addNumbersToList(list);
        System.out.println();
    }
}