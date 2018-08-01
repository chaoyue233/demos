package chaoyue.mysql;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoinMapper {
    int insertCoin(Coin coin);

    List<Coin> getByDeviceId(@Param("deviceId") String deviceId);
}
