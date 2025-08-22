package com.kh.parkingtower.model.vo;

public class Car {

	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;

	public Car() {
		super();
	}

	public Car(int parkingNum, int carNum, int carType, String owner) {
		super();
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}

	public int getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		String type = "";
		switch (carType) {
		case 1:
			type = "경차";
			break;
		case 2:
			type = "세단";
			break;
		case 3:
			type = "SUV";
			break;
		case 4:
			type = "트럭";
			break;
		default:
			type = "알 수 없음";
			break;
		}
		return "Car [차량 순서 = " + parkingNum + ", 차량 번호 = " + carNum + ", 차종 = " + type + ", 소유자 = " + owner
				+ "]";
	}

}
