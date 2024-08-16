import com.dio.appbank.enums.TipoConta;
import com.dio.appbank.models.Cliente;
import com.dio.appbank.models.ContaCorrente;
import com.dio.appbank.models.ContaPoupanca;
import com.dio.appbank.models.abstracts.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente luiz = new Cliente("Luiz", "063.465.987.63");
        Conta corrente = new ContaCorrente(luiz,TipoConta.CORRENTE);
        Conta poupanca = new ContaPoupanca(luiz,TipoConta.POUPANCA);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        corrente.depositar(1500);
        corrente.imprimirExtrato();
        corrente.sacar(250);
        corrente.imprimirExtrato();

        corrente.transferir(250, poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}