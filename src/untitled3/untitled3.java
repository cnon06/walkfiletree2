package untitled3;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;




public class untitled3 {

    public static void main(String [] args) throws IOException
    {
        //System.out.println("Hi world!");
        Path fileDir = Paths.get("d:\\");
        MyFileVisitor visitor = new MyFileVisitor();


        Files.walkFileTree(fileDir,visitor);

    }

}
