package kalkulacka;

//* @author Adam

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GrafickeRozhrani extends JFrame {
    
    JTextField cislo1Field;
    JTextField cislo2Field;
    JTextField cislo3Field;
    
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    
    JButton button;
    
    public GrafickeRozhrani(){
        super("Kalkulacka");
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        
        panel1 = new JPanel ();
        add(panel1);
        
        cislo1Field = new JTextField("cislo 1", 10);
        panel1.add(cislo1Field);
        
        cislo2Field = new JTextField("cislo 2", 10);
        panel1.add(cislo2Field);
        
        panel2 = new JPanel ();
        add(panel2);
        
        button = new JButton("Vypočítej!");
        panel2.add(button);
        
        panel3 = new JPanel ();
        add(panel3);
        
        cislo3Field = new JTextField("Vysledek", 10);
        panel3.add(cislo3Field);
    }
}