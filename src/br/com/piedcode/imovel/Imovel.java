package br.com.piedcode.imovel;

import br.com.piedcode.aliquota.AliquotaBase;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by rodolfo on 10/08/2017.
 */
public interface Imovel {

	BigDecimal getValorImovel();

	BigDecimal getBeneficio();

	List<AliquotaBase> getAliquotas();

}
