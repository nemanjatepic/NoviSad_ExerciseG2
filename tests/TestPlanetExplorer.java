import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_startnaPozicija() {
		PlanetExplorer planet = new PlanetExplorer(0, 0, "N");
		String kraj = planet.pozicija("");
		assertEquals("Pocetne koordinate", planet, kraj);
	}
	
	
	@Test(expected = PlanetExplorerException.class)
	public void test_desno() throws PlanetExplorerException {
		
		PlanetExplorer planet = new PlanetExplorer(0, 0, "N");
		
		String kraj = planet.pozicija();
		assertEquals("Pocetne koordinate", planet, kraj);
	}
	
}
