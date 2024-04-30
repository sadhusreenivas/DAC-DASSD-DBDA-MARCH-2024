package actshyd;

import hyd.online.*; // DAC - implicit
import hyd.offline.right.DASSD; // explicit import

public class CDAC{

	public static void main(String[] args) {
    // FQN
	hyd.offline.left.DBDA dbda = new hyd.offline.left.DBDA(25,"PG_DBDA",133000);
    dbda.getDBDA(); //

    DAC dac = new DAC(20, "PG-DAC",90000);
    dac.getDAC(); //

    DASSD dassd = new DASSD(29,"PG-DASSD",115000);
    dassd.getDASSD();
		
	}
}