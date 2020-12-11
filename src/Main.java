
/**
 *
 * @author anthony
 */
public class Main {
    public static void main(String[] args) {
        SmartControl smartControl = new SmartControl();
        AirConditioner airConditioner = new AirConditioner();
        Fan fan = new Fan();

        SmartHomeController smartHomeController = new SmartHomeController(smartControl, airConditioner, fan);
        smartControl.setSmartHomeMediator(smartHomeController);
        airConditioner.setSmartHomeMediator(smartHomeController);
        fan.setSmartHomeMediator(smartHomeController);

        smartControl.on(); // Turn on the smart control

        airConditioner.on();
        fan.on();
        System.out.println("AC on ? " + airConditioner.isOn());
        System.out.println("Fan on ? " + fan.isOn());
    }
}
