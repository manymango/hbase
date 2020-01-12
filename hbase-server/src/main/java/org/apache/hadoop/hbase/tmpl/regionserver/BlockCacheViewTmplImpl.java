// Autogenerated Jamon implementation
// /root/apps/test/jamon-dist-2013.12.28/./jamon/org/apache/hadoop/hbase/tmpl/regionserver/BlockCacheViewTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 29, 1
import java.util.*;
// 30, 1
import org.apache.hadoop.conf.Configuration;
// 31, 1
import org.apache.hadoop.hbase.io.hfile.BlockCacheUtil.CachedBlocksByFile;
// 32, 1
import org.apache.hadoop.hbase.io.hfile.BlockCacheUtil;
// 33, 1
import org.apache.hadoop.hbase.io.hfile.CachedBlock;
// 34, 1
import org.apache.hadoop.hbase.io.hfile.CacheConfig;
// 35, 1
import org.apache.hadoop.hbase.io.hfile.BlockCache;
// 36, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketCacheStats;
// 37, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketCache;
// 38, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketAllocator;
// 39, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketAllocator.Bucket;
// 40, 1
import org.apache.hadoop.util.StringUtils;

public class BlockCacheViewTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl.Intf

{
  private final CacheConfig cacheConfig;
  private final Configuration conf;
  private final String bcn;
  private final String bcv;
  private final BlockCache blockCache;
  protected static org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl.ImplData __jamon_setOptionalArguments(org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl.ImplData p_implData)
  {
    return p_implData;
  }
  public BlockCacheViewTmplImpl(org.jamon.TemplateManager p_templateManager, org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheViewTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    cacheConfig = p_implData.getCacheConfig();
    conf = p_implData.getConf();
    bcn = p_implData.getBcn();
    bcv = p_implData.getBcv();
    blockCache = p_implData.getBlockCache();
  }
  
  @Override public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 42, 1
    
  BlockCache bc = blockCache;
  BlockCache [] bcs = bc == null ? null : bc.getBlockCaches();
  if (bcn.equals("L1")) {
    bc = bcs == null || bcs.length == 0? bc: bcs[0];
  } else {
    if (bcs == null || bcs.length < 2) {
      System.out.println("There is no L2 block cache");
      return;
    }
    bc = bcs[1];
  }
  if (bc == null) {
    System.out.println("There is no block cache");
    return;
  }
  CachedBlocksByFile cbsbf = BlockCacheUtil.getLoadedCachedBlocksByFile(conf, bc);

    // 60, 1
    if (bcv.equals("file") )
    {
      // 60, 27
      {
        // 60, 27
        __jamon_innerUnit__bc_by_file(jamonWriter, cbsbf);
      }
    }
    // 60, 59
    else
    {
      // 60, 66
      jamonWriter.write("[ ");
      // 60, 68
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(BlockCacheUtil.toJSON(bc)), jamonWriter);
      // 60, 99
      jamonWriter.write(", ");
      // 60, 101
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(BlockCacheUtil.toJSON(cbsbf)), jamonWriter);
      // 60, 135
      jamonWriter.write(" ]");
    }
    // 60, 143
    jamonWriter.write("\r\n");
    // 61, 1
    
cbsbf = null;

  }
  
  
  // 65, 1
  private void __jamon_innerUnit__bc_by_file(final java.io.Writer jamonWriter, final CachedBlocksByFile cbsbf)
    throws java.io.IOException
  {
    // 69, 1
    jamonWriter.write("[");
    // 69, 2
    for (Map.Entry<String, NavigableSet<CachedBlock>> e: cbsbf.getCachedBlockStatsByFile().entrySet() )
    {
      // 69, 103
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(BlockCacheUtil.toJSON(e.getKey(), e.getValue())), jamonWriter);
    }
    // 69, 163
    jamonWriter.write("]\r\n");
  }
  
  
}