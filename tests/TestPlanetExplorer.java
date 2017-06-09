import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_startnaPozicija() {
		PlanetExplorer planet = new PlanetExplorer(0, 0, "N");
		String kraj = planet.pozicija();
		assertEquals(planet, kraj);
	}
}
