package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private Long customerId;
    private String customerName;
    private Long productId;
    private Integer qty;
    private String address;
}
