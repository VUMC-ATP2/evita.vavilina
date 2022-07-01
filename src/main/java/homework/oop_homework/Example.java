package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        //----------- only product expenses ------------
        Date firstDate = new Date();
        Customer firstCustomer = new Customer("Anne");
        firstCustomer.setMemberType("Silver");
        firstCustomer.setMember(firstCustomer.isMember());

        Visit firstVisit = new Visit(firstCustomer, firstDate);
        firstVisit.setProductExpenses(100);
        firstVisit.setServiceExpenses(0);
        System.out.println(firstDate);
        System.out.println("Customer: " + firstCustomer.getName() +
                        "\nMember type: " + firstCustomer.getMemberType() +
                        "\nTotal expanses: " + firstVisit.finalExpenses() + "\n");

        //----------- only service expenses ------------
        Date secondDate = new Date();
        Customer secondCustomer = new Customer("Bruno");
        secondCustomer.setMemberType("");
        secondCustomer.setMember(secondCustomer.isMember());

        Visit secondVisit = new Visit(secondCustomer, secondDate);
        secondVisit.setProductExpenses(0);
        secondVisit.setServiceExpenses(100);
        System.out.println(secondDate);
        System.out.println("Customer: " + secondCustomer.getName() +
                "\nMember type: " + secondCustomer.getMemberType() +
                "\nTotal expanses: " + secondVisit.finalExpenses() + "\n");

        //----------- product and service expenses ------------
        Date thirdDate = new Date();
        Customer thirdCustomer = new Customer("Andrew");
        thirdCustomer.setMemberType("Premium");
        thirdCustomer.setMember(thirdCustomer.isMember());

        Visit thirdVisit = new Visit(thirdCustomer, thirdDate);
        thirdVisit.setProductExpenses(10);
        thirdVisit.setServiceExpenses(100);
        System.out.println(thirdDate);
        System.out.println("Customer: " + thirdCustomer.getName() +
                "\nMember type: " + thirdCustomer.getMemberType() +
                "\nTotal expanses: " + thirdVisit.finalExpenses() + "\n");
    }
}
