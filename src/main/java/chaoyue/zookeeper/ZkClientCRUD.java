package chaoyue.zookeeper;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;

public class ZkClientCRUD {
    private ZkClient zkClient;


    // create Session
    private void createSession() {
        //zk集群的地址
        zkClient = new ZkClient(GlobalConstants.zkhosts, GlobalConstants.sessionTimeout, GlobalConstants.connectionTimeout, new SerializableSerializer());
        System.out.println("conneted ok!");
    }

    private void createNode(String serverAddress) {
        String path = zkClient.create(GlobalConstants.parentZnodePath, serverAddress, CreateMode.PERSISTENT);
        System.out.println(path);
    }

    private void getData() {
        String serverAddress = zkClient.readData(GlobalConstants.parentZnodePath, null);
        System.out.println(serverAddress);
    }

    private void writeData() {
        zkClient.writeData(GlobalConstants.parentZnodePath, "test2");
    }

    private void delelteData(){
        zkClient.delete(GlobalConstants.parentZnodePath);
    }

    public static void main(String[] args) {
        ZkClientCRUD zk = new ZkClientCRUD();
        zk.createSession();
        zk.writeData();
        zk.getData();
    }
}

