package com.example.eventregistrypoc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Testing purpose only
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SurveyInfo {
    private static final long serialVersionUID = -1138446817700416884L;
    @JsonProperty
    private String surveyName;
    @JsonProperty
    private int surveyId;
    @JsonProperty
    private String surveyDescription;

    @Override
    public String toString() {
        return "SurveyInfo{" +
                "surveyName='" + surveyName + '\'' +
                ", surveyId=" + surveyId +
                ", surveyDescription='" + surveyDescription + '\'' +
                '}';
    }
}
