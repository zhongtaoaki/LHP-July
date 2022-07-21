package secondWeek;

public enum Season {

//	public static final Season SPRING = new Season("春天");
//	public static final Season SUMMER = new Season("夏天");
//	public static final Season AUTUMN = new Season("秋天");
//	public static final Season WINTER = new Season("冬天");

	SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");

	public String chineseName;

	private Season(String chineseName) {
		this.chineseName = chineseName;
	}

}
