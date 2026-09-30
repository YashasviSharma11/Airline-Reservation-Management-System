package com.jkshian.arms.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Builder
@Entity
@DynamicUpdate
@Table(name =  "airplane")
public class AirPlane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String start;
    private String end;
    private int avlSeat;
    private double numOfKm;
    public AirPlane() {}
    public AirPlane(int id,String start,String end,int avlSeat,double numOfKm){this.id=id;this.start=start;this.end=end;this.avlSeat=avlSeat;this.numOfKm=numOfKm;}
    public int getId(){return id;} public void setId(int v){id=v;} public String getStart(){return start;} public void setStart(String v){start=v;} public String getEnd(){return end;} public void setEnd(String v){end=v;} public int getAvlSeat(){return avlSeat;} public void setAvlSeat(int v){avlSeat=v;} public double getNumOfKm(){return numOfKm;} public void setNumOfKm(double v){numOfKm=v;}
}
