package OCP.NotFollowing;

import SRP.FollowSRP.Marker;

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