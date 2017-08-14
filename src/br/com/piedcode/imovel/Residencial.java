package br.com.piedcode.imovel;

import br.com.piedcode.aliquota.AliquotaBase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodolfo on 10/08/2017.
 */
public class Residencial implements Imovel {

    private List<AliquotaBase> aliquotaBaseList;
    private BigDecimal valor;
    private BigDecimal desconto;

    public Residencial(BigDecimal valor) {
        this.valor = valor;
        this.desconto = new BigDecimal(0.0d);
        this.aliquotaBaseList = createAliquotas();
    }

    public Residencial(BigDecimal valor, BigDecimal desconto) {
        this.valor = valor;
        this.desconto = desconto;
        this.aliquotaBaseList = createAliquotas();
    }

    private List<AliquotaBase> createAliquotas(){
        List<AliquotaBase> aliquotaBaseList = new ArrayList<>();

        aliquotaBaseList.add(
                new AliquotaBase(
                        new BigDecimal(0.006d),
                        new BigDecimal(0.0d),
                        new BigDecimal(95450.0d),
                        new BigDecimal(95450.0d)
                )
        );

        aliquotaBaseList.add(
                new AliquotaBase(
                        new BigDecimal(0.007d),
                        new BigDecimal(95450.01d),
                        new BigDecimal(238626.0d),
                        new BigDecimal(143176.0d)
                )
        );

        aliquotaBaseList.add(
                new AliquotaBase(
                        new BigDecimal(0.0075d),
                        new BigDecimal(238626.01d),
                        new BigDecimal(417596.0d),
                        new BigDecimal(178970.0d)
                )
        );

        return aliquotaBaseList;

    }

    public BigDecimal getValor(){
        return this.valor;
    }

    public BigDecimal getDesconto(){
        return this.desconto;
    }

    public List<AliquotaBase> getAliquotaBaseList(){
        return this.aliquotaBaseList;
    }

    @Override
    public BigDecimal getValorImovel(){
        return this.getValor();
    }

    @Override
    public List<AliquotaBase> getAliquotas(){
        return this.getAliquotaBaseList();
    }

    @Override
    public BigDecimal getBeneficio(){
        if(null != getDesconto())
            return getDesconto();
        return new BigDecimal(0.0d);
    }
}
