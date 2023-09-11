package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String getParsableString (String str) {
        str = str.replace(",", "");
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (!Character.isDigit(a)) {
                str = str.substring(0, i);
                break;
            }
        }
        if (str.equals("")) {
            str = "0";
        }
        return str;
    }
    public static void main(String[] args) throws IOException{
        Document document = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_river_systems_by_length").get();
        Elements body = document.select("table.wikitable.sortable").select("tr");
        List<River> rivers = new ArrayList<>();
        for(int i=1; i<body.size(); i++){
            Element row = body.get(i);
            Elements cells = row.select("td");
            String name =cells.get(0).text();
            int lengthkm = Integer.valueOf(getParsableString(cells.get(1).text()));
            int lengthml = Integer.valueOf(getParsableString(cells.get(2).text()));
            int drainage = Integer.valueOf(getParsableString(cells.get(3).text()));
            River river = new River(name,lengthkm, lengthml, drainage);
            rivers.add(river);
        }
        for (River river: rivers){
            System.out.println(river.toString());
        }
    }
}