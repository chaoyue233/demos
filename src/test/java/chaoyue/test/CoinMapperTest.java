package chaoyue.test;

import chaoyue.mysql.Coin;
import chaoyue.mysql.CoinMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.List;
import java.util.UUID;

@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class CoinMapperTest extends AbstractSpringContextTest {

    @Autowired
    private CoinMapper coinMapper;

    @Test
    public void insertLargeCoin() {
        Long count = 1000000L;
        for (int i = 0; i < count; i++) {
            Coin coin = new Coin();
            coin.setCoinId(getUUID32());
            coin.setCouponId(getUUID32());
            coin.setDeviceId(getUUID32());
            coin.setCost(i / 10000);
            coin.setWeight(i / 100000);
            coinMapper.insertCoin(coin);
            if (i % 1000 == 0) {
                System.out.println("process percent " + i * 100.0 / count + " %");
            }

        }
    }

    @Test
    public void insertSingleCoin() {
        Coin coin = new Coin();
        coin.setCoinId(getUUID32());
        coin.setDeviceId(getUUID32());
        coin.setCost(0);
        coin.setWeight(0);
        coinMapper.insertCoin(coin);
    }

    @Test
    public void getCoinByDeviceTest() {
        String deviceId = "dd4158bbea6d49d9a3583d01b37283c7";
        List<Coin> coinList = coinMapper.getByDeviceId(deviceId);
        System.out.println(coinList);
    }

    private static String getUUID32() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
