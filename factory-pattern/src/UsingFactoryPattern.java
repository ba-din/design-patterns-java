import java.util.ArrayList;
import java.util.List;

public class UsingFactoryPattern {
    
    public static void main(String[] args) {
        List<ElectronicDevice> electronicDevices = new ArrayList<>();
        ElectronicDeviceFactory electronicDeviceFactory = new ElectronicDeviceFactory();

        ElectronicDevice computer = electronicDeviceFactory.create("computer", "Apple");
        electronicDevices.add(computer);

        ElectronicDevice smartPhone = electronicDeviceFactory.create("smart-phone", "Samsung");
        electronicDevices.add(smartPhone);
        
        for (ElectronicDevice electronicDevice : electronicDevices) {
            System.out.println(electronicDevice.getClass().toString());
            electronicDevice.powerOn();
            System.out.println();
        }
    }
}
