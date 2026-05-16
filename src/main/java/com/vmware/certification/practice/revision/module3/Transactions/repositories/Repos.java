package com.vmware.certification.practice.revision.module3.Transactions.repositories;

import com.vmware.certification.practice.revision.module3.Transactions.models.Learn;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Repos {

    @Transactional
    public Learn updateAndGet(){

    }
}
