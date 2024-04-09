package chrisferdev.beststore.models;

import jakarta.validation.constraints.NotEmpty;

public class ProductDto {
    @NotEmpty(message = "The name is required")
    private String name;
    
    @NotEmpty(message = "The brand is required")
    private String brand;

    @NotEmpty(message = "The name is required")
    
}
