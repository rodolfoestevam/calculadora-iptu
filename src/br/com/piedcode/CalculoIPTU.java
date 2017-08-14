package br.com.piedcode;

import br.com.piedcode.aliquota.AliquotaBase;
import br.com.piedcode.imovel.Imovel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodolfo on 10/08/2017.
 */
public class CalculoIPTU {

    public static BigDecimal calculateFromImovel(Imovel imovel) {
        BigDecimal sum = new BigDecimal(0d);
        BigDecimal totalIPTU = new BigDecimal(0d);

        for (AliquotaBase a : imovel.getAliquotas()) {
            BigDecimal valorCalcular = new BigDecimal(0d);

            // se o valor do imovel é maior que o valor minimo da aliquota
            if (imovel.getValorImovel().compareTo(a.getValorInicial()) > 0) {

                //se o valor do imovel é maior que o valor maximo da aliquota
                if(imovel.getValorImovel().compareTo(a.getValorFinal()) > 0 ){
                    //pega o valor a calcular como o intervalo da aliquota
                    valorCalcular = a.getIntervalo();

                    // e soma aos limitantes das aliquotas já calculadas
                    sum = sum.add(a.getIntervalo());
                } else {
                    //se nao for maior pega chegou ao fim dos valores
                    // valor a calcular é a valor do imovel menos oq já foi somado
                    valorCalcular = imovel.getValorImovel().subtract(sum);
                }

                //calcula o iptu : iptu + (valorCalcular * aliquota)
                totalIPTU = totalIPTU.add(valorCalcular.multiply(a.getAliquotaPorcentagem()));

            } else {
                //se nao for maior encerra a iteracao entre as aliquotas
                break;
            }
        }
        return totalIPTU.subtract(imovel.getBeneficio());
    }
}
