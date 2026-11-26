package ilusha.JSON;

import ilusha.PatineGheata;
import ilusha.Role;
import model.EchipamentSportiv;

import java.util.ArrayList;

public class EquipmentJsonData {
    ArrayList<EchipamentSportivJson> echipamentSportiv;
    ArrayList<RoleJson> role;
    ArrayList<PatineGheataJson> patineGheata;


    public static void populateFromJson(EquipmentJsonData equipmentData, ArrayList<EchipamentSportiv> esList, ArrayList<Role> roleList, ArrayList<PatineGheata> patineGheataList) {
        // Populate the lists from JSON
        for (EchipamentSportivJson equipmentJson : equipmentData.echipamentSportiv) {
            esList.add(new EchipamentSportiv(
                    equipmentJson.getName(),
                    equipmentJson.getBrand(),
                    equipmentJson.getPrice(),
                    equipmentJson.getWeightKg(),
                    equipmentJson.getMinimumUserAge()
            ));
        }

        for (RoleJson roleJson : equipmentData.role) {
            roleList.add(new Role(
                    roleJson.getName(),
                    roleJson.getBrand(),
                    roleJson.getPrice(),
                    roleJson.getWeightKg(),
                    roleJson.getMinimumUserAge(),
                    roleJson.getBootSize(),
                    roleJson.getWheelsPerSkate(),
                    roleJson.getWheelDiameterMm(),
                    roleJson.getBearingRating(),
                    roleJson.isHasHeelBrake()
            ));
        }

        for (PatineGheataJson patineGheataJson : equipmentData.patineGheata) {
            patineGheataList.add(new PatineGheata(
                    patineGheataJson.getName(),
                    patineGheataJson.getBrand(),
                    patineGheataJson.getPrice(),
                    patineGheataJson.getWeightKg(),
                    patineGheataJson.getMinimumUserAge(),
                    patineGheataJson.getBootSizeEu(),
                    patineGheataJson.getSkateType(),
                    patineGheataJson.getBladeMaterial(),
                    patineGheataJson.getBladeLengthCm(),
                    patineGheataJson.isInsulated()
            ));
        }

    }

}
