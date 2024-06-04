package DIP;

import DIP.Following.*;

public class Client {

    public static void main(String[] args) {
        Macbook macbook= new Macbook(new WiredKeyboard(), new WiredMouse());
        macbook.getKeyboard().useKeyboard();
        macbook.getMouse().useMouse();

    }
}
