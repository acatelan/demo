package com.example.demo.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED) @Getter @Setter
public abstract class DemoSuperObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
}
