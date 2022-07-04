package com.atguigu.ggkt.utils.exception;

import com.atguigu.ggkt.utils.results.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: ljs
 * @Pcakage: com.atguigu.ggkt.utils.exception.GlobalExceptionHandler
 * @Date: 2022年07月04日 18:53
 * @Description:
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(GgktException.class)
    @ResponseBody
    public Result error(GgktException e){
        e.printStackTrace();
        return Result.fail().message(e.getMsg()).code(e.getCode());
    }
}
