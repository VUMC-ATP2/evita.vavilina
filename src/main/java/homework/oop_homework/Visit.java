package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
public class Visit {

    public Customer customer;
    public double productExpenses;
    public double serviceExpenses;
    public double totalExpenses;
    public Date date;

    public Visit(Customer name, Date date) {
        this.customer = name;
        this.date = date;
    }

    public double getProductExpenses() {
        productExpenses -= productExpenses * DiscountRate.getProductDiscountRate(productExpenses, customer.getMember());
        return productExpenses;
    }

    public double getServiceExpenses() {
        serviceExpenses -= serviceExpenses * DiscountRate.getServiceDiscountRate(customer.getMemberType());
        return serviceExpenses;
    }

    public double finalExpenses() {
        totalExpenses = getProductExpenses() + getServiceExpenses();
        return totalExpenses;
    }
}
