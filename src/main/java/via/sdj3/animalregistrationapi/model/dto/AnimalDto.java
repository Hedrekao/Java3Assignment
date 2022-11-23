package via.sdj3.animalregistrationapi.model.dto;

import via.sdj3.animalregistrationapi.model.Product;



public class AnimalDto {

        private String date;
        private double weight;

        private int registrationNumber;
        private String origin;


        public AnimalDto(String date, double weight, int registrationNumber, String origin, int productId) {
            this.date = date;
            this.weight = weight;
            this.registrationNumber = registrationNumber;
            this.origin = origin;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public int getRegistrationNumber() {
            return registrationNumber;
        }

        public void setRegistrationNumber(int registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }


    }


