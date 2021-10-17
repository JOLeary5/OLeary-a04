package baseline;

import java.io.*;
import java.util.Scanner;

public class createHTML {
    public static void createHTMLFile(String siteName, String authorName){

        Scanner SC = new Scanner(System.in);
        String currentPath;


        //Prompts if user wants these files added to the Directory
        System.out.print("Do you want a folder for JavaScript? ");
        char js = SC.next().charAt(0);
        System.out.print("Do you want a folder for CSS? ");
        char css = SC.next().charAt(0);

        //Create String containing the userDirectory
        currentPath = System.getProperty("user.dir");
        currentPath += "\\"+siteName;

        File website = new File(currentPath);

        boolean websiteCreated = website.mkdir();
        if(websiteCreated)
        {
            System.out.println("Created " + currentPath);
            try
            {
                FileWriter skeletonWriter = new FileWriter(currentPath+"\\index.html");
                skeletonWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                skeletonWriter.write("\t<meta author=\""+authorName+"\">\n");
                skeletonWriter.write("\t<title>"+siteName+"</title>\n");
                skeletonWriter.write("</head>\n<body>\n\n</body>\n</html>");
                skeletonWriter.close();
                System.out.println("Created " + currentPath+"\\index.html");
                if(js == 'y' || js == 'Y')
                {
                    File jsFolder = new File(currentPath+"\\js");
                    boolean jsCreated = jsFolder.mkdir();
                    if(jsCreated)
                    {
                        System.out.println("Created " + jsFolder+"\\");
                    }
                    else
                    {
                        System.out.println("Js folder not created!!");
                    }
                }
                if(css == 'y' || css == 'Y')
                {
                    File cssFolder = new File(currentPath+"\\css");
                    boolean cssCreated = cssFolder.mkdir();
                    if(cssCreated)
                    {
                        System.out.println("Created " + cssFolder+"\\");
                    }
                    else
                    {
                        System.out.println("CSS folder not created!!");
                    }
                }
            }
            catch(IOException e)
            {
                System.out.println("index.html not created as required!!");
            }
        }
        else
        {
            System.out.println("Website folder not created!!");
        }
        SC.close();
    }
}
