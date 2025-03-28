package com.banking.utils;

import java.time.LocalDate;
import java.time.Period;

import com.banking.Exceptions.AgeException;

public class AgeValidator {
  public static final int MIN_AGE;
  static {
	  MIN_AGE = 18;
  }
  
  public static void ValidateAge(LocalDate dob) throws AgeException{
	  if(Period.between(dob,LocalDate.now()).getYears() < 18) {
		  throw new AgeException("Hey you are under ange please come later !!");
	  };
      System.out.println("Age validation successful!");

  }
}
