package shopsongkyunghee.domain;

import java.util.*;
import lombok.*;
import shopsongkyunghee.domain.*;
import shopsongkyunghee.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
    private Integer amount;
    private Date deliveryDt;
    private String status;
}
