package Final1deMarzo2024;

public class AdicionalPropina extends Adicional{
private int porc;

public AdicionalPropina(int porc){
	this.porc=porc;
}

public double extra (Comida c){
	return c.getPrecio()*this.porc/100;
	}
}
