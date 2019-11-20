package Generics;

//Immutable generic class as it does not allow any way to modify the values
class GenericType<T> {
    private T t;

    public GenericType(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}

public class Example1 {
    public static void main(String[] args) {
        GenericType<String> stringGeneric = new GenericType<String>("Example String");

        GenericType<Integer> integerGeneric = new GenericType<Integer>(5);

      //  GenericType test = new GenericType("TestString"); //test is of type Object
      //  System.out.println("String test is : " + test.get());

        System.out.println("String is : " + stringGeneric.get());
        
        System.out.println("Integer is : " + integerGeneric.get());
    }
}