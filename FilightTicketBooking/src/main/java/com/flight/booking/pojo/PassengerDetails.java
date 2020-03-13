package com.flight.booking.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class PassengerDetails {

	private String passengerName;
	private String age;
	private String sex;
//	private String mealPreference;
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
//	public String getMealPreference() {
//		return mealPreference;
//	}
//	public void setMealPreference(String mealPreference) {
//		this.mealPreference = mealPreference;
//	}
	
	
}
