
/**
 * GUI to load data
 * 
 * @John Turner
 * @CIS133J
 */
import java.util.*;
public class Gui
{
    // instance variables - replace the example below with your own
    Hospital h; //the Hospital
    
    /**
     * Constructor for objects of class Gui
     */
    public Gui()
    {

    }
    //load test data
    public void loadTestData(){
        try{
            
            
            h = new Hospital("OHSU");
            Patient p = new Patient("Jerry");
            p.addSample(new Sample(new Date(100+15,9,11),10.9,360,6.8,40.1));
            p.addSample(new Sample(new Date(100+15,10,21),10.3,305,6.7,37.5));
            p.addSample(new Sample(new Date(100+15,11,24),7.3,205,5.6,35.6));
            h.addPatient(p);
            
            
            
            System.out.println(h.toString());   
            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            
        }
        
    }
    
   
}
