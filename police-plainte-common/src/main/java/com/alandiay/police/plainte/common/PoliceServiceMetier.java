package com.alandiay.police.plainte.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD})
public  @interface PoliceServiceMetier {

	public PoliceServicesEnum value();
}
