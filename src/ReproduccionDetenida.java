	
public class ReproduccionDetenida implements State{
	
	private static ReproduccionDetenida instance = null;
	
	private ReproduccionDetenida(){}
	
	public static ReproduccionDetenida getInstance() {
		if(instance == null) {
	         instance = new ReproduccionDetenida();
	    }
		return instance;
	}
	
	public void pressPlay(ReproductorMP3 reproductor) {
		reproductor.setState(ReproduccionEnCurso.getInstance());
	}
	
	public String getIndicador() {
		return "Detenida";
	}
}
