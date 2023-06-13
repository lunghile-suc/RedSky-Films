package com.redskyfilms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redskyfilms.model.Booking;
import com.redskyfilms.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
    
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking add_booking(Booking booking) {
        return bookingRepository.save(booking);
    }
}
