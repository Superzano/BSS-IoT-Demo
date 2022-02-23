package conf;

public class MqttConfigurationParameters {
    public static String BROKER_ADDRESS = "127.0.0.1"; // local host
    public static int BROKER_PORT = 1883; // default mqtt port
    public static final String VEHICLE_BASE_TOPIC = "vehicle";
    public static final String STATION_BASE_TOPIC = "station";
    public static final String VEHICLE_TELEMETRY_TOPIC = "telemetry";
}