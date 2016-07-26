package testStreams.persistence.model;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

import javax.persistence.*;

/**
 * Created by Matt on 7/22/16.
 */
@Entity
@Table(name = "product")
@JsonApiResource(type = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid", nullable = false)
    @JsonApiId
    private int productid;

    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "value", nullable = false)
    private float value;

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
