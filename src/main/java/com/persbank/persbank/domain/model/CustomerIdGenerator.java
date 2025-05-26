package com.persbank.persbank.domain.model;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomerIdGenerator implements IdentifierGenerator {
    private static final AtomicInteger counter = new AtomicInteger(1);

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "PSEB";
        String numberFormat = "%05d";
        return prefix + String.format(numberFormat, counter.getAndIncrement());
    }
}
