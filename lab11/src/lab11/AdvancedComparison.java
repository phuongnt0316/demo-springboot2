package lab11;

public class AdvancedComparison<T extends Comparable<T>> {
    public void maximum(T a, T b, T c){
        T max=a;
        if(b.compareTo(a) > 0 ) {
            max = b;
        }
            if(c.compareTo(b)>0){
                max=c;
            }
            System.out.println("Maximum: "+max);


    }

    public static void main(String[] args) {
        AdvancedComparison<Integer> compInt=new AdvancedComparison<>();
        AdvancedComparison<Float> compFloat= new AdvancedComparison<>();
        AdvancedComparison<String> compString=new AdvancedComparison<>();
        compInt.maximum(5,2,6);
        compFloat.maximum(8.5f,9.3f,6.2f);
        compString.maximum("Viet Nam","Trung Quoc","Hoa ky");
    }
}

