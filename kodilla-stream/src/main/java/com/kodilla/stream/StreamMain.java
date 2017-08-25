package com.kodilla.stream;

import com.kodilla.stream.lambada.ExecuteSaySomething;
import com.kodilla.stream.lambada.Executor;
import com.kodilla.stream.lambada.SaySomething;
import com.kodilla.stream.lambada.Procesor;

 public class StreamMain {
     public static void main(String[] args) {
         Procesor processor = new Procesor();
         Executor codeToExecute = () -> System.out.println("This is an example text.");
         processor.execute(codeToExecute);
     }
    }
