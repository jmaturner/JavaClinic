import java.util.Date;
import java.util.Vector;
/**
 * Sample class - takes in values and date of sample
 * 
 * @author (John Turner) 
 * 
 */
public class Sample
{
    // instance variables - replace the example below with your own    
    public double WBC;
    public int platelet;
    public Date sampledate;
    public double RBC;
    public double HCT;
    

    /**
     * Constructor for objects of class Sample
     */
    public Sample(Date sampledate, double WBC,int platelet, double RBC, double HCT) throws Exception 
    {
        // initialise instance variables
        this.sampledate = sampledate;
        this.WBC = WBC;
        this.platelet = platelet;
        this.RBC = RBC;
        this.HCT = HCT;
        if (platelet <= 1 || platelet >= 700) throw new Exception("Invalid Platelet Value " + platelet);   
        if (WBC <= 1 || WBC >= 50 ) throw new Exception ("Invalid WBC value " + WBC);
        if (RBC <= 1 || WBC >= 30 ) throw new Exception ("Invalid RBC value " + RBC);        
        if (HCT <= 20 || HCT >= 60 ) throw new Exception ("Invalid Hematocrit value " + HCT);  
     
    }
    
    
  
    
    public String toString(){
        String msg = "";
        msg += "--Sample: " + this.sampledate + "\n" + "---WBC " + this.WBC + "---PLT " + this.platelet +"---RBC " + this.RBC + "---HCT " + this.HCT +"\n";
        
        return msg;
    }
        
}
    
  

   
