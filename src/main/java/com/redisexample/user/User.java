package com.redisexample.user;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class User {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private Integer score;

}
