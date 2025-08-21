package practice.vo;

public class Pizza {

	private String name;
	private String size;
	private String crust;
	private String topping;
	private int slices;
	private boolean isHot;
	
	public Pizza() {}
	
	public Pizza(String name, String size, String crust, String topping, int slices, boolean isHot) {
	    this.name = name;
	    this.size = size;
	    this.crust = crust;
	    this.topping = topping;
	    this.slices = slices;
	    this.isHot = isHot;
	}

	public void reheat() {
		isHot = true;
		System.out.println(name + "피자를 데웠습니다. 따뜻해용~");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public boolean getHot() {
		return isHot;
	}

	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}

	public String info() {
		String info = "\n== 현재 피자 정보 ==\n" + "이름: " + name + "\n" + "사이즈: " + size + "\n" + "크러스트: " + crust + "\n"
				+ "토핑: " + topping + "\n" + "조각 수: " + slices + "\n" + "따뜻함? " + (isHot ? "예" : "아니오");

		return info;
	}
}
