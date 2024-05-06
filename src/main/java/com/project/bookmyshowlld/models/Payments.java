package com.project.bookmyshowlld.models;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Payments extends BaseModel{

    String referenceNo;

    @Enumerated(EnumType.ORDINAL)
    PaymentStatus paymentStatus;

    @Enumerated(EnumType.ORDINAL)
    PaymentMode paymentMode;

    double amount;

    @Enumerated(EnumType.ORDINAL)
    PaymentProvider paymentProvider;
}
