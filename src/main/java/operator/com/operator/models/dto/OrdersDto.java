package operator.com.operator.models.dto;

import java.util.UUID;

import jakarta.validation.constraints.Email;
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
public class OrdersDto {

    private String id;

    @NotBlank(message = "It's required")
    @Size(min=3, max = 50)
    private String product;

    @NotBlank(message = "It's required")
    @Size(min = 2, max = 50)
    private String color;

    @NotBlank(message = "It's required")
    @Size(min = 3, max = 50)
    private String category;

    @NotBlank(message = "It's required")
    @Min(0)
    private Double price;

    @NotBlank(message = "It's required")
    @Size(min = 3, max = 50)
    private String manufacturer;

    @NotBlank(message = "It's required")
    @Min(0)
    private Integer total;

    @NotBlank(message = "It's required")
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank(message = "It's required")
    @Email(message = "Email is not valid")
    private String email; 

    @NotBlank(message = "It's required")
    @Size(min = 3, max = 50)
    private String tel;
}
