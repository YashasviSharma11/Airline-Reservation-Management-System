package com.jkshian.arms.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class BookingDto {
    private int id;
    private String bstart;
    private String bend;
//    private String useremail;
    private int bnumofseat;
    private double price;
    public BookingDto() {}
    public BookingDto(int id,String bstart,String bend,int bnumofseat,double price){this.id=id;this.bstart=bstart;this.bend=bend;this.bnumofseat=bnumofseat;this.price=price;}
    public int getId(){return id;} public void setId(int v){id=v;}
    public String getBstart(){return bstart;} public void setBstart(String v){bstart=v;}
    public String getBend(){return bend;} public void setBend(String v){bend=v;}
    public int getBnumofseat(){return bnumofseat;} public void setBnumofseat(int v){bnumofseat=v;}
    public double getPrice(){return price;} public void setPrice(double v){price=v;}


}
