 final class city {
        protected String address = "Coimbatore";
        public void climate() {
            System.out.println("Always a cool breeze");
        }
    }

    class homeLocation extends city {//cannot inherit from final city
        private String area = "kalapatti";
        public static void main(String[] args) {
            homeLocation myLoc = new homeLocation();
            myLoc.climate();
            System.out.println(myLoc.address + " " + myLoc.area);
        }
    }
