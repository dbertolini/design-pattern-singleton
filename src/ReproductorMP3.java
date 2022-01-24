public class ReproductorMP3 {

	private State state;
	
	public void setState(State state) {
		this.state = state;
		System.out.println("Estado setteado: " + state.getIndicador());
	}
	
	public void pressPlay() {
		state.pressPlay(this);
	}
}
