package br.com.luis.controllers;

import br.com.luis.exception.UnsupportedMathOperationException;
import br.com.luis.math.SimpleMath;
import br.com.luis.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.tomcat.util.http.parser.HttpParser.isNumeric;

@RestController
@RequestMapping("/math")
public class MathController{

    //Nova instancia para a classe SimpleMath
    private SimpleMath math = new SimpleMath();

    //Metodos da Class
    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sum(NumberConverter.convertToDouble (numberOne) , NumberConverter.convertToDouble (numberTwo));
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sub(NumberConverter.convertToDouble (numberOne) , NumberConverter.convertToDouble (numberTwo));
    }

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.mult(NumberConverter.convertToDouble (numberOne) , NumberConverter.convertToDouble (numberTwo));
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double div(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.div(NumberConverter.convertToDouble (numberOne) , NumberConverter.convertToDouble (numberTwo));
    }

    @RequestMapping("/med/{numberOne}/{numberTwo}")
    public Double med(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.med(NumberConverter.convertToDouble (numberOne) , NumberConverter.convertToDouble (numberTwo));
    }

    @RequestMapping("/raiz/{number}")
    public Double raiz(
            @PathVariable("number") String number
    ) throws Exception {
        if(!NumberConverter.isNumeric(number)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.raiz(NumberConverter.convertToDouble (number));
    }

}


