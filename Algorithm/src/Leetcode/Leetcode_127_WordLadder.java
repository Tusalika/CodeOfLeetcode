package Leetcode;

import javafx.util.Pair;

import java.util.*;

public class Leetcode_127_WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int L = beginWord.length();
        HashMap<String, ArrayList<String>> allComboDict = new HashMap<String, ArrayList<String>>();

        wordList.forEach(
                word -> {
                    for (int i = 0; i < L; i++) {
                        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
                        ArrayList<String> transformation = allComboDict.getOrDefault(newWord, new ArrayList<>());
                        transformation.add(word);
                        allComboDict.put(newWord, transformation);
                    }
                }
        );
        Queue<Pair<String,Integer>> Q= new LinkedList<Pair<String, Integer>>();
        Q.add(new Pair<>(beginWord,1));

        HashMap<String,Boolean> visited = new HashMap<String,Boolean>();
        visited.put(beginWord,true);

        while (!Q.isEmpty()){
            Pair<String,Integer> node=Q.remove();
            String word=node.getKey();
            int level=node.getValue();
            for (int i = 0; i < L; i++) {
                String newWord=word.substring(0,i)+'*'+word.substring(i+1,L);

                for (String adjacentWord:allComboDict.getOrDefault(newWord,new ArrayList<>())){
                    if(adjacentWord.equals(endWord)){
                        visited.put(adjacentWord,true);
                        Q.add(new Pair(adjacentWord,level+1));
                    }
                }
            }
        }
        return 0;
    }
}
