package lesson6.InOutSystem.Person.employee;
import java.io.Serializable;
import lesson6.InOutSystem.Person.office.VIPRoom;

public class DevOps extends Employee implements VIPRoom, Serializable{

	public DevOps(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheVipRoom() {
		System.out.println("DevOps can come in...");
	}
}
