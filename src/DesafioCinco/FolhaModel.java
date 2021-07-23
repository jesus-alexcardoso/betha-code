package DesafioCinco;

import java.util.Arrays;

public class FolhaModel {
    private int id;
    private FuncionarioModel funcionario;
    private String dataPagamento;
    private DescontoModel[] listaDesconto;
    private Double salarioLiquido;

    public FolhaModel(int id, FuncionarioModel funcionario, String dataPagamento) {
        this.id = id;
        this.funcionario = funcionario;
        this.dataPagamento = dataPagamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFuncionario(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public int getId() {
        return id;
    }

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public DescontoModel[] getListaDesconto() {
        return listaDesconto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    @Override
    public String toString() {
        return "FolhaModel{" +
                "id=" + id +
                ", funcionario=" + funcionario +
                ", dataPagamento='" + dataPagamento + '\'' +
                ", listaDesconto=" + Arrays.toString(listaDesconto) +
                ", salarioLiquido=" + salarioLiquido +
                '}';
    }

    public void calcular() {
        this.calcular(null);
    }

    public void calcular(DescontoModel[] listaDesconto) {
        this.calcular(listaDesconto, null);
    }

    public void calcular(DescontoModel[] listaDesconto, Double bonus) {
        Double salarioBruto = funcionario.getSalarioBruto();
        Double salarioLiquido = salarioBruto;

        salarioLiquido -= getDescontoIRPF(salarioBruto);
        salarioLiquido -= getDescontoINSS(salarioBruto);

        if (listaDesconto != null) {
            for (int i = 0; i < listaDesconto.length; i++) {
                salarioLiquido -= listaDesconto[i].getValor();
            }
        }

        if (bonus != null) {
            salarioLiquido += bonus;
        }

        this.salarioLiquido = salarioLiquido;
    }

    public Double getDescontoIRPF(Double salarioBruto) {
        Double desconto = 0.0;
        Double descontoPercentual = 0.0;

        if (salarioBruto <= 1903.98) {
            descontoPercentual = 0.0;
        } else if (salarioBruto <= 2826.65) {
            descontoPercentual = 7.5;
        } else if (salarioBruto <= 3751.05) {
            descontoPercentual = 15.0;
        } else if (salarioBruto <= 4664.68) {
            descontoPercentual = 22.5;
        } else {
            descontoPercentual = 27.5;
        }

        desconto = (salarioBruto * (descontoPercentual / 100));

        System.out.println("Desconto IRPF: R$" + desconto);

        return desconto;
    }

    public Double getDescontoINSS(Double salarioBruto) {
        Double desconto = 0.0;

        if (salarioBruto <= 1100.00) {
            desconto = 0.075;
        } else if (salarioBruto > 1100.00 && salarioBruto <= 2203.48) {
            desconto = 0.09;
        } else if (salarioBruto > 2203.48 && salarioBruto <= 3305.22) {
            desconto = 0.12;
        } else if (salarioBruto > 3305.22 && salarioBruto <= 6433.57) {
            desconto = 0.14;
        }

        desconto = desconto * salarioBruto;


        System.out.println("Desconto INSS: R$" + desconto);

        return desconto;
    }
}
