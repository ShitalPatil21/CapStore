package com.capgemini.hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.hotelmanagement.bean.HotelBean;
import com.capgemini.hotelmanagement.bean.HotelResponseBean;
import com.capgemini.hotelmanagement.bean.UserBean;
import com.capgemini.hotelmanagement.service.HotelService;
import com.capgemini.hotelmanagement.service.RoomService;
import com.capgemini.hotelmanagement.service.UserService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HotelController {
	@Autowired
	HotelService hotelService;

	@Autowired
	RoomService roomService;

	@Autowired
	UserService userService;

	String success = "success";
	
	@PostMapping("/addHotel")
	public HotelResponseBean registerUser(@RequestBody HotelBean hotelBean) {
		HotelResponseBean hotelResponseBean = new HotelResponseBean();
		hotelService.addHotel(hotelBean);
		hotelResponseBean.setStatuscode(200);
		hotelResponseBean.setMessage(success);
		hotelResponseBean.setDescription("hotel Added Successfully");
		return hotelResponseBean;
	}

	@DeleteMapping("/deleteHotel")
	public HotelResponseBean deleteHotel(int hotelId) {
		userService.deleteemployeeHotel(hotelId);
		roomService.deleteRoomUsingHotel(hotelId);
		HotelResponseBean hotelResponseBean = new HotelResponseBean();
		hotelService.deleteHotel(hotelId);
		hotelResponseBean.setStatuscode(200);
		hotelResponseBean.setMessage(success);
		hotelResponseBean.setDescription("hotel Deleted Successfully");
		return hotelResponseBean;
	}

	@PostMapping("/updateHotel")
	public HotelResponseBean UpdateHotel(@RequestBody HotelBean hotelBean) {
		HotelResponseBean hotelResponseBean = new HotelResponseBean();
		hotelService.updateHotel(hotelBean);
		hotelResponseBean.setStatuscode(200);
		hotelResponseBean.setMessage(success);
		hotelResponseBean.setDescription("hotel Updated Successfully");
		return hotelResponseBean;
	}

	@GetMapping("/seeAllHotels")
	public HotelResponseBean seeAllHotels() {
		HotelResponseBean hotelResponseBean = new HotelResponseBean();
		List<HotelBean> hotelList = hotelService.getAllHotels();
		hotelResponseBean.setStatuscode(200);
		hotelResponseBean.setMessage(success);
		hotelResponseBean.setDescription("hotel Found Sucesfully");
		hotelResponseBean.setHotelList(hotelList);
		return hotelResponseBean;
	}

	@GetMapping("/getEmployee")
	public HotelResponseBean getUser(@RequestParam int hotelId) {
		List<UserBean> userList = hotelService.getEmployee(hotelId);
		HotelResponseBean hotelResponseBean = new HotelResponseBean();
		hotelResponseBean.setStatuscode(200);
		hotelResponseBean.setMessage(success);
		hotelResponseBean.setDescription("Employee List Found...");
		hotelResponseBean.setUserList(userList);
		return hotelResponseBean;
	}
	
	@GetMapping("/Hotel")
	public HotelResponseBean getHotel(int hotelId) {
		HotelBean hotelBean=hotelService.getHotel(hotelId);
		HotelResponseBean hotelResponseBean = new HotelResponseBean();
		hotelResponseBean.setStatuscode(200);
		hotelResponseBean.setMessage(success);
		hotelResponseBean.setDescription("Hotel Found...");
		hotelResponseBean.setHotelBean(hotelBean);
		return hotelResponseBean;
	}

}
