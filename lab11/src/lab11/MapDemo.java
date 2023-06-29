package lab11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {


    public static void main(String[] args) {
        Map<String,String>student=new HashMap<>();
        student.put("K1230","Tuan");
        student.put("K1231","Nam");
        student.put("K1232","Thao");
        student.put("K1233","Binh");
        student.put("K1234","Hoang");
        for(Map.Entry<String,String>entrySet:student.entrySet()){
            String key=entrySet.getKey();
            String value= entrySet.getValue();
            System.out.println(key+"--"+value);
        }
        System.out.println("student rollno =K1231: "+student.get("K1231"));
        System.out.println(student.get("Nam"));
        //delete student
        student.remove("K1233");
        System.out.println("After delete: "+student);


    }
}
