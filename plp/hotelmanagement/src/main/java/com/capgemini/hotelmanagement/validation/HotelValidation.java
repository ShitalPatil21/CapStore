package com.capgemini.hotelmanagement.validation;

public interface HotelValidation {

	public boolean emailValidation(String email);

	public boolean passwordValidation(String password);
	
	public boolean mobileNoValidation(String phoneNo);
	
	public boolean userNameValidation(String userName);
	
	public boolean hotelNameValidation(String hotelName);
	
	public boolean hotelLocationValidation(String hotelLocation);
	
	public boolean roomRentValidation(String roomRent);
}
