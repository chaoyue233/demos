package chaoyue.zookeeper;

public class GlobalConstants {
    // zk服务器列表
    public static final String zkhosts = "192.168.10.201:2181";
    // 连接的超时时间
    public static final int sessionTimeout = 10000;

    public static final int connectionTimeout = 10000;
    // 服务在zk下的路径
    public static final String parentZnodePath = "/wx-foundation";
}
