package shopsongkyunghee.domain;

import java.util.*;
import lombok.*;
import shopsongkyunghee.domain.*;
import shopsongkyunghee.infra.AbstractEvent;

@Data
@ToString
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
