package com.spring.recipeBook.dataModels.dto;

public class ResponseStructure<T> {

    private int statusCode;
    private String message;
    private T data;
}
