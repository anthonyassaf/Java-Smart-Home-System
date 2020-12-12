
import java.util.ArrayList;

/**
 *
 * @author anthony
 */
public class HComponent implements HomeComponent {
    private String name;
    private int number;
    private String status;

    public HComponent(){
        
    }
    
    public HComponent(int number, String name, String status){
        this.name = name;
        this.number = number;
        this.status = status;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setString(String status){
        this.status = status;
    }

    @Override
    public void on() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void off() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
