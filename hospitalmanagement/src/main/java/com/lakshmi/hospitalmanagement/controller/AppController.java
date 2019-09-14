package com.lakshmi.hospitalmanagement.controller;

import com.lakshmi.hospitalmanagement.entities.Booking;
import com.lakshmi.hospitalmanagement.entities.Resource;
import com.lakshmi.hospitalmanagement.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController
public class AppController {
    @Autowired
    private HospitalService hospitalService;
    @RequestMapping(value="/tcs/hack/v1/resources",method= RequestMethod.GET)
    public ResponseEntity<?> fetchAllAvailableResources(@RequestParam("t1") int i, @RequestParam("t1") int j) {
        Iterable<Resource> resourceList = hospitalService.fetchAllAvailableResources();
        return new ResponseEntity<>(resourceList, HttpStatus.OK);
    }
    @RequestMapping(value="/tcs/hack/v1/resources/{id}",method= RequestMethod.GET)
    public ResponseEntity<?> fetchOnlySpecificResource(@PathVariable("id") long id) {
        Resource resource = hospitalService.fetchOnlySpecificResource(id);
        return new ResponseEntity<>(resource, HttpStatus.OK);
    }
    @RequestMapping(value="/tcs/hack/v1/resources/",method= RequestMethod.POST)
    public ResponseEntity<?> addOrUpdateNewResource(@RequestParam("id") long id, @RequestParam("name") String resourceName) {
        Resource resource = hospitalService.addOrUpdateNewResource(id,resourceName);
        return new ResponseEntity<>(resource, HttpStatus.OK);
    }
    @RequestMapping(value="/tcs/hack/v1/resources/",method= RequestMethod.DELETE)
    public ResponseEntity<?> deleteANewResource(@RequestParam("id") long id, @RequestParam("name") String resourceName) {
         hospitalService.deleteANewResource(id,resourceName);
        return new ResponseEntity<>(resourceName, HttpStatus.OK);
    }
    @RequestMapping(value="/tcs/hack/v1/resources/",method= RequestMethod.GET)
    public ResponseEntity<?> fetchAllReservations() {
        Iterable<Booking> reservationList = hospitalService.fetchAllReservations();
        return new ResponseEntity<>(reservationList, HttpStatus.OK);
    }
    @RequestMapping(value="/tcs/hack/v1/resources/{id}",method= RequestMethod.POST)
    public ResponseEntity<?> addNewReservation(@RequestParam("id") int id, @RequestParam("bookingdate") String bookingDate,@RequestParam("bookingslot") String bookingSlot) {
        Booking reservation = hospitalService.addNewReservation(id,bookingDate+bookingSlot);
        return new ResponseEntity<>(reservation, HttpStatus.OK);
    }
}
