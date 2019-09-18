package com.sys.selectcource.enities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Question {
    private Integer id;

    @NotBlank
    private String title;

    public Question(@JsonProperty("id") Integer id,
                    @JsonProperty("title") String title) {
        this.id = id;
        this.title = title;
    }
}
