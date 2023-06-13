package com.redskyfilms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redskyfilms.model.Booking;
import com.redskyfilms.service.BookingService;

@Controller
@RequestMapping("api/booking")
public class BookingController {
    
    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking add_booking(Booking booking){
        return bookingService.add_booking(booking);
    }
}
