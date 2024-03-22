package database.settings;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesReader implements ISettings {
    public Map<String, String> read() {
        Map<String, String> props = new HashMap<>();
        try(InputStream input = getClass()
                .getClassLoader()
                .getResourceAsStream("SQLSettings.properties")){
            Properties properties = new Properties();
            properties.load(input);

            for(Map.Entry<Object, Object> entry: properties.entrySet()){
                props.put(
                        entry.getKey().toString(),
                        entry.getValue().toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }
}
