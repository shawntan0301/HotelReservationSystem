/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.*;
import util.enumeration.EmployeeAccessRightsEnum;

/**
 *
 * @author shawn
 */
@Entity
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmployeeId;
    
    @Column(nullable = false, length = 32)
    private String employeeName;
    
    @Column(nullable = false, length = 32, unique = true)
    private String username;
    
    @Column(nullable = false, length = 32)
    private String password;
    
    @Column(nullable = false)
    private EmployeeAccessRightsEnum accessRight;

    public Employee() {
    }

    public Employee(String employeeName, String username, String password, EmployeeAccessRightsEnum accessRight) {
        this.employeeName = employeeName;
        this.username = username;
        this.password = password;
        this.accessRight = accessRight;
    }
    

    public Long getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Long EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public EmployeeAccessRightsEnum getAccessRight() {
        return accessRight;
    }

    public void setAccessRight(EmployeeAccessRightsEnum accessRight) {
        this.accessRight = accessRight;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (EmployeeId != null ? EmployeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the EmployeeId fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.EmployeeId == null && other.EmployeeId != null) || (this.EmployeeId != null && !this.EmployeeId.equals(other.EmployeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Employee[ id=" + EmployeeId + " ]";
    }
    
}
