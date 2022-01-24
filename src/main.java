
public class main {

	public static void main(String[] args) {

		ReproductorMP3 reproductor = new ReproductorMP3();
		
		reproductor.setState(ReproduccionDetenida.getInstance());
		
		reproductor.pressPlay();
		reproductor.pressPlay();
		reproductor.pressPlay();

	}

}
