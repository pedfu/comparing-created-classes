package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\pedyu\\Desktop\\in.txt";
        ArrayList<Employee> employees = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null) {
                String[] word = line.split(",");
                employees.add(new Employee(word[0], Double.parseDouble(word[1])));
                line = br.readLine();
            }

            Collections.sort(employees);

            for(Employee e:employees) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
