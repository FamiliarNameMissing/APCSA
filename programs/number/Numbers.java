//Benjamin C 
//2021-10-28

import java.util.*;

public class Numbers {
    //declare
    private Hashtable<String, Integer> in;
    //configure
    private void setup() {
        in = new Hashtable<String, Integer>();
    }

    public void addResult(String letter, int result) {
        in.put(letter, result);
    }
    
    //this doesn't return in order and I don't know why yet
    public void printOut(){
        for(String key: in.keySet()) {
            Integer number = in.get(key);
            System.out.println(key + ": " + number);
        }
    }
    
    public static void main(String[] args) {
        Numbers x = new Numbers();
        x.setup();
        
        int a = (int) (Math.random() * 10) + 1;
        x.addResult("a| ", a);
        int b = (int) (Math.random() * 101);
        x.addResult("b| ", b);
        int c = (int) (Math.random() * 20) + 10;
        x.addResult("c| ", c);
        int d = (int) (Math.random() * 50) + 25;
        x.addResult("d| ", d);
        int e = (int) (Math.random() * 2) + 1;
        x.addResult("e| ", e);
        int f = (int) (Math.random() * 3) - 1;
        x.addResult("f| ", f);
        int g = (int) (Math.random() * 1) - 1;
        x.addResult("g| ", g);
        int h = (int) (Math.random() * 20) - 20;
        x.addResult("h| ", h);
        int i = (int) (Math.random() * 5) - 10;
        x.addResult("i| ", i);
        int j = (int) (Math.random() * -1) - 5;
        x.addResult("j| ", j);
        int k = (int) (Math.random() * -100);
        x.addResult("k| ", k);
        //print out values with the keys
        x.printOut();
    }
}
