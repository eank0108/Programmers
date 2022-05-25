import java.util.*;
class Q35 {
    public static String[] solution(String[] strings, int n) {
        String temp;
        String[] tempArr = new String[2];

        for (int i = 0; i < strings.length-1; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i].charAt(n) > strings[j].charAt(n)) {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else if (strings[i].charAt(n) == strings[j].charAt(n)) {
                    tempArr[0] = strings[i];
                    tempArr[1] = strings[j];
                    Arrays.sort(tempArr);
                    strings[i] = tempArr[0];
                    strings[j] = tempArr[1];
                }
            }
        }
        return strings;
    }
    public static void comparatorExample1() {
        List<String> strings = new ArrayList<>();
        strings.add("This code is free software");
        strings.add("you can redistribute it");
        strings.add("under the terms of the GNU General Public License version 2 only");
        strings.add("This code is distributed in the hope that it will be useful");
        strings.add("Please contact Oracle");
        strings.add("500 Oracle Parkway, Redwood Shores, CA 94065 USA");

        // Sorting 하기 전에 출력
        for (String str : strings) {
            System.out.println(str);
        }

        // 문자 길이로 sorting (오름차순)
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        // sorting 후 출력
        System.out.println();
        for (String str : strings) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        comparatorExample1();
        System.out.println(Arrays.toString(solution(new String[]{"abae", "abad", "cdaa", "cdac"}, 2)));
    }
}
