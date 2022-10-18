package it.develhope.swagger02.controllers;

import io.swagger.annotations.ApiOperation;
import it.develhope.swagger02.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/math")
public class MathController {

    @GetMapping(value = "/msg")
    @ApiOperation(value = "Message", notes = "Print the welcome message")
    public String welcomeMathMsg(){
        return "This is math operation";
    }
    @GetMapping(value = "/division-info")
    @ApiOperation(value = "Division", notes = "Print the details of division")
    public ArithmeticOperation division(){
        return new ArithmeticOperation(
                "Division",
                2,
                "Given two natural numbers, the second of which is different from zero," +
                        " the division operation returns a third number which, " +
                        "multiplied by the second," +
                        " gives us the first",
                new String[]{
                        "invariant", "distributive"
                }
        );
    }
    @GetMapping(value = "/multiplication")
    @ApiOperation(value = "Multiplication", notes = "Print the details of multiplication")
    public int multiplication(
            @RequestParam(
                    name = "multiplying ",
                    required = true
            ) int a,
            @RequestParam (
                    name = "multiplier",
                    required = true
            )int b){
        return a * b;
    }
    @GetMapping(value = "/square/{n}")
    @ApiOperation(value = "Square", notes = "Calculate the square")
    public int square(
            @PathVariable(
                    value = "Base",
                    required = true)
                    int n){
        return n * n;
    }

}
