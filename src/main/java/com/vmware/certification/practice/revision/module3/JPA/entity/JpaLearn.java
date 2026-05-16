package com.vmware.certification.practice.revision.module3.JPA.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class JpaLearn {
    @Id
    @GeneratedValue
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    @Column(nullable = false)
    private String name;

    @JsonProperty("address")
    @Column(nullable = false)
    private String address;
}
