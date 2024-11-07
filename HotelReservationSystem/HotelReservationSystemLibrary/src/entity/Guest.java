/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author shawn
 */
@Entity
public class Guest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestId;

    @Column(nullable = false, length = 32, unique = true)
    private String guestName;
    
    @Column(nullable = false, length = 32)
    private String password;
    
    @Column(nullable = false, length = 64, unique = true)
    private String emailAddress;
    
    @OneToMany(mappedBy = "")
    private ArrayList<ReservationRecord> reservationRecords;

    public Guest() {
    }

    public Guest(String guestName, String password, String emailAddress, ArrayList<ReservationRecord> reservationRecords) {
        this.guestName = guestName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.reservationRecords = reservationRecords;
    }
    
    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<ReservationRecord> getReservationRecords() {
        return reservationRecords;
    }

    public void setReservationRecords(ArrayList<ReservationRecord> reservationRecords) {
        this.reservationRecords = reservationRecords;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guestId != null ? guestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the guestId fields are not set
        if (!(object instanceof Guest)) {
            return false;
        }
        Guest other = (Guest) object;
        if ((this.guestId == null && other.guestId != null) || (this.guestId != null && !this.guestId.equals(other.guestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Guest[ id=" + guestId + " ]";
    }
    
}
