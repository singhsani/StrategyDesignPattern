import withStragegy.NormalVehicle;
import withStragegy.SportsVehicle;
import withStragegy.Vehicle;
import withoutStrategy.GoodsVehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new NormalVehicle();
        vehicle.drive();
        System.out.println(vehicle.getClass().getName());
    }
}