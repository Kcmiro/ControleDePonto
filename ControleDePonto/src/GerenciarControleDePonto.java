import Funcionarios.Funcionario;
import Funcionarios.Gerente;
import Funcionarios.Operador;
import Funcionarios.Secretaria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControleDePonto {
    public static void main(String[] args) {
        Funcionario funcGe = new Gerente(01,"Joao","joao@gmail.com","344.123.420-04","Joaozinho","706032");
        Funcionario funcSe = new Secretaria(03,"Maria","maria@gmail.com","453.761.389-01","3019-5120","09");
        Funcionario funcOp = new Operador(02,"Zé","zezinho@gmail.com","780.320.124-04", 10);
        RegistroPonto Ponto = new RegistroPonto();
        Ponto.setFunc(funcGe);
        Ponto.setDataRegistro(LocalDate.now());
        Ponto.setHoraEntrada(LocalDateTime.now());
        Ponto.apresentarRegistroPonto();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        RegistroPonto PontoSe = new RegistroPonto();
        PontoSe.setFunc(funcSe);
        PontoSe.setDataRegistro(LocalDate.now());
        PontoSe.setHoraEntrada(LocalDateTime.now());
        PontoSe.apresentarRegistroPonto();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        RegistroPonto PontoOp = new RegistroPonto();
        PontoOp.setFunc(funcOp);
        PontoOp.setDataRegistro(LocalDate.now());
        PontoOp.setHoraEntrada(LocalDateTime.now());
        PontoOp.apresentarRegistroPonto();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Ponto.setHoraSaida(LocalDateTime.now());
        Ponto.apresentarRegistroPonto();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        PontoSe.setHoraSaida(LocalDateTime.now());
        PontoSe.apresentarRegistroPonto();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        PontoOp.setHoraSaida(LocalDateTime.now());
        PontoOp.apresentarRegistroPonto();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}