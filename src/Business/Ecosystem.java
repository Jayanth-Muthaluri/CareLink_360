/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Roles;
import Business.Role.Admin;
import java.util.ArrayList;

/**
 *
 * @author talha
 */
public class Ecosystem extends Organization{
    private static Ecosystem ecosystem;
    private ArrayList<Network> networks;
    public static Ecosystem getInstance(){
        if(ecosystem==null){
            ecosystem=new Ecosystem();
        }
        return ecosystem;
    }
    
    public Network createAddNetworks(){
        Network network=new Network();
        networks.add(network);
        return network;
    }
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roleList=new ArrayList<Roles>();
        roleList.add(new Admin());
        return roleList;
    }
    private Ecosystem(){
        super(null);
        networks=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public void setNetworkName(ArrayList<Network> networks) {
        this.networks = networks;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networks){
            
        }
        return true;
    }
}
