package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    private String name;

    public BridgeStoneTyres() {
        this.name = "BridgeStone Tyres";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String rotate() {
        return "Rotating BridgeStone Tyres";
    }

}
