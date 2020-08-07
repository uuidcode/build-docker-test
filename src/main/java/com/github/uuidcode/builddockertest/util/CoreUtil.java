package com.github.uuidcode.builddockertest.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CoreUtil {
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static String toJson(Object object) {
        return gson.toJson(object);
    }
}
