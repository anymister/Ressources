package ressources;

public class Mode_Automatique {
	private RepertoireEvenement RE = new RepertoireEvenement();
	private ModeSemiAutomatique MSA = new ModeSemiAutomatique();

	public Mode_Automatique() {

	}

	public void placerLesEvenement() {

		for (int i = 0; i < RE.getRepertoireEvenement().size(); i++) {
			MSA.choisirCreneau();
		}

	}

}
