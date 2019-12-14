// Autogenerated Jamon implementation
// /root/apps/test/jamon-dist-2013.12.28/./jamon/org/apache/hadoop/hbase/tmpl/common/TaskMonitorTmpl.jamon

package org.apache.hadoop.hbase.tmpl.common;

// 20, 1
import java.util.*;
// 21, 1
import org.apache.hadoop.hbase.monitoring.*;
// 22, 1
import org.apache.hadoop.util.StringUtils;

public class TaskMonitorTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl.Intf

{
  private final String filter;
  private final String format;
  private final String parent;
  private final TaskMonitor taskMonitor;
  protected static org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl.ImplData __jamon_setOptionalArguments(org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl.ImplData p_implData)
  {
    if(! p_implData.getFilter__IsNotDefault())
    {
      p_implData.setFilter("general");
    }
    if(! p_implData.getFormat__IsNotDefault())
    {
      p_implData.setFormat("html");
    }
    if(! p_implData.getParent__IsNotDefault())
    {
      p_implData.setParent("");
    }
    if(! p_implData.getTaskMonitor__IsNotDefault())
    {
      p_implData.setTaskMonitor(TaskMonitor.get());
    }
    return p_implData;
  }
  public TaskMonitorTmplImpl(org.jamon.TemplateManager p_templateManager, org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    filter = p_implData.getFilter();
    format = p_implData.getFormat();
    parent = p_implData.getParent();
    taskMonitor = p_implData.getTaskMonitor();
  }
  
  @Override public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 31, 1
    if (format.equals("json"))
    {
      // 31, 29
      jamonWriter.write("\r\n    ");
      // 32, 5
      {
        // 32, 5
        __jamon_innerUnit__renderTasks(jamonWriter, filter );
      }
      // 32, 37
      jamonWriter.write("\r\n");
    }
    // 33, 1
    else
    {
      // 33, 8
      jamonWriter.write("\r\n  <h2><a name=\"tasks\">Tasks</a></h2>\r\n\r\n  <div class=\"tabbable\">\r\n      <ul class=\"nav nav-pills\">\r\n        <li class=\"\">\r\n            <a href=\"#tab_alltasks\" data-toggle=\"tab\">Show All Monitored Tasks</a>\r\n        </li>\r\n        <li class=\"active\">\r\n            <a href=\"#tab_generaltasks\" data-toggle=\"tab\">Show non-RPC Tasks</a>\r\n        </li>\r\n        <li class=\"\">\r\n            <a href=\"#tab_handlertasks\" data-toggle=\"tab\">Show All RPC Handler Tasks</a>\r\n        </li>\r\n        <li class=\"\">\r\n            <a href=\"#tab_rpctasks\" data-toggle=\"tab\">Show Active RPC Calls</a>\r\n        </li>\r\n        <li>\r\n            <a href=\"#tab_operationtasks\" data-toggle=\"tab\">Show Client Operations</a>\r\n        </li>\r\n      </ul>\r\n      <div class=\"tab-content\" style=\"padding-bottom: 9px; border-bottom: 1px solid #ddd;\">\r\n        <div class=\"tab-pane\" id=\"tab_alltasks\">\r\n            ");
      // 56, 13
      {
        // 56, 13
        __jamon_innerUnit__jsonView(jamonWriter, "all" );
      }
      // 56, 41
      jamonWriter.write("\r\n            ");
      // 57, 13
      {
        // 57, 13
        __jamon_innerUnit__renderTasks(jamonWriter, "all" );
      }
      // 57, 44
      jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane active\" id=\"tab_generaltasks\">\r\n            ");
      // 60, 13
      {
        // 60, 13
        __jamon_innerUnit__jsonView(jamonWriter, "general" );
      }
      // 60, 45
      jamonWriter.write("\r\n            ");
      // 61, 13
      {
        // 61, 13
        __jamon_innerUnit__renderTasks(jamonWriter, "general" );
      }
      // 61, 48
      jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_handlertasks\">\r\n            ");
      // 64, 13
      {
        // 64, 13
        __jamon_innerUnit__jsonView(jamonWriter, "handler" );
      }
      // 64, 45
      jamonWriter.write("\r\n            ");
      // 65, 13
      {
        // 65, 13
        __jamon_innerUnit__renderTasks(jamonWriter, "handler" );
      }
      // 65, 48
      jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_rpctasks\">\r\n            ");
      // 68, 13
      {
        // 68, 13
        __jamon_innerUnit__jsonView(jamonWriter, "rpc" );
      }
      // 68, 41
      jamonWriter.write("\r\n            ");
      // 69, 13
      {
        // 69, 13
        __jamon_innerUnit__renderTasks(jamonWriter, "rpc" );
      }
      // 69, 44
      jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_operationtasks\">\r\n            ");
      // 72, 13
      {
        // 72, 13
        __jamon_innerUnit__jsonView(jamonWriter, "operation" );
      }
      // 72, 47
      jamonWriter.write("\r\n            ");
      // 73, 13
      {
        // 73, 13
        __jamon_innerUnit__renderTasks(jamonWriter, "operation" );
      }
      // 73, 50
      jamonWriter.write("\r\n        </div>\r\n      </div>\r\n  </div>\r\n");
    }
    // 77, 7
    jamonWriter.write("\r\n\r\n");
  }
  
  
  // 79, 1
  private void __jamon_innerUnit__jsonView(final java.io.Writer jamonWriter, final String filter)
    throws java.io.IOException
  {
    // 83, 5
    jamonWriter.write("<a href=\"");
    // 83, 14
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(parent), jamonWriter);
    // 83, 26
    jamonWriter.write("?format=json&filter=");
    // 83, 46
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(filter), jamonWriter);
    // 83, 58
    jamonWriter.write("\">View as JSON</a>\r\n");
  }
  
  
  // 86, 1
  private void __jamon_innerUnit__renderTasks(final java.io.Writer jamonWriter, final String filter)
    throws java.io.IOException
  {
    // 90, 5
    
       List<? extends MonitoredTask> tasks = taskMonitor.getTasks(filter);
       long now = System.currentTimeMillis();
       Collections.sort(tasks, (t1, t2) -> Long.compare(t1.getStateTime(), t2.getStateTime()));
       boolean first = true;
    
    // 96, 5
    if (format.equals("json") )
    {
      // 96, 34
      jamonWriter.write("\r\n        [");
      // 97, 10
      for (MonitoredTask task : tasks)
      {
        // 97, 44
        if (first)
        {
          // 97, 56
          first = false;
        }
        // 97, 85
        else
        {
          // 97, 92
          jamonWriter.write(",");
        }
        // 97, 99
        org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(task.toJSON()), jamonWriter);
      }
      // 97, 125
      jamonWriter.write("]\r\n    ");
    }
    // 98, 5
    else
    {
      // 98, 12
      jamonWriter.write("\r\n        ");
      // 99, 9
      if (tasks.isEmpty())
      {
        // 99, 31
        jamonWriter.write("\r\n            <p>No tasks currently running on this node.</p>\r\n        ");
      }
      // 101, 9
      else
      {
        // 101, 16
        jamonWriter.write("\r\n            <table class=\"table table-striped\">\r\n                <tr>\r\n                      <th>Start Time</th>\r\n                      <th>Description</th>\r\n                      <th>State</th>\r\n                      <th>Status</th>\r\n                </tr>\r\n                ");
        // 109, 17
        for (MonitoredTask task : tasks )
        {
          // 109, 52
          jamonWriter.write("\r\n                    <tr class=\"");
          // 110, 32
          {
            // 110, 32
            __jamon_innerUnit__stateCss(jamonWriter, task.getState() );
          }
          // 110, 71
          jamonWriter.write("\">\r\n                      <td>");
          // 111, 27
          org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(new Date(task.getStartTime())), jamonWriter);
          // 111, 62
          jamonWriter.write("</td>\r\n                      <td>");
          // 112, 27
          org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(task.getDescription()), jamonWriter);
          // 112, 54
          jamonWriter.write("</td>\r\n                      <td>");
          // 113, 27
          org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(task.getState()), jamonWriter);
          // 113, 48
          jamonWriter.write("\r\n                          (since ");
          // 114, 34
          org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(StringUtils.formatTimeDiff(now, task.getStateTime())), jamonWriter);
          // 114, 92
          jamonWriter.write(" ago)\r\n                      </td>\r\n                      <td>");
          // 116, 27
          org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(task.getStatus()), jamonWriter);
          // 116, 49
          jamonWriter.write("\r\n                          (since ");
          // 117, 34
          org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(StringUtils.formatTimeDiff(now, task.getStatusTime())), jamonWriter);
          // 117, 93
          jamonWriter.write("\r\n                          ago)</td>\r\n                    </tr>\r\n                ");
        }
        // 120, 24
        jamonWriter.write("\r\n            </table>\r\n        ");
      }
      // 122, 15
      jamonWriter.write("\r\n    ");
    }
    // 123, 11
    jamonWriter.write("\r\n");
  }
  
  
  // 126, 1
  private void __jamon_innerUnit__stateCss(final java.io.Writer jamonWriter, final MonitoredTask.State state)
    throws java.io.IOException
  {
    // 130, 1
           if (state == MonitoredTask.State.COMPLETE) { 
    // 130, 68
    jamonWriter.write("alert alert-success");
    // 130, 87
     } 
    // 131, 1
      else if (state == MonitoredTask.State.ABORTED)  { 
    // 131, 68
    jamonWriter.write("alert alert-error");
    // 131, 85
       } 
  }
  
  
}
