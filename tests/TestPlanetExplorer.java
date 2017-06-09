import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_startnaPozicija() {
		PlanetExplorer planet = new PlanetExplorer(0, 0, "N");
		String kraj = planet.pozicija();
		assertEquals("Pocetne koordinate", planet, kraj);
	}
	
	
	@Test(expected = PlanetExplorerException.class)
	public void test_desno() throws PlanetExplorerException {
		
		PlanetExplorer planet = new PlanetExplorer(0, 0, "E");
	
		String r = planet.executeCommand("r");
		
		String kraj = planet.pozicija();
		assertEquals(r, planet);
	}
	
	@Test(expected = PlanetExplorerException.class)
	public void test_desno2() throws PlanetExplorerException {
		
		PlanetExplorer planet = new PlanetExplorer(0, 0, "S");
	
		String r = planet.executeCommand("r");
		r = planet.executeCommand("r");
		
		String kraj = planet.pozicija();
		assertEquals(r, planet);
	}
	
	@Test(expected = PlanetExplorerException.class)
	public void test_desno3() throws PlanetExplorerException {
		
		PlanetExplorer planet = new PlanetExplorer(0, 0, "W");
	
		String r = planet.executeCommand("r");
		r = planet.executeCommand("r");
		r = planet.executeCommand("r");
		
		String kraj = planet.pozicija();
		assertEquals(r, planet);
	}
	
	@Test(expected = PlanetExplorerException.class)
	public void test_levo() throws PlanetExplorerException {
		
		PlanetExplorer planet = new PlanetExplorer(0, 0, "W");
	
		String l = planet.executeCommand("l");
		
		
		String kraj = planet.pozicija();
		assertEquals(l, planet);
	}
	
	@Test(expected = PlanetExplorerException.class)
	public void test_levo1() throws PlanetExplorerException {
		
		PlanetExplorer planet = new PlanetExplorer(0, 0, "W");
	
		String l = planet.executeCommand("l");
		l = planet.executeCommand("l");
		
		String kraj = planet.pozicija();
		assertEquals(l, planet);
	}
	
}
