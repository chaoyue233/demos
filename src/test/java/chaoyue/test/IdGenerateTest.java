package chaoyue.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IdGenerateTest {

    /**
     * 尝试下根据timeStamp + 渠道 + 随机数来生成ID
     */
    @Test
    public void getIDTest() {
        String timestamp = String.valueOf(System.currentTimeMillis());
        System.out.println(timestamp);
        char channel = '6';
        Random random = new Random();
        char[] timeArr = timestamp.toCharArray();
        List<Character> idList = new ArrayList<>();

        idList.add(channel);
        for (int i = 0; i < timeArr.length; i++) {
            idList.add(timeArr[i]);
            if (i == 0 || i == 2 || i == 4 || i == 8) {
                String num = String.valueOf(random.nextInt(10));
                idList.add(num.toCharArray()[0]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : idList) {
            stringBuilder.append(character);
        }
        System.out.println(stringBuilder.toString());
    }

    @Test
    public void test1() {
        String s1 = new String("test");
        String s2 = new String("test");
        String s3 = s1.intern();
        String s4 = "test";
        System.out.println(s1 == s2);
        System.out.println(s1.intern() == s3);
        System.out.println(s1.intern() == s4);
    }
}
