package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString()
public class DiscountRate {

    public static double productDiscount = 0.1;
    static double serviceDiscountSilver = 0.1;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountPremium = 0.2;

    public static double getProductDiscountRate(double productExpenses, boolean isMember) {

        if (isMember && productExpenses != 0) {
            return  productDiscount;
        } else {
            return 0.0;
        }
    }

    public static double getServiceDiscountRate(String memberType) {

        switch (Objects.toString(memberType)) {
            case "Silver":
                return serviceDiscountSilver;
            case "Gold":
                return serviceDiscountGold;
            case "Premium":
                return serviceDiscountPremium;
            default:
                return 0.0;
        }
    }
}
