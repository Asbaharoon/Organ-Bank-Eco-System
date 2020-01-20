/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Person.DonorDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.PatientRole.PatientWorkAreaJPanel;

/**
 *
 * @author saksh
 */
public class PatientRole extends Role{
 
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network, DonorDirectory donorDirectory) {
        return new PatientWorkAreaJPanel(userProcessContainer, account, (PatientOrganization)organization, enterprise,business, network);
    }
}
