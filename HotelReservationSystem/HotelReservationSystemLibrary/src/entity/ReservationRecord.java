/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author shawn
 */
@Entity
public class ReservationRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationRecordId;
    
    @Column(nullable = false)
    private Date checkInDate;
    
    @Column(nullable = false)
    private Date checkOutDate;
    
    private Date checkInTime;
    
    private Date checkOutTime;
    
    private BigDecimal bill;
    
    private Date dateOfReservation;
    
    @Column(nullable = false)
    private String guestEmail;
    
    @OneToOne
    private Room allocatedRoom;
    
    @OneToOne
    private RoomType roomType;
    
    @ManyToOne
    private Guest guestReservation;
    
    @ManyToOne
    private Partner partnerReservation;
    
    @OneToOne
    private ExceptionReport report;

    public ReservationRecord() {
    }

    //Constructors for different guest/partner reservation
    public ReservationRecord(Date checkInDate, Date checkOutDate, Date checkInTime, Date checkOutTime, BigDecimal bill, Date dateOfReservation, String guestEmail, Room allocatedRoom, RoomType roomType, Guest guestReservation, Partner partnerReservation, ExceptionReport report) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.bill = bill;
        this.dateOfReservation = dateOfReservation;
        this.guestEmail = guestEmail;
        this.allocatedRoom = allocatedRoom;
        this.roomType = roomType;
        this.guestReservation = guestReservation;
        this.partnerReservation = partnerReservation;
        this.report = report;
    }

    public Long getReservationRecordId() {
        return reservationRecordId;
    }

    public void setReservationRecordId(Long reservationRecordId) {
        this.reservationRecordId = reservationRecordId;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public BigDecimal getBill() {
        return bill;
    }

    public void setBill(BigDecimal bill) {
        this.bill = bill;
    }

    public Date getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(Date dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public Room getAllocatedRoom() {
        return allocatedRoom;
    }

    public void setAllocatedRoom(Room allocatedRoom) {
        this.allocatedRoom = allocatedRoom;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Guest getGuestReservation() {
        return guestReservation;
    }

    public void setGuestReservation(Guest guestReservation) {
        this.guestReservation = guestReservation;
    }

    public Partner getPartnerReservation() {
        return partnerReservation;
    }

    public void setPartnerReservation(Partner partnerReservation) {
        this.partnerReservation = partnerReservation;
    }

    public ExceptionReport getReport() {
        return report;
    }

    public void setReport(ExceptionReport report) {
        this.report = report;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservationRecordId != null ? reservationRecordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the reservationRecordId fields are not set
        if (!(object instanceof ReservationRecord)) {
            return false;
        }
        ReservationRecord other = (ReservationRecord) object;
        if ((this.reservationRecordId == null && other.reservationRecordId != null) || (this.reservationRecordId != null && !this.reservationRecordId.equals(other.reservationRecordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ReservationRecord[ id=" + reservationRecordId + " ]";
    }
    
}
