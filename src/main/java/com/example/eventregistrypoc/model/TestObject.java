package com.example.eventregistrypoc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TestObject {
    @JsonProperty
    private String startEventKeyValue;
    @JsonProperty
    private String nameObject;
    @JsonProperty
    private String type;


}
