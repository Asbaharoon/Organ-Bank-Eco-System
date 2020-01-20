/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class LabTestWorkRequest extends WorkRequest{

 
     
    private String testResult;
    private String patient_Name;
    private String patient_id;
    private ArrayList <String> tests = new ArrayList<String>();
    private String file_name;
    private UserAccount patientAccount;

    public UserAccount getPatientAccount() {
        return patientAccount;
    }

    public void setPatientAccount(UserAccount patientAccount) {
        this.patientAccount = patientAccount;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }
    

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
       public ArrayList<String> getTests() {
        return tests;
    }

    public void setTests(ArrayList<String> tests) {
        this.tests = tests;
    }
}
