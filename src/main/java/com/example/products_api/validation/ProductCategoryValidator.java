package com.example.products_api.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ProductCategoryValidator implements ConstraintValidator<ValidProductCategory, String> {
    @Override
    public boolean isValid(String category, ConstraintValidatorContext constraintValidatorContext) {
        return category != null && Character.isUpperCase(category.charAt(0));
    }
}
