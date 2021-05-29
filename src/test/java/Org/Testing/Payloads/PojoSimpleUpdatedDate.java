package Org.Testing.Payloads;

public class PojoSimpleUpdatedDate {

	public static PojoBodyData GetUpdatedBodyData() {
		PojoBodyData data = new PojoBodyData();
		data.setFirstName("Arshbit");
		data.setLastName("Singh");
		data.setAge(9);
		data.setProfession("student");
		data.setId(2011);
		return data;
	}

}