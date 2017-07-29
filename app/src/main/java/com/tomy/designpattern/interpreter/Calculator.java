package com.tomy.designpattern.interpreter;

import com.tomy.designpattern.interpreter.cls.RPN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Calculator
{

    public Calculator()
    {
        float[][] dataSource = new float[3][6];
        /*导入数据*/
        importData(dataSource);

        try
        {
            System.out.println("Input a expression:");
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            for (; ; )
            {
                /*输入表达式*/
                String input;
                input = is.readLine().trim();
                if (input.equals("q"))
                    break;
                else
                {
                    /*将输入的表达式转成逆波兰表达式*/
                    RPN rpn = new RPN(input);
                    HashMap<String, Float> var;
                    for (int i = 0; i < 3; i++)
                    {
                        var = new HashMap<>();
                        /*为表达式中的每一个变量，提供数据*/
                        var.put("a", dataSource[i][0]);
                        var.put("b", dataSource[i][1]);
                        var.put("c", dataSource[i][2]);
                        var.put("d", dataSource[i][3]);
                        var.put("e", dataSource[i][4]);
                        var.put("f", dataSource[i][5]);

                        rpn.getResult(var);
                    }
                }
                System.out.println("Input another expression or input 'q' to quit:");
            }
            is.close();
        }
        catch (IOException e)
        {
            System.out.println("Wrong input!!!");
        }
    }

    private void importData(float[][] dataSource)
    {
        System.out.println("data source:");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                dataSource[i][j] = (float) (Math.random() * 100);
                System.out.print(dataSource[i][j] + ",");
            }
            System.out.println(";");
        }
    }

}
