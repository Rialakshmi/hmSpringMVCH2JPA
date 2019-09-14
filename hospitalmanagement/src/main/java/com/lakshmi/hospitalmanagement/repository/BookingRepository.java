package com.lakshmi.hospitalmanagement.repository;
import com.lakshmi.hospitalmanagement.entities.Booking;
import org.springframework.data.repository.CrudRepository;
public interface BookingRepository extends CrudRepository<Booking, Long> {
}

