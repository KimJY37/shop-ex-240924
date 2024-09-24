package shopsongkyunghee.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shopsongkyunghee.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userName;
    private String productName;
    private String userId;
    private String productId;
    private Integer amount;
    private Date orderDt;
    private String status;
    private Integer qty;
    private String address;
}
