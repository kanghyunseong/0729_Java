package com.kh.model.vo;

public class Restaurant {

	// 상호, 주소, 메인메뉴
	private String storeName;
	private String address;
	private String mainMenu;

	public Restaurant() {

	}

	public Restaurant(String storeName, String address, String mainMenu) {
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMainMenu() {
		return mainMenu;
	}

	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}

	public String information() {
		return "[가게명 : " + storeName + " "
			 + "가게 주소 : " + address + " "
			 + "메인 메뉴 : " + mainMenu + "]";
	}

}
