import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;


//In charge of storing and retrieving the array of prime integers.
class Data {
    String fileName;

    public Data(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Writes each element of @data to this.fileName
     */
    public void writeToFile(int[] data) {
        try {
            FileOutputStream file = new FileOutputStream(this.fileName);
            for (int i = 0; i < data.length; i++)
                file.write(data[i]);
            file.close();
        } catch (IOException e) {
            System.out.println("Error - " + e.toString());
        }
    }

    /**
     * Returns an array of integers from this.fileName
     * @maxValue : The cap for taking in values from file.
     */
    public int[] readFromFile(int maxValue) {
        ArrayList<Integer> listData = new ArrayList<Integer> ();

        try {
            FileInputStream file = new FileInputStream(this.fileName);
            int dataPoint;
            do {
                dataPoint = file.read();
                if (dataPoint != -1 && dataPoint <= maxValue) {
                    listData.add(dataPoint);
                }
            }   while (dataPoint != -1 && dataPoint <= maxValue);
            file.close();
        }   catch (IOException e) {
            System.out.println("Error - " + e.toString());
        }
        
        //Convert ArrayList to integer array
        int[] data = new int[listData.size()];
        for (int i = 0; i < data.length; i++) {
            data[i] = listData.get(i);
        }
        
        return data;
    }

}