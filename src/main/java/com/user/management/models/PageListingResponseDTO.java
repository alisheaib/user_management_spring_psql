package com.user.management.models;



import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class PageListingResponseDTO implements Serializable {
    private int currentPage;
    private long totalItems;
    private int totalItemsInPage;
    private int totalPages;
    private Object data;
    private String message;
    private String status;
    private Date timeStamp;
}