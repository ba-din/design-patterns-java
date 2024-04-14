public class SmartPhone implements ElectronicDevice {
    
    protected String maker;

    public SmartPhone(String maker) {
        this.maker = maker;
    }

    public void powerOn() {
        System.out.println(String.format("%s Smart phone - power on", maker));
    }

    @Override
    public void powerOff() {
        System.out.println(String.format("%s Smart phone - power off", maker));
    }

    @Override
    public String getMaker() {
        return maker;
    }
}
