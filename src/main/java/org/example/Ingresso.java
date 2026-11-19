package org.example;

public class Ingresso {
    private final String filme;
    private final int quantidade;
    private final String tipo;

    public Ingresso(String filme, int quantidade, String tipo){
        if(!"órbita".equals(filme) && !"código".equals(filme) && !"oceano".equals(filme)){
            throw new IllegalArgumentException("Escolha um filme válido!!");
        }
        if (quantidade < 1 || quantidade > 10){
            throw  new IllegalArgumentException("Escolha de 1 a 10 ingressos!");
        }
        if (!"inteira".equals(tipo) && !"meia".equals(tipo)){
            throw new IllegalArgumentException("Escolha inteira ou meia!");
        }
        this.filme = filme;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public String getTitulo(){
        return switch (filme){
            case "órbita" -> "Álem da órbita";
            case "código" -> "código titulo";
            default -> "oceano vivo";
        };
    }

    public int getPrecoUnitarioCentavos(){
        return tipo.equals("meia") ? 1500 : 3000;
    }

    public int calcularTotalCentavos(){
        return quantidade + getPrecoUnitarioCentavos();
    }

    public String getFilme() {
        return filme;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTipo() {
        return tipo;
    }


}
