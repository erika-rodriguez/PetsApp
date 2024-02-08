package domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "order status"
})
@NoArgsConstructor

public enum OrderStatusEnumDTO {

    @JsonProperty("placed")
    PLACED,
    @JsonProperty("approved")
    APPROVED,
    @JsonProperty("delivered")
    DELIVERED;

}
