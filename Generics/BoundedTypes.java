package Generics;

class SumValues<T extends Number> {
    private T[] values;

   public SumValues(T[] values) {
       this.values = values;
   }
   
   //return a double sum for all types of Numbers given as type argument
   public double getSum() {
       double sum = 0.0;
       for(T t : values) {
           sum += t.doubleValue();
       }
       return sum;
   }
    
}

public class BoundedTypes {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.0, 5.0, 7.0};

       
        SumValues<Integer> sumInt = new SumValues<Integer>(intArray);
        SumValues<Double> sumDouble = new SumValues<Double>(doubleArray);

        
      // below two lines give BoundMismatch Error Because SumValues can only work with Number class and its subclasses

      /*  String[] stringArray = {"Bounded", "Parameter Types"};
        SumValues<String> sumStr = new SumValues<String>(stringArray);
        */
        
        System.out.println(sumInt.getSum());
        System.out.println(sumDouble.getSum());
    }
}