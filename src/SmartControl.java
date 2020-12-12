
/**
 *
 * @author anthony
 */
public class SmartControl extends HComponent {
    private boolean smartControl;
    private SmartHomeMediator smartHomeMediator;

    @Override
    public void on() {
        smartControl = true;
        smartHomeMediator.changed(this);
    }

    @Override
    public void off() {
        smartControl = false;
        smartHomeMediator.changed(this);
    }

    @Override
    public boolean isOn() {
        return smartControl;
    }

    public boolean isSmartControlOn() {
        return smartControl;
    }

    public void setSmartHomeMediator(SmartHomeMediator smartHomeMediator) {
        this.smartHomeMediator = smartHomeMediator;
    }
    
}