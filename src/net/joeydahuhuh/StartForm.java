/*
 * Created by JFormDesigner on Sat May 16 23:39:02 CST 2020
 */

package net.joeydahuhuh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author joeyho111
 */
public class StartForm extends JFrame {
    public StartForm() {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (IllegalAccessException | ClassNotFoundException | UnsupportedLookAndFeelException | InstantiationException e) {
            e.printStackTrace();
        }
        initComponents();
        textField1.setEditable(false);
        textField2.setEditable(false);
    }

    private void button1MousePressed(MouseEvent e) {
        Checker checker = new Checker();
        checker.setVisible(true);
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - joeyho111
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/resource/ico.png")).getImage());
        setTitle("Pack Updater");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Mod Updater");
        label1.setFont(new Font("Arial Narrow", label1.getFont().getStyle() & ~Font.BOLD, label1.getFont().getSize() + 8));
        contentPane.add(label1, "cell 0 0");

        //---- label2 ----
        label2.setText("During the process the followings are required. ");
        contentPane.add(label2, "cell 0 1");

        //---- textField1 ----
        textField1.setText("- Stable Internet Connection ");
        contentPane.add(textField1, "cell 0 2 19 2");

        //---- textField2 ----
        textField2.setText("- Instant downloaded from the official launcher ");
        contentPane.add(textField2, "cell 0 4 19 1");

        //---- label3 ----
        label3.setText("Press continue to proceed. ");
        contentPane.add(label3, "cell 0 7");

        //---- label4 ----
        label4.setText("BTEHK - MU Pack Updater - V.1.5");
        contentPane.add(label4, "cell 0 9");

        //---- button1 ----
        button1.setText("Continue");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button1MousePressed(e);
            }
        });
        contentPane.add(button1, "cell 18 9");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - joeyho111
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
