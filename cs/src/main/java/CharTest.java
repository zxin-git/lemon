import org.apache.commons.codec.binary.Hex;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * @author zxin
 */
public class CharTest {

    public static void main(String[] args) {
        String s = "中";
        char c = '中';
        System.out.println(Hex.encodeHexString(s.getBytes(Charset.forName("UTF-8"))));
        System.out.println(Hex.encodeHexString(s.getBytes(Charset.forName("UTF-16"))));
        System.out.println(Hex.encodeHexString(s.getBytes(Charset.forName("UTF-32"))));
        System.out.println(Hex.encodeHexString(s.getBytes(Charset.forName("GBK"))));
        System.out.println(Hex.encodeHexString(s.getBytes(Charset.forName("US-ASCII"))));
        System.out.println(Hex.encodeHexString(charToByte(c)));

    }

    public static byte[] charToByte(char c) {
        byte[] b = new byte[2];
        b[0] = (byte) ((c & 0xFF00) >> 8);
        b[1] = (byte) (c & 0xFF);
        return b;
    }
}
