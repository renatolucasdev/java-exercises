public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("João", 25);
        Pessoa p2 = new Pessoa("Joana", 30);

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

    }
}