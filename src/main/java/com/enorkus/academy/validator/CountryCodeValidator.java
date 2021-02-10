package com.enorkus.academy.validator;

import com.enorkus.academy.exception.ValidationException;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class CountryCodeValidator extends Validator<String>{
    @Override
    public void validate(String attribute, String message) {
        if(!StringUtils.isBlank(attribute)) {
            if(!EnumUtils.isValidEnum(CountryCode.class, attribute)) {
                throw new ValidationException(message);
            }
        }
    }
}
