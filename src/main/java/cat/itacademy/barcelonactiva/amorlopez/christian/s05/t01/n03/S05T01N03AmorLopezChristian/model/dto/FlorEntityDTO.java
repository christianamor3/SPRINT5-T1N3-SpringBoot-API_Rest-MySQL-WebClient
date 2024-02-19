package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n03.S05T01N03AmorLopezChristian.model.dto;

public class FlorEntityDTO {

    private int pk_FlorID;
    private String nomFlor;
    private String paisFlor;

    private String tipusFlor;

    

    public FlorEntityDTO() {
    }

    public FlorEntityDTO(int pk_FlorID, String nomFlor, String paisFlor, String tipusFlor) {
        this.pk_FlorID = pk_FlorID;
        this.nomFlor = nomFlor;
        this.paisFlor = paisFlor;
        this.tipusFlor = tipusFlor;
    }

    public int getPk_FlorID() {
        return pk_FlorID;
    }

    public void setPk_FlorID(int pk_FlorID) {
        this.pk_FlorID = pk_FlorID;
    }

    public String getNomFlor() {
        return nomFlor;
    }

    public void setNomFlor(String nomFlor) {
        this.nomFlor = nomFlor;
    }

    public String getPaisFlor() {
        return paisFlor;
    }

    public void setPaisFlor(String paisFlor) {
        this.paisFlor = paisFlor;
    }

    public String getTipusFlor() {
        return tipusFlor;
    }

    public void setTipusFlor(String tipusFlor) {
        this.tipusFlor = tipusFlor;
    }

}
