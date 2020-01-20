/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
     public UserAccount createUserAccount(String username, String password, Employee employee, Role role ){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        //userAccount.setDate(date);
        if(userAccountList.contains(userAccount)){
            JOptionPane.showMessageDialog(null, "Username Already Exists Please try anothe username");
        }else{
        userAccountList.add(userAccount);
        }
        return userAccount;
    }
    
    public UserAccount createUserAccount(String username, String password,String phNum,String address,String qalString, String sex, boolean availability, int age, String file_path, Employee employee, Role role,boolean organavail){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setPhNumber(phNum);
        userAccount.setAddress(address);
        userAccount.setAge(age);
        userAccount.setSex(sex);
        userAccount.setIsAvailable(availability);
        userAccount.setQualifications(qalString);
        userAccount.setProfile(file_path);
        userAccount.setIsAvailableforOrgan(organavail);
        //userAccount.setDate(date);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

    public void createUserAccount(String userName, String password, String phNum, String Address, String qalString, String file_path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
