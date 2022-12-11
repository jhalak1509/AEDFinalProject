package businessFramework.DB4OUtil;

import businessFramework.ConfigSys;
import businessFramework.Environment;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.util.ConcurrentModificationException;

/**
 *
 * @author jhalaksurve
 */
public class DB4OUtil {
  private static final String FILENAME = System.getProperty("user.dir") + "/DataBank.db4o";  
  private static DB4OUtil dB4OUtil;
  
  public static synchronized DB4OUtil getInstance()
  {
    if (dB4OUtil == null) {
      dB4OUtil = new DB4OUtil();
    }
    return dB4OUtil;
  }
  
  protected static synchronized void shutdown(ObjectContainer connection)
  {
    if (connection != null) {
      connection.close();
    }
  }
  
  private ObjectContainer createConnection()
  {
    try
    {
      EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
      config.common().add(new TransparentPersistenceSupport());
      
      config.common().activationDepth(Integer.MAX_VALUE);
      
      config.common().updateDepth(Integer.MAX_VALUE);
      
      config.common().objectClass(Environment.class).cascadeOnUpdate(true);
      
      return Db4oEmbedded.openFile(config, FILENAME);
    }
    catch (Exception ex)
    {
  //    System.out.print(ex.getMessage());
    }
    return null;
  }
  
  public synchronized void storeSystem(Environment system)
  {
      try
      {
          
    ObjectContainer connection = createConnection();
    connection.store(system);
    connection.commit();
    connection.close();
         
      }
      catch(ConcurrentModificationException cme)
      {
         
      }
  }
  
  public Environment retrieveSystem()
  {
    ObjectContainer connection = createConnection();
    ObjectSet<Environment> systems = connection.query(Environment.class);
    
    Environment system;
    if (systems.size() == 0) {
      system = ConfigSys.configuration();
    } else {
      system = (Environment)systems.get(systems.size() - 1);
    }
    connection.close();
    return system;
  } 
    
}
