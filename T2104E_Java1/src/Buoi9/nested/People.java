package Buoi9.nested;

public class People {
    //bien
    private String name;
    private Address address;

    //innerclass: member class: 1 phan cua class ngoai-non-static
    public class Address{
        //bien
        private String province;
        private String district;

        //ham
        public Address(String province, String district) {
            this.province = province;
            this.district = district;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public void showInfoPeople(){
            System.out.println("Tinh: "+ this.province + "; huyen: " + this.district + "; ten Nguoi: " + getName());
        }
    }

    public static void main(String[] args){
        People p1 = new People();
        p1.getName();
        People.Address ad1 = p1.new Address("Hn","Cau Giay");
    }

    //method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void checkVung(){
        int loaiVung = 0;
        //localclass: pham vi trong 1 ham
        class Vung{
            private Address vung;
            public Vung(Address ad){
                this.vung = ad;
            }
            public int loaiVung(){
                if ("HN".equals(this.vung.getProvince()) || "HCM".equals(this.vung.getProvince()))
                    return 1;
                else if ("HP".equals(this.vung.getProvince()) || "QN".equals(this.vung.getProvince()))
                    return 2;
                else
                return 3;
            }
        }

        Vung vung = new Vung(this.address);
        loaiVung = vung.loaiVung();
        if (loaiVung == 1){
            System.out.println("Dia chi cua people la thanh pho lon loai 1");
        }else if (loaiVung == 2){
            System.out.println("Dia chi cua people la thanh pho lon loai 2");
        }else {
            System.out.println("Dia chi cua people la thanh pho lon loai 3");
        }
    }
}
