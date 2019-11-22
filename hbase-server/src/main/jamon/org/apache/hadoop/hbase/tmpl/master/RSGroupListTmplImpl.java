// Autogenerated Jamon implementation
// /root/apps/test/jamon-dist-2013.12.28/./jamon/org/apache/hadoop/hbase/tmpl/master/RSGroupListTmpl.jamon

package jamon.org.apache.hadoop.hbase.tmpl.master;

// 27, 5
import java.util.Collections;
// 28, 5
import java.util.List;
// 29, 5
import java.util.Map;
// 30, 5
import java.util.Set;
// 31, 5
import java.util.stream.Collectors;
// 32, 5
import org.apache.hadoop.hbase.master.HMaster;
// 33, 5
import org.apache.hadoop.hbase.RegionMetrics;
// 34, 5
import org.apache.hadoop.hbase.ServerMetrics;
// 35, 5
import org.apache.hadoop.hbase.Size;
// 36, 5
import org.apache.hadoop.hbase.RSGroupTableAccessor;
// 37, 5
import org.apache.hadoop.hbase.master.ServerManager;
// 38, 5
import org.apache.hadoop.hbase.net.Address;
// 39, 5
import org.apache.hadoop.hbase.rsgroup.RSGroupInfo;
// 40, 5
import org.apache.hadoop.util.StringUtils.TraditionalBinaryPrefix;

public class RSGroupListTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements jamon.org.apache.hadoop.hbase.tmpl.master.RSGroupListTmpl.Intf

{
  private final HMaster master;
  private final ServerManager serverManager;
  protected static jamon.org.apache.hadoop.hbase.tmpl.master.RSGroupListTmpl.ImplData __jamon_setOptionalArguments(jamon.org.apache.hadoop.hbase.tmpl.master.RSGroupListTmpl.ImplData p_implData)
  {
    return p_implData;
  }
  public RSGroupListTmplImpl(org.jamon.TemplateManager p_templateManager, jamon.org.apache.hadoop.hbase.tmpl.master.RSGroupListTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    master = p_implData.getMaster();
    serverManager = p_implData.getServerManager();
  }
  
  @Override public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 42, 1
    
List<RSGroupInfo> groups = RSGroupTableAccessor.getAllRSGroupInfo(master.getConnection());

    // 45, 1
    if ((groups != null && groups.size() > 0))
    {
      // 45, 45
      jamonWriter.write("\r\n\r\n");
      // 47, 1
      
RSGroupInfo [] rsGroupInfos = groups.toArray(new RSGroupInfo[groups.size()]);
Map<Address, ServerMetrics> collectServers = Collections.emptyMap();
if (master.getServerManager() != null) {
  collectServers =
      master.getServerManager().getOnlineServers().entrySet().stream()
          .collect(Collectors.toMap(p -> p.getKey().getAddress(), Map.Entry::getValue));
}

      // 57, 1
      jamonWriter.write("<div class=\"tabbable\">\r\n    <ul class=\"nav nav-pills\">\r\n        <li class=\"active\"><a href=\"#tab_rsgroup_baseStats\" data-toggle=\"tab\">Base Stats</a></li>\r\n        <li class=\"\"><a href=\"#tab_rsgroup_memoryStats\" data-toggle=\"tab\">Memory</a></li>\r\n        <li class=\"\"><a href=\"#tab_rsgroup_requestStats\" data-toggle=\"tab\">Requests</a></li>\r\n        <li class=\"\"><a href=\"#tab_rsgroup_storeStats\" data-toggle=\"tab\">Storefiles</a></li>\r\n        <li class=\"\"><a href=\"#tab_rsgroup_compactStats\" data-toggle=\"tab\">Compactions</a></li>\r\n    </ul>\r\n    <div class=\"tab-content\" style=\"padding-bottom: 9px; border-bottom: 1px solid #ddd;\">\r\n        <div class=\"tab-pane active\" id=\"tab_rsgroup_baseStats\">\r\n            ");
      // 67, 13
      {
        // 67, 13
        __jamon_innerUnit__rsgroup_baseStats(jamonWriter, rsGroupInfos, collectServers );
      }
      // 67, 97
      jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_rsgroup_memoryStats\">\r\n            ");
      // 70, 13
      {
        // 70, 13
        __jamon_innerUnit__rsgroup_memoryStats(jamonWriter, rsGroupInfos, collectServers );
      }
      // 70, 99
      jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_rsgroup_requestStats\">\r\n            ");
      // 73, 13
      {
        // 73, 13
        __jamon_innerUnit__rsgroup_requestStats(jamonWriter, rsGroupInfos, collectServers );
      }
      // 73, 100
      jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_rsgroup_storeStats\">\r\n            ");
      // 76, 13
      {
        // 76, 13
        __jamon_innerUnit__rsgroup_storeStats(jamonWriter, rsGroupInfos, collectServers );
      }
      // 76, 98
      jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_rsgroup_compactStats\">\r\n            ");
      // 79, 13
      {
        // 79, 13
        __jamon_innerUnit__rsgroup_compactStats(jamonWriter, rsGroupInfos, collectServers );
      }
      // 79, 100
      jamonWriter.write("\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n");
    }
    // 84, 7
    jamonWriter.write("\r\n\r\n");
  }
  
  
  // 387, 1
  private void __jamon_innerUnit__rsGroupLink(final java.io.Writer jamonWriter, final String rsGroupName)
    throws java.io.IOException
  {
    // 391, 5
    jamonWriter.write("<a href=rsgroup.jsp?name=");
    // 391, 30
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(rsGroupName), jamonWriter);
    // 391, 47
    jamonWriter.write(">");
    // 391, 48
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(rsGroupName), jamonWriter);
    // 391, 65
    jamonWriter.write("</a>\r\n");
  }
  
  
  // 86, 1
  private void __jamon_innerUnit__rsgroup_baseStats(final java.io.Writer jamonWriter, final RSGroupInfo[] rsGroupInfos, final Map<Address,ServerMetrics> collectServers)
    throws java.io.IOException
  {
    // 91, 1
    jamonWriter.write("<table class=\"table table-striped\">\r\n<tr>\r\n    <th>RSGroup Name</th>\r\n    <th>Num. Online Servers</th>\r\n    <th>Num. Dead Servers</th>\r\n    <th>Num. Tables</th>\r\n    <th>Requests Per Second</th>\r\n    <th>Num. Regions</th>\r\n    <th>Average Load</th>\r\n</tr>\r\n");
    // 101, 1
    
    int totalOnlineServers = 0;
    int totalDeadServers = 0;
    int totalTables = 0;
    int totalRequests = 0;
    int totalRegions = 0;
    for (RSGroupInfo rsGroupInfo: rsGroupInfos) {
      String rsGroupName = rsGroupInfo.getName();
      int onlineServers = 0;
      int deadServers = 0;
      int tables = 0;
      long requestsPerSecond = 0;
      int numRegionsOnline = 0;
      Set<Address> servers = rsGroupInfo.getServers();
      for (Address server : servers) {
        ServerMetrics sl = collectServers.get(server);
        if (sl != null) {
          requestsPerSecond += sl.getRequestCountPerSecond();
          numRegionsOnline += sl.getRegionMetrics().size();
          //rsgroup total
          totalRegions += sl.getRegionMetrics().size();
          totalRequests += sl.getRequestCountPerSecond();
          totalOnlineServers++;
          onlineServers++;
        } else {
          totalDeadServers++;
          deadServers++;
        }
      }
      tables = rsGroupInfo.getTables().size();
      totalTables += tables;
      double avgLoad = onlineServers == 0 ? 0 :
            (double)numRegionsOnline / (double)onlineServers;

    // 135, 1
    jamonWriter.write("<tr>\r\n    <td>");
    // 136, 9
    {
      // 136, 9
      __jamon_innerUnit__rsGroupLink(jamonWriter, rsGroupName);
    }
    // 136, 52
    jamonWriter.write("</td>\r\n    <td>");
    // 137, 9
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(onlineServers), jamonWriter);
    // 137, 28
    jamonWriter.write("</td>\r\n    <td>");
    // 138, 9
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(deadServers), jamonWriter);
    // 138, 26
    jamonWriter.write("</td>\r\n    <td>");
    // 139, 9
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(tables), jamonWriter);
    // 139, 21
    jamonWriter.write("</td>\r\n    <td>");
    // 140, 9
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(requestsPerSecond), jamonWriter);
    // 140, 32
    jamonWriter.write("</td>\r\n    <td>");
    // 141, 9
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(numRegionsOnline), jamonWriter);
    // 141, 31
    jamonWriter.write("</td>\r\n    <td>");
    // 142, 9
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(avgLoad), jamonWriter);
    // 142, 22
    jamonWriter.write("</td>\r\n</tr>\r\n");
    // 144, 1
    
}

    // 147, 1
    jamonWriter.write("<tr><td>Total:");
    // 147, 15
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(rsGroupInfos.length), jamonWriter);
    // 147, 40
    jamonWriter.write("</td>\r\n<td>");
    // 148, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(totalOnlineServers), jamonWriter);
    // 148, 29
    jamonWriter.write("</td>\r\n<td>");
    // 149, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(totalDeadServers), jamonWriter);
    // 149, 27
    jamonWriter.write("</td>\r\n<td>");
    // 150, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(totalTables), jamonWriter);
    // 150, 22
    jamonWriter.write("</td>\r\n<td>");
    // 151, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(totalRequests), jamonWriter);
    // 151, 24
    jamonWriter.write("</td>\r\n<td>");
    // 152, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(totalRegions), jamonWriter);
    // 152, 23
    jamonWriter.write("</td>\r\n<td>");
    // 153, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(master.getServerManager().getAverageLoad()), jamonWriter);
    // 153, 53
    jamonWriter.write("</td>\r\n</tr>\r\n</table>\r\n");
  }
  
  
  // 336, 1
  private void __jamon_innerUnit__rsgroup_compactStats(final java.io.Writer jamonWriter, final RSGroupInfo[] rsGroupInfos, final Map<Address,ServerMetrics> collectServers)
    throws java.io.IOException
  {
    // 341, 1
    jamonWriter.write("<table class=\"table table-striped\">\r\n<tr>\r\n    <th>RSGroup Name</th>\r\n    <th>Num. Compacting Cells</th>\r\n    <th>Num. Compacted Cells</th>\r\n    <th>Remaining Cells</th>\r\n    <th>Compaction Progress</th>\r\n</tr>\r\n");
    // 349, 1
    
    for (RSGroupInfo rsGroupInfo: rsGroupInfos) {
      String rsGroupName = rsGroupInfo.getName();
      int numStores = 0;
      long totalCompactingCells = 0;
      long totalCompactedCells = 0;
      long remainingCells = 0;
      long compactionProgress  = 0;
      for (Address server : rsGroupInfo.getServers()) {
        ServerMetrics sl = collectServers.get(server);
        if (sl != null) {
          for (RegionMetrics rl : sl.getRegionMetrics().values()) {
            totalCompactingCells += rl.getCompactingCellCount();
            totalCompactedCells += rl.getCompactedCellCount();
          }
        }
      }
      remainingCells = totalCompactingCells - totalCompactedCells;
      String percentDone = "";
      if  (totalCompactingCells > 0) {
           percentDone = String.format("%.2f", 100 *
              ((float) totalCompactedCells / totalCompactingCells)) + "%";
      }

    // 373, 1
    jamonWriter.write("<tr>\r\n<td>");
    // 374, 5
    {
      // 374, 5
      __jamon_innerUnit__rsGroupLink(jamonWriter, rsGroupName);
    }
    // 374, 48
    jamonWriter.write("</td>\r\n<td>");
    // 375, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(totalCompactingCells), jamonWriter);
    // 375, 31
    jamonWriter.write("</td>\r\n<td>");
    // 376, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(totalCompactedCells), jamonWriter);
    // 376, 30
    jamonWriter.write("</td>\r\n<td>");
    // 377, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(remainingCells), jamonWriter);
    // 377, 25
    jamonWriter.write("</td>\r\n<td>");
    // 378, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(percentDone), jamonWriter);
    // 378, 22
    jamonWriter.write("</td>\r\n</tr>\r\n");
    // 380, 1
    
}

    // 383, 1
    jamonWriter.write("</table>\r\n");
  }
  
  
  // 158, 1
  private void __jamon_innerUnit__rsgroup_memoryStats(final java.io.Writer jamonWriter, final RSGroupInfo[] rsGroupInfos, final Map<Address,ServerMetrics> collectServers)
    throws java.io.IOException
  {
    // 163, 1
    jamonWriter.write("<table class=\"table table-striped\">\r\n<tr>\r\n    <th>RSGroup Name</th>\r\n    <th>Used Heap</th>\r\n    <th>Max Heap</th>\r\n    <th>Memstore Size</th>\r\n\r\n</tr>\r\n");
    // 171, 1
    
    final String ZEROMB = "0 MB";
    String usedHeapStr = ZEROMB;
    String maxHeapStr = ZEROMB;
    String memstoreSizeStr = ZEROMB;
    for (RSGroupInfo rsGroupInfo: rsGroupInfos) {
      String rsGroupName = rsGroupInfo.getName();
      long usedHeap = 0;
      long maxHeap = 0;
      long memstoreSize = 0;
      for (Address server : rsGroupInfo.getServers()) {
        ServerMetrics sl = collectServers.get(server);
        if (sl != null) {
          usedHeap += (long) sl.getUsedHeapSize().get(Size.Unit.MEGABYTE);
          maxHeap += (long) sl.getMaxHeapSize().get(Size.Unit.MEGABYTE);
          memstoreSize += (long) sl.getRegionMetrics().values().stream().mapToDouble(
            rm -> rm.getMemStoreSize().get(Size.Unit.MEGABYTE)).sum();
        }
      }

      if (usedHeap > 0) {
        usedHeapStr = TraditionalBinaryPrefix.long2String(usedHeap
                                      * TraditionalBinaryPrefix.MEGA.value, "B", 1);
      }
      if (maxHeap > 0) {
        maxHeapStr = TraditionalBinaryPrefix.long2String(maxHeap
                                      * TraditionalBinaryPrefix.MEGA.value, "B", 1);
      }
      if (memstoreSize > 0) {
        memstoreSizeStr = TraditionalBinaryPrefix.long2String(memstoreSize
                                      * TraditionalBinaryPrefix.MEGA.value, "B", 1);
      }

    // 204, 1
    jamonWriter.write("<tr>\r\n    <td>");
    // 205, 9
    {
      // 205, 9
      __jamon_innerUnit__rsGroupLink(jamonWriter, rsGroupName);
    }
    // 205, 52
    jamonWriter.write("</td>\r\n    <td>");
    // 206, 9
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(usedHeapStr), jamonWriter);
    // 206, 26
    jamonWriter.write("</td>\r\n    <td>");
    // 207, 9
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(maxHeapStr), jamonWriter);
    // 207, 25
    jamonWriter.write("</td>\r\n    <td>");
    // 208, 9
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(memstoreSizeStr), jamonWriter);
    // 208, 30
    jamonWriter.write("</td>\r\n\r\n</tr>\r\n");
    // 211, 1
    
}

    // 214, 1
    jamonWriter.write("</table>\r\n");
  }
  
  
  // 217, 1
  private void __jamon_innerUnit__rsgroup_requestStats(final java.io.Writer jamonWriter, final RSGroupInfo[] rsGroupInfos, final Map<Address,ServerMetrics> collectServers)
    throws java.io.IOException
  {
    // 222, 1
    jamonWriter.write("<table class=\"table table-striped\">\r\n<tr>\r\n    <th>RSGroup Name</th>\r\n    <th>Request Per Second</th>\r\n    <th>Read Request Count</th>\r\n    <th>Write Request Count</th>\r\n</tr>\r\n");
    // 229, 1
    
    for (RSGroupInfo rsGroupInfo: rsGroupInfos) {
      String rsGroupName = rsGroupInfo.getName();
      long requestsPerSecond = 0;
      long readRequests = 0;
      long writeRequests = 0;
      for (Address server : rsGroupInfo.getServers()) {
        ServerMetrics sl = collectServers.get(server);
        if (sl != null) {
          for (RegionMetrics rm : sl.getRegionMetrics().values()) {
            readRequests += rm.getReadRequestCount();
            writeRequests += rm.getWriteRequestCount();
          }
          requestsPerSecond += sl.getRequestCountPerSecond();
        }
      }

    // 246, 1
    jamonWriter.write("<tr>\r\n<td>");
    // 247, 5
    {
      // 247, 5
      __jamon_innerUnit__rsGroupLink(jamonWriter, rsGroupName);
    }
    // 247, 48
    jamonWriter.write("</td>\r\n<td>");
    // 248, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(requestsPerSecond), jamonWriter);
    // 248, 28
    jamonWriter.write("</td>\r\n<td>");
    // 249, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(readRequests), jamonWriter);
    // 249, 23
    jamonWriter.write("</td>\r\n<td>");
    // 250, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(writeRequests), jamonWriter);
    // 250, 24
    jamonWriter.write("</td>\r\n</tr>\r\n");
    // 252, 1
    
}

    // 255, 1
    jamonWriter.write("</table>\r\n");
  }
  
  
  // 259, 1
  private void __jamon_innerUnit__rsgroup_storeStats(final java.io.Writer jamonWriter, final RSGroupInfo[] rsGroupInfos, final Map<Address,ServerMetrics> collectServers)
    throws java.io.IOException
  {
    // 264, 1
    jamonWriter.write("<table class=\"table table-striped\">\r\n<tr>\r\n    <th>RSGroup Name</th>\r\n    <th>Num. Stores</th>\r\n    <th>Num. Storefiles</th>\r\n    <th>Storefile Size Uncompressed</th>\r\n    <th>Storefile Size</th>\r\n    <th>Index Size</th>\r\n    <th>Bloom Size</th>\r\n</tr>\r\n");
    // 274, 1
    
    final String ZEROKB = "0 KB";
    final String ZEROMB = "0 MB";
    String uncompressedStorefileSizeStr = ZEROMB;
    String storefileSizeStr = ZEROMB;
    String indexSizeStr = ZEROKB;
    String bloomSizeStr = ZEROKB;
    for (RSGroupInfo rsGroupInfo: rsGroupInfos) {
      String rsGroupName = rsGroupInfo.getName();
      int numStores = 0;
      long numStorefiles = 0;
      long uncompressedStorefileSize  = 0;
      long storefileSize  = 0;
      long indexSize  = 0;
      long bloomSize  = 0;
      int count = 0;
      for (Address server : rsGroupInfo.getServers()) {
        ServerMetrics sl = collectServers.get(server);
        if (sl != null) {
          for (RegionMetrics rm : sl.getRegionMetrics().values()) {
            numStores += rm.getStoreCount();
            numStorefiles += rm.getStoreFileCount();
            uncompressedStorefileSize += rm.getUncompressedStoreFileSize().get(Size.Unit.MEGABYTE);
            storefileSize += rm.getStoreFileSize().get(Size.Unit.MEGABYTE);
            indexSize += rm.getStoreFileUncompressedDataIndexSize().get(Size.Unit.KILOBYTE);
            bloomSize += rm.getBloomFilterSize().get(Size.Unit.KILOBYTE);
          }
          count++;
        }
      }
       if (uncompressedStorefileSize > 0) {
          uncompressedStorefileSizeStr = TraditionalBinaryPrefix.
          long2String(uncompressedStorefileSize * TraditionalBinaryPrefix.MEGA.value, "B", 1);
       }
       if (storefileSize > 0) {
           storefileSizeStr = TraditionalBinaryPrefix.
           long2String(storefileSize * TraditionalBinaryPrefix.MEGA.value, "B", 1);
       }
       if (indexSize > 0) {
          indexSizeStr = TraditionalBinaryPrefix.
          long2String(indexSize * TraditionalBinaryPrefix.KILO.value, "B", 1);
       }
       if (bloomSize > 0) {
           bloomSizeStr = TraditionalBinaryPrefix.
           long2String(bloomSize * TraditionalBinaryPrefix.KILO.value, "B", 1);
       }

    // 321, 1
    jamonWriter.write("<tr>\r\n<td>");
    // 322, 5
    {
      // 322, 5
      __jamon_innerUnit__rsGroupLink(jamonWriter, rsGroupName);
    }
    // 322, 48
    jamonWriter.write("</td>\r\n<td>");
    // 323, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(numStores), jamonWriter);
    // 323, 20
    jamonWriter.write("</td>\r\n<td>");
    // 324, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(numStorefiles), jamonWriter);
    // 324, 24
    jamonWriter.write("</td>\r\n<td>");
    // 325, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(uncompressedStorefileSizeStr), jamonWriter);
    // 325, 39
    jamonWriter.write("</td>\r\n<td>");
    // 326, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(storefileSizeStr), jamonWriter);
    // 326, 27
    jamonWriter.write("</td>\r\n<td>");
    // 327, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(indexSizeStr), jamonWriter);
    // 327, 23
    jamonWriter.write("</td>\r\n<td>");
    // 328, 5
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(bloomSizeStr), jamonWriter);
    // 328, 23
    jamonWriter.write("</td>\r\n</tr>\r\n");
    // 330, 1
    
}

    // 333, 1
    jamonWriter.write("</table>\r\n");
  }
  
  
}
