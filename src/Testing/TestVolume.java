package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.CUP_Volume;
import Code.OZ_Volume;
import Code.QuantityVolume;
import Code.TBSP_Volume;
import Code.TSP_Volume;

public class TestVolume {

	@Test
	public void shouldEqualOZandTSP() {
		QuantityVolume tsp = new TSP_Volume(6);
		QuantityVolume oz = new OZ_Volume(1);
		
		assertEquals(true, tsp.isEqualQuntity(oz));
	}
	@Test
	public void shouldEqualOZandCUP() {
		QuantityVolume cup = new CUP_Volume(1);
		QuantityVolume oz = new OZ_Volume(8);
		
		assertEquals(true, cup.isEqualQuntity(oz));
	}
	@Test
	public void shouldEqualOZandTBSP() {
		QuantityVolume tbsp = new TBSP_Volume(2);
		QuantityVolume oz = new OZ_Volume(1);
		
		assertEquals(true, tbsp.isEqualQuntity(oz));
	}

	@Test
	public void shouldConvertTSPtoCUP() {
		QuantityVolume tsp = new TSP_Volume(48);
		QuantityVolume cup = new CUP_Volume();
		assertEquals(true,cup.convertFrom(tsp) instanceof CUP_Volume);
	}
}
