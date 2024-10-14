package com.example.helloworldprojectdocker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "hello_world")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorldEntity {
    @Id
    @EqualsAndHashCode.Include @GeneratedValue
    private UUID id;
    @Enumerated(EnumType.STRING)
    private Language language;
    @Column(name = "hello_message")
    private String helloMessage;
}
