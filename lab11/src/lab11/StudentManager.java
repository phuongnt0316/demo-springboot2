package lab11;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<String> lstSinhVien=new ArrayList<>();
    public void testList(){
        lstSinhVien.add("Tuan");
        lstSinhVien.add("Ha");
        lstSinhVien.add("Phuong");
        System.out.println("ArrayList:");
        System.out.println("\t"+lstSinhVien+"\n");
    }
    public void updateList(){
        lstSinhVien.set(1,"Hong Ha");
        System.out.println("Update ArrayList");
        System.out.println("\t"+lstSinhVien+"\n");
    }
    public void deleteList(){
        lstSinhVien.remove(0);
        System.out.println("Delete ArrayList:");
        System.out.println("\t"+lstSinhVien+"\n");
    }

    public static void main(String[] args) {
        StudentManager stm=new StudentManager();
        stm.testList();
        stm.updateList();
        stm.deleteList();
    }
}
