package lab11;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AdvancedComparison<Integer> compInt=new AdvancedComparison<>();
        AdvancedComparison<Float> compFloat= new AdvancedComparison<>();
        AdvancedComparison<String> compString=new AdvancedComparison<>();
        compInt.maximum(5,2,6);
        compFloat.maximum(8.5f,9.3f,6.2f);
        compString.maximum("Viet Nam","Trung Quoc","Hoa ky");

    }
}