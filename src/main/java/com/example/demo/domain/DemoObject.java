package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "pet")
@Getter @Setter
@NoArgsConstructor
public class DemoObject extends DemoSuperObject {
    private String name;
    private String owner;
    private String species;
    private Date birthDate;
    private Date deathDate;

    public DemoObject(String name, String owner, String species, Date birthDate, Date deathDate) {
        this.name = name;
        this.owner = owner;
        this.species = species;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    @Setter
    @Accessors
    public class DemoObjectBuilder {
        private String name;
        private String owner = null;
        private String species;
        private Date birthDate;
        private Date deathDate = null;

        public DemoObjectBuilder() { }

        public DemoObject buildDemoObject() {
            return new DemoObject(name, owner, species, birthDate, deathDate);
        }
    }
}
