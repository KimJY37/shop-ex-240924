package shopsongkyunghee.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopsongkyunghee.domain.*;
import shopsongkyunghee.infra.AbstractEvent;

//<<< DDD / Domain Event
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

    public OrderCanceled(Order aggregate) {
        super(aggregate);
    }

    public OrderCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
