package DIP.NotFollowing;

import javax.crypto.Mac;

public class Macbook {

    private WiredKeyboard keyboard;
    private WiredMouse mouse;

    public Macbook(WiredMouse mouse, WiredKeyboard keyboard){
        this.keyboard= new WiredKeyboard();
        this.mouse= new WiredMouse();
    }
}
