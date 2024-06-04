package SRP.FollowSRP;

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


class Invoice  {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker= marker;
        this.quantity= quantity;
    }


    public int calculateprice(Marker marker, int quantity){
        return marker.getPrice()*quantity;
    }


}


