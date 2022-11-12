package ProjectPractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellCommandsInJava {
    public static void main(String[] args) {
        try{
//            Process process = Runtime.getRuntime().exec("ls -l /home/aspirine/Documents");
            Process process = Runtime.getRuntime().exec("pwd");

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            while((line = reader.readLine()) != null){
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);
                System.exit(0);
            }else {
                System.out.println("Failure!");
                System.exit(1);
            }

        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}