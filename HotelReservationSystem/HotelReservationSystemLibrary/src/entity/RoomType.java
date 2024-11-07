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
public class RoomType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomTypeId;
    
    @Column(nullable = false, length = 200)
    private String typeName;
    
    @Column(nullable = false, length = 200)
    private String description;
    
    @Column(nullable = false, length = 200)
    private String bedType;
    
    private Integer capacity;
    
    @Column(nullable = false, length = 200)
    private String amenities;
    
    @Column(nullable = false)
    private Integer ranking;
    
    @OneToMany(mappedBy = "")
    private ArrayList<Room> rooms;
    
    @OneToMany(mappedBy = "")
    private ArrayList<RoomRate> roomRate;
    

    public RoomType() {
    }

    public RoomType(String typeName, String description, String bedType, Integer capacity, String amenities, Integer ranking) {
        this.typeName = typeName;
        this.description = description;
        this.bedType = bedType;
        this.capacity = capacity;
        this.amenities = amenities;
        this.ranking = ranking;
    }
    
    

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomTypeId != null ? roomTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the roomTypeId fields are not set
        if (!(object instanceof RoomType)) {
            return false;
        }
        RoomType other = (RoomType) object;
        if ((this.roomTypeId == null && other.roomTypeId != null) || (this.roomTypeId != null && !this.roomTypeId.equals(other.roomTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.RoomType[ id=" + roomTypeId + " ]";
    }
    
}
