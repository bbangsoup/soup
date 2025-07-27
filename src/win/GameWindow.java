package win;

import javax.swing.*;
import java.awt.*;

public class GameWin extends JFrame {

    public static final int TEXT_HEIGHT = 30;
    public static int score = 0;

    private FirstSwingApp app;

    public GameWin(String title, FirstSwingApp app) {
        super( title );

        this.app = app;


    }
}
