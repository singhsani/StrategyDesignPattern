package withStragegy;

import withStragegy.strategy.DriveStrategy;
import withStragegy.strategy.SportDriveStrategy;

public class OffroadVehicle extends Vehicle{
    OffroadVehicle() {
        super(new SportDriveStrategy());
    }
}
