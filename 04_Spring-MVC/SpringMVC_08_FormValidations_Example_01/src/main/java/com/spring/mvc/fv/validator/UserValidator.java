package com.spring.mvc.fv.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.mvc.fv.model.User;

@Component
public class UserValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	public void validate(Object object, Errors errors) {

		ValidationUtils.rejectIfEmpty(errors, "name", "user.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "email", "user.email.empty");
		ValidationUtils.rejectIfEmpty(errors, "gender", "user.gender.empty");
		ValidationUtils.rejectIfEmpty(errors, "languages", "user.languages.empty");
		User user = (User) object;
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		if (!(pattern.matcher(user.getEmail()).matches())) {
			errors.rejectValue("email", "user.email.invalid");
		}
	}

}
