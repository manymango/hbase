// Autogenerated Jamon proxy
// /root/apps/test/jamon-dist-2013.12.28/./jamon/org/apache/hadoop/hbase/tmpl/common/TaskMonitorTmpl.jamon

package org.apache.hadoop.hbase.tmpl.common;

// 20, 1
import java.util.*;
// 21, 1
import org.apache.hadoop.hbase.monitoring.*;
// 22, 1
import org.apache.hadoop.util.StringUtils;

@org.jamon.annotations.Template(
  signature = "D2698843B28ACE2892E5017316CBA4FE",
  optionalArguments = {
    @org.jamon.annotations.Argument(name = "filter", type = "String"),
    @org.jamon.annotations.Argument(name = "format", type = "String"),
    @org.jamon.annotations.Argument(name = "parent", type = "String"),
    @org.jamon.annotations.Argument(name = "taskMonitor", type = "TaskMonitor")})
public class TaskMonitorTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public TaskMonitorTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  protected TaskMonitorTmpl(String p_path)
  {
    super(p_path);
  }
  
  public TaskMonitorTmpl()
  {
     super("/jamon/org/apache/hadoop/hbase/tmpl/common/TaskMonitorTmpl");
  }
  
  public interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf
  {
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 26, 1
    public void setFilter(String filter)
    {
      // 26, 1
      m_filter = filter;
      m_filter__IsNotDefault = true;
    }
    public String getFilter()
    {
      return m_filter;
    }
    private String m_filter;
    public boolean getFilter__IsNotDefault()
    {
      return m_filter__IsNotDefault;
    }
    private boolean m_filter__IsNotDefault;
    // 27, 1
    public void setFormat(String format)
    {
      // 27, 1
      m_format = format;
      m_format__IsNotDefault = true;
    }
    public String getFormat()
    {
      return m_format;
    }
    private String m_format;
    public boolean getFormat__IsNotDefault()
    {
      return m_format__IsNotDefault;
    }
    private boolean m_format__IsNotDefault;
    // 28, 1
    public void setParent(String parent)
    {
      // 28, 1
      m_parent = parent;
      m_parent__IsNotDefault = true;
    }
    public String getParent()
    {
      return m_parent;
    }
    private String m_parent;
    public boolean getParent__IsNotDefault()
    {
      return m_parent__IsNotDefault;
    }
    private boolean m_parent__IsNotDefault;
    // 25, 1
    public void setTaskMonitor(TaskMonitor taskMonitor)
    {
      // 25, 1
      m_taskMonitor = taskMonitor;
      m_taskMonitor__IsNotDefault = true;
    }
    public TaskMonitor getTaskMonitor()
    {
      return m_taskMonitor;
    }
    private TaskMonitor m_taskMonitor;
    public boolean getTaskMonitor__IsNotDefault()
    {
      return m_taskMonitor__IsNotDefault;
    }
    private boolean m_taskMonitor__IsNotDefault;
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
  
  protected String filter;
  public final org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl setFilter(String p_filter)
  {
    (getImplData()).setFilter(p_filter);
    return this;
  }
  
  protected String format;
  public final org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl setFormat(String p_format)
  {
    (getImplData()).setFormat(p_format);
    return this;
  }
  
  protected String parent;
  public final org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl setParent(String p_parent)
  {
    (getImplData()).setParent(p_parent);
    return this;
  }
  
  protected TaskMonitor taskMonitor;
  public final org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl setTaskMonitor(TaskMonitor p_taskMonitor)
  {
    (getImplData()).setTaskMonitor(p_taskMonitor);
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
    return new TaskMonitorTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer()
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}