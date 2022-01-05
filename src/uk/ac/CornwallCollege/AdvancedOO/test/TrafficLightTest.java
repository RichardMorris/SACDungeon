package uk.ac.CornwallCollege.AdvancedOO.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uk.ac.CornwallCollege.AdvancedOO.Colours;
import uk.ac.CornwallCollege.AdvancedOO.Lights;
import uk.ac.CornwallCollege.AdvancedOO.State;

class TrafficLightTest {

	@Test
	void test_initial_state_of_Lights() {
		Lights tl = new Lights();
		Colours s = tl.getState();
		assertEquals(Colours.RED,s);
	
	}

}
