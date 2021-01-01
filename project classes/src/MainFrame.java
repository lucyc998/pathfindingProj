import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame extends JFrame{

    MainFrame() {
        this.setTitle("Pathfinder Visualizer");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setLayout(new BorderLayout(50,100));
        this.add(new Grid(), BorderLayout.CENTER);
        
        SelectionPanel p = new SelectionPanel();
        
        String options[] = {"Starting Point", "Ending Point", "Wall"};
        
        JComboBox comboBox = new JComboBox(options);
        
        JButton startButton = new JButton("Start");
        JButton resetButton = new JButton("Reset");
        
        
        p.add(startButton);
        p.add(resetButton);
        p.add(comboBox);
        
        comboBox.setSize(500,500);
        this.add(p, BorderLayout.PAGE_END);
        
        pack();

        this.setLayout(null);
        this.setLocationRelativeTo(null); //centers middle of computer
        this.setVisible(true);

    }
}
