import com.example.objectmapper.domain.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class writeValueAsString {

    @Test
    void writevalueasstring() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "sorrento");
        String result = objectMapper.writeValueAsString(car);
        System.out.println("result = " + result);

    }

    @Test
    void writeValueAsBytes() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "sorrento");
        byte[] result = objectMapper.writeValueAsBytes(car);
        System.out.println("result = " + Arrays.toString(result));

    }

    @Test
    @DisplayName("writeValueAsString Test")
    void readValue() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writeValueAsString(new Car("yellow", "sorrento"));
        Car car = objectMapper.readValue(result, Car.class);
        System.out.println("car.getColor() = " + car.getColor());
        System.out.println("car.getType() = " + car.getType());
    }

}
