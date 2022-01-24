
public class ReproduccionEnCurso implements State{
	
	private static ReproduccionEnCurso instance = null;
	
	private ReproduccionEnCurso() {
		
	}
	
	public static ReproduccionEnCurso getInstance() {
		
		if(instance == null) {
			instance = new ReproduccionEnCurso();
		}
		
		return instance;
	}
	
	public void pressPlay(ReproductorMP3 reproductor) {
		reproductor.setState(ReproduccionDetenida.getInstance());
	}
	
	public String getIndicador() {
		return "En curso";
	}
}
