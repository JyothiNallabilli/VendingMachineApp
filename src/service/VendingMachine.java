package service;

import model.Items;
import java.util.*;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;
public class VendingMachine {
    private Map<String, Items> inventory= new HashMap<>();
    private int balance=0;
    public void addItem(Items items){
        inventory.put(items.getCode(),items);
    }
    public void insertMoney(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Inserted: "+amount);
        }else{
            System.out.println("Invalid Amount.");
        }
    }
    public void displayItems(){
        System.out.println("Available Items: ");
        for(Items items: inventory.values()){
            System.out.println(items.getCode()+" - "+items.getName()+" ($" + items.getPrice()+") - Qty: "+items.getQuantity());
        }
    }
    public void purchase(String code){
        if(!inventory.containsKey(code)){
            System.out.println("Item not found");
            return;
        }
        Items items=inventory.get(code);
        if(items.getQuantity()==0){
            System.out.println("Item is out of stock");
            return;
        }
        if(balance < items.getPrice()){
            System.out.println("Insufficient balance. Please insert more money");
            return;
        }
        balance-=items.getPrice();
        items.setQuantity(items.getQuantity()-1);
        System.out.println("Purchased: "+items.getName());
        System.out.println("Remaining balance: $" + balance);
    }
    public void refund(){
        System.out.println("Refunded: $"+balance);
        balance=0;
    }
}
