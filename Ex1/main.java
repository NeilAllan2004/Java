package com.mycompany.ex1;
public class Ex1 {

    public static void main(String[] args) {
        Pessoa Pessoa1 = new Pessoa();
        Contrato Contrato1 = new Contrato();
        Plano Plano1 = new Plano();
        PessoaContrato PessoaC1 = new PessoaContrato();
        Fatura Fatura1 = new Fatura();
        Medico Medico1 = new Medico();
        Consulta Consulta1 = new Consulta();
        Exame Exame1 = new Exame();
        HistoricoMedico Historico = new HistoricoMedico();
        Pessoa1.Nome = "Exemplo";
        Pessoa1.Endereco = "Maracanaú";
        Pessoa1.DataNascimento = 01/01/2023;
        Pessoa1.Sexo = "Masculino";
        Contrato1.DataInclusao = 02/02/2023;
        Contrato1.NomeEmpresa = "Exemplo";
        Contrato1.Plano = Plano1;
        Plano1.Pessoa = Pessoa1;
        Plano1.Tipo = "Exemplo";
        PessoaC1.Contrato = Contrato1;
        PessoaC1.Pessoa = Pessoa1;
        PessoaC1.Fatura = Fatura1;
        PessoaC1.Tarifa = 99.99;
        PessoaC1.isTitular = true;
        Fatura1.JurosPorDia = 0.12;
        Fatura1.PercentualMulta = 0.23;
        Fatura1.PessoaContrato = PessoaC1;
        Fatura1.ValorTotal = 99.99;
        Fatura1.Vencimento = 03/03/2023;
        Medico1.Nome = "Exemplo";
        Medico1.Especialidade = "Geral";
        Consulta1.Medico = Medico1;
        Consulta1.Diagnostico = Exame1;
        Exame1.Resultado = "Exemplo";
        Historico.Consulta = Consulta1;
        Historico.Medico = Medico1;
        Historico.QtdConsultas = 1;
    }
}
