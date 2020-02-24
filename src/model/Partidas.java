package model;

import java.sql.Date;

public class Partidas {
	private int matchId;
	private Date dataPartida;
	private String modoDeJogo;
	private String adversario;
	private String meuTime;
	private int golsFeito;
	private int golsConcedido;
	private String timeAdversario;
	private int penaltisGf;
	private int penaltisGc;
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public Date getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}
	public String getModoDeJogo() {
		return modoDeJogo;
	}
	public void setModoDeJogo(String modoDeJogo) {
		this.modoDeJogo = modoDeJogo;
	}
	public String getAdversario() {
		return adversario;
	}
	public void setAdversario(String adversario) {
		this.adversario = adversario;
	}
	public String getMeuTime() {
		return meuTime;
	}
	public void setMeuTime(String meuTime) {
		this.meuTime = meuTime;
	}
	public int getGolsFeito() {
		return golsFeito;
	}
	public void setGolsFeito(int golsFeito) {
		this.golsFeito = golsFeito;
	}
	public int getGolsConcedido() {
		return golsConcedido;
	}
	public void setGolsConcedido(int golsConcedido) {
		this.golsConcedido = golsConcedido;
	}
	public String getTimeAdversario() {
		return timeAdversario;
	}
	public void setTimeAdversario(String timeAdversario) {
		this.timeAdversario = timeAdversario;
	}
	public int getPenaltisGf() {
		return penaltisGf;
	}
	public void setPenaltisGf(int penaltisGf) {
		this.penaltisGf = penaltisGf;
	}
	public int getPenaltisGc() {
		return penaltisGc;
	}
	public void setPenaltisGc(int penaltisGc) {
		this.penaltisGc = penaltisGc;
	}
	
	/*public String toString() {
		return matchId
	}*/
}