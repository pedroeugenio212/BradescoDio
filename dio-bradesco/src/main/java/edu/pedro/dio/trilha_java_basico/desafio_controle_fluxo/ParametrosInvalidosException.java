package edu.pedro.dio.trilha_java_basico.desafio_controle_fluxo;

public class ParametrosInvalidosException extends Exception
{

    public ParametrosInvalidosException()
    {
    }

    public ParametrosInvalidosException(String message)
    {
	super(message);
    }

    public ParametrosInvalidosException(String message, Throwable cause)
    {
	super(message, cause);
    }

}
