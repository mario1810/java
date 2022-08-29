package com.generation.chapter2;

public class SwitchApp {
	
    public static void main(String[] args) {

        int stage = 2;
        String season;
        switch(stage) {
            case 0:
                season = "Spring";
                break;
            case 1:
                season = "Summer";
                break;
            case 2:
                season = "Fall";
                break;
            case 3:
                season = "Winter";
                break;
            default:
                season = "Invalid stage";
        }
        //after
        stage = 2;
        season=switch(stage) {
            case 0-> "Spring";
            case 1->"Summer";
            case 2->"Fall";
            case 3->"Winter";
            default->{
            System.out.println("Invalid value");	
            yield "Invalid stage";	
            }
        };

        System.out.println(season);
    }
}
