
/**
 * Write a description of class Patient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.Collections;
public class Patient
{
    // instance variables - replace the example below with your own
    public String name;
    public Vector <Sample> samples;

    /**
     * Constructor for objects of class Patient
     */
    public Patient(String name)
    {
        // initialise instance variables
        this.name = name;
        samples = new Vector();
    }
    
    
    public void addSample(Sample s){
        samples.add(s);
    }
    
    public double getavgWBC (){
        int total=0;
        for (int i=0; i<samples.size(); i++) {
            total += samples.elementAt(i).WBC;
        }
        return total / samples.size();
    }
   
    public double getmaxWBC(){
        double max = 0;
        for (int i=0;i<samples.size();i++) {
        if (max < samples.elementAt(i).WBC) {
        max = samples.elementAt(i).WBC;
    }
    }
    return max;
   }
   
   public double getavgPLT (){
        int total=0;
        for (int i=0; i<samples.size(); i++) {
            total += samples.elementAt(i).platelet;
        }
        return total / samples.size();
    }
   
    public double getmaxPLT(){
        double max = 0;
        for (int i=0;i<samples.size();i++) {
        if (max < samples.elementAt(i).platelet) {
        max = samples.elementAt(i).platelet;
    }
    }
    return max;
   }
    
    
    
    public double getavgRBC (){
        int total=0;
        for (int i=0; i<samples.size(); i++) {
            total += samples.elementAt(i).RBC;
        }
        return total / samples.size();
    }
    
    public double getmaxRBC(){
        double max = 0;
        for (int i=0;i<samples.size();i++) {
        if (max < samples.elementAt(i).RBC) {
        max = samples.elementAt(i).RBC;
    }
    }
    return max;
  }
  
  public double getavgHCT (){
        int total=0;
        for (int i=0; i<samples.size(); i++) {
            total += samples.elementAt(i).HCT;
        }
        return total / samples.size();
    }
    
    public double getmaxHCT(){
        double max = 0;
        for (int i=0;i<samples.size();i++) {
        if (max < samples.elementAt(i).HCT) {
        max = samples.elementAt(i).HCT;
    }
    }
    return max;
  }

    
    
  
    public String toString(){
    String msg = "";
    msg += "--Patient Name: " + this.name + "\n";
    for (int i=0;i<samples.size();i++) {
        Sample s = (Sample) samples.elementAt(i);
        msg += s.toString();
    }
    msg += "average WBC = "  + getavgWBC() + "\n";
    msg += "Max WBC = "  + getmaxWBC() + "\n";
    
    msg += "average PLT = "  + getavgPLT() + "\n";
    msg += "Max PLT = "  + getmaxPLT() + "\n";
    
    msg += "average RBC = "  + getavgRBC() + "\n";
    msg += "Maximum RBC = " + getmaxRBC() + "\n";
    
    msg += "average HCT = "  + getavgHCT() + "\n";
    msg += "Maximum HCT = " + getmaxHCT() + "\n";
    return msg;
}
}
