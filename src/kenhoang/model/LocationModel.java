package kenhoang.model;

/**
 * Created by sample on 7/7/17.
 */
public class LocationModel {
    private int idLocation;
    private String idSpecies;
    private String idPosition;
    private String locationDesc;

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public String getIdSpecies() {
        return idSpecies;
    }

    public void setIdSpecies(String idSpecies) {
        this.idSpecies = idSpecies;
    }

    public String getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(String idPosition) {
        this.idPosition = idPosition;
    }

    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    public LocationModel(int idLocation, String idSpecies, String idPosition, String locationDesc) {
        this.idLocation = idLocation;
        this.idSpecies = idSpecies;
        this.idPosition = idPosition;
        this.locationDesc = locationDesc;
    }

    public LocationModel() {
    }
}
