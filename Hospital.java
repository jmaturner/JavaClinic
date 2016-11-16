
/**
 * Hospital Class
 * 
 * John Turner
 * 
 */
import java.util.*;
import java.util.Vector;

public class Hospital
{
    // instance variables 
    public String name;
    public Vector patients;
    
    
    /**
     * Constructor for objects of class Hospital
     */
    public Hospital(String name)
    {
        // initialise instance variables
        this.name = name;
        this.patients = new Vector();
    } 
    //add a patient
    public void addPatient(Patient p){
        patients.addElement(p);
    }
    
    //find how many patients are in the hospital
    public void getSize(){
       patients.size();
       System.out.println("there are " + patients.size()+" patients in the hospital" );
    }
    
        
    public String toString(){
        String msg = "";
        msg += "--Hospital Name: " + this.name + "\n";
        for (int i=0;i<patients.size();i++) {
            Patient p = (Patient) patients.elementAt(i);
            msg += p.toString();
            msg += "There are " + patients.size() + " patients in the hospital";
        }
        return msg;
    }
}
