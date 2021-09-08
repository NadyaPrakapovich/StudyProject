package lesson6.InOutSystem;

// TODO: 9/1/2021 Use CTRL+ALT+L [Pavel.Chachotkin]

import java.util.Random;
import java.util.UUID;

public class IdCard {
    private String idCard;

    public String getIdCard() {
        return idCard;
    }

    public String createIdCard() {
        idCard = UUID.randomUUID().toString().substring(3, 13);
        return idCard;
    }

// TODO: 9/1/2021 Must not be commented code in project without reason in comment [Pavel.Chachotkin]



}
