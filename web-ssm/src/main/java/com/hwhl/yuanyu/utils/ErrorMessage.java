/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ErrorMessage
 * Author:   zhoulei
 * Date:     2018/4/23 下午4:57
 * Description: 错误信息封装，返回string字符串
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hwhl.yuanyu.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈错误信息封装，返回string字符串〉
 *
 * @author zhoulei
 * @create 2018/4/23
 * @since 1.0.0
 */
public class ErrorMessage {

    public static String getFieldErrorMessage(BindingResult bindingResult){
        StringBuffer sb = new StringBuffer();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        sb.append("不符合要求字段：");
        for (FieldError fe: fieldErrors) {
            sb.append(fe.getField()+",原因："+fe.getDefaultMessage()+"; ");
        }
        return sb.toString();
    }
}
