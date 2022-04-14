package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Staff extends Person {
    String education;
    String position;

    public void initialize1() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        education = br.readLine();
        System.out.println("Enter your position");
        position = br.readLine();
    }

    public void Bancha_56351()
    {
        Bancha1_56351();
        System.out.println("Education :" + education);
        System.out.println("Position :" + position);
    }
}
