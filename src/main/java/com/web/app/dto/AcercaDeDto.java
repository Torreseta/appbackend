package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class AcercaDeDto implements Serializable {
    
    @NotBlank
    private String info;

    public AcercaDeDto() {
    }

    public AcercaDeDto(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}




    