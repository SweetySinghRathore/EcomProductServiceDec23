package dev.sweety.EcomProductServiceDec23.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "ECOM_CATEGORY")
public class Category extends BaseModel {
    private String name;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;
}
