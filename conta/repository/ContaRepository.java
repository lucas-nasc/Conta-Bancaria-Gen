package conta.repository;
import conta.model.Conta;

public interface ContaRepository {

    //CRUD da conta
    public void procurarPorNumero(int numero);
    public void listarTodas();
    public void cadastrar(Conta conta);
    public void deletar(int numero);
    public void atualizar(Conta conta);

    //Metedos Bancarios
    public void sacar(int numero, float valor);
    public void depositar(int numero, float valor);
    public void transferir(int numeroOrigem, int numeroDestino, float valor);


}
