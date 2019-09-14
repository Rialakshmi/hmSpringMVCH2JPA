package com.lakshmi.hospitalmanagement.service;
import com.lakshmi.hospitalmanagement.entities.Booking;
import com.lakshmi.hospitalmanagement.repository.BookingRepository;
import com.lakshmi.hospitalmanagement.entities.Resource;
import com.lakshmi.hospitalmanagement.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class HospitalService {


    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ResourceRepository resourceRepository;


    public Iterable<Resource> fetchAllAvailableResources() {
        return resourceRepository.findAll();
    }


    public Resource fetchOnlySpecificResource(long id) {
        return resourceRepository.findOne(id);
    }


    public Resource addOrUpdateNewResource(long id, String resourceName) {
        return resourceRepository.save(new Resource(id,resourceName));

    }


    public void deleteANewResource(long id,String resourceName) {
        resourceRepository.delete(new Resource(id,resourceName));
    }


    public Iterable<Booking> fetchAllReservations() {
        return bookingRepository.findAll();
    }

    public Booking addNewReservation(long id,String slot) {
        return bookingRepository.save(new Booking(id,slot));

    }

}
