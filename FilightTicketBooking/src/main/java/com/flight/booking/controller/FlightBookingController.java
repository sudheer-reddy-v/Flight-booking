package com.flight.booking.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.booking.pojo.BookingInfo;
import com.flight.booking.pojo.FlightSearch;
import com.flight.booking.pojo.FlightsAvailabilityInfo;
import com.flight.booking.pojo.PassengerDetails;
import com.flight.booking.repository.BookingRepository;
//import com.flight.booking.repository.BookingRepository;
import com.flight.booking.repository.FIlghtScheduleRepository;
//import com.flight.booking.repository.UserRepository;


@RestController
public class FlightBookingController {
	
//	@Autowired
//	UserRepository userRepo;
//	
//	@Autowired
//	BookingRepository bookingRepo;
	
	@Autowired
	FIlghtScheduleRepository scheduleRepo;
	
	@Autowired
	BookingRepository bookRepo;
	
	
	@GetMapping("/Search")
	public List<FlightsAvailabilityInfo> serchFlightDetails(FlightSearch search) {
		
		List<FlightsAvailabilityInfo> det= scheduleRepo.findFightSchedule(search.getSource(),search.getDestination(),search.getDate());
        for(FlightsAvailabilityInfo info:det)
        System.out.println("Flight Name"+info.getFlightName());
        
        return det;
	}
	
	@GetMapping("/book")
	public BookingInfo bookFlight(BookingInfo info) {
		
//	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
//	    EntityManager entityManager = entityManagerFactory.createEntityManager();
//	    entityManager.getTransaction().begin();
//	    entityManager.persist(info);
//	    entityManager.getTransaction().commit();
//	     
//	    System.out.println(entityManager.contains(info));
//	    entityManager.close();
//	    entityManagerFactory.close();
		List<PassengerDetails> list=new ArrayList<PassengerDetails>();
		list.add((PassengerDetails) info.getPassengerDetails().get(0));
		PassengerDetails details=new PassengerDetails();
		details.setAge("27");
		details.setPassengerName("hetr");
		details.setSex("sahd");
		list.add(details);
		info.setPassengerDetails(list);
		
		info=bookRepo.save(info);
		if(info.getBookingId()!=null && !"".equals(info.getBookingId())) {
			info.setMessage("Iternory succesfully booked");
		}else {
			info.setMessage("Un able to book your iternory");
		}
        return info;
	}
	
}
