package seryozha.hovhannisyan.pattern.behavioral.memento;

/**
 * Created by Seryozha on 1/29/2017.
 *
 * Notice that caretaker object contains the saved state in the form of Object,
 * so it can’t alter its data and also it has no knowledge of it’s structure.
 */
public class CaretakerFileWriter {

    private Object obj;

    public void save(OriginatorFileWriterUtil originator) {
        this.obj = originator.save();
    }

    public void undo(OriginatorFileWriterUtil originator) {
        originator.undoToLastSave(obj);
    }

}
