package com.example.helloworldprojectdocker.repository;

import com.example.helloworldprojectdocker.entity.HelloWorldEntity;
import com.example.helloworldprojectdocker.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository extends JpaRepository<HelloWorldEntity, Integer> {
    // Fetch only the helloMessage based on the language
    @Query("SELECT h.helloMessage FROM HelloWorldEntity h WHERE h.language = :language")
    String findHelloMessageByLanguage(@Param("language") Language language);

}
