// Autogenerated Jamon proxy
// /root/apps/test/jamon-dist-2013.12.28/./jamon/org/apache/hadoop/hbase/tmpl/master/RegionServerListTmpl.jamon

package jamon.org.apache.hadoop.hbase.tmpl.master;

// 27, 9
import java.util.*;
// 28, 9
import org.apache.hadoop.hbase.master.HMaster;
// 29, 9
import org.apache.hadoop.hbase.procedure2.util.StringUtils;
// 30, 9
import org.apache.hadoop.hbase.replication.ReplicationLoadSource;
// 31, 9
import org.apache.hadoop.hbase.RegionMetrics;
// 32, 9
import org.apache.hadoop.hbase.ServerMetrics;
// 33, 9
import org.apache.hadoop.hbase.ServerName;
// 34, 9
import org.apache.hadoop.hbase.Size;
// 35, 9
import org.apache.hadoop.hbase.util.VersionInfo;
// 36, 9
import org.apache.hadoop.hbase.util.Pair;
// 37, 9
import org.apache.hadoop.util.StringUtils.TraditionalBinaryPrefix;

@org.jamon.annotations.Template(
  signature = "3014D59EE1D8FE3441AA4C8A712CFE31",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "master", type = "HMaster")},
  optionalArguments = {
    @org.jamon.annotations.Argument(name = "servers", type = "List<ServerName>")})
public class RegionServerListTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public RegionServerListTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  protected RegionServerListTmpl(String p_path)
  {
    super(p_path);
  }
  
  public RegionServerListTmpl()
  {
     super("/jamon/org/apache/hadoop/hbase/tmpl/master/RegionServerListTmpl");
  }
  
  public interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf
  {
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 23, 1
    public void setMaster(HMaster master)
    {
      // 23, 1
      m_master = master;
    }
    public HMaster getMaster()
    {
      return m_master;
    }
    private HMaster m_master;
    // 22, 1
    public void setServers(List<ServerName> servers)
    {
      // 22, 1
      m_servers = servers;
      m_servers__IsNotDefault = true;
    }
    public List<ServerName> getServers()
    {
      return m_servers;
    }
    private List<ServerName> m_servers;
    public boolean getServers__IsNotDefault()
    {
      return m_servers__IsNotDefault;
    }
    private boolean m_servers__IsNotDefault;
  }
  @Override
  protected org.jamon.AbstractTemplateProxy.ImplData makeImplData()
  {
    return new ImplData();
  }
  @Override public ImplData getImplData()
  {
    return (ImplData) super.getImplData();
  }
  
  protected List<ServerName> servers;
  public final jamon.org.apache.hadoop.hbase.tmpl.master.RegionServerListTmpl setServers(List<ServerName> p_servers)
  {
    (getImplData()).setServers(p_servers);
    return this;
  }
  
  
  @Override
  public org.jamon.AbstractTemplateImpl constructImpl(Class<? extends org.jamon.AbstractTemplateImpl> p_class){
    try
    {
      return p_class
        .getConstructor(new Class [] { org.jamon.TemplateManager.class, ImplData.class })
        .newInstance(new Object [] { getTemplateManager(), getImplData()});
    }
    catch (RuntimeException e)
    {
      throw e;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  protected org.jamon.AbstractTemplateImpl constructImpl(){
    return new RegionServerListTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final HMaster master)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, master);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final HMaster master)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, master);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final HMaster master)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setMaster(master);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}
