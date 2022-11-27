import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class WrIndxException extends Exception {
    // private int detail;

    WrIndxException() {}


    public String toString() {
        return "Wrong choice , please try again";
    }
}




public class FileOperations {

    private static final String INPUT_FILE_NAME = "C:\\Users\\ASUS\\IdeaProjects\\OnlineMakeupShop\\in.txt";
    //private static final String OUTPUT_FILE_NAME = "C:\\\out.txt";

    static void indx(int x) throws WrIndxException {
        if (x <= 0 || x > 4) throw new WrIndxException();
    }


    static int adder(List<makeup> makeupList) {



        int y;
        while (true) {



            System.out.println("Please enter the following:");
            String proname;
            int expdate;
            String pro1;
            String pro2;
            String pro3;
            String company;
            String ratings;
            int price;
            Scanner makeupvar = new Scanner(System.in);
            System.out.println("Enter Product Name: ");
            while (true) {

                Scanner prosearch = new Scanner(System.in);
                String searchName =prosearch.nextLine() ;
                proname=searchName;
                int searchIndex = -1;
                for (int i = 0; i < makeupList.size(); i++) {
                    makeup c = makeupList.get(i);
                    if (c.getProname().equals(searchName)) {
                        searchIndex = i;
                    }
                }

                if (searchIndex != -1) {
                    System.out.println("This Product doesn't exist! Please try again");
                    continue;
                }
                else break;
            }

            System.out.println("Enter Expiry Date: ");
            expdate = makeupvar.nextInt();
            makeupvar.nextLine();
            System.out.println("Enter Products: ");
            pro1 = makeupvar.nextLine();

            pro2 = makeupvar.nextLine();

            pro3 = makeupvar.nextLine();
            System.out.println("Enter Company: ");
            company = makeupvar.nextLine();
            System.out.println("Enter Product Ratings: ");
            ratings = makeupvar.nextLine();
            System.out.println("Enter Product price");
            price = makeupvar.nextInt();
            makeupvar.nextLine();

            makeup c1 = new makeup(proname, expdate, pro1, pro2, pro3, company, ratings, price);
            makeupList.add(c1);

            System.out.println("Your Product " + c1 + " has been Added.");
            while (true) {
                System.out.println("(1)Do You wish to add another?");
                System.out.println("(2)Go back to main menu");
                y = makeupvar.nextInt();
                if (y == 1) break;
                else if (y == 2) break;
                else {
                    System.out.println("Invalid input! try again");
                    continue;
                }
            }
            if (y == 1) continue;
            else if (y == 2) break;
        }
        return y;
    }




    static int deleter(List<makeup> makeupList)
    {
        int y;
        while (true){

            System.out.println("Enter Product Name:");
            Scanner prosearch = new Scanner(System.in);
            String searchName =prosearch.nextLine() ;
            int searchIndex = -1;
            for (int i = 0; i < makeupList.size(); i++) {
                makeup c = makeupList.get(i);
                if (c.getProname().equals(searchName)) {
                    searchIndex = i;
                }
            }
            if (searchIndex != -1) {
                makeupList.remove(searchIndex);
            }
            else {
                System.out.println("No Such Product exists! Please try again");
                continue;
            }
            System.out.println("Your Product has been Deleted.");

            while (true) {
                System.out.println("(1)Do You wish to delete another?");
                System.out.println("(2)Go back to main menu");
                y = prosearch.nextInt();
                if (y == 1) break;
                else if (y == 2) break;
                else {
                    System.out.println("Invalid input! try again");
                    continue;
                }
            }
            if (y == 1) continue;
            else if (y == 2) break;

        }

        return y;
    }


    static int searcher(List<makeup> makeupList)
    {
        int y;


        while (true) {
            System.out.println("(1) By Product Name: ");
            System.out.println("(2) By Company and ratings: ");
            System.out.println( "(3) Back to Main Menu");
            Scanner option= new Scanner(System.in);
            y = option.nextInt();
            if (y == 3) return y;
            else if (y == 1)
            {


                while (true) {

                    int p;
                    System.out.println("Enter Product Name:");
                    Scanner prosearch = new Scanner(System.in);
                    String searchName = prosearch.nextLine();
                    int searchIndex = -1;
                    for (int i = 0; i < makeupList.size(); i++) {
                        makeup c = makeupList.get(i);
                        if (c.getProname().equals(searchName)) {
                            searchIndex = i;
                        }
                    }
                    if (searchIndex != -1) {
                        System.out.println(makeupList.get(searchIndex));

                    } else {
                        System.out.println("No Product exists! Please try again");
                        continue;
                    }
                }


            }


            else if (y == 2) {

                while (true) {

                    int p;
                    System.out.println("Enter Company:");
                    Scanner search = new Scanner(System.in);
                    String mak_searchName = search.nextLine();
                    System.out.println("Enter Ratings:");
                    String mod_searchName = search.nextLine();
                    if (mak_searchName.equalsIgnoreCase("any") == true &&
                            mod_searchName.equalsIgnoreCase("any") == true) continue;
                    else if (mak_searchName.equalsIgnoreCase("any") == true &&
                            mod_searchName.equalsIgnoreCase("any") == false) {

                        int searchIndex = -1;
                        for (int i = 0; i < makeupList.size(); i++) {
                            makeup c = makeupList.get(i);
                            if (c.getProname().equals(mak_searchName)) {
                                searchIndex = i;
                            }
                        }
                        if (searchIndex != -1) {
                            System.out.println("No such Company exist.Please try again");
                            continue;
                        } else {
                            for (int i = 0; i < makeupList.size(); i++)
                                if (makeupList.get(i).getProname().equalsIgnoreCase(mak_searchName) == true) {
                                    System.out.println(makeupList.get(i));
                                }
                        }
                    } else if (mak_searchName.equalsIgnoreCase("any") == false &&
                            mod_searchName.equalsIgnoreCase("any") == true) {

                        int searchIndex = -1;
                        for (int i = 0; i < makeupList.size(); i++) {
                            makeup c = makeupList.get(i);
                            if (c.getProname().equals(mod_searchName)) {
                                searchIndex = i;
                            }
                        }
                        if (searchIndex != -1) {
                            System.out.println("No such Car model exist.Please try again");
                            continue;
                        } else {
                            for (int i = 0; i < makeupList.size(); i++)
                                if (makeupList.get(i).getRatings().equalsIgnoreCase(mod_searchName) == true) {
                                    System.out.println(makeupList.get(i));
                                }
                        }
                    } else {

                        int searchIndex1 = -1;
                        int searchIndex2 = -1;
                        for (int i = 0; i < makeupList.size(); i++) {
                            makeup c = makeupList.get(i);
                            if (c.getProname().equals(mak_searchName)) {
                                searchIndex1 = i;
                            }
                        }
                        for (int i = 0; i < makeupList.size(); i++) {
                            makeup c = makeupList.get(i);
                            if (c.getProname().equals(mod_searchName)) {
                                searchIndex2 = i;
                            }
                        }


                        if (searchIndex1 == -1 || searchIndex2 == -1 || searchIndex1 != searchIndex2) {
                            System.out.println("No such Product exists! Please try again");
                            continue;
                        } else System.out.println(makeupList.get(searchIndex1));
                    }

                }

            }
            int p;
            while (true) {

                System.out.println("(1)Do You wish to Search again?");
                System.out.println("(2)Go back to menu");
                p = option.nextInt();
                if (p == 1) break;
                else if (p == 2) break;
                else {
                    System.out.println("Invalid input! try again");
                    continue;
                }
            }
            if (p == 1) continue;
            else if (p == 2) break;
        }
        return y;
    }







    public static void main(String[] args) {

        int x;
        List<makeup> makeupList = new ArrayList();
        List<String> makeupString = new ArrayList();



        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
            while (true) {
                line = br.readLine();
                if (line != null){

                    String[] temp = line.split(",");
                    String proname;
                    proname = temp[0];
                    System.out.println(temp[0]);
                    int expdate;
                    expdate = Integer.parseInt(temp[1]);
                    System.out.println(expdate);
                    String pro1;
                    pro1 = temp[2];
                    String pro2;
                    pro2 = temp[3];
                    String pro3;
                    pro3 = temp[4];
                    String company;
                    company = temp[5];
                    String ratings;
                    ratings = temp[6];
                    int price;
                    price = Integer.parseInt(temp[7]);
                    makeup c1 = new makeup(proname, expdate, pro1, pro2, pro3, company, ratings, price);
                    makeupList.add(c1);
                }
                else break;




                System.out.println(line);
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println( makeupList.get(1));









        while (true) {
            try {

                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

                String[] option = new String[]{
                        "Enter your Option:",
                        "(1) Search Products: ",
                        "(2) Add Product: ",
                        "(3) Delete Product: ",
                        "(4) Exit System"};
                for (int i = 0; i < 5; i++) {
                    System.out.println(option[i]);
                }
                String number = buf.readLine();
                System.out.println("your Option is :" + number);
                char[] a = number.toCharArray();
                x = a[0] - 48;
                //System.out.println(x);
                try {
                    indx(x);
                    if (x == 1)
                    { int t=searcher(makeupList);
                        if(t==3) continue;
                    }
                    if (x == 2) {
                        int t=adder(makeupList);
                        if(t==2) continue;
                    }
                    if (x == 3) {
                        int t=deleter(makeupList);
                        if (t==2) continue;
                    }
                    if (x == 4) return;
                    if (x > 0 && x <= 4) break;
                } catch (WrIndxException e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


//        System.out.println(carList.toString());
        String text;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(INPUT_FILE_NAME));
            for (int i=0;i< makeupList.size();i++) {
                text = makeupList.get(i).toString();
                bw.write(text);
                bw.write("\n");
            }
            bw.close();
            System.out.println("File written");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}