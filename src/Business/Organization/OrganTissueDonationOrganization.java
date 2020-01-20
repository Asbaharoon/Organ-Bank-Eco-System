/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicalDirector;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krish9
 */
public class OrganTissueDonationOrganization extends Organization {
     public OrganTissueDonationOrganization() {
        super(Organization.Type.OrganTissueDonationOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalDirector());
        return roles;
    }
    
}
