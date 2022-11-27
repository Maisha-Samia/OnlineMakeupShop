public class makeup    {
    private String Proname;
    private int Expdate;
    private String Pro1;
    private String Pro2;
    private String Pro3;
    private String Company;
    private String Ratings;
    private int Price;

    public String getProname() {
        return Proname;
    }

    public int getExpdate() {
        return Expdate;
    }

    public String getPro1() {
        return Pro1;
    }
    public class makeup {
        private String Proname;
        private int Expdate;
        private String Pro1;
        private String Pro2;
        private String Pro3;
        private String Company;
        private String Ratings;
        private int Price;

        public String getProname() {
            return Proname;
        }

        public int getExpdate() {
            return Expdate;
        }

        public String getPro1() {
            return Pro1;
        }

        public String getPro2() { return Pro2; }

        public String getPro3() { return Pro3;}

        public String Company() {
            return Company;
        }

        public String getRatings() {
            return Ratings;
        }

        public int getPrice() {
            return Price;
        }



        public makeup(String proname, int expdate, String pro1, String pro2, String pro3, String company, String ratings, int price) {
            Proname = proname;
            Expdate = expdate;
            Pro1 = pro1;
            Pro2 = pro2;
            Pro3 = pro3;
            Company = company;
            Ratings = ratings;
            Price = price;
        }

        public String toString()
        {
            return Proname+","+Expdate+","+Pro1+","+Pro2+","+Pro3+","+Company+","+Ratings+","+Price;
        }


    }
    public String getPro2() { return Pro2; }

    public String getPro3() { return Pro3;}

    public String Company() {
        return Company;
    }

    public String getRatings() {
        return Ratings;
    }

    public int getPrice() {
        return Price;
    }



    public makeup(String proname, int expdate, String pro1, String pro2, String pro3, String company, String ratings, int price) {
        Proname = proname;
        Expdate = expdate;
        Pro1 = pro1;
        Pro2 = pro2;
        Pro3 = pro3;
        Company = company;
        Ratings = ratings;
        Price = price;
    }

    public String toString()
    {
        return Proname+","+Expdate+","+Pro1+","+Pro2+","+Pro3+","+Company+","+Ratings+","+Price;
    }


}