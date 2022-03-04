package ru.inordic.lesson5;

import java.util.Scanner;

public class Product {
    private  double cost;
    private  int shelfNumber;
    private  String name;
    private  long idCode;
    private  int shelfCount;
    int n = 0;


    public Product(){}

    public Product(String name, int shelfNumber, double cost, long idCode, int shelfCount){
        this.name = name;
        if (cost > 0) {
            this.cost = cost;
        } else {
            System.out.println("Цена не может быть меньше или равна нулю");
        }
        if (shelfNumber > 0 && shelfNumber <= 20) {
            this.shelfNumber = shelfNumber;
        } else {
            System.out.println("Номер полки должен быть больше нуля и больше 20");
        }
        this.idCode = idCode;
        if (shelfCount > 0 && shelfCount <= 20 ) {
            this.shelfCount = shelfCount;
        } else {
            System.out.println("Количество полок должно быть больше нуля и больше 20");
        }
    }

    public double getCost() {
        return cost;

    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdCode() {
        return idCode;
    }

    public void setIdCode(long idCode) {
        this.idCode = idCode;
    }

    public int getShelfCount() {
        return shelfCount;
    }

    public void setShelfCount(int shelfCount) {
        this.shelfCount = shelfCount;
    }

    public changeShelf(int shelfCount){

    }
}
