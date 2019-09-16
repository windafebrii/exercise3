import com.enigma.model.Motorcycle;
import com.enigma.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Motorcycle motor = new Motorcycle(2,2,1);

        Vehicle kendaraan = new Vehicle(5, 2);

        System.out.println(kendaraan.print());
        System.out.println(kendaraan.getType());

        System.out.println(motor.print());
        System.out.println(motor.getType());
    }
}
