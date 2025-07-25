package operator.com.operator.models.dto;

import java.util.UUID;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ShipmentsDto {

    @NotBlank(message = "It's required") 
    @Size(min = 2, max = 100)
    private String id;

    @NotBlank(message = "It's required")
    @Size(min = 2, max = 50)
    private String product;

    @NotBlank(message = "It's required")
    @Size(min = 2, max = 50)
    private String color;

    @NotBlank(message = "It's required")
    @Size(min = 2, max = 50)
    private String category;

    @NotBlank(message = "It's required")
    @Min(0)
    private Integer total;

    @NotBlank(message = "It's required")
    @Size(min = 2, max = 50)
    private String name;

    @NotBlank(message = "It's required")
    @Size(min = 2, max = 50)
    private String address;

    @NotBlank(message = "It's required")
    @Min(0)
    private Double discount;

    @NotBlank(message = "It's required")
    @Min(0)
    private Double payment;
}
