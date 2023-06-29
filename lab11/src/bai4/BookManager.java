package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
private List<Book> books=new ArrayList<>();
private int n;
public void nhap(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap so sach: ");
    n=Integer.parseInt(sc.nextLine());
    for (int i = 0; i < n; i++) {
        Book book=new Book();
        book.nhap();
        books.add(book);


    }


}
public void hienthi(){
    for (int i = 0; i <n; i++) {
        System.out.println(books.get(i).toString());


    }
}
public void sapxep(){
    for (int i = 0; i < n-1; i++) {
        for (int j = i+1; j <n ; j++) {
            if(books.get(i).getPrice()<books.get(j).getPrice()){
                Book temp=new Book();
                temp=books.get(i);
                books.set(i,books.get(j));
                books.set(j,temp);

            }

        }

    }
}

    public static void main(String[] args) {
        BookManager bookManager=new BookManager();
        bookManager.nhap();
        bookManager.hienthi();
        bookManager.sapxep();
        bookManager.hienthi();
    }


}
