package com.example.demo.repository;

import com.example.demo.domain.DemoObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DemoRepository extends JpaRepository<DemoObject, Long> {
    @Query("SELECT new com.example.demo.domain.DemoObject(o.name, o.owner, o.species, o.birthDate, o.deathDate) " +
            "FROM DemoObject o")
    List<DemoObject> getDemoObjects();
}
