package com.sys.selectcource.enities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class DateEnity {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
}
