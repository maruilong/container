package com.itmasir.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author shinian
 * @date 2017/11/29/029
 */
public class FillingLists {

    public static void main(String[] args) {
        List<StringAdress> list = new ArrayList<>(Collections.nCopies(4, new StringAdress("hello")));

        System.out.println(list);

        Collections.fill(list, new StringAdress("world"));

        System.out.println(list);

    }
}

class StringAdress {
    private String s;

    public StringAdress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + s;
    }
}
