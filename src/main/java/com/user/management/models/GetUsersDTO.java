package com.user.management.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter @Setter
public class GetUsersDTO implements Serializable {
    private int currentPage;
    private long totalItems;
    private int totalItemsInPage;
    private int totalPages;
    private List<UserDTO> data;
    private String message;
    private String status;
    private Date timeStamp;
}
