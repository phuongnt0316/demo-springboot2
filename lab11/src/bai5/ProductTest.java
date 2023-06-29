package bai5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductTest {
    private int n;
    private Map<Integer,Product> products=new HashMap<>();
    public void nhap(){
        System.out.println("Nhap n: ");
        Scanner sc= new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <n; i++) {
            Product pr=new Product();
            pr.nhap();
            products.put(i,pr);

        }
    }
    public void xuat(){
        for (int i = 0; i < n; i++) {
            System.out.println(products.get(i).toString());

        }
    }
    public void sapxep(){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if(products.get(i).compareTo(products.get(j))>0){
                    Product temp;
                    temp=products.get(i);
                    products.put(i,products.get(j));
                    products.put(j,temp);

                }

            }
            
        }
    }
    public static void main(String[] args) {
        ProductTest productTest=new ProductTest();
        productTest.nhap();
        productTest.xuat();
        productTest.sapxep();
        System.out.println("After sort: ");
        productTest.xuat();





    }



}
