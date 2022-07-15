package random;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {

    public void reset() throws IOException {

        File file = new File("object.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("object.txt has been deleted");
        }
        file.createNewFile();
        System.out.println("object.txt has been created");
        FileOutputStream outFile = new FileOutputStream("object.txt");
        ObjectOutputStream outObject = new ObjectOutputStream(outFile);

        List<Bean> list = new ArrayList<>();
        list.add(new Bean("邱紹文", 1));
        list.add(new Bean("于 廷偉", 1));
        list.add(new Bean("骆鑫宇", 1));
        list.add(new Bean("楊 振楠", 1));
        list.add(new Bean("李源", 1));
        list.add(new Bean("赵宇飞", 1));
        list.add(new Bean("欧晨凯", 1));
        list.add(new Bean("劉 天琦", 1));
        list.add(new Bean("蔡", 1));

        outObject.writeObject(list);
        outObject.close();
        outFile.close();
    }

}