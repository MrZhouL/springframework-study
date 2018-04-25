package com.hwhl.yuanyu.validatorannotation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneLocalDate.PhoneValidator.class)
@Documented
public @interface PhoneLocalDate {
    String field() default  "";

    String message() default "请输入正确的手机号";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    class PhoneValidator implements ConstraintValidator<PhoneLocalDate, String> {

        @Override
        public void initialize(PhoneLocalDate phoneLocalDate) {

        }

        @Override
        public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
            String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";
            Pattern p = Pattern.compile(regex);
            if (StringUtils.isNotBlank(phone)){
                Matcher matcher = p.matcher(phone);
                return matcher.matches();
            }
            return StringUtils.isBlank(StringUtils.trim(phone));
        }
    }
}
