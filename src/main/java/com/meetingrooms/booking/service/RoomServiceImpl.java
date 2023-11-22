package com.meetingrooms.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meetingrooms.booking.model.Booking;
import com.meetingrooms.booking.model.Room;
import com.meetingrooms.booking.repository.BookingRepository;
import com.mongodb.MongoClient;


@Service
public class RoomServiceImpl implements RoomService {

	@Override
	public List<Room> findAll() {
		List <Room> roomList = new ArrayList <Room>();
		Room room1 = new Room("Amaze", "3");
		Room room2 = new Room("Beauty", "7");
		Room room3 = new Room("Inspire", "12");
		Room room4 = new Room("Strive", "20");

		roomList.add(room1);
		roomList.add(room2);
		roomList.add(room3);
		roomList.add(room4);
		return roomList;
	}

}