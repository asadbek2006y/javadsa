package staticmembers;

class Configuration {
    public static String configValue;

    static {
        configValue = "Default config value";
        System.out.println("Static block executed: configValue initialized");
    }


}

public class exc5 {
    public static void main(String[] args) {
        System.out.println("Config Value: " + Configuration.configValue);

    }
}
