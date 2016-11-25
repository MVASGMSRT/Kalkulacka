package master;

//* @author Adam

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GrafickeRozhrani extends JFrame implements ActionListener {
    
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
        
        cislo1Field = new JTextField("x", 10);
        panel1.add(cislo1Field);
        
        cislo2Field = new JTextField("y", 10);
        panel1.add(cislo2Field);
        
        panel2 = new JPanel ();
        add(panel2);
        
        button = new JButton("Sečti!");
        panel2.add(button);
        
        panel3 = new JPanel ();
        add(panel3);
        
        cislo3Field = new JTextField("Vysledek", 10);
        panel3.add(cislo3Field);
        
        button.addActionListener((ActionListener) this);
        
    }

    public void actionPerformed(ActionEvent e) {
        int cislo1 = Integer.parseInt(cislo1Field.getText());
        int cislo2 = Integer.parseInt(cislo2Field.getText());
        int vysledek = cislo1 + cislo2;
        cislo3Field.set(""+vysledek );
    }
}