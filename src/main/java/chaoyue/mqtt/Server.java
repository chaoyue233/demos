package chaoyue.mqtt;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class Server {

    public static final String HOST = "tcp://chaoyue.test.com:61613";
    public static final String TOPIC = "chaoyue_test_topic";
    private static final String clientid = "chaoyue_server";

    private MqttClient client;
    private MqttTopic topic;
    private MqttTopic topic125;
    private String userName = "admin";
    private String passWord = "rongyi";

    private MqttMessage message;

    public Server() throws MqttException {
        // MemoryPersistence设置clientid的保存形式，默认为以内存保存
        client = new MqttClient(HOST, clientid, new MemoryPersistence());
        connect();
    }

    private void connect() {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(false);
        options.setUserName(userName);
        options.setPassword(passWord.toCharArray());
        // 设置超时时间
        options.setConnectionTimeout(10);
        // 设置会话心跳时间
        options.setKeepAliveInterval(20);
        try {
            client.setCallback(new PushCallback());
            client.connect(options);
            topic = client.getTopic(TOPIC);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void publish(MqttTopic topic, MqttMessage message) throws MqttPersistenceException,
            MqttException {
        MqttDeliveryToken token = topic.publish(message);
        token.waitForCompletion();
        System.out.println("message is published completely! "
                + token.isComplete());
    }

    public static void main(String[] args) throws MqttException, InterruptedException {

        Server server = new Server();
        server.message = new MqttMessage();
        server.message.setQos(2);
        server.message.setRetained(true);
        for (int i = 0; i < 5; i++) {
            String message = "chaoyue_test_message_body " + i;
            server.message.setPayload(message.getBytes());
            server.publish(server.topic, server.message);
            System.out.println(server.message.isRetained() + "------ratained状态");
            Thread.sleep(1000L);
        }
        // 强制退出 不然tcp链接会一直挂起
        System.exit(0);

    }

}
