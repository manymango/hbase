// Autogenerated Jamon implementation
// /root/apps/test/jamon-dist-2013.12.28/./jamon/org/apache/hadoop/hbase/tmpl/regionserver/BlockCacheTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 32, 1
import java.util.Map;
// 33, 1
import org.apache.hadoop.hbase.io.hfile.BlockCacheUtil.CachedBlocksByFile;
// 34, 1
import org.apache.hadoop.hbase.io.hfile.AgeSnapshot;
// 35, 1
import org.apache.hadoop.hbase.io.hfile.CachedBlock;
// 36, 1
import org.apache.hadoop.conf.Configuration;
// 37, 1
import org.apache.hadoop.hbase.io.hfile.CacheConfig;
// 38, 1
import org.apache.hadoop.hbase.io.hfile.BlockCache;
// 39, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketCacheStats;
// 40, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketCache;
// 41, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketAllocator;
// 42, 1
import org.apache.hadoop.hbase.io.hfile.bucket.BucketAllocator.Bucket;
// 43, 1
import org.apache.hadoop.util.StringUtils.TraditionalBinaryPrefix;

public class BlockCacheTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheTmpl.Intf

{
  private final CacheConfig cacheConfig;
  private final Configuration config;
  private final BlockCache bc;
  protected static org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheTmpl.ImplData __jamon_setOptionalArguments(org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheTmpl.ImplData p_implData)
  {
    return p_implData;
  }
  public BlockCacheTmplImpl(org.jamon.TemplateManager p_templateManager, org.apache.hadoop.hbase.tmpl.regionserver.BlockCacheTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    cacheConfig = p_implData.getCacheConfig();
    config = p_implData.getConfig();
    bc = p_implData.getBc();
  }
  
  @Override public void renderNoFlush(final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 25, 1
    
  String bcUrl = bc == null ? null : "http://hbase.apache.org/devapidocs/" + bc.getClass().getName().replaceAll("\\.", "/") + ".html";
  String bcName = bc == null ? null : bc.getClass().getSimpleName();
  BlockCache [] bcs = bc == null ? null : bc.getBlockCaches();
  boolean evictions = bcs != null && bcs.length > 1;

    // 45, 1
    jamonWriter.write("<div class=\"tabbable\">\r\n    <ul class=\"nav nav-pills\">\r\n        <li class=\"active\"><a href=\"#tab_bc_baseInfo\" data-toggle=\"tab\">Base Info</a></li>\r\n        <li class=\"\"><a href=\"#tab_bc_config\" data-toggle=\"tab\">Config</a></li>\r\n        <li class=\"\"><a href=\"#tab_bc_stats\" data-toggle=\"tab\">Stats</a></li>\r\n        <li class=\"\"><a href=\"#tab_bc_l1\" data-toggle=\"tab\">L1</a></li>\r\n        <li class=\"\"><a href=\"#tab_bc_l2\" data-toggle=\"tab\">L2</a></li>\r\n    </ul>\r\n    <div class=\"tab-content\" style=\"padding-bottom: 9px; border-bottom: 1px solid #ddd;\">\r\n        <div class=\"tab-pane active\" id=\"tab_bc_baseInfo\">\r\n            ");
    // 55, 13
    {
      // 55, 13
      __jamon_innerUnit__bc_baseInfo(jamonWriter, bc, bcUrl, bcName);
    }
    // 55, 73
    jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_bc_config\">\r\n            ");
    // 58, 13
    {
      // 58, 13
      __jamon_innerUnit__bc_config(jamonWriter, cacheConfig );
    }
    // 58, 55
    jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_bc_stats\">\r\n            ");
    // 61, 13
    {
      // 61, 13
      __jamon_innerUnit__bc_stats(jamonWriter, bc );
    }
    // 61, 36
    jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_bc_l1\">\r\n            ");
    // 64, 13
    {
      // 64, 13
      __jamon_innerUnit__bc_l(jamonWriter, bcs == null? bc: bcs[0], "L1", evictions);
    }
    // 64, 90
    jamonWriter.write("\r\n        </div>\r\n        <div class=\"tab-pane\" id=\"tab_bc_l2\">\r\n            ");
    // 67, 13
    {
      // 67, 13
      __jamon_innerUnit__bc_l(jamonWriter, bcs == null? null: bcs.length <= 1? null: bcs[1], "L2", evictions);
    }
    // 67, 115
    jamonWriter.write("\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n");
  }
  
  
  // 72, 1
  private void __jamon_innerUnit__bc_baseInfo(final java.io.Writer jamonWriter, final BlockCache bc, final String bcUrl, final String bcName)
    throws java.io.IOException
  {
    // 78, 1
    
  BlockCache [] bcs = bc == null? null: bc.getBlockCaches();
  String bcl1Url = null;
  String bcl1Name = null;
  String bcl2Url = null;
  String bcl2Name = null;
  if (bcs != null) {
    BlockCache bcl1 = bcs[0];
    if (bcl1 != null) {
      bcl1Url = "http://hbase.apache.org/devapidocs/" + bcl1.getClass().getName().replaceAll("\\.", "/") + ".html";
      bcl1Name = bcl1.getClass().getSimpleName();
    }
    if (bcs.length == 2) {
      BlockCache bcl2 = bcs[1];
      bcl2Url = "http://hbase.apache.org/devapidocs/" + bcl2.getClass().getName().replaceAll("\\.", "/") + ".html";
      bcl2Name = bcl2.getClass().getSimpleName();
    }
  }

    // 97, 1
    jamonWriter.write("<table class=\"table table-striped\">\r\n    <tr>\r\n        <th>Attribute</th>\r\n        <th>Value</th>\r\n        <th>Description</th>\r\n    </tr>\r\n    </tr>\r\n    <tr>\r\n        <td>Implementation</td>\r\n        <td><a href=\"");
    // 106, 22
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(bcUrl), jamonWriter);
    // 106, 33
    jamonWriter.write("\">");
    // 106, 35
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(bcName), jamonWriter);
    // 106, 47
    jamonWriter.write("</a></td>\r\n        <td>Block cache implementing class</td>\r\n    </tr>\r\n</table>\r\n<p>See <a href=\"http://hbase.apache.org/book.html#block.cache\">block cache</a> in the HBase Reference Guide for help.</p>\r\n");
  }
  
  
  // 113, 1
  private void __jamon_innerUnit__bc_config(final java.io.Writer jamonWriter, final CacheConfig cacheConfig)
    throws java.io.IOException
  {
    // 117, 1
    if (cacheConfig == null )
    {
      // 117, 28
      jamonWriter.write("\r\n<p>CacheConfig is null</p>\r\n");
    }
    // 119, 1
    else
    {
      // 119, 8
      jamonWriter.write("\r\n<table class=\"table table-striped\">\r\n    <tr>\r\n        <th>Attribute</th>\r\n        <th>Value</th>\r\n        <th>Description</th>\r\n    </tr>\r\n    <tr>\r\n        <td>Cache DATA on Read</td>\r\n        <td>");
      // 128, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(cacheConfig.shouldCacheDataOnRead()), jamonWriter);
      // 128, 54
      jamonWriter.write("</td>\r\n        <td>True if DATA blocks are cached on read\r\n        (INDEX & BLOOM blocks are always cached)</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Cache DATA on Write</td>\r\n        <td>");
      // 134, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(cacheConfig.shouldCacheDataOnWrite()), jamonWriter);
      // 134, 55
      jamonWriter.write("</td>\r\n        <td>True if DATA blocks are cached on write.</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Cache INDEX on Write</td>\r\n        <td>");
      // 139, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(cacheConfig.shouldCacheIndexesOnWrite()), jamonWriter);
      // 139, 58
      jamonWriter.write("</td>\r\n        <td>True if INDEX blocks are cached on write</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Cache BLOOM on Write</td>\r\n        <td>");
      // 144, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(cacheConfig.shouldCacheBloomsOnWrite()), jamonWriter);
      // 144, 57
      jamonWriter.write("</td>\r\n        <td>True if BLOOM blocks are cached on write</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Evict blocks on Close</td>\r\n        <td>");
      // 149, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(cacheConfig.shouldEvictOnClose()), jamonWriter);
      // 149, 51
      jamonWriter.write("</td>\r\n        <td>True if blocks are evicted from cache when an HFile\r\n        reader is closed</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Cache DATA in compressed format</td>\r\n        <td>");
      // 155, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(cacheConfig.shouldCacheDataCompressed()), jamonWriter);
      // 155, 58
      jamonWriter.write("</td>\r\n        <td>True if DATA blocks are cached in their compressed form</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Prefetch on Open</td>\r\n        <td>");
      // 160, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(cacheConfig.shouldPrefetchOnOpen()), jamonWriter);
      // 160, 53
      jamonWriter.write("</td>\r\n        <td>True if blocks are prefetched into cache on open</td>\r\n    </tr>\r\n</table>\r\n");
    }
    // 164, 7
    jamonWriter.write("\r\n");
  }
  
  
  // 262, 1
  private void __jamon_innerUnit__bc_l(final java.io.Writer jamonWriter, final BlockCache bc, final String name, final boolean evictions)
    throws java.io.IOException
  {
    // 268, 1
    if (bc == null )
    {
      // 268, 19
      jamonWriter.write("\r\n<p>No ");
      // 269, 7
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(name), jamonWriter);
      // 269, 17
      jamonWriter.write(" deployed</p>\r\n");
    }
    // 270, 1
    else
    {
      // 270, 8
      jamonWriter.write("\r\n");
      // 271, 1
      {
        // 271, 1
        __jamon_innerUnit__block_cache(jamonWriter, bc, name, evictions);
      }
      // 271, 65
      jamonWriter.write("\r\n");
    }
    // 272, 7
    jamonWriter.write("\r\n");
  }
  
  
  // 224, 1
  private void __jamon_innerUnit__bc_stats(final java.io.Writer jamonWriter, final BlockCache bc)
    throws java.io.IOException
  {
    // 228, 1
    if (bc == null )
    {
      // 228, 19
      jamonWriter.write("\r\n<p>BlockCache is null</p>\r\n");
    }
    // 230, 1
    else
    {
      // 230, 8
      jamonWriter.write("\r\n<table class=\"table table-striped\">\r\n    <tr>\r\n        <th>Attribute</th>\r\n        <th>Value</th>\r\n        <th>Description</th>\r\n    </tr>\r\n    <tr>\r\n        <td>Size</td>\r\n        <td>");
      // 239, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(bc.getCurrentSize(),
            "B", 1)), jamonWriter);
      // 240, 23
      jamonWriter.write("</td>\r\n        <td>Current size of block cache in use</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Free</td>\r\n        <td>");
      // 245, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(bc.getFreeSize(),
            "B", 1)), jamonWriter);
      // 246, 23
      jamonWriter.write("</td>\r\n        <td>The total free memory currently available to store more cache entries</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Count</td>\r\n        <td>");
      // 251, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", bc.getBlockCount())), jamonWriter);
      // 251, 59
      jamonWriter.write("</td>\r\n        <td>Number of blocks in block cache</td>\r\n    </tr>\r\n    ");
      // 254, 5
      {
        // 254, 5
        __jamon_innerUnit__evictions_tmpl(jamonWriter, bc);
      }
      // 254, 35
      jamonWriter.write("\r\n    ");
      // 255, 5
      {
        // 255, 5
        __jamon_innerUnit__hits_tmpl(jamonWriter, bc);
      }
      // 255, 30
      jamonWriter.write("\r\n</table>\r\n<p>If block cache is made up of more than one cache -- i.e. a L1 and a L2 -- then the above\r\nare combined counts. Request count is sum of hits and misses.</p>\r\n");
    }
    // 259, 7
    jamonWriter.write("\r\n");
  }
  
  
  // 275, 1
  private void __jamon_innerUnit__block_cache(final java.io.Writer jamonWriter, final BlockCache bc, final String name, final boolean evictions)
    throws java.io.IOException
  {
    // 281, 1
    
  String bcUrl = "http://hbase.apache.org/devapidocs/" + bc.getClass().getName().replaceAll("\\.", "/") + ".html";
  String bcName = bc.getClass().getSimpleName();
  org.apache.hadoop.hbase.io.hfile.BlockCacheUtil.CachedBlocksByFile cbsbf =
    org.apache.hadoop.hbase.io.hfile.BlockCacheUtil.getLoadedCachedBlocksByFile(config, bc);
  AgeSnapshot cbsbfSnapshot = cbsbf.getAgeInCacheSnapshot();

  boolean bucketCache = bc.getClass().getSimpleName().equals("BucketCache");
  BucketCacheStats bucketCacheStats = null;
  BucketAllocator bucketAllocator = null;

  if (bucketCache) {
    bucketCacheStats = (BucketCacheStats)bc.getStats();
    bucketAllocator = ((BucketCache)bc).getAllocator();
  }

    // 297, 1
    if (cbsbf.isFull() )
    {
      // 297, 23
      jamonWriter.write("\r\n<p>\r\n<div class=\"alert alert-danger\">\r\n<strong>The stats below are incomplete!</strong> We ran into our accounting limit of ");
      // 300, 86
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(cbsbf.getCount()), jamonWriter);
      // 300, 108
      jamonWriter.write(" blocks. Up the configuration <i>hbase.ui.blockcache.by.file.max</i>.\r\n</div>\r\n</p> \r\n");
    }
    // 303, 7
    jamonWriter.write("\r\n<table id=\"blocks_summary\" class=\"table table-striped\">\r\n    <tr>\r\n        <th>Attribute</th>\r\n        <th>Value</th>\r\n        <th>Description</th>\r\n    </tr>\r\n    <tr>\r\n        <td>Implementation</td>\r\n        <td><a href=\"");
    // 312, 22
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(bcUrl), jamonWriter);
    // 312, 33
    jamonWriter.write("\">");
    // 312, 35
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(bc.getClass().getSimpleName()), jamonWriter);
    // 312, 70
    jamonWriter.write("</a></td>\r\n        <td>Class implementing this block cache Level</td>\r\n    </tr>\r\n");
    // 315, 1
    if (bucketCache )
    {
      // 315, 20
      jamonWriter.write("\r\n    <tr>\r\n        <td>Implementation</td>\r\n        <td>");
      // 318, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(((BucketCache)bc).getIoEngine()), jamonWriter);
      // 318, 50
      jamonWriter.write("</a></td>\r\n        <td>IOEngine</td>\r\n    </tr>\r\n");
    }
    // 321, 7
    jamonWriter.write("\r\n    <tr>\r\n        <td>Cache Size Limit</td>\r\n        <td>");
    // 324, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(bc.getMaxSize(), "B", 1)), jamonWriter);
    // 324, 79
    jamonWriter.write("</td>\r\n        <td>Max size of cache</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Block Count</td>\r\n        <td>");
    // 329, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", bc.getBlockCount())), jamonWriter);
    // 329, 59
    jamonWriter.write("</td>\r\n        <td>Count of Blocks</td>\r\n    </tr>\r\n");
    // 332, 1
    if (!bucketCache )
    {
      // 332, 21
      jamonWriter.write("\r\n    <tr>\r\n        <td>Data Block Count</td>\r\n        <td>");
      // 335, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", bc.getDataBlockCount())), jamonWriter);
      // 335, 63
      jamonWriter.write("</td>\r\n        <td>Count of DATA Blocks</td>\r\n    </tr>\r\n");
    }
    // 338, 7
    jamonWriter.write("\r\n    <tr>\r\n        <td>Size of Blocks</td>\r\n        <td>");
    // 341, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(bc.getCurrentSize(), "B", 1)), jamonWriter);
    // 341, 83
    jamonWriter.write("</td>\r\n        <td>Size of Blocks</td>\r\n    </tr>\r\n");
    // 344, 1
    if (!bucketCache )
    {
      // 344, 21
      jamonWriter.write("\r\n    <tr>\r\n        <td>Size of Data Blocks</td>\r\n        <td>");
      // 347, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(TraditionalBinaryPrefix.long2String(bc.getCurrentDataSize(), "B", 1)), jamonWriter);
      // 347, 87
      jamonWriter.write("</td>\r\n        <td>Size of DATA Blocks</td>\r\n    </tr>\r\n");
    }
    // 350, 7
    jamonWriter.write(" \r\n");
    // 351, 1
    {
      // 351, 1
      __jamon_innerUnit__evictions_tmpl(jamonWriter, bc);
    }
    // 351, 31
    jamonWriter.write("\r\n");
    // 352, 1
    {
      // 352, 1
      __jamon_innerUnit__hits_tmpl(jamonWriter, bc);
    }
    // 352, 26
    jamonWriter.write("\r\n\r\n");
    // 354, 1
    if (bucketCache )
    {
      // 354, 20
      jamonWriter.write("\r\n    <tr>\r\n        <td>Hits per Second</td>\r\n        <td>");
      // 357, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(bucketCacheStats.getIOHitsPerSecond()), jamonWriter);
      // 357, 56
      jamonWriter.write("</td>\r\n        <td>Block gets against this cache per second</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Time per Hit</td>\r\n        <td>");
      // 362, 13
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(bucketCacheStats.getIOTimePerHit()), jamonWriter);
      // 362, 53
      jamonWriter.write("</td>\r\n        <td>Time per cache hit</td>\r\n    </tr>\r\n");
    }
    // 365, 7
    jamonWriter.write("\r\n</table>\r\n<p>View block cache <a href=\"?format=json&bcn=");
    // 368, 47
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(name), jamonWriter);
    // 368, 57
    jamonWriter.write("\">as JSON</a> | Block cache <a href=\"?format=json&bcn=");
    // 368, 111
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(name), jamonWriter);
    // 368, 121
    jamonWriter.write("&bcv=file\">as JSON by file</a></p>\r\n");
    // 369, 1
    
cbsbf = null;

  }
  
  
  // 167, 1
  private void __jamon_innerUnit__evictions_tmpl(final java.io.Writer jamonWriter, final BlockCache bc)
    throws java.io.IOException
  {
    // 171, 1
    
  AgeSnapshot ageAtEvictionSnapshot = bc.getStats().getAgeAtEvictionSnapshot();
  // Only show if non-zero mean and stddev as is the case in combinedblockcache

    // 175, 5
    jamonWriter.write("<tr>\r\n        <td>Evicted</td>\r\n        <td>");
    // 177, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", bc.getStats().getEvictedCount())), jamonWriter);
    // 177, 72
    jamonWriter.write("</td>\r\n        <td>The total number of blocks evicted</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Evictions</td>\r\n        <td>");
    // 182, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", bc.getStats().getEvictionCount())), jamonWriter);
    // 182, 73
    jamonWriter.write("</td>\r\n        <td>The total number of times an eviction has occurred</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Mean</td>\r\n        <td>");
    // 187, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", (long)ageAtEvictionSnapshot.getMean())), jamonWriter);
    // 187, 78
    jamonWriter.write("</td>\r\n        <td>Mean age of Blocks at eviction time (seconds)</td>\r\n    </tr>\r\n");
  }
  
  
  // 192, 1
  private void __jamon_innerUnit__hits_tmpl(final java.io.Writer jamonWriter, final BlockCache bc)
    throws java.io.IOException
  {
    // 196, 5
    jamonWriter.write("<tr>\r\n        <td>Hits</td>\r\n        <td>");
    // 198, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", bc.getStats().getHitCount())), jamonWriter);
    // 198, 68
    jamonWriter.write("</td>\r\n        <td>Number requests that were cache hits</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Hits Caching</td>\r\n        <td>");
    // 203, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", bc.getStats().getHitCachingCount())), jamonWriter);
    // 203, 75
    jamonWriter.write("</td>\r\n        <td>Cache hit block requests but only requests set to cache block if a miss</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Misses</td>\r\n        <td>");
    // 208, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", bc.getStats().getMissCount())), jamonWriter);
    // 208, 69
    jamonWriter.write("</td>\r\n        <td>Block requests that were cache misses but set to cache missed blocks</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Misses Caching</td>\r\n        <td>");
    // 213, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,d", bc.getStats().getMissCount())), jamonWriter);
    // 213, 69
    jamonWriter.write("</td>\r\n        <td>Block requests that were cache misses but only requests set to use block cache</td>\r\n    </tr>\r\n    <tr>\r\n        <td>Hit Ratio</td>\r\n        <td>");
    // 218, 13
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(String.format("%,.2f", bc.getStats().getHitRatio() * 100)), jamonWriter);
    // 218, 76
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf("%"), jamonWriter);
    // 218, 85
    jamonWriter.write("</td>\r\n        <td>Hit Count divided by total requests count</td>\r\n    </tr>\r\n\r\n");
  }
  
  
}