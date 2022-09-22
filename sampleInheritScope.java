private class city {//parent class should have public access modifier
        protected String address = "Coimbatore";
        private void climate() {//cant access this method
            System.out.println("Always a cool breeze");
        }
    }

    class homeLocation extends city {
        private String area = "kalapatti";
        public static void main(String[] args) {
            homeLocation myLoc = new homeLocation();
            myLoc.climate();//cant able to call since its access is private
            System.out.println(myLoc.address + " " + myLoc.area);//print this one second
        }
    }
