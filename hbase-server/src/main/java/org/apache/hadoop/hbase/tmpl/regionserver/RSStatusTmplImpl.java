// Autogenerated Jamon implementation
// /root/apps/test/jamon-dist-2013.12.28/./jamon/org/apache/hadoop/hbase/tmpl/regionserver/RSStatusTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 27, 1
import java.util.*;
// 28, 1
import org.apache.hadoop.hbase.regionserver.HRegionServer;
// 29, 1
import org.apache.hadoop.hbase.client.RegionInfo;
// 30, 1
import org.apache.hadoop.hbase.ServerName;
// 31, 1
import org.apache.hadoop.hbase.HBaseConfiguration;
// 32, 1
import org.apache.hadoop.hbase.io.hfile.CacheConfig;
// 33, 1
import org.apache.hadoop.hbase.shaded.protobuf.ProtobufUtil;
// 34, 1
import org.apache.hadoop.hbase.shaded.protobuf.generated.AdminProtos.ServerInfo;
// 35, 1
import org.apache.hadoop.hbase.zookeeper.MasterAddressTracker;

public class RSStatusTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements org.apache.hadoop.hbase.tmpl.regionserver.RSStatusTmpl.Intf

{
  private final HRegionServer regionServer;
  private final String bcn;
  private final String bcv;
  private final String filter;
  private final String format;
  // 55, 1
  
  public String formatZKString() {
    StringBuilder quorums = new StringBuilder();
    String zkQuorum = regionServer.getZooKeeper().getQuorum();

    if (null == zkQuorum) {
      return quorums.toString();
    }

    String[] zks = zkQuorum.split(",");

    if (zks.length == 0) {
      return quorums.toString();
    }

    for(int i = 0; i < zks.length; ++i) {
      quorums.append(zks[i].trim());

      if (i != (zks.length - 1)) {
        quorums.append("<br/>");
      }
    }

    return quorums.toString();
  }

  protected static org.apache.hadoop.hbase.tmpl.regionserver.RSStatusTmpl.ImplData __jamon_setOptionalArguments(org.apache.hadoop.hbase.tmpl.regionserver.RSStatusTmpl.ImplData p_implData)
  {
    if(! p_implData.getBcn__IsNotDefault())
    {
      p_implData.setBcn("");
    }
    if(! p_implData.getBcv__IsNotDefault())
    {
      p_implData.setBcv("");
    }
    if(! p_implData.getFilter__IsNotDefault())
    {
      p_implData.setFilter("general");
    }
    if(! p_implData.getFormat__IsNotDefault())
    {
      p_implData.setFormat("html");
    }
    return p_implData;
  }
  public RSStatusTmplImpl(org.jamon.TemplateManager p_templateManager, org.apache.hadoop.hbase.tmpl.regionserver.RSStatusTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    regionServer = p_implData.getRegionServer();
    bcn = p_implData.getBcn();
    bcv = p_implData.getBcv();
    filter = p_implData.getFilter();
    format = p_implData.getFormat();
  }
  
  @Override public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 38, 1
    if (format.equals("json") && bcn != null && bcn.length() > 0  )
    {
      // 38, 66
      jamonWriter.write("\r\n  ");
      // 39, 3
      {
        org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl __jamon__var_0 = new org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl(this.getTemplateManager());
        __jamon__var_0.renderNoFlush(jamonWriter, new CacheConfig(regionServer.getConfiguration()), regionServer.getConfiguration(), bcn, bcv, regionServer.getBlockCache().orElse(null)  );
      }
      // 39, 210
      jamonWriter.write("\r\n  ");
      // 40, 3
      return; 
    }
    // 41, 1
    else if (format.equals("json") )
    {
      // 41, 34
      jamonWriter.write("\r\n  ");
      // 42, 3
      {
        org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl __jamon__var_1 = new org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl(this.getTemplateManager());
        __jamon__var_1.setFilter(filter);
        __jamon__var_1.setFormat("json" );
        __jamon__var_1.renderNoFlush(jamonWriter);
      }
      // 42, 68
      jamonWriter.write("\r\n  ");
      // 43, 3
      return; 
    }
    // 44, 7
    jamonWriter.write("\r\n");
    // 45, 1
    
  ServerInfo serverInfo = ProtobufUtil.getServerInfo(null, regionServer.getRSRpcServices());
  ServerName serverName = ProtobufUtil.toServerName(serverInfo.getServerName());
  List<RegionInfo> onlineRegions = ProtobufUtil.getOnlineRegions(regionServer.getRSRpcServices());
  MasterAddressTracker masterAddressTracker = regionServer.getMasterAddressTracker();
  ServerName masterServerName = masterAddressTracker == null ? null
    : masterAddressTracker.getMasterAddress();
  int infoPort = masterAddressTracker == null ? 0 : masterAddressTracker.getMasterInfoPort();

    // 82, 1
    jamonWriter.write("<!DOCTYPE html>\r\n<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n<html lang=\"en\">\r\n  <head>\r\n    <meta charset=\"utf-8\">\r\n    <title>HBase Region Server: ");
    // 87, 33
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(serverName.getHostname()), jamonWriter);
    // 87, 63
    jamonWriter.write("</title>\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <meta name=\"description\" content=\"\">\r\n\r\n    <link href=\"/static/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n    <link href=\"/static/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n    <link href=\"/static/css/hbase.css\" rel=\"stylesheet\">\r\n  </head>\r\n\r\n  <body>\r\n\r\n    <div class=\"navbar  navbar-fixed-top navbar-default\">\r\n        <div class=\"container-fluid\">\r\n            <div class=\"navbar-header\">\r\n                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n                    <span class=\"icon-bar\"></span>\r\n                    <span class=\"icon-bar\"></span>\r\n                    <span class=\"icon-bar\"></span>\r\n                </button>\r\n                <a class=\"navbar-brand\" href=\"/rs-status\"><img src=\"/static/hbase_logo_small.png\" alt=\"HBase Logo\"/></a>\r\n            </div>\r\n            <div class=\"collapse navbar-collapse\">\r\n                <ul class=\"nav navbar-nav\">\r\n                <li class=\"active\"><a href=\"/rs-status\">Home</a></li>\r\n                <li><a href=\"/processRS.jsp\">Process Metrics</a></li>\r\n                <li><a href=\"/logs/\">Local Logs</a></li>\r\n                <li><a href=\"/logLevel\">Log Level</a></li>\r\n                <li><a href=\"/dump\">Debug Dump</a></li>\r\n                <li><a href=\"/jmx\">Metrics Dump</a></li>\r\n                <li><a href=\"/prof\">Profiler</a></li>\r\n                ");
    // 117, 17
    if (HBaseConfiguration.isShowConfInServlet())
    {
      // 117, 64
      jamonWriter.write("\r\n                <li><a href=\"/conf\">HBase Configuration</a></li>\r\n                ");
    }
    // 119, 23
    jamonWriter.write("\r\n            </ul>\r\n          </div><!--/.nav-collapse -->\r\n        </div>\r\n      </div>\r\n    </div>\r\n\r\n  <div class=\"container-fluid content\">\r\n    <div class=\"row inner_header\">\r\n        <div class=\"page-header\">\r\n            <h1>RegionServer <small>");
    // 129, 37
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(serverName), jamonWriter);
    // 129, 53
    jamonWriter.write("</small></h1>\r\n        </div>\r\n    </div>\r\n    <div class=\"row\">\r\n\r\n    <section>\r\n    <h2>Server Metrics</h2>\r\n    ");
    // 136, 5
    {
      org.apache.hadoop.hbase.tmpl.regionserver.ServerMetricsTmpl __jamon__var_2 = new org.apache.hadoop.hbase.tmpl.regionserver.ServerMetricsTmpl(this.getTemplateManager());
      __jamon__var_2.renderNoFlush(jamonWriter, regionServer.getMetrics().getRegionServerWrapper(), regionServer.getRpcServer().getMetrics().getHBaseServerWrapper(), regionServer.getRpcServer().getByteBuffAllocator());
    }
    // 138, 75
    jamonWriter.write("\r\n    </section>\r\n\r\n    <section>\r\n    <h2>Block Cache</h2>\r\n    ");
    // 143, 5
    {
      org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheTmpl __jamon__var_3 = new org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheTmpl(this.getTemplateManager());
      __jamon__var_3.renderNoFlush(jamonWriter, new CacheConfig(regionServer.getConfiguration()), regionServer.getConfiguration(), regionServer.getBlockCache().orElse(null) );
    }
    // 143, 179
    jamonWriter.write("\r\n    </section>\r\n\r\n    <section>\r\n    ");
    // 147, 5
    {
      org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl __jamon__var_4 = new org.apache.hadoop.hbase.tmpl.common.TaskMonitorTmpl(this.getTemplateManager());
      __jamon__var_4.setFilter(filter);
      __jamon__var_4.setParent("/rs-status" );
      __jamon__var_4.renderNoFlush(jamonWriter);
    }
    // 147, 76
    jamonWriter.write("\r\n    </section>\r\n\r\n    <section>\r\n    <h2>Regions</h2>\r\n    ");
    // 152, 5
    {
      org.apache.hadoop.hbase.tmpl.regionserver.RegionListTmpl __jamon__var_5 = new org.apache.hadoop.hbase.tmpl.regionserver.RegionListTmpl(this.getTemplateManager());
      __jamon__var_5.renderNoFlush(jamonWriter, regionServer, onlineRegions);
    }
    // 152, 86
    jamonWriter.write("\r\n    </section>\r\n\r\n    <section>\r\n    <h2>Replication Status</h1>\r\n    ");
    // 157, 5
    {
      org.apache.hadoop.hbase.tmpl.regionserver.ReplicationStatusTmpl __jamon__var_6 = new org.apache.hadoop.hbase.tmpl.regionserver.ReplicationStatusTmpl(this.getTemplateManager());
      __jamon__var_6.renderNoFlush(jamonWriter, regionServer);
    }
    // 157, 62
    jamonWriter.write("\r\n    </section>\r\n\r\n    <section>\r\n    <h2>Software Attributes</h2>\r\n    <table id=\"attributes_table\" class=\"table table-striped\">\r\n        <tr>\r\n            <th>Attribute Name</th>\r\n            <th>Value</th>\r\n            <th>Description</th>\r\n        </tr>\r\n        <tr>\r\n            <td>HBase Version</td>\r\n            <td>");
    // 170, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.hbase.util.VersionInfo.getVersion()), jamonWriter);
    // 170, 76
    jamonWriter.write(", revision=");
    // 170, 87
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.hbase.util.VersionInfo.getRevision()), jamonWriter);
    // 170, 147
    jamonWriter.write("</td>\r\n            <td>HBase version and revision</td>\r\n        </tr>\r\n        <tr>\r\n            <td>HBase Compiled</td>\r\n            <td>");
    // 175, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.hbase.util.VersionInfo.getDate()), jamonWriter);
    // 175, 73
    jamonWriter.write(", ");
    // 175, 75
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.hbase.util.VersionInfo.getUser()), jamonWriter);
    // 175, 131
    jamonWriter.write("</td>\r\n            <td>When HBase version was compiled and by whom</td>\r\n        </tr>\r\n        <tr>\r\n            <td>HBase Source Checksum</td>\r\n            <td>");
    // 180, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.hbase.util.VersionInfo.getSrcChecksum()), jamonWriter);
    // 180, 80
    jamonWriter.write("</td>\r\n            <td>HBase source SHA512 checksum</td>\r\n        </tr>\r\n        <tr>\r\n            <td>Hadoop Version</td>\r\n            <td>");
    // 185, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.util.VersionInfo.getVersion()), jamonWriter);
    // 185, 70
    jamonWriter.write(", revision=");
    // 185, 81
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.util.VersionInfo.getRevision()), jamonWriter);
    // 185, 135
    jamonWriter.write("</td>\r\n            <td>Hadoop version and revision</td>\r\n        </tr>\r\n        <tr>\r\n            <td>Hadoop Compiled</td>\r\n            <td>");
    // 190, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.util.VersionInfo.getDate()), jamonWriter);
    // 190, 67
    jamonWriter.write(", ");
    // 190, 69
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.util.VersionInfo.getUser()), jamonWriter);
    // 190, 119
    jamonWriter.write("</td>\r\n            <td>When Hadoop version was compiled and by whom</td>\r\n        </tr>\r\n        <tr>\r\n            <td>Hadoop Source Checksum</td>\r\n            <td>");
    // 195, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.hadoop.util.VersionInfo.getSrcChecksum()), jamonWriter);
    // 195, 74
    jamonWriter.write("</td>\r\n            <td>Hadoop source MD5 checksum</td>\r\n        </tr>\r\n        <tr>\r\n            <td>ZooKeeper Client Version</td>\r\n            <td>");
    // 200, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.zookeeper.Version.getVersion()), jamonWriter);
    // 200, 64
    jamonWriter.write(", revision=");
    // 200, 75
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.zookeeper.Version.getRevision()), jamonWriter);
    // 200, 123
    jamonWriter.write("</td>\r\n            <td>ZooKeeper client version and revision</td>\r\n        </tr>\r\n        <tr>\r\n            <td>ZooKeeper Client Compiled</td>\r\n            <td>");
    // 205, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(org.apache.zookeeper.Version.getBuildDate()), jamonWriter);
    // 205, 66
    jamonWriter.write("</td>\r\n            <td>When ZooKeeper client version was compiled</td>\r\n        </tr>\r\n        <tr>\r\n            <td>ZooKeeper Quorum</td>\r\n            <td>");
    // 211, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(formatZKString()), jamonWriter);
    // 211, 39
    jamonWriter.write("</td>\r\n            <td>Addresses of all registered ZK servers</td>\r\n        </tr>\r\n        <tr>\r\n            <td>Coprocessors</td>\r\n            <td>");
    // 216, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(java.util.Arrays.toString(regionServer.getRegionServerCoprocessors())), jamonWriter);
    // 216, 92
    jamonWriter.write("</td>\r\n            <td>Coprocessors currently loaded by this regionserver</td>\r\n        </tr>\r\n        <tr>\r\n            <td>RS Start Time</td>\r\n            <td>");
    // 221, 17
    org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(new Date(regionServer.getStartcode())), jamonWriter);
    // 221, 60
    jamonWriter.write("</td>\r\n            <td>Date stamp of when this region server was started</td>\r\n        </tr>\r\n        <tr>\r\n            <td>HBase Master</td>\r\n            <td>\r\n                ");
    // 227, 17
    if (masterServerName == null )
    {
      // 227, 49
      jamonWriter.write("\r\n                No master found\r\n                ");
    }
    // 229, 17
    else
    {
      // 229, 24
      jamonWriter.write("\r\n                ");
      // 230, 17
      
                String host = masterServerName.getHostname() + ":" + infoPort;
                String url = "//" + host + "/master-status";
                
      // 234, 17
      jamonWriter.write("<a href=\"");
      // 234, 26
      org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(url), jamonWriter);
      // 234, 35
      jamonWriter.write("\">");
      // 234, 37
      org.jamon.escaping.Escaping.NONE.write(org.jamon.emit.StandardEmitter.valueOf(host), jamonWriter);
      // 234, 47
      jamonWriter.write("</a>\r\n                ");
    }
    // 235, 23
    jamonWriter.write("\r\n            </td>\r\n            <td>Address of HBase Master</td>\r\n        </tr>\r\n    </table>\r\n    </section>\r\n    </div>\r\n</div>\r\n<script src=\"/static/js/jquery.min.js\" type=\"text/javascript\"></script>\r\n<script src=\"/static/js/jquery.tablesorter.min.js\" type=\"text/javascript\"></script>\r\n<script src=\"/static/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n<script src=\"/static/js/tab.js\" type=\"text/javascript\"></script>\r\n<script>\r\n$(document).ready(function()\r\n    {\r\n        $.tablesorter.addParser({\r\n            id: 'filesize',\r\n            is: function(s) {\r\n                return s.match(new RegExp( /([\\.0-9]+)\\ (B|KB|MB|GB|TB)/ ));\r\n            },\r\n            format: function(s) {\r\n                var suf = s.match(new RegExp( /(KB|B|GB|MB|TB)$/ ))[1];\r\n                var num = parseFloat(s.match( new RegExp( /([\\.0-9]+)\\ (B|KB|MB|GB|TB)/ ))[0]);\r\n                switch(suf) {\r\n                    case 'B':\r\n                        return num;\r\n                    case 'KB':\r\n                        return num * 1024;\r\n                    case 'MB':\r\n                        return num * 1024 * 1024;\r\n                    case 'GB':\r\n                        return num * 1024 * 1024 * 1024;\r\n                    case 'TB':\r\n                        return num * 1024 * 1024 * 1024 * 1024;\r\n                }\r\n            },\r\n            type: 'numeric'\r\n        });\r\n        $.tablesorter.addParser(\r\n        {\r\n            id: \"separator\",\r\n            is: function (s) {\r\n                return /^[0-9]?[0-9,]*$/.test(s);\r\n            },\r\n            format: function (s) {\r\n                return $.tablesorter.formatFloat( s.replace(/,/g,'') );\r\n            },\r\n            type: \"numeric\"\r\n        });\r\n\r\n        $(\"#baseStatsTable\").tablesorter();\r\n        $(\"#requestStatsTable\").tablesorter({\r\n            headers: {\r\n                1: {sorter: 'separator'},\r\n                2: {sorter: 'separator'},\r\n                3: {sorter: 'separator'}\r\n            }\r\n        });\r\n        $(\"#storeStatsTable\").tablesorter({\r\n            headers: {\r\n                1: {sorter: 'separator'},\r\n                2: {sorter: 'separator'},\r\n                3: {sorter: 'filesize'},\r\n                4: {sorter: 'filesize'},\r\n                5: {sorter: 'filesize'},\r\n                6: {sorter: 'filesize'}\r\n            }\r\n        });\r\n        $(\"#compactionStatsTable\").tablesorter({\r\n            headers: {\r\n                1: {sorter: 'separator'},\r\n                2: {sorter: 'separator'}\r\n            }\r\n        });\r\n        $(\"#memstoreStatsTable\").tablesorter({\r\n            headers: {\r\n                1: {sorter: 'filesize'}\r\n            }\r\n        });\r\n    }\r\n);\r\n</script>\r\n</body>\r\n</html>\r\n");
  }
  
  
}
