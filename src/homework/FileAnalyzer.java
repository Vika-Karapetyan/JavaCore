package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileAnalyzer {
    public Map<String, Integer> wordMap(String path) throws IOException {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line="";
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (int i = 0; i < words.length; i++){
                    map.put(words[i], i ++);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return map;
    }


    public int totalWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем общее количество слов
        int count = 0;
        try (BufferedReader bufferedreader = new BufferedReader(new FileReader(path))) {
            String line ="";

            while ((line = bufferedreader.readLine()) != null) {
                count++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }
    public int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        Map<String, Integer> wordMap = wordMap(path);
        int count = 0;
        for (Integer value : wordMap.values()) {
            if (wordMap!=null) {
                count++;
            }
        }
        return count;
    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        // Читаем файл, находим топ-N часто встречающихся слов
        Map<String, Integer> topFrequentWords = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line="";
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                //էս մեթոդը չստացվավ
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число

        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(word)) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

}

