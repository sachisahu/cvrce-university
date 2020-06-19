package com.cvrce.dto;

public class ProductDto {

    public String Brand;
    public String Madein;
    public String Name;
    public String Price;



    public ProductDto() {
    }

        public String getBrand() {return Brand;}

        public void setBrand(String brand) {this.Brand = brand;}

        public String getMadein() {return Madein;}

        public void setMadein(String madein) {this.Madein = madein;}

        public String getName() {return Name;}

        public void setName(String name) {this.Name = name;}

        public String getPrice() {return Price;}

        public void setPrice(String price) {this.Price = price;}

}