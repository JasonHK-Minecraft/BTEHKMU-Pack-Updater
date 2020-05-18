/*
 * Created by JFormDesigner on Mon May 18 00:42:13 CST 2020
 */

package net.joeydahuhuh;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author joeyho111
 */
public class Updated extends JFrame {
    public Updated() {
        initComponents();
    }

    private void button1MousePressed(MouseEvent e) {
            System.exit(0);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - joeyho111
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("Updated");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Download Update");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
        contentPane.add(label1, "cell 0 0");

        //---- label2 ----
        label2.setText("This updater is not up-to-date, please download a new one from discord");
        contentPane.add(label2, "cell 0 1");

        //---- button1 ----
        button1.setText("Exit");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button1MousePressed(e);
            }
        });
        contentPane.add(button1, "cell 0 2");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - joeyho111
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
