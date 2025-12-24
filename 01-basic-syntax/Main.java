public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("João", 25);
        Pessoa p2 = new Pessoa("Joana", 30);
        Pessoa p3 = new Pessoa("Roberto");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());

        p1.setIdade(0); //não atualiza a idade (regra > 0)
        System.out.println("Idade após tentativa de atualização: " + p1.getIdade());
        p2.setNome("Ana");
        System.out.println("Nome após atualização: " + p2.getNome());
        p2.setIdade(28);
        System.out.println("Idade após atualização: " + p2.getIdade());

        System.out.println("Nome: "  + p3.getNome());
        System.out.println("Idade: " + p3.getIdade());//idade padrão por sobrecarga de construtor

        System.out.println("---------------------------------------");

        Retangulo r = new Retangulo(5, 2);

        System.out.println("Área do retângulo: " + r.calcularArea());
        System.out.println("Perímetro do retângulo: "+ r.calcularPerimetro());
        System.out.println("Aumentar: " + r.aumentar(6));

        Retangulo r1 = new Retangulo(2,3);
        Retangulo r2 = r1; //r2 recebe a mesma referência de memória de r1
        r2.setLargura(7);
        r2.setAltura(5);

        System.out.println("Largura de r1: "+ r1.getLargura()); //7, pois o valor foi alterado por r2 na mesma referência de memória que r2
        System.out.println("Altura de r1: " + r1.getAltura()); //5, pois o valor foi alterado por r2 na mesma referência de memória que r2

        System.out.println("---------------------------------------");
        TiposPrimitivos tiposPrimitivos = new TiposPrimitivos();
        System.out.println("Valores padrões dos Tipos Primitivos: ");
        System.out.println(tiposPrimitivos.mostrarValoresPadrao());
        System.out.println("Intervalos de valores dos Tipos Primitivos (Wrappers Classes)");
        System.out.println(tiposPrimitivos.mostrarIntervalos());
        System.out.println("Narrowing (3.9): " + tiposPrimitivos.narrowing(3.9));
        System.out.println("Narrowing (-2.1): " + tiposPrimitivos.narrowing(-2.1));
        System.out.println("Narrowing (Double.MAX_VALUE): " + tiposPrimitivos.narrowing(Double.MAX_VALUE));
        System.out.println("Widening (5000): " + tiposPrimitivos.narrowing(5000));
    }
}