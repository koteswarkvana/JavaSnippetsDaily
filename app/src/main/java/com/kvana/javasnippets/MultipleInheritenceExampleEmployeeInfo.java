package com.kvana.javasnippets;

public class MultipleInheritenceExampleEmployeeInfo extends MultipleInheritenceExample {
    float employeePFAmount, employeeSal;

    public void putEmployeeDetails(float employeePFAmount, float employeeSal) {
        this.employeePFAmount = employeePFAmount;
        this.employeeSal = employeeSal;
    }

    public void displayEmployeeDetails() {
        System.out.println("employee details are below ");
        System.out.println("employee PFAmount >> " + employeePFAmount);
        System.out.println("employee Sal  >> " + employeeSal);
    }
}



