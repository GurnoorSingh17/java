import java.util.Random;

public class Gun {

    String Manufacturer;
    String ModelName;
    Boolean Automatic;
    Boolean ShotGun;
    int NoOFRounds;
    Double ReloadTime;

    public Gun(String Manufacturer,String ModelName,Boolean Automatic,Boolean ShotGun,int NoOFRounds,double ReloadTime){
        this.Manufacturer = Manufacturer;
        this.ModelName = ModelName;
        this.Automatic = Automatic;
        this.ShotGun = ShotGun;
        this.NoOFRounds = NoOFRounds;
        this.ReloadTime = ReloadTime;
    }

    public void ShootKids(){
        Random random = new  Random();
        int KidAge = random.nextInt(12) + 1;

        System.out.println("killed a kid of age: " + KidAge + " with " + ModelName);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Manufacturer == null) ? 0 : Manufacturer.hashCode());
        result = prime * result + ((ModelName == null) ? 0 : ModelName.hashCode());
        result = prime * result + ((Automatic == null) ? 0 : Automatic.hashCode());
        result = prime * result + ((ShotGun == null) ? 0 : ShotGun.hashCode());
        result = prime * result + NoOFRounds;
        result = prime * result + ((ReloadTime == null) ? 0 : ReloadTime.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Gun other = (Gun) obj;
        if (Manufacturer == null) {
            if (other.Manufacturer != null)
                return false;
        } else if (!Manufacturer.equals(other.Manufacturer))
            return false;
        if (ModelName == null) {
            if (other.ModelName != null)
                return false;
        } else if (!ModelName.equals(other.ModelName))
            return false;
        if (Automatic == null) {
            if (other.Automatic != null)
                return false;
        } else if (!Automatic.equals(other.Automatic))
            return false;
        if (ShotGun == null) {
            if (other.ShotGun != null)
                return false;
        } else if (!ShotGun.equals(other.ShotGun))
            return false;
        if (NoOFRounds != other.NoOFRounds)
            return false;
        if (ReloadTime == null) {
            if (other.ReloadTime != null)
                return false;
        } else if (!ReloadTime.equals(other.ReloadTime))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Gun [Manufacturer=" + Manufacturer + ", ModelName=" + ModelName + ", Automatic=" + Automatic
                + ", ShotGun=" + ShotGun + ", NoOFRounds=" + NoOFRounds + ", ReloadTime=" + ReloadTime + "]";
    }
    
}
