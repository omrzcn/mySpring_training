package com.cydeo.entity;

import com.cydeo.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "payments")
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;


    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status status;


//    @OneToOne (cascade = CascadeType.ALL) // whenever we save a payment in DataGenerator, payment detail is gonna save automatically with help of cashcade
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE} ) // we dont want to put CascadeType.ALL, because of delete fucntion. companies doesnt want to use delete function
//    @JoinColumn(name = "payment_detail_id") // we dont have to write this. it coming automaticalliy
    private PaymentDetail paymentDetail;
    // OneToOne' i sadece parent'a koymak mantikli, child'a degil(payment Detail class) ama ornek olsun diye koyduk


    public Payment(LocalDate createdDate, BigDecimal amount, Status status) { // we craeted constructor without id
        this.createdDate = createdDate;
        this.amount = amount;
        this.status = status;
    }





}
