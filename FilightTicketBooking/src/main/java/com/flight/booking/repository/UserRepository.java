//package com.flight.booking.repository;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import com.flight.booking.pojo.UserDetails;
//
//@Repository
//public interface UserRepository extends CrudRepository<UserDetails, String> {
//	
//    
//    @Query(value = "SELECT * FROM EMPLOYEES e WHERE e.EMPLOYEEID = :employeeID", nativeQuery = true)
//    UserDetails findUserByEmployeeID(String employeeID);
//    
//}