package com.pluralsight;


public class CellPhoneApplication {
        private int serial_number;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;

        public CellPhoneApplication()
        {
            this.serial_number = 0;
            this.model = "";
            this.carrier = "";
            this.phoneNumber = "";
            this.owner = "";
        }

        public void setSerial_number(int serial_number)
        {
            this.serial_number = serial_number;
        }
        public void setModel(String model)
        {
            this.model = model;
        }
        public void setCarrier(String carrier)
        {
            this.carrier = carrier;
        }
        public void setPhoneNumber(String phoneNumber)
        {
        this.owner = phoneNumber;
        }

        public void setOwner(String owner)
        {
            this.owner = owner;
        }
        public void printCell_Specs()
        {
            System.out.printf("Serial Number: %d \n", this.serial_number);
            System.out.printf("Model: %s \n", this.model);
            System.out.printf("Carrier: %s \n", this.carrier);
            System.out.printf("Phone Number: %s \n", this.phoneNumber);
            System.out.printf("Owner: %s \n", this.owner);

        }


}


