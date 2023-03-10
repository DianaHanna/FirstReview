package class24;

import class23.WebDriver;

public abstract class File {

    public abstract void open();

    public void edit(){
        System.out.println("Editing file");
    }
    public void close(){
        System.out.println("Closing file");
    }
}
class JavaFile extends File{

    @Override
    public void open(){
        System.out.println("Opening Java file using Notepad++");
    }
    public void edit(){
        System.out.println("Editing Java File in intellij");
    }
}
class WordFile extends File {

    @Override
    public void open() {
        System.out.println("Opening Word file using Microsoft Word");
    }
    public void edit(){
        System.out.println("Editing word file");
    }

}
class PdfFile extends File {
    @Override
    public void open() {
        System.out.println("Opening PDF file using Adobe Acrobat");
    }
    public void edit(){
        System.out.println("Editing the PDF file");
    }
    public static void main(String[] args) {

        File[] file = {new PdfFile(), new JavaFile(), new WordFile()};
        for (File f : file) {
            f.close();
            f.open();
            f.edit();
        }
    }
}