package com.redskyfilms.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long booking_id;

    private Long user_id;
    private Long movie_id;
    private Long seat_id;
    private int row_no;

    @CreationTimestamp
    private LocalDateTime booking_date;

    private String booking_code;
}
