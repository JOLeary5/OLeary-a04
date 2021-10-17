/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAndReplace
{
    public static Map<String,String> replaceWith()
    {
        //Creating New-Hashmap
        Map<String,String>map = new HashMap<>();
        map.put("utilize","use");
        return map;
    }

    public static String replaceWords(String str, Map<String,String> map)
    {
        for (Map.Entry<String,String> entry : map.entrySet())
        {
            //Replace the value with the Hashmap Key
            if (str.contains(entry.getKey())){
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }

    public static void FindAndReplaceWithHashmaps(String name)
    {
        Map<String, String> hashMap = replaceWith();

        //Trying to replace the Strings in the File according to the HASMAP
        try
        {
            Stream<String> lines = Files.lines(Path.of("Data/" + name), Charset.forName("UTF-8"));
            List<String> replacedLine = lines.map(line-> replaceWords(line,hashMap)).collect(Collectors.toList());
            Files.write(Path.of("Data/"+name),replacedLine, Charset.forName("UTF-8"));
            lines.close();
            System.out.println("Done");
        }
        catch (IOException e )
        {
            e.printStackTrace();
        }

    }
}
