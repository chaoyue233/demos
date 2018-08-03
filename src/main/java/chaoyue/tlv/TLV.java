package chaoyue.tlv;

public class TLV {
    private int tag;//tag定义成数字是为了方便遍历使用
    private int len;
    private byte[] value;

    public int getTag() {
        return tag;
    }
    public void setTag(int tag) {
        this.tag = tag;
    }
    public int getLen() {
        return len;
    }
    public void setLen(int len) {
        this.len = len;
    }
    public byte[] getValue() {
        return value;
    }
    public void setValue(byte[] value) {
        this.value = value;
    }
}
