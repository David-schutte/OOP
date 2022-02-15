package nl.saxion.oop.week1;

import java.awt.Color;
import java.util.ArrayList;
import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    ArrayList<Video> videos;
    String status;

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1200, 600);
    }

    public void run() {
        // TODO: Load videos from csv file.
        videos =
            readFile("C:\\Users\\david\\Desktop\\HBO-ICT\\jaar 1\\periode 3\\OOP\\Week1\\Exercise2\\youtubevideos.csv");
        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show watchlist ");
            SaxionApp.printLine("* 2) Watch video");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                // TODO: Your implementation here
                getList();
                SaxionApp.pause();
            } else if (menuInput == 2) {
                // TODO: Your implementation here
                getList();
                SaxionApp.printLine("Please enter a video to watch:");
                int video_number;
                video_number = SaxionApp.readInt() - 1;
                SaxionApp.printLine("You have watched:");
                getWatchedVideo(video_number);
                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }

    private void getWatchedVideo(int video_number) {
        SaxionApp.printLine(videos.get(video_number).title);
        videos.get(video_number).watched = true;
    }

    private void getList() {
        int i = 1;
        for (Video v : videos) {
            Color text_color;
            if (v.isWatched()) {
                status = "WATCHED";
                text_color = Color.green;
            } else {
                status = "NOT WATCHED";
                text_color = Color.red;
            }
            SaxionApp.print(
                i + ") " + v.title + " - " + v.channel_title + " - " + v.video_id + " (" + v.views + " views) ");
            SaxionApp.printLine("[" + status + "]", text_color);
            i++;
        }
    }

    private ArrayList<Video> readFile(String file) {
        CsvReader reader = new CsvReader(file);
        reader.skipRow();

        videos = new ArrayList<>();
        //add all the rows from the file to the cards list.
        while (reader.loadRow()) {
            Video v = new Video();
            v.video_id = reader.getString(0);
            v.title = reader.getString(1);
            v.channel_title = reader.getString(2);
            v.views = reader.getInt(4);
            videos.add(v);
        }
        return videos;
    }

}