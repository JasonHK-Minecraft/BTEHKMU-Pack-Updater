package net.joeydahuhuh;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://joeydahuhuh.info/updator/update.txt");
            Scanner s = new Scanner(url.openStream());
            List<String> list=new ArrayList<>();
            while(s.hasNextLine()){
                list.add(s.nextLine());
                if(list.contains("1.5")){
                    StartForm form = new StartForm();
                    form.setVisible(true);
                } else {
                    Updated updated = new Updated();
                    updated.setVisible(true);
                }
            }

        } catch (IOException e) {

        }
    }
}
