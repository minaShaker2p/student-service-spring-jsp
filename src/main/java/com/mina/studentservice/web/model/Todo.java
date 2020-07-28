package com.mina.studentservice.web.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Todo {

    private int id;
    private String user;
    private String desc;
    private Date targetDate;
    private boolean isDone;

}
