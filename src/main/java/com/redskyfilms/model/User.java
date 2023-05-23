package com.redskyfilms.model;

import lombok.Data;

@Data
public class User {
    private long user_id;
    private String user_first_name;
    private String user_last_name;
    private String user_email;
    private String user_address;
}
