import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_startnaPozicija() {
		PlanetExplorer pozicija = new PlanetExplorer(0, 0, "N");
		assertNotNull(pozicija);
	}
}
