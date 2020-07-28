package com.mina.studentservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Todo {

    private int id;
    private String user;
    private String desc;
    private Date targetDate;
    private boolean isDone;

}
