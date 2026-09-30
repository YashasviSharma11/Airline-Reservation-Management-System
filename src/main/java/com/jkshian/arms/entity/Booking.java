package com.jkshian.arms.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bStart;
    private String bEnd;
    private String userEmail;
    private int bNumOfseat;
    private double price;
    public Booking() {}
    public Booking(int id,String bStart,String bEnd,String userEmail,int bNumOfseat,double price){this.id=id;this.bStart=bStart;this.bEnd=bEnd;this.userEmail=userEmail;this.bNumOfseat=bNumOfseat;this.price=price;}
    public int getId(){return id;} public void setId(int v){id=v;} public String getBStart(){return bStart;} public void setBStart(String v){bStart=v;} public String getBEnd(){return bEnd;} public void setBEnd(String v){bEnd=v;} public String getUserEmail(){return userEmail;} public void setUserEmail(String v){userEmail=v;} public int getBNumOfseat(){return bNumOfseat;} public void setBNumOfseat(int v){bNumOfseat=v;} public double getPrice(){return price;} public void setPrice(double v){price=v;}

}
