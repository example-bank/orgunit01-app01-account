package com.example.bank.account.domain.model.common;

import java.util.Date;

public interface DomainEvent {

    public int getEventVersion();

    public Date getOccurredOn();

    public String getEventType();
}