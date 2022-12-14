package com.nttdata.bootcamp.wallettransactionservice.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class ApiError{
    private ResponseCode code;
    private String message;
    private List<String> errors;
}
