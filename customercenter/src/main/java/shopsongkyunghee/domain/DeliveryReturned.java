package shopsongkyunghee.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shopsongkyunghee.infra.AbstractEvent;

@Data
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
