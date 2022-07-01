package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString()
public class Customer {
    protected String name;
    private Boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public boolean isMember() {
        if((Objects.equals(memberType,"Silver")) || (Objects.equals(memberType, "Gold")) || (Objects.equals(memberType, "Premium"))) {
            return true;
        } else {
            return false;
        }
    }

}
