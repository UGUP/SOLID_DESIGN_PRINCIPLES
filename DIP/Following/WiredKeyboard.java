package DIP.Following;

import java.security.Key;

public class WiredKeyboard implements Keyboard {
    @Override
    public void useKeyboard() {
        System.out.println(" I am using wired Keyboard");
    }
}
