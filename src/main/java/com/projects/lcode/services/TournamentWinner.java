package com.projects.lcode.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public static void main(String[] args) {

        ArrayList<String> game1= new ArrayList<>(
                Arrays.asList("HTML","C#")
        );
        ArrayList<String> game2= new ArrayList<>(
                Arrays.asList("C#","Python")
        );
        ArrayList<String> game3= new ArrayList<>(
                Arrays.asList("Python","HTML")
        );

        ArrayList<ArrayList<String>> competition= new ArrayList<ArrayList<String>>(
                Arrays.asList(game1,game2,game3)
        );

        ArrayList<Integer> results= new ArrayList<Integer>(
                Arrays.asList(0,0,1)
        );

        tournamentWinner(competition,results);
    }

    public static String tournamentWinner(ArrayList competition, ArrayList results) {

        Map<String,Integer> leader = new HashMap<>();

        for(int i =0 ; i< competition.size(); i++){

            var t= (ArrayList) competition.get(i);
            if((Integer) results.get(i)==0) {
                leader.put((String) t.get(1),leader.getOrDefault(t.get(1),0)+3);
            }
            else {
                leader.put((String) t.get(0),leader.getOrDefault(t.get(0),0)+3);
            }
        }

       var s =  leader.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .limit(1)
                .map(item -> item.getKey())
                .findFirst()
                .orElse("");
        return s;

    }
}
