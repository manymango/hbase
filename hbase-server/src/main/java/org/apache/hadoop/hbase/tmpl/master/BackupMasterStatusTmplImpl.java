// Autogenerated Jamon implementation
// /root/apps/test/jamon-dist-2013.12.28/./jamon/org/apache/hadoop/hbase/tmpl/master/BackupMasterStatusTmpl.jamon

package org.apache.hadoop.hbase.tmpl.master;

// 23, 1
import java.util.*;
// 24, 1
import org.apache.hadoop.hbase.ServerName;
// 25, 1
import org.apache.hadoop.hbase.ClusterMetrics;
// 26, 1
import org.apache.hadoop.hbase.master.HMaster;
// 27, 1
import org.apache.hadoop.hbase.zookeeper.MasterAddressTracker;

public class BackupMasterStatusTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements org.apache.hadoop.hbase.tmpl.master.BackupMasterStatusTmpl.Intf

{
  private final HMaster master;
  protected static org.apache.hadoop.hbase.tmpl.master.BackupMasterStatusTmpl.ImplData __jamon_setOptionalArguments(org.apache.hadoop.hbase.tmpl.master.BackupMasterStatusTmpl.ImplData p_implData)
  {
    return p_implData;
  }
  public BackupMasterStatusTmplImpl(org.jamon.TemplateManager p_templateManager, org.apache.hadoop.hbase.tmpl.master.BackupMasterStatusTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    master = p_implData.getMaster();
  }
  
  @Override public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 29, 1
    
MasterAddressTracker masterAddressTracker = master.getMasterAddressTracker();

    // 33, 1
    if ((!master.isActiveMaster()) )
    {
      // 33, 35
      jamonWriter.write("\r\n    ");
      // 34, 5
      
    ServerName active_master =
        (masterAddressTracker == null) ? null : masterAddressTracker.getMasterAddress();
    assert active_master != null : "Failed to retrieve master's ServerName!";
    int infoPort = (masterAddressTracker == null) ? 0 : masterAddressTracker.getMasterInfoPort();
    
      // 40, 5
      jamonWriter.write("<div class=\"row inner_header\">\r\n        <div class=\"page-header\">\r\n            <h1>Backup Master <small>");
      // 42, 38
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(master.getServerName().getHostname()), jamonWriter);
      // 42, 80
      jamonWriter.write("</small></h1>\r\n        </div>\r\n    </div>\r\n    <h4>Current Active Master: <a href=\"//");
      // 45, 43
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(active_master.getHostname()), jamonWriter);
      // 45, 76
      jamonWriter.write(":");
      // 45, 77
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(infoPort), jamonWriter);
      // 45, 91
      jamonWriter.write("/master-status\"\r\n        target=\"_blank\">");
      // 46, 25
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(active_master.getHostname()), jamonWriter);
      // 46, 58
      jamonWriter.write("</a><h4>\r\n");
    }
    // 47, 1
    else
    {
      // 47, 8
      jamonWriter.write("\r\n    <h2>Backup Masters</h2>\r\n\r\n    <table class=\"table table-striped\">\r\n    <tr>\r\n        <th>ServerName</th>\r\n        <th>Port</th>\r\n        <th>Start Time</th>\r\n    </tr>\r\n    ");
      // 56, 5
      
    Collection<ServerName> backup_masters = master.getClusterMetricsWithoutCoprocessor(
        EnumSet.of(ClusterMetrics.Option.BACKUP_MASTERS)).getBackupMasterNames();
    ServerName [] backupServerNames = backup_masters.toArray(new ServerName[backup_masters.size()]);
    Arrays.sort(backupServerNames);
    for (ServerName serverName : backupServerNames) {
      int infoPort = (masterAddressTracker == null) ? 0 : masterAddressTracker
          .getBackupMasterInfoPort(serverName);
    
      // 65, 5
      jamonWriter.write("<tr>\r\n        <td><a href=\"//");
      // 66, 24
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(serverName.getHostname()), jamonWriter);
      // 66, 54
      jamonWriter.write(":");
      // 66, 55
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(infoPort), jamonWriter);
      // 66, 69
      jamonWriter.write("/master-status\"\r\n            target=\"_blank\">");
      // 67, 29
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(serverName.getHostname()), jamonWriter);
      // 67, 59
      jamonWriter.write("</a>\r\n        </td>\r\n        <td>");
      // 69, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(serverName.getPort()), jamonWriter);
      // 69, 39
      jamonWriter.write("</td>\r\n        <td>");
      // 70, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(new Date(serverName.getStartcode())), jamonWriter);
      // 70, 54
      jamonWriter.write("</td>\r\n    </tr>\r\n    ");
      // 72, 5
      
    }
    
      // 75, 5
      jamonWriter.write("<tr><td>Total:");
      // 75, 19
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(backupServerNames.length), jamonWriter);
      // 75, 49
      jamonWriter.write("</td>\r\n    </table>\r\n");
    }
    // 77, 7
    jamonWriter.write("\r\n");
  }
  
  
}
