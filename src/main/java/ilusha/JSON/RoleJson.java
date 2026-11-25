package ilusha.JSON;

public class RoleJson extends EchipamentSportivJson {
        double bootSize;
        int wheelsPerSkate;
        double wheelDiameterMm;
        String bearingRating;
        boolean hasHeelBrake;

        public double getBootSize() {
                return bootSize;
        }

        public int getWheelsPerSkate() {
                return wheelsPerSkate;
        }

        public double getWheelDiameterMm() {
                return wheelDiameterMm;
        }

        public String getBearingRating() {
                return bearingRating;
        }

        public boolean isHasHeelBrake() {
                return hasHeelBrake;
        }
}
