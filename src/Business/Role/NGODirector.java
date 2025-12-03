/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.NGODirector.DirectorProcessWAJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gaganaananda
 */
public class NGODirector extends Roles{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new DirectorProcessWAJPanel(userProcessContainer, account, (NGODirectorOrg)organization, enterprise);
    }
    
}
