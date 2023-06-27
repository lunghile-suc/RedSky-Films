package com.redskyfilms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redskyfilms.model.Booking;
import com.redskyfilms.service.BookingService;

@Controller
@RequestMapping("/api/")
public class BookingController {
    
    @Autowired
    private BookingService bookingService;

    @PostMapping("/booking")
    public Booking add_booking(@RequestBody Booking booking){
        return bookingService.add_booking(booking);
    }

    @GetMapping("/booking/{id}")
    public Optional<Booking> get_booking(@PathVariable Long id){
        return bookingService.get_booking(id);
    }
}
