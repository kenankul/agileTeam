package projectvendingmachine;

import java.util.Scanner;

public class Runner {

    public static void  main(String[] args) {

        Products product =new Products();

        Methods methods=new Methods();
        methods.select(product);
    }

}
