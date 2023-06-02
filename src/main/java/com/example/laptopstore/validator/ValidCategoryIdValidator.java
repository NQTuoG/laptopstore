package com.example.laptopstore.validator;

import com.example.laptopstore.entity.Category;
import com.example.laptopstore.validator.nnotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context ){
        return category != null && category.getId() != null;
    }
}
