package com.ep360.data.models;
// Generated Mar 6, 2015 9:55:17 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VesselMasterId generated by hbm2java
 */
@Embeddable
public class VesselMasterId  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -5395470727132881478L;
	private String vesselName;
     private String vesselType;

    public VesselMasterId() {
    }

    public VesselMasterId(String vesselName, String vesselType) {
       this.vesselName = vesselName;
       this.vesselType = vesselType;
    }
   


    @Column(name="vessel_name", unique=true, nullable=false, length=100)
    public String getVesselName() {
        return this.vesselName;
    }
    
    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }


    @Column(name="vessel_type", nullable=false, length=10)
    public String getVesselType() {
        return this.vesselType;
    }
    
    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VesselMasterId) ) return false;
		 VesselMasterId castOther = ( VesselMasterId ) other; 
         
		 return ( (this.getVesselName()==castOther.getVesselName()) || ( this.getVesselName()!=null && castOther.getVesselName()!=null && this.getVesselName().equals(castOther.getVesselName()) ) )
 && ( (this.getVesselType()==castOther.getVesselType()) || ( this.getVesselType()!=null && castOther.getVesselType()!=null && this.getVesselType().equals(castOther.getVesselType()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getVesselName() == null ? 0 : this.getVesselName().hashCode() );
         result = 37 * result + ( getVesselType() == null ? 0 : this.getVesselType().hashCode() );
         return result;
   }   


}


