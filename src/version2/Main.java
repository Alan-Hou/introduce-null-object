package version2;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        Site site = new Site();
        site.getCustomer();
        System.out.println(site.getCustomer().getName());
    }
}
