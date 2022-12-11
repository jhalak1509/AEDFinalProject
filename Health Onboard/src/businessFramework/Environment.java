package businessFramework;
import businessFramework.commonFunctions.NeedHelp;
import businessFramework.network.Network;
import businessFramework.organization.Organization;
import businessFramework.roles.Roles;
import businessFramework.roles.SysAdminRole;
import java.util.ArrayList;


/**
 *
 * @author patil
 */
public class Environment extends Organizations {
    
 private ArrayList<Network> networkList;
   private static Environment environment;
   private ArrayList<NeedHelp> helpList;
    
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
    
    public boolean checkIfUsernameIsUnique(String username)
    {
      if (!getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        return false;
      }
      return true;
    }
   
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
   
   @Override
    public ArrayList<Roles> getSupportedRoles() {
        ArrayList<Roles> rolesList = new ArrayList<>();
        rolesList.add(new SysAdminRole());
        return rolesList;
    }
   
    public NeedHelp addNeedHelp()
    {
        NeedHelp needHelp = new NeedHelp();
        helpList.add(needHelp);
        return needHelp;
    }
    
    public void deleteHelp(NeedHelp needHelp)
    {
        helpList.remove(needHelp);
    }

    public ArrayList<NeedHelp> getHelpList() {
        return helpList;
    }
}
