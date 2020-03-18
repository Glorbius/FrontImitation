package kz.lesson.dbpractic.request;

import kz.lesson.dbpractic.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request {


    public static void getAll() throws IOException {

        URL url = new URL("http://localhost:8080/domashka/all");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");


        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer responce = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            responce.append(inputLine);
            responce.append("\n");
        }
        in.close();
        System.out.println(responce.toString());
    }

    public static void getId(String getid) throws IOException {

        URL url = new URL(getid);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");


    }


    public static void add(User user) throws IOException {
        URL httpUrl = new URL("http://localhost:8080/domashka/add");


        HttpURLConnection con = (HttpURLConnection) httpUrl.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);

        String datinput = "{\"name\":\"" + user.getName() + "\",\"age\":" + user.getAge() + ",\"legsize\":" + user.getLegSize() + ",\"sex\":\"" + user.getSex() + "\",\"status\":\"" + user.getStatus() + "\"}";


        try (OutputStream os = con.getOutputStream()) {
            byte[] input = datinput.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }


    }

    public static void delete(int id) throws IOException {
        URL httpUrl = new URL("http://localhost:8080/domashka/delete");


        HttpURLConnection con = (HttpURLConnection) httpUrl.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);

        String datinput = "{\"id\":" + id + "}";


        try (OutputStream os = con.getOutputStream()) {
            byte[] input = datinput.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }

    }

    public static void changeName(User user) throws IOException {
        URL httpUrl = new URL("http://localhost:8080/domashka/changeName");


        HttpURLConnection con = (HttpURLConnection) httpUrl.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);

        String datinput = "{\"name\":\"" + user.getName() + "\",\"id\":" + user.getId() + "}";


        try (OutputStream os = con.getOutputStream()) {
            byte[] input = datinput.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
    }

    public static void changeAge(User user) throws IOException {
        URL httpUrl = new URL("http://localhost:8080/domashka/changeAge");


        HttpURLConnection con = (HttpURLConnection) httpUrl.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);

        String datinput = "{\"age\":\"" + user.getAge() + "\",\"id\":" + user.getId() + "}";


        try (OutputStream os = con.getOutputStream()) {
            byte[] input = datinput.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
    }

    public static void changeLegsize(User user) throws IOException {
        URL httpUrl = new URL("http://localhost:8080/domashka/changeLegsize");


        HttpURLConnection con = (HttpURLConnection) httpUrl.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);

        String datinput = "{\"legsize\":\"" + user.getLegSize() + "\",\"id\":" + user.getId() + "}";


        try (OutputStream os = con.getOutputStream()) {
            byte[] input = datinput.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
    }

    public static void changeSex(User user) throws IOException {
        URL httpUrl = new URL("http://localhost:8080/domashka/changeSex");


        HttpURLConnection con = (HttpURLConnection) httpUrl.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);

        String datinput = "{\"sex\":\"" + user.getSex() + "\",\"id\":" + user.getId() + "}";


        try (OutputStream os = con.getOutputStream()) {
            byte[] input = datinput.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
    }

    public static void changeStatus(User user) throws IOException {
        URL httpUrl = new URL("http://localhost:8080/domashka/changeName");


        HttpURLConnection con = (HttpURLConnection) httpUrl.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);

        String datinput = "{\"status\":\"" + user.getStatus() + "\",\"id\":" + user.getId() + "}";


        try (OutputStream os = con.getOutputStream()) {
            byte[] input = datinput.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
    }
}




