/*
 * Created by JFormDesigner on Sat May 16 23:49:27 CST 2020
 */

package net.joeydahuhuh;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

import net.joeydahuhuh.check.FileValid;
import net.joeydahuhuh.check.net;
import net.miginfocom.swing.*;

/**
 * @author joeyho111
 */
public class Checker extends JFrame {
    public Checker() {
        initComponents();
        textField1.setEditable(false);
        textField2.setVisible(false);
        label4.setVisible(false);
        button1.setVisible(false);
        button2.setVisible(false);
        textField2.setEditable(false);
        label6.setVisible(false);
        textField3.setVisible(false);
        net net = new net();
        if(net.check()){
            label3.setText("Success");
            label4.setVisible(true);
            textField2.setVisible(true);
            button1.setVisible(true);
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            textField1.setVisible(false);
            textField2.setText(System.getenv("APPDATA") +"\\.buildtheearth");
            button2.setVisible(true);
        } else {
            label3.setText("Failed");
        }
    }

    private void button1MousePressed(MouseEvent e) {
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File(".")); // start at application current directory
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fc.showSaveDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File folder = fc.getSelectedFile();
            textField2.setText(String.valueOf(folder));
            button2.setVisible(true);
        }
    }

    private void button2MousePressed(MouseEvent e) {
        FileValid valid = new FileValid();
        textField3.setText("Downloading...");
        textField3.setVisible(true);
        label6.setVisible(true);
        valid.getModFile(textField2.getText(), textField3);

    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - joeyho111
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        textField2 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        label5 = new JLabel();
        label6 = new JLabel();
        textField3 = new JTextField();

        //======== this ========
        setTitle("Pack Injector");
        setIconImage(new ImageIcon(getClass().getResource("/resource/ico.png")).getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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
        label1.setText("The wizard is checking if you have:");
        contentPane.add(label1, "cell 0 0");

        //---- label2 ----
        label2.setText("Result:");
        contentPane.add(label2, "cell 16 0");

        //---- textField1 ----
        textField1.setText("Internet Connection");
        contentPane.add(textField1, "cell 0 1");
        contentPane.add(label3, "cell 16 1");

        //---- label4 ----
        label4.setText("Locate your profile location:");
        contentPane.add(label4, "cell 0 3");
        contentPane.add(textField2, "cell 0 4 16 1");

        //---- button1 ----
        button1.setText("Open");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button1MousePressed(e);
            }
        });
        contentPane.add(button1, "cell 16 4");

        //---- button2 ----
        button2.setText("Check & Download");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button2MousePressed(e);
            }
        });
        contentPane.add(button2, "cell 0 5");
        contentPane.add(label5, "cell 0 6 9 1");

        //---- label6 ----
        label6.setText("Result:");
        contentPane.add(label6, "cell 0 8");
        contentPane.add(textField3, "cell 0 9 17 1");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - joeyho111
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
