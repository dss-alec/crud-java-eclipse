import java.util.Date;
public abstract class Veiculo {
	
private double preco;
private Date fabricacao;
private double peso;



public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public Date getFabricacao() {
	return fabricacao;
}
public void setFabricacao(Date fabricacao) {
	this.fabricacao = fabricacao;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}


}
