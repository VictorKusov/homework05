package ru.list.victor_90.study.myapplication;

import java.util.Random;

public class Item {
    static Random random = new Random();
    int id;
    String text;

    public Item( String text) {
        switch (random.nextInt(4)) {
            case 0: {
                id = R.drawable.ic_check_circle_24dp;
                break;
            }
            case 1: {
                id = R.drawable.ic_face_24dp;
                break;
            }
            case 2: {
                id = R.drawable.ic_insert_emoticon_24dp;
                break;
            }
            case 3: {
                id = R.drawable.ic_local_taxi_24dp;
                break;
            }
        }
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
