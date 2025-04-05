package model;

public class Items {
    private String code;
    private String name;
    private int price;
    private int quantity;
    public Items(String code,String name, int price,int quantity){
        this.code=code;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getCode(){return code;}
    public String getName(){return name;}
    public int getPrice(){return price;}
    public int getQuantity(){return quantity;}

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
