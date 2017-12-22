import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by chaoyue on 2017/7/20.
 */
public class Main {
  public static void main(String[] args) throws IOException {
    InputStream in = new URL( "http://ldb.dev.mjmobi.com/wxa" ).openStream();
    try {
      System.out.println( IOUtils.toString( in ) );
      System.out.println("真 TM 是太无聊了" );
    } finally {
      IOUtils.closeQuietly( in );
    }
  }
}
