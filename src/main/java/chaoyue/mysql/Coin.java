package chaoyue.mysql;

import lombok.Data;

@Data
public class Coin {
    private Long id;
    private String coinId;
    private String deviceId;
    private String couponId;
    private Integer cost;
    private Integer weight;
}
