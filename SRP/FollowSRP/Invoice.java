package SRP.FollowSRP;

public class Invoice  {

    private SRP.FollowSRP.Marker marker;
    private int quantity;

    public Invoice(SRP.FollowSRP.Marker marker, int quantity){
        this.marker= marker;
        this.quantity= quantity;
    }


    public int calculateprice(Marker marker, int quantity){
        return marker.getPrice()*quantity;
    }


}