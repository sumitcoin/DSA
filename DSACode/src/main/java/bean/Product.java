package bean;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private Integer id;
    private String name;
    private Double price;

}
