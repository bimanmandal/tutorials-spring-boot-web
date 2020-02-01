package com.biman.tutorials.model;

import java.util.List;

public class OperationContainer {
    List<Integer> numbers;
    String operation_type;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public String getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }
}
