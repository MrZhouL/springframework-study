package com.hwhl.yuanyu.validatorannotation;



import org.apache.commons.lang3.StringUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.constraints.Null;
import java.lang.annotation.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StrongPassword.StrongPasswordValidator.class)
@Documented
public @interface StrongPassword {
    //错误信息
    String message() default "密码由数字和字母组成，并且要同时含有数字和字母，且长度要在8-16位之间";
    //分组
    Class<?>[] groups() default { };
    //负责加载
    Class<? extends Payload>[] payload() default { };

    /**
     * Defines several {@link Null} annotations on the same element.
     *指定多个时使用
     * @see javax.validation.constraints.Null
     */
    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        Null[] value();
    }

    //自定义的校验器
    class StrongPasswordValidator implements ConstraintValidator<StrongPassword,String>{

        @Override
        public void initialize(StrongPassword constraintAnnotation) {

        }

        @Override
        public boolean isValid(String password, ConstraintValidatorContext context) {
            String regex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";
            Pattern p = Pattern.compile(regex);
            if (StringUtils.isNotBlank(password)){
                Matcher matcher = p.matcher(password);
                return matcher.matches();
            }
            return StringUtils.isBlank(StringUtils.trim(password));
        }
    }
}
