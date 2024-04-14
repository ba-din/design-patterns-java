public class ElectronicDeviceFactory {

    public ElectronicDevice create(String type, String maker) {
        switch (type) {
            case "computer":
                return new Computer(maker);
            case "smart-phone":
                return new SmartPhone(maker);
            default:
                return null;
        }
    }
}
