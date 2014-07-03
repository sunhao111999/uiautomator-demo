package controls;

import java.io.*;
import java.util.ArrayList;

public class Command
{
    private String cmd;
    private int index;

    public Command(String cmd)
    {
        this.cmd = cmd;
        this.index = 0;
    }

    public Command(String cmd, int index)
    {
        this.cmd = cmd;
        this.index = index;
    }

    public String getCommand() throws IOException
    {
        ArrayList<String> array = new ArrayList<String>();

        Process ps = Runtime.getRuntime().exec(this.cmd);

        BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
        String line;
        while ((line = br.readLine()) != null)
        {
            array.add(line);
        }

        if (array.size() == 0)
        {
            return "no result";
        }
        else return array.get(this.index);
    }

    public void writeFile(String fileName, String content) throws IOException
    {
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(content + "\n");
        writer.close();
    }
}
