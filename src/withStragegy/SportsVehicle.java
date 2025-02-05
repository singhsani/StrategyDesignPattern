package withStragegy;

import withStragegy.strategy.DriveStrategy;
import withStragegy.strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
