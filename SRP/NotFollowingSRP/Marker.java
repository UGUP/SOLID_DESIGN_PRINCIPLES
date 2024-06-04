package SRP.NotFollowingSRP;

public class Marker {

    private String name;
    private String color;
    private int price;
    private int manufacturedYear;

    public Marker(String name,String color,int price, int manufacturedYear){
        this.name=name;
        this.price=price;
        this.color=color;
        this.manufacturedYear=manufacturedYear;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }
}


class Invoice{

    private Marker marker;
    private int quantity;


    public Invoice(Marker marker, int quantity){
        this.marker= marker;
        this.quantity=quantity;
    }

    // problem is if I change the calculation price logic tomorrow

    public int calculateTotalPrice(){
      return marker.getPrice()*quantity;
    }

    // What if I change the printing logic tomorrow
    public void printinvoice(){
        // print the invoice
    }


    // what if I introduce new Database tomorrow
    public void saveToDb(){
    // save to db
    }





}
