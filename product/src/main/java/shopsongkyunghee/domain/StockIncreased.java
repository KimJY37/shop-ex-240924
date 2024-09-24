package shopsongkyunghee.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopsongkyunghee.domain.*;
import shopsongkyunghee.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer stock;
    private String productName;
    private String imageUrl;
    private Date registerDt;
    private String status;

    public StockIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
