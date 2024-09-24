package shopsongkyunghee.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shopsongkyunghee.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
}
