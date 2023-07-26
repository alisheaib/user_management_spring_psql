package com.user.management.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ResponseExceptionDTO implements Serializable {

    public ResponseExceptionDTO(HttpStatus status, List<String> fieldErrors, String message){
        this.timeStamp = new Date();
        this.status = status.value();
        this.error = status.name();
        this.fieldErrors = fieldErrors;
        this.message = message;
    }

    private Date timeStamp;
    private int status;
    private String message;
    private String error;
    private List<String> fieldErrors;

}
