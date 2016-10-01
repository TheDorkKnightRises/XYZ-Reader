package thedorkknightrises.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BASE_URL = url;
    }
}
