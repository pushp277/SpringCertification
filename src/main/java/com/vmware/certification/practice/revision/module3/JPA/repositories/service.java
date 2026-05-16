package com.vmware.certification.practice.revision.module3.JPA.repositories;

import com.vmware.certification.practice.revision.module3.JPA.entity.JpaLearn;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class service {
    private final JpaDaoRepository jpaDaoRepository;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void addUser(int id, String name, String address){
        JpaLearn jpaLearn = new JpaLearn();
        jpaLearn.setAddress("Mizonokuchi");
        jpaLearn.setName("Raju");
        jpaDaoRepository.save(jpaLearn);
        System.out.println(jpaDaoRepository.findFirst1ByNameContains("aj"));
    }

    public JpaLearn findById(int id){
        return jpaDaoRepository.findById(id);
    }

    public JpaLearn findByContains(){
        return jpaDaoRepository.findFirst1ByNameContains("u");
    }
}
