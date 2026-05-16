package com.vmware.certification.practice.revision.module3.JPA.repositories;

import com.vmware.certification.practice.revision.module3.JPA.entity.JpaLearn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JpaDaoRepository extends JpaRepository<JpaLearn, Integer> {

    JpaLearn findFirst1ByNameContains(String name);
    JpaLearn findById(int id);

//    @Query(value = "insert into jpalearn (id, name, address) values (:id, :name, :address)")
//    void addRow(@Param("id") int id, @Param("name") String name, @Param("address") String address);
}
