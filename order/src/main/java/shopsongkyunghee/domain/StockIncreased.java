package shopsongkyunghee.domain;

import java.util.*;
import lombok.*;
import shopsongkyunghee.domain.*;
import shopsongkyunghee.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer stock;
    private String productName;
    private String imageUrl;
    private Date registerDt;
    private String status;
}
