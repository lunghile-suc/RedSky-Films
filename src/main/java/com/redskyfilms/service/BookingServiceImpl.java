package com.redskyfilms.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redskyfilms.exceptions.BookingNotFound;
import com.redskyfilms.model.Booking;
import com.redskyfilms.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
    
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking add_booking(Booking booking) {

        final int generated_code_length = 3;

        String code = "RDSBK";

        Random random = new Random();

        for (int i = 0; i < generated_code_length; i++) {
            code += String.valueOf(random.nextInt(10));
        }

        booking.setBooking_code(code);
        
        return bookingRepository.save(booking);
    }

    @Override
    public Optional<Booking> get_booking(Long id) {
        Booking booking = bookingRepository.findById(id).orElse(null);

        if(booking==null){
            throw new BookingNotFound("Booking with " + id + " is not found");
        }else{
            return bookingRepository.findById(id);
        }
    }
}
