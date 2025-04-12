package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichellinTyres implements Tyres {

    private String name;

    public MichellinTyres() {
        this.name = "Michellin Tyres";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String rotate() {
        return "Rotating Michellin Tyres";
    }

}
