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
public class Partner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long partnerId;
    
    @Column(nullable = false, length = 32, unique = true)
    private String partnerName;
    
    @Column(nullable = false, length = 32, unique = true)
    private String username;

    @Column(nullable = false, length = 32)
    private String password;
    
    @Column(nullable = false, length = 32, unique = true)
    private String emailAddress;
    
    @OneToMany(mappedBy = "")
    private ArrayList<ReservationRecord> reservationRecords;

    public Partner() {
        reservationRecords = new ArrayList<>();
    }

    public Partner(String partnerName, String username, String password, String emailAddress, ArrayList<ReservationRecord> reservationRecords) {
        this.partnerName = partnerName;
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.reservationRecords = reservationRecords;
    }
    
    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        hash += (partnerId != null ? partnerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the partnerId fields are not set
        if (!(object instanceof Partner)) {
            return false;
        }
        Partner other = (Partner) object;
        if ((this.partnerId == null && other.partnerId != null) || (this.partnerId != null && !this.partnerId.equals(other.partnerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Partner[ id=" + partnerId + " ]";
    }
    
}
