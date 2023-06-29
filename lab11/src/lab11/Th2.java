package lab11;

public class Th2 {
    //Generic method printArray
    public static <E> void printArray(E[] inputArray){
        //Display array elements
        for (E element:inputArray
             ) {
            System.out.printf("%s ",element);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray ={1,2,3,4,8};
        Double[] doubleArray={1.0,1.2,1.4,2.4};
        Character[] charArray={'P','H','U','O','N','G'};
        System.out.println("intergerArray:");
        printArray(intArray);
        System.out.println("doubleArray");
        printArray(doubleArray);
        System.out.println("CharacterArray");
        printArray(charArray);
    }
}
