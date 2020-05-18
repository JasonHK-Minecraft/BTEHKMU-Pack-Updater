package net.joeydahuhuh.check;

import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.util.Arrays;

public class FileValid {


    public void getModFile(String dir, JTextField lb) {
        try {
            File profolder = new File(dir + "\\.packinfo.properties");
            File folder = new File(dir + "\\mods");
            lb.setText("Validating dir...");
            if (!folder.exists() && !profolder.exists()) {
                lb.setText("Failed due to: No BTE Official Pack Installed");
            } else {
                File[] listOfFiles = folder.listFiles();
                String usermods = Arrays.toString(listOfFiles).replace(dir + "\\mods\\", "");
                String process1 = usermods.replaceAll("[\\[\\]]", "");
                String process2 = process1.replaceAll(",", "");
                String process3 = process2.replaceAll(" ", "");
                System.out.println(process3);
                if (!process3.contains("BetterBuildersWands-1.12-0.11.1.245+69d0d70.jar")) {
                    System.out.println("Missing BetterBuildersWands");
                    URL url = new URL("http://joeydahuhuh.info/updator/mods/BetterBuildersWands-1.12-0.11.1.245+69d0d70.jar");
                    File downloaded = new File(folder + "\\BetterBuildersWands-1.12-0.11.1.245+69d0d70.jar");
                    FileUtils.copyURLToFile(url, downloaded);

                }
                if (!process3.contains("CustomNPCs_1.12.2-(01Oct19).jar")) {
                    System.out.println("Missing CustomNPCs");
                    URL url = new URL("http://joeydahuhuh.info/updator/mods/CustomNPCs_1.12.2-(01Oct19).jar");
                    File downloaded = new File(folder + "\\CustomNPCs_1.12.2-(01Oct19).jar");
                    FileUtils.copyURLToFile(url, downloaded);

                }

                if (!process3.contains("SignPicture-1.12.1-2.8.1-universal.jar")) {
                    System.out.println("Missing SignPicture");
                    URL url = new URL("http://joeydahuhuh.info/updator/mods/SignPicture-1.12.1-2.8.1-universal.jar");
                    File downloaded = new File(folder + "\\SignPicture-1.12.1-2.8.1-universal.jar");
                    FileUtils.copyURLToFile(url, downloaded);
                }

                if (!process3.contains("WorldEdit-CUI-FE3-1.12.2-3.0.3.jar")) {
                    System.out.println("Missing WorldEdit-CUI");
                    URL url = new URL("http://joeydahuhuh.info/updator/mods/SignPicture-1.12.1-2.8.1-universal.jar");
                    File downloaded = new File(folder + "\\WorldEdit-CUI-FE3-1.12.2-3.0.3.jar");
                    FileUtils.copyURLToFile(url, downloaded);
                }
                if (!process3.contains("OptiFine_1.12.2_HD_U_F5.jar")) {
                    System.out.println("Missing Optifine");
                    URL url = new URL("http://joeydahuhuh.info/updator/mods/OptiFine_1.12.2_HD_U_F5.jar");
                    File downloaded = new File(folder + "\\OptiFine_1.12.2_HD_U_F5.jar");
                    FileUtils.copyURLToFile(url, downloaded);

                }
                lb.setText("All files are now up-to-date");

            }
            } catch(Exception e){
                e.printStackTrace();
            }

        }
    }
