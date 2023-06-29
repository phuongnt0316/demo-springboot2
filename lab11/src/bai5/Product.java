package bai5;

import java.util.Scanner;

public class Product implements Comparable<Product> {
    private String proId;
    private String proName;
    private String producer;
    private int yearMaking;
    private float price;

    public Product() {
        this.proId = proId;
        this.proName = proName;
        this.producer = producer;
        this.yearMaking = yearMaking;
        this.price = price;
    }


    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", producer='" + producer + '\'' +
                ", yearMaking=" + yearMaking +
                ", price=" + price +
                '}';
    }
    public void nhap(){
        System.out.println("--Insert Product--");
        Scanner sc=new Scanner(System.in);
        proId=sc.nextLine();
        proName=sc.nextLine();
        producer=sc.nextLine();
        yearMaking=Integer.parseInt(sc.nextLine());
        price=Float.parseFloat(sc.nextLine());
    }

    @Override
    public int compareTo(Product o) {
        int year=((Product)o).getYearMaking();
        return this.yearMaking-year;
    }
}
