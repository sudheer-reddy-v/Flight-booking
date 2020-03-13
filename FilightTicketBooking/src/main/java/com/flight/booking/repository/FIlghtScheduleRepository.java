package com.flight.booking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flight.booking.pojo.FlightsAvailabilityInfo;

@Repository
public interface FIlghtScheduleRepository extends CrudRepository<FlightsAvailabilityInfo, String> {
	
    
    @Query(value = "SELECT * FROM FLIGHTSCHEDULE where SOURCE =:source and DESTINATION =:destination and DATE =:date", nativeQuery = true)
    List<FlightsAvailabilityInfo> findFightSchedule(String source,String destination,String date);
    
}

//e WHERE e.source = :source and e.destination=:destination