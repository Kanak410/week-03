package singleLinkedList.InventoryManagementSystem;

public class Node {


    private String ItemName;
    private int ItemId;
    private double quantity;
    private double price;
     private Node next;
     public Node(String ItemName,int ItemId,double quantity,double price){
         this.ItemName=ItemName;
         this.ItemId=ItemId;
         this.quantity=quantity;
         this.price=price;
         this.next=null;
     }
     public String getItem(){
         return ItemName;
     }
     public void setItem(String ItemName){
         this.ItemName=ItemName;
     }
    public int getItemId(){
        return ItemId;
    }
    public void setItemId(int ItemId){
        this.ItemId=ItemId;
    }
    public double getQuantity(){
        return quantity;
    }
    public void setQuantity(double quantity){
        this.quantity=quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next=next;
    }


}
