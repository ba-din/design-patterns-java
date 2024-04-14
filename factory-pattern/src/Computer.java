public class Computer implements ElectronicDevice {

    protected String maker;

    public Computer(String maker) {
        this.maker = maker;
    }
    
    public void  powerOn() {
        System.out.println(String.format("%s Computer - power on", maker));
    }

    @Override
    public void powerOff() {
        System.out.println(String.format("%s Computer - power Off", maker));
    }

    @Override
    public String getMaker() {
        return maker;
    }
}
