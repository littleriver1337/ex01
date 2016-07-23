package testStreams.persistence.model;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

import javax.persistence.*;

/**
 * Created by Matt on 7/22/16.
 */
@Entity
@Table(name = "info")
@JsonApiResource(type = "info")
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "info", nullable = false)
    @JsonApiId
    Integer id;
}
