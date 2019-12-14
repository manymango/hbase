package org.apache.hadoop.hbase;

import org.apache.yetus.audience.InterfaceAudience;

/**
 * @author manymango
 * @time 2019/12/14 15:39
 * @description
 */
@InterfaceAudience.Private
@edu.umd.cs.findbugs.annotations.SuppressWarnings(value="DM_STRING_CTOR",
        justification="Intentional; to be modified in test")
public class Version {
    public static final String version = new String("2.2.2");
    public static final String revision = "e6513a76c91cceda95dad7af246ac81d46fa2589";
    public static final String user = "hbase-rm";
    public static final String date = "Sun Oct 20 04:42:28 UTC 2019";
    public static final String url = "git://8c0c609853ea/opt/hbase-rm/output/hbase";
    public static final String srcChecksum = "4d23f97701e395c5d34db1882ac5021b";
}