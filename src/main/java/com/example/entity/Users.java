package com.example.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

/**
 * Author Yandong
 *
 * @Date 2025-09-15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "users")
public class Users {
    @Id
    private Long id;

    @Column(name="name" , nullable = false)
    private String name;
    private String email;
    private String password;
}
