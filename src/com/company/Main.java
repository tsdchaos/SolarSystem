package com.company;

public class Main {

    public static void main(String[] args) {
	SolarSystem solarSystem = new SolarSystem();
    solarSystem.sun=1;
    solarSystem.Moon=1;
    solarSystem.Planets=9;

        Sun Sol=new Sun();
        Sol.Heat="647525756587896kj";
        Sol.radius="654878644km";
        Sol.temp="1231554c";

        Planet2 platypus = new Planet2();
        platypus.color="pink";
        platypus.size="4544521347896756345";

        Planet1 mercury = new Planet1();
        mercury.color = "green";
        mercury.size = "1235456789 km";

        //Adding moon1 features
        Moon1 mooner = new Moon1();
        mooner.color = "white";
        mooner.radius = "1258789364 km";
        mooner.lightIntensity = "789421 Lumins";


    }
}
