package br.com.piedcode.aliquota;

import java.math.BigDecimal;

/**
 * Created by rodolfo on 10/08/2017.
 */
public class AliquotaBase {

	private BigDecimal aliquotaPorcentagem;
	private BigDecimal valorInicial;
	private BigDecimal valorFinal;
	private BigDecimal intervalo;

	public AliquotaBase() {
	}

	public AliquotaBase(BigDecimal aliquotaPorcentagem,
			BigDecimal valorInicial, BigDecimal valorFinal, BigDecimal intervalo) {
		this.aliquotaPorcentagem = aliquotaPorcentagem;
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
		this.intervalo = intervalo;
	}

	public BigDecimal getAliquotaPorcentagem() {
		return aliquotaPorcentagem;
	}

	public void setAliquotaPorcentagem(BigDecimal aliquotaPorcentagem) {
		this.aliquotaPorcentagem = aliquotaPorcentagem;
	}

	public BigDecimal getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(BigDecimal valorInicial) {
		this.valorInicial = valorInicial;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	public BigDecimal getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(BigDecimal intervalo) {
		this.intervalo = intervalo;
	}
}
