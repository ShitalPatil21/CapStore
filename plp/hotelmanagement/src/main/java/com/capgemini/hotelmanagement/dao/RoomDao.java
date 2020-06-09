package com.capgemini.hotelmanagement.dao;

import java.util.List;
import com.capgemini.hotelmanagement.bean.RoomBean;


public interface RoomDao {

	public boolean addRoom(RoomBean roomBean);

	public List<RoomBean> getAllRooms(int hotelId);

	public boolean updateRoom(RoomBean roomBean);

	public boolean deleteRoom(int roomId);

	public boolean changeStatus(int roomId);

	public boolean statusAvailable(int roomId);

	public double roomPrice(int roomId);
	
	public boolean deleteRoomUsingHotel(int hotelId);
	

}