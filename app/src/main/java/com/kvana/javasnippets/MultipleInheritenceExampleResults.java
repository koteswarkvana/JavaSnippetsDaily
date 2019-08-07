package com.kvana.javasnippets;

public class MultipleInheritenceExampleResults extends MultipleInheritenceExampleEmployeeInfo implements MultipleInheritenceExampleEmployeeSprots {

    float total;

    @Override
    public void displayWeight() {
        System.out.println("employee sport weight is = " + sportWeight);
    }

    void displayEmployeeTotalDetails() {
        total = employeePFAmount + employeeSal + sportWeight;
        getEmployeeId();
        displayEmployeeDetails();
        displayWeight();
        System.out.println("Total score is  >>  " + total);
    }
}
