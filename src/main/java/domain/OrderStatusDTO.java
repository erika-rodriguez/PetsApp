package domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({
        "status",
        "order status"
})
public class OrderStatusDTO {
    @JsonProperty("status")
    private String status;
    @JsonProperty("order status")
    private Enum<OrderStatusEnumDTO> orderStatusEnumDTOEnum;
}
