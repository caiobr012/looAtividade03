import java.time.LocalDate;

import uniderp.loo.escola.dominio.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        Aluno A1 = new Aluno();
        A1.setCodigo(1);
        A1.setNome("Caio");
        A1.setCpf("05939251145");
        A1.setEndereco("Rua Jacinto numero 690");
        A1.setRg("0465788");
        A1.setTelefone("67996398788");
        A1.setMatricula("0001");
        A1.setDataInsercao(LocalDate.of(2012, 10, 25));
        A1.setDataMatricula(LocalDate.of(2012, 10, 25));
        A1.setDataNascimento(LocalDate.of(2000, 02, 28));


    }

}
