package withStragegy;

import withStragegy.strategy.DriveStrategy;
import withStragegy.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
