package com.redskyfilms.service;

import java.util.Optional;

import com.redskyfilms.model.Booking;

public interface BookingService {

    Booking add_booking(Booking booking);

    Optional<Booking> get_booking(Long id);
    
}
