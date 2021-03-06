package br.com.codenation;

public class Main {
    public static void main(String[] args) {
        StatisticUtil st = new StatisticUtil();

        System.out.println(st.average(new int[] { 1, 2, 3, 4, 5 }));

        System.out.println(st.mode(new int[] { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8 }));

        System.out.println(st.median(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
    }
}
