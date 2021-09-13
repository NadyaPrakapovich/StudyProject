package lesson6.InOutSystem;

import java.util.UUID;

public class IdCard {
    private String idCard;

    public void setIdCard(String id) {
        this.idCard = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public String createIdCard() {
        idCard = UUID.randomUUID().toString().substring(3, 13);
        return idCard;
    }
}
