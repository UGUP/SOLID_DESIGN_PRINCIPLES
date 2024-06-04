package DIP.Following;

public class Macbook {

    private Keyboard keyboard;
    private Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse){
        this.keyboard= keyboard;
        this.mouse= mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
