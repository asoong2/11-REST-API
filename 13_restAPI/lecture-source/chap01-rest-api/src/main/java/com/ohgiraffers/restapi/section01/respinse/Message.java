package com.ohgiraffers.restapi.section01.respinse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Message {

    private int httpStatusCode;

    private String message;

}
