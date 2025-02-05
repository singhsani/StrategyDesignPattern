package withStragegy.strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive strategy");
    }
}
