package core;

import javax.persistence.*;

@Entity
@Table(name = "MobileUsers")
public class MobileUser {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id;

    @Column(name = "MOBILENUMBER")
    public String mobileNumber;

    @Column(name = "MINUTES")
    public Integer currentMinutes;

    @Column(name = "CREDITS")
    public Integer curentCredits;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getCurrentMinutes() {
        return currentMinutes;
    }

    public void setCurrentMinutes(Integer currentMinutes) {
        this.currentMinutes = currentMinutes;
    }

    public Integer getCurentCredits() {
        return curentCredits;
    }

    public void setCurentCredits(Integer curentCredits) {
        this.curentCredits = curentCredits;
    }
}