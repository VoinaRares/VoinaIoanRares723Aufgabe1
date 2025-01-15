package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Log> logs = new ArrayList<>();
        try{

            File inputFile = new File("spielorte.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputFile);
            doc.getDocumentElement().normalize();

            for(int i = 0; i < doc.getElementsByTagName("log").getLength(); i ++){
                Element element = (Element) doc.getElementsByTagName("log").item(i);
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = dateFormat.parse(element.getElementsByTagName("Datum").item(0).getTextContent().trim());
                int id = Integer.parseInt(element.getElementsByTagName("Id").item(0).getTextContent().trim());
                int kapa = Integer.parseInt(element.getElementsByTagName("Kapazität").item(0).getTextContent().trim());
                String spielort = element.getElementsByTagName("Spielort").item(0).getTextContent().trim();
                String team1 = element.getElementsByTagName("Team1").item(0).getTextContent().trim();
                String team2 = element.getElementsByTagName("Team2").item(0).getTextContent().trim();

                logs.add(new Log(date, id, kapa, spielort, team1, team2));

                System.out.println(doc.getElementsByTagName("log").item(i).getTextContent());
            }


            //b
            System.out.println("Enter capacity: ");
            int kapa = Integer.parseInt(System.console().readLine());
            for(Log log : logs){
                if(log.getKapazitat() >= kapa){
                    System.out.println(log.getTeam1() + " vs " + log.getTeam2() + " " + log.getDatum() +  " " + log.getSpielort());
                }
            }

//            for(Log log : logs){
//                if(log.getSpielort().equals("München")){
//                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//                    if(log.getDatum().after( dateFormat.parse("2024-06-30"))){
//                        System.out.println(log);
//                    }
//                }
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}