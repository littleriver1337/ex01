package testStreams.model;

import testStreams.TestStreams01Application;

import javax.persistence.*;

/**
 * Created by Matt on 7/22/16.
 */
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "productid")
    Integer productid;
}
