package chaoyue.zookeeper;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

public class SubscribeDataChanges {
    private static class ZKDataListener implements IZkDataListener {

        public void handleDataChange(String dataPath, Object data) throws Exception {

            System.out.println("data change : " + dataPath + ":" + data.toString());
        }

        public void handleDataDeleted(String dataPath) throws Exception {

            System.out.println("data delete : " + dataPath);

        }


    }

    public static void main(String[] args) throws InterruptedException {
        //zk集群的地址
        String ZKServers = GlobalConstants.zkhosts;
        ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000, new SerializableSerializer());
        System.out.println("conneted ok!");
        zkClient.subscribeDataChanges(GlobalConstants.parentZnodePath, new ZKDataListener());
        Thread.sleep(Long.MAX_VALUE);
    }
}
