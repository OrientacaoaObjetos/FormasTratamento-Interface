import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteAutoridade {

	@Test
	public void nomeInformal() {
		Informal informal = new Informal();
		Autoridade autoridade = new Autoridade("Emanuel", "Rocha", informal);
		assertEquals(autoridade.getTratamento(), "Emanuel");
	}
	
	@Test
	public void nomeRespeitosoMasculino() {
		Respeitoso respeitoso = new Respeitoso(true);
		Autoridade autoridade = new Autoridade("Emanuel", "Rocha", respeitoso);
		assertEquals(autoridade.getTratamento(), "Sr. Rocha");
	}
	
	@Test
	public void nomeRespeitosoFeminino() {
		Respeitoso respeitoso = new Respeitoso(false);
		Autoridade autoridade = new Autoridade("Andressa", "Ibarra", respeitoso);
		assertEquals(autoridade.getTratamento(), "Sra. Ibarra");
	}
	
	@Test
	public void nomeComTitulo() {
		ComTitulo respeitoso = new ComTitulo("Magnifico");
		Autoridade autoridade = new Autoridade("Joao", "Guimaraes", respeitoso);
		assertEquals(autoridade.getTratamento(), "Magnifico Joao Guimaraes");
	}

}
