package Org.Testing.Payloads;

public class PojoSimpleBody {

	public PojoBodyData GetBodyData() {
		PojoBodyData data = new PojoBodyData();
		data.setFirstName("Rashmitha");
		data.setLastName("Santhos");
		data.setAge(42);
		data.setProfession("Advocate");
		data.setId(244);
		return data;

	}

}
