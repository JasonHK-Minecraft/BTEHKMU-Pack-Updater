package net.joeydahuhuh.check;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class net {
    public boolean check() {
        try {
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
            conn.getInputStream().close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}