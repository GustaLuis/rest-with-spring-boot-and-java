package br.com.luis.request.converters;

public class NumberConverter {

    //conversão
    public static Double convertToDouble(String strNumber)  {
        if (strNumber == null || strNumber.isEmpty()) {
            throw new IllegalArgumentException();
        }
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    //validação
    //verifica se uma string representa um numero valido.
    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) {
            return false;
        }
        //Se não for um número, retorna false
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
        //verificar se a string number corresponde ao padrão definido
    }
}
