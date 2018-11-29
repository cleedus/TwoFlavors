package com.example.jokesource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeProvider {
   // private  String joke = "Moses had the first tablet that connected to the cloud";

   private ArrayList<String> arrayList = new ArrayList<>();

    private ArrayList<String> getArrayList() {

        arrayList.add("Moses had the first tablet that connected to the cloud");
        arrayList.add("An elderly couple are in church. The wife leans over and whispers to her husband, \"I just let out a long, silent fart. What should I do?\" The husband replies, \"First off, replace the batteries in your hearing aid!\"");
        arrayList.add("Q: Why did the ants dance on the jam jar? A: The lid said, Twist to open.");
        arrayList.add("Q. Why do Dasher and Dancer love coffee? A. Because they’re Santa’s star bucks!");
        arrayList.add("Did you hear the one about the little mountain?\n" +
                "\n" +
                "It's hill-arious!");
        arrayList.add("Q: Why couldn't the leopard play hide and seek? \n" +
                "A: Because he was always spotted.");
        arrayList.add("Wife: \"In my dream, I saw you in a jewelry store and you bought me a diamond ring.\" \n" +
                "Husband: \"I had the same dream and I saw your dad paying the bill.\"");

        arrayList.add("A child asked his father, \"How were people born?\" So his father said, \"Adam and Eve made babies, then their babies became adults and made babies, and so on.\" The child then went to his mother, asked her the same question and she told him, \"We were monkeys then we evolved to become like we are now.\" The child ran back to his father and said, \"You lied to me!\" His father replied, \"No, your mom was talking about her side of the family.");
        return arrayList;
    }


    public String getJoke() {
        Random random = new Random();
        int index = random.nextInt(getArrayList().size());
        return getArrayList().get(index);
    }
}

