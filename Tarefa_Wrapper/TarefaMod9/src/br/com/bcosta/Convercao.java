package br.com.bcosta;

public class Convercao {

    public static void main(String args[]) {

        long numLPrimitivo = 55555555555555555L;
        System.out.println(numLPrimitivo);

        Long numLWrapper = Long.valueOf(numLPrimitivo);
        System.out.println("Valor de numLWrapper: " + numLWrapper);

        Short num2Wrapper = numLWrapper.shortValue();
        System.out.println("Valor de num2Wrapper: " + num2Wrapper);

    }
}
