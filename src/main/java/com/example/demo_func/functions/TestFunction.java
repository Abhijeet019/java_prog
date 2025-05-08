package com.example.demo_func.functions;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class TestFunction implements Function<String, String> {

  @Override
  public String apply(String s) {
    System.out.println("function executed"+s);
    return "totalFailedRecords.toString()";
  }
}
