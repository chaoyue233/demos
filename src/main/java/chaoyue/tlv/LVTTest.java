package chaoyue.tlv;

public class LVTTest {
    public static void main(String[] args) {
        //测试数据
        String data = "950500000008004F08A0000003330101019F36022935500A50424F432044454249549F3704CC8DEE7A82027C009F34030000009F101307020103A00000010A010000017400116766E99F3303E0E1C0";

        TLVTools tlvTools = new TLVTools();
        TLV tlv;
        tlvTools.unpack(data);

        for (int i = 0; i < tlvTools.tlvList.size(); i++) {
            tlv = tlvTools.tlvList.get(i);
            System.out.print("   标签:[" + i + "]" + "\n");
            System.out.print("  tag:" + tlv.getTag() + "\n");
            System.out.print("  len:" + tlv.getLen() + "\n");
            System.out.print("value:" + tlvTools.bytesToHex(tlv.getValue()) + "\n");
        }
    }
}
