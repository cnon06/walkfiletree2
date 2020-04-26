package untitled3;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path>
{

    public FileVisitResult postVisitDirectory (Path dir, IOException exc) throws  IOException
    {
        System.out.println("Just visited "+ dir);
        return FileVisitResult.CONTINUE;
    }


    public FileVisitResult preVisitDirectory (Path dir, BasicFileAttributes attrs) throws  IOException
    {
        System.out.println("About to visit "+ dir);
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws  IOException
    {
        if(attrs.isRegularFile()) System.out.print("Regular File: ");

        System.out.println(file);
        return FileVisitResult.CONTINUE;
    }


    public FileVisitResult visitFileFailed (Path file, IOException exc) throws  IOException
    {
        System.err.println(exc.getMessage());
        return FileVisitResult.CONTINUE;
    }

}
