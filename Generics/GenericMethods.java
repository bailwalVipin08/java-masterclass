package Generics;
// generic static methods cannot have a generic return type 

class PrintGenerically<E> {

    E value;
    //example of generic static method

    PrintGenerically(E val) {
        this.value = val;
    }
    public static <E> void print(E[] genericArray) {
        for(int i = 0; i < genericArray.length; i++) {
            System.out.print(genericArray[i] + " ");
        }
        System.out.println();
    }

    //example of generic instance method

    public E getAValue() {
        return this.value;
    }
}

public class GenericMethods {
    public static void main(String[] args) {

        Character[] characters = {'a', 'b', 'c', 'd'};
        Integer[] integers = {1, 2, 3, 4, 5};
        PrintGenerically.print(characters);
        PrintGenerically.print(integers);

        PrintGenerically<String> p = new PrintGenerically<String>("Generic Value");

        System.out.println(p.getAValue());
    }
}