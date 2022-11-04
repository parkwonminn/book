package com.pwm.community.exceptions;

import com.pwm.community.enums.CommonResult;
import com.pwm.community.interfaces.IResult;
import com.pwm.community.interfaces.IResult;

public class RollbackException extends Exception {
    public final IResult result;

    public RollbackException() {
        this(CommonResult.FAILURE);
    }

    public RollbackException(IResult result) {
        super();
        this.result = result;
    }
}