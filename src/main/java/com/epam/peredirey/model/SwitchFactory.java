package com.epam.peredirey.model;

import java.util.ArrayList;
import java.util.List;

public class SwitchFactory {

    public static List<AbstractSwitch> createSwitches(int countLayer2Switch, int countLayer3Swithch){
        List<AbstractSwitch> switches = new ArrayList<AbstractSwitch>();
        for (int i = 0; i < countLayer2Switch; i++) {
            String name = "Layer2Switch" + i;
            String vendor = (i + 1) * 10 / 9;
            int carrying = (2 - i) * MAX_CARRYING / 15;
            int fuelConsumption = (i + 4) * 34 / 12;
            int airbagMotorPower = (i + 4) * 34 / 12;
            int airbagMotorName = 1;
            planes.add(new AirbagPlane(name, capacity, carrying, fuelConsumption, airbagMotorPower, airbagMotorName));
        }

        for (int j = 0; j < countHydroPlane; j++) {
            planes.add(new HydroPlane("HydroPlane" + j, (j + 1) * 8 / 7, (3 - j) * 60 / 17, (j + 3) * 33 / 11, (j + 3) * 38 / 11));
        }
        return planes;
    }


}
    }
}
