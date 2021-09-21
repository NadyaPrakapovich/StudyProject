package lesson6.InOutSystem.Person.Employee;

import java.util.UUID;

public class IdCard {
    private final String idCard;

    public IdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public static IdCard createIdCard() {
        return new IdCard(UUID.randomUUID().toString().substring(3, 13));
    }
}
