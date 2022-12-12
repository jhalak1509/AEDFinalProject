package businessFramework;

import businessFramework.commonFunctions.Help;
import businessFramework.network.Network;
import businessFramework.organizations.Organizations;
import businessFramework.roles.Roles;
import businessFramework.roles.SysAdmin;
import java.util.ArrayList;

/**
 *
 * @author patil
 */
public class Environment extends Organizations {
    
 private ArrayList<Network> networkList;
   private static Environment environment;
   private ArrayList<Help> helpList;
    
   public Environment()
   {
       super(null);
       networkList = new ArrayList<>();
       helpList = new ArrayList<>();
      
   }
   
   public static Environment getInstance()
   {
    if(environment == null)
    {
      environment = new Environment();
    }
    return environment;
   }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
   
    public Network addNetwork()
    {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkUniqueName(String username)
    {
      if (!getUserDirectory().checkUniqueName(username)) {
        return false;
      }
      return true;
    }
   
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
   
   
    public ArrayList<Roles> getSupportedRoles() {
        ArrayList<Roles> rolesList = new ArrayList<>();
        rolesList.add(new SysAdmin());
        return rolesList;
    }
   
    public Help addHelp()
    {
        Help help = new Help();
        helpList.add(help);
        return help;
    }
    
    public void deleteHelp(Help help)
    {
        helpList.remove(help);
    }

    public ArrayList<Help> getHelpList() {
        return helpList;
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
