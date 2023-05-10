package Bai2;

public class CD {
    private String MaCD;
    private String TuaCD;
    private int SoBaiHat;
    private float Gia;

    public CD() {
    }

    public CD(String MaCD, String TuaCD, int SoBaiHat, float Gia) {
        this.MaCD = MaCD;
        this.TuaCD = TuaCD;
        this.SoBaiHat = SoBaiHat;
        this.Gia = Gia;
    }

    public String getMaCD() {
        return MaCD;
    }

    public String getTuaCD() {
        return TuaCD;
    }

    public int getSoBaiHat() {
        return SoBaiHat;
    }

    public float getGia() {
        return Gia;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public void setTuaCD(String TuaCD) {
        this.TuaCD = TuaCD;
    }

    public void setSoBaiHat(int SoBaiHat) {
        this.SoBaiHat = SoBaiHat;
    }

    public void setGia(float Gia) {
        if(Gia>0){
            this.Gia = Gia;
        }
    }    

    @Override
    public String toString() {
        return "\n Ma CD: " + MaCD + "\n Tua CD: " + TuaCD + "\n So bai hat: " + SoBaiHat + "\n Gia: " + Gia + "\n=================================";
    }
    
}
