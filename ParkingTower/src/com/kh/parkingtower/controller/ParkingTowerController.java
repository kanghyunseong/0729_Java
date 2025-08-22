package com.kh.parkingtower.controller;

import java.util.*;

import com.kh.parkingtower.model.vo.*;

public class ParkingTowerController {

	ArrayList<Car> carList = new ArrayList<Car>();
	private int parkingCounter = 1;
	
	public void insertCar(int carNum, int carType, String owner) {
		carList.add(new Car(parkingCounter++, carNum, carType, owner));
	}
	
	public int deleteCar(int carNum) {
		for(Car c : carList) {
			if(c.getCarNum() == carNum) {
				carList.remove(c);
				return 1;
			}
		}
		return 0;
	}
	
	public ArrayList<Car> searchCar(String owner) {
		ArrayList<Car> result = new ArrayList<Car>();
		for(Car c : carList) {
			if(c.getOwner().equals(owner)) {
				result.add(c);
			}
		}
		
		return result;
	}
	
	public ArrayList<Car> selectList() {
		return carList;
	}
}
