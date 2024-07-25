package Act2_tp4;

public class AlarmaLuminosa  extends Alarma{
	private Luz luz; 


	public AlarmaLuminosa(Timbre timbre, Luz luz){
		super(timbre);
		this.luz=luz;

	}

	@Override 
	public boolean comprobar(){
			if (super.comprobar()==true){
			this.luz.isPrendido();
			return true;
				
			}
			else {
				return false;
		}
	}
	}
