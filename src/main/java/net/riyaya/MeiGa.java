package net.riyaya;

import net.riyaya.DataBase.Config;
import twitter4j.Twitter;

public class MeiGa {
    private static Twitter twitter;
    private static Config config = new Config();

    public static void main(String[] args) {
        config.load();
    }
}
