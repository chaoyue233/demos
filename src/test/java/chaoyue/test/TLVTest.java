package chaoyue.test;

import org.junit.Test;

public class TLVTest {

    @Test
    public void getValueTest() {
        String value = "test";
        String value_16 = str2HexStr(value);
        System.out.println(value_16);
        System.out.println(hexStr2Str(value_16));
        System.out.println(hexStr2Str("027C009F34"));
    }

    @Test
    public void getStrLength(){
        String str = "000003330101019F36022935500A50424F432044454249549F3704CC8DEE7A82027C009F34030000009F101307020103A00000010A010000017400116766E99F3303E0E1C0";
        System.out.println(str.length());
    }


    public static String str2HexStr(String str) {
        char[] chars = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bs = str.getBytes();
        int bit;
        for (int i = 0; i < bs.length; i++) {
            bit = (bs[i] & 0x0f0) >> 4;
            sb.append(chars[bit]);
            bit = bs[i] & 0x0f;
            sb.append(chars[bit]);
            // sb.append(' ');
        }
        return sb.toString().trim();
    }

    public static String hexStr2Str(String hexStr) {
        String str = "0123456789ABCDEF";
        char[] hexs = hexStr.toCharArray();
        byte[] bytes = new byte[hexStr.length() / 2];
        int n;
        for (int i = 0; i < bytes.length; i++) {
            n = str.indexOf(hexs[2 * i]) * 16;
            n += str.indexOf(hexs[2 * i + 1]);
            bytes[i] = (byte) (n & 0xff);
        }
        return new String(bytes);
    }
}
