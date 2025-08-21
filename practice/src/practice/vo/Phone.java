package practice.vo;

public class Phone {

    private String brand;
    private String model;
    private String color;
    private int battery;
    private boolean isOn;
    private String os;
    
    public Phone() {}
    
    public Phone(String brand, String model, String color, int battery, boolean isOn, String os) {
    	this.brand = brand;
    	this.model = model;
    	this.color = color;
    	this.battery = battery;
    	this.isOn = isOn;
    	this.os = os;
    }

    public void charge() {
        battery = 100;
        System.out.println("배터리가 100% 충전되었습니다.");
    }

    public void usedPhone() {
        if (!isOn) {
            System.out.println("전원이 꺼져 있어요. 먼저 전원을 켜주세요.");
            return;
        }

        if (battery >= 10) {
            battery -= 10;
            System.out.println("배터리가 10% 줄었습니다. 현재 배터리: " + battery + "%");
            if (battery == 0) {
                isOn = false;
                System.out.println("배터리가 0%입니다. 스마트폰이 꺼졌습니다.");
            }
        } else {
            battery = 0;
            isOn = false;
            System.out.println("배터리가 부족합니다. 스마트폰이 꺼졌습니다.");
        }

        checkBatteryWarning();
    }

    public void powerOn() {
        if (!isOn) {
            if (battery == 0) {
                System.out.println("배터리가 0%입니다. 충전 후 전원을 켜세요.");
            } else {
                isOn = true;
                System.out.println("스마트폰이 켜졌습니다.");
            }
        } else {
            System.out.println("이미 켜져 있습니다.");
        }
    }

    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("스마트폰이 꺼졌습니다.");
        } else {
            System.out.println("이미 꺼져 있습니다.");
        }
    }

    public void checkBatteryWarning() {
        if (battery <= 20 && battery > 0 && isOn) {
            System.out.println("배터리가 부족합니다! 충전이 필요해요.");
        }
    }
    
    
    	public String info() {
    	    String info = 
    	        "\n== 스마트폰 정보 ==\n"
    	        + "브랜드: " + brand + "\n"
    	        + "모델: " + model + "\n"
    	        + "색상: " + color + "\n"
    	        + "OS: " + os + "\n"
    	        + "배터리: " + battery + "%\n"
    	        + "전원 상태: " + (isOn ? "켜짐" : "꺼짐");
    	    
    	    return info;
    	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public boolean getIsOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
}
