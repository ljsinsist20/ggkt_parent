package com.atguigu.ggkt.utils.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ljs
 * @Pcakage: com.atguigu.ggkt.utils.exception.GgktException
 * @Date: 2022年07月04日 18:52
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GgktException extends RuntimeException {
    private Integer code;
    private String msg;
}
