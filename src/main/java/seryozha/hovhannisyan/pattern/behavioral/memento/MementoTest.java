package seryozha.hovhannisyan.pattern.behavioral.memento;

import java.util.Date;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class MementoTest {
    public static void main2(String[] args) {
        
        CaretakerFileWriter caretaker = new CaretakerFileWriter();

        OriginatorFileWriterUtil fileWriter = new OriginatorFileWriterUtil("data.txt");
        fileWriter.write("First Set of Data\n");
        System.out.println(fileWriter + "\n\n");

        // lets save the file
        caretaker.save(fileWriter);
        //now write something else
        fileWriter.write("Second Set of Data\n");

        //checking file contents
        System.out.println(fileWriter + "\n\n");

        //lets undo to last save
        caretaker.undo(fileWriter);

        //checking file content again
        System.out.println(fileWriter + "\n\n");
    }
}
