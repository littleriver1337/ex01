package testStreams.model;

import testStreams.TestStreams01Application;

import javax.persistence.*;

/**
 * Created by Matt on 7/22/16.
 */
@Entity
@Table(name = "info")
public class Info {

    @Id
    @GeneratedValue
    @Column(name = "info", nullable = false)
    Integer id;
}
