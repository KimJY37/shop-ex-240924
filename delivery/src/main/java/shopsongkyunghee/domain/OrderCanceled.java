package shopsongkyunghee.domain;

import java.util.*;
import lombok.*;
import shopsongkyunghee.domain.*;
import shopsongkyunghee.infra.AbstractEvent;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productId;
    private String productName;
    private Integer amount;
    private Date orderDt;
    private String status;
    private Integer qty;
}
