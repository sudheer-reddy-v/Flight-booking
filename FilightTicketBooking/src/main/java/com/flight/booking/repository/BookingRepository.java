package com.flight.booking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flight.booking.pojo.BookingInfo;

@Repository
public interface BookingRepository extends CrudRepository<BookingInfo, String> {
	
    
//    @Query(value = "SELECT * FROM EMPLOYEES e WHERE e.EMPLOYEEID = :employeeID", nativeQuery = true)
//    BookingInfo findUserByEmployeeID(String employeeID);
    
}