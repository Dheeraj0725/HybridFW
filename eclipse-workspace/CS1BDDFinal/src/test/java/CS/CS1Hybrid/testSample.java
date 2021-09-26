package CS.CS1Hybrid;

import java.io.IOException;
import java.util.ArrayList;

public class testSample extends HomePage{
	public testSample() throws IOException {
	}

    public static void main(String[] args) throws IOException {

        dataDriven  d = new dataDriven();
        ArrayList<Object> data = d.getData("Item");

        System.out.println(data.get(0));//column name
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        String ItemName = (String) data.get(0);
        String Username = (String) data.get(1);
        String Password = (String) data.get(2);
    }
}

