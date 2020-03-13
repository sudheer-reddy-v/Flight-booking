package com.flight.booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flight.booking.pojo.FlightsAvailabilityInfo;
import com.flight.booking.repository.FIlghtScheduleRepository;

@SpringBootApplication
public class FilightTicketBookingApplication implements CommandLineRunner {
	
	@Autowired
	FIlghtScheduleRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(FilightTicketBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//    public void run(String... args) {
//		System.out.println("Reached Here");
//        List<FlightsAvailabilityInfo> det= repo.findFightSchedule("Hyderabad","Chennai");
//        for(FlightsAvailabilityInfo info:det)
//        System.out.println("Flight Name"+info.getFlightName());
//        
//        
//    }



}
