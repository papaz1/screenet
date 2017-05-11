package se.screenet.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resource {

    @Id
    @GeneratedValue
    private long id;
}
