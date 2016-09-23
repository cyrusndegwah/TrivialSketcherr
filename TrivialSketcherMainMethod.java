import java.awt.Color;

import javax.swing.JFrame;

public class TrivialSketcherMainMethod 
    {
        public static void main(String s[])
        {
            Border ob=new Border();
            
            
            ob.setVisible(true);
            ob.setBounds(100, 100, 1200, 500);
            ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }