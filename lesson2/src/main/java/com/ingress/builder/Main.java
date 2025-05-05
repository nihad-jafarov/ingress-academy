package com.ingress.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .CPU("Intel i7")
                .RAM("16GB")
                .storage("512GB SSD")
                .graphicsCardEnabled(true)
                .bluetoothEnabled(false)
                .build();

        System.out.println(computer);
    }
}