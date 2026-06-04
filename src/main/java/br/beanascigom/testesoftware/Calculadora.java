package br.beanascigom.testesoftware;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {

    /**
     * Calcula o salário líquido do funcionário aplicando o desconto
     * conforme as regras de cada cargo.
     *
     * @param funcionario o funcionário cujo salário será calculado
     * @return salário líquido com duas casas decimais
     */
    public BigDecimal calcula(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        BigDecimal fator = fatorDesconto(funcionario.getCargo(), salario);
        return salario.multiply(fator).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Retorna o fator multiplicador (1 - desconto) de acordo com o cargo
     * e o salário informado.
     */
    private BigDecimal fatorDesconto(Cargo cargo, BigDecimal salario) {
        return switch (cargo) {
            case DESENVOLVEDOR -> salario.compareTo(new BigDecimal("3000.00")) >= 0
                    ? new BigDecimal("0.80")   // desconto de 20%
                    : new BigDecimal("0.90");  // desconto de 10%

            case DBA, TESTADOR -> salario.compareTo(new BigDecimal("2000.00")) >= 0
                    ? new BigDecimal("0.75")   // desconto de 25%
                    : new BigDecimal("0.85");  // desconto de 15%

            case GERENTE -> salario.compareTo(new BigDecimal("5000.00")) >= 0
                    ? new BigDecimal("0.70")   // desconto de 30%
                    : new BigDecimal("0.80");  // desconto de 20%
        };
    }
}
